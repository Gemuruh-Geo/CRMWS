package com.jet.crm.ws.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.jet.crm.ws.model.calltracker.CallConclutionO;

public class CallConclutionMapper implements RowMapper<CallConclutionO>{

	@Override
	public CallConclutionO mapRow(ResultSet rs, int rowNum) throws SQLException {
		CallConclutionO cco = new CallConclutionO();
		cco.setCustom1(rs.getString("custom_1"));
		cco.setCustom2(rs.getString("custom_2"));
		cco.setIvr_survey("");
		cco.setOutcome(rs.getString("outcome"));
		cco.setValue(rs.getString("value"));
		cco.setCall_ref_no(rs.getString("call_id"));
		return cco;
		
	}

}
