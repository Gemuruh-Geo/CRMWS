package com.jet.crmws.test;


import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;






import com.jet.crm.ws.config.AppConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={AppConfig.class})
@WebAppConfiguration
public class UnitTest {
	
	@Autowired
	private WebApplicationContext wac;
	
	private MockMvc mockMvc;
	
	@Before
	public void setup(){
		this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
	}
	
	@Test
	public void validCallConversionCallTracker(){
		try {
			this.mockMvc.perform(get("/v1/calls/1506?start=20140616T181542.00Z&end=20140617T171510.00Z")
			        .accept(MediaType.APPLICATION_JSON)).andDo(print())
			        .andExpect(status().isOk()).andReturn();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test
	public void validCallConclution(){
		try {
			this.mockMvc.perform(get("/v1/calls/ref/70-11-7-53958").accept(MediaType.APPLICATION_JSON)).andDo(print()).andExpect(status().isOk()).andReturn();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void invalidCallRefNoCallConclution(){
		try {
			mockMvc.perform(get("/v1/calls/ref/70-11-7-5395800000000000").accept(MediaType.APPLICATION_JSON)).andDo(print()).andExpect(status().isOk()).andReturn();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test
	public void invalidDateFormatExcpCallConversionCallTracker(){
		try {
			mockMvc.perform(get("/v1/calls/1506?start=sdasdsdsads&end=20140617T171510.00Z").accept(MediaType.APPLICATION_JSON)).andDo(print()).andExpect(status().isOk()).andReturn();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test
	public void invalidAccountNoExcCallConversionCallTracker(){
		try {
			mockMvc.perform(get("/v1/calls/150600000000000?start=20140616T181542.00Z&end=20140617T171510.00Z").accept(MediaType.APPLICATION_JSON)).andDo(print()).andExpect(status().isOk()).andReturn();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// WEBTRACKER TESTING
	@Test
	public void validCallConversionWebTracker(){
		try {
			this.mockMvc.perform(get("/v1/conversions/WT1506?start=20140616T181542.00Z&end=20140617T171510.00Z")
					.accept(MediaType.APPLICATION_JSON)).andDo(print())
					.andExpect(status().isOk()).andReturn();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void invalidDateFormatExcpCallConversionWebTracker(){
		try {
			mockMvc.perform(get("/v1/conversions/WT1506?start=sdasdsdsads&end=20140617T171510.00Z").accept(MediaType.APPLICATION_JSON)).andDo(print()).andExpect(status().isOk()).andReturn();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void invalidNoTrackingCodeException(){
		try {
			mockMvc.perform(get("/v1/conversions/WTXXXX?start=20140616T181542.00Z&end=20140617T171510.00Z").accept(MediaType.APPLICATION_JSON)).andDo(print()).andExpect(status().isOk()).andReturn();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void invalidRequestException(){
		try {
			mockMvc.perform(get("/v1/conversions/WT1506?start=20140616T181542.00Z").accept(MediaType.APPLICATION_JSON)).andDo(print()).andExpect(status().isOk()).andReturn();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
