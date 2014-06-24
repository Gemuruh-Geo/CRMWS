package com.jet.crm.ws.config;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.accept.ContentNegotiationManager;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.ContentNegotiatingViewResolver;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

@Configuration
@EnableWebMvc
@PropertySource(value={"classpath:conn.properties"})
public class WebAppConfig extends WebMvcConfigurerAdapter{
	
	public class JsonViewResolver implements ViewResolver{

		@Override
		public View resolveViewName(String viewName, Locale locale)
				throws Exception {
			MappingJackson2JsonView jsonView = new MappingJackson2JsonView();
			jsonView.setPrettyPrint(true);
			return jsonView;
		}
		
	}
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		super.addResourceHandlers(registry);
		
		registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
	}
	
	@Override
	public void configureDefaultServletHandling(
			DefaultServletHandlerConfigurer configurer) {
		super.configureDefaultServletHandling(configurer);
		configurer.enable();
	}
	
	@Override
	public void configureContentNegotiation(
			ContentNegotiationConfigurer configurer) {
		super.configureContentNegotiation(configurer);
		configurer.favorPathExtension(true).useJaf(true)
		.ignoreAcceptHeader(true)
		.mediaType("json", MediaType.APPLICATION_JSON)
		.defaultContentType(MediaType.APPLICATION_JSON);
	}
	
	@Bean
	public ViewResolver contentNegotiatingViewResolver(ContentNegotiationManager manager) {
		JsonViewResolver jsonViewResolver = new JsonViewResolver();
		List<ViewResolver> listResolver = new ArrayList<ViewResolver>();
		listResolver.add(jsonViewResolver);

		ContentNegotiatingViewResolver negotiatingViewResolver = new ContentNegotiatingViewResolver();
		negotiatingViewResolver.setViewResolvers(listResolver);
		negotiatingViewResolver.setContentNegotiationManager(manager);

		return negotiatingViewResolver;
	}
	
	@Override
	public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
		converters.add(messageConverter());
	}
	
	@Bean
	public MappingJackson2HttpMessageConverter messageConverter() {
		MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();

		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.configure(SerializationFeature.INDENT_OUTPUT, true);
		
		converter.setObjectMapper(objectMapper);
		converter.setPrettyPrint(true);
		
		return converter;
	}
	
}
;