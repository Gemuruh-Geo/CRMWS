package com.jet.crm.ws.dao;

import java.sql.Timestamp;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.jet.crm.ws.mapper.CallConclutionMapper;
import com.jet.crm.ws.mapper.CallConversionMapper;
import com.jet.crm.ws.model.calltracker.CallConclutionO;
import com.jet.crm.ws.model.calltracker.CallConversionCallTrackerModel;
import com.jet.crm.ws.util.SQLQuery;


@Repository
public class CallConversionTrackerDaoImpl implements CallConversionTrackerDao{
	
	@Autowired
	DataSource mysqlds;
	
	@Autowired
	DataSource pgsqlds;
	
	private JdbcTemplate jdbcTemplate;
	

	@Override
	public List<CallConversionCallTrackerModel> getCallConversionsData(
			final String site, final Timestamp start, final Timestamp end) {
		
		jdbcTemplate = new JdbcTemplate(mysqlds);
		
		/*
		 * we should using sql builder, but for current test we just using hardcoded sql
		 * Parsing to timestamp with timezone from start
		 * parsing to timestamp with timezone from end
		 * 
		 * processing Query
		 * 
		 * */
		
		List<CallConversionCallTrackerModel> result = jdbcTemplate.query(SQLQuery.CALLTRACKER_LIST, new Object[]{site,start,end},new CallConversionMapper());
		return result;
	}


	@Override
	public CallConclutionO getCallConclutions(final String call_ref_no) {
		
		jdbcTemplate = new JdbcTemplate(pgsqlds);
		
		List<CallConclutionO> callConclutions = jdbcTemplate.query(SQLQuery.CALL_CONCLUTION_BY_CALLREFNO, new Object[]{call_ref_no},new CallConclutionMapper());
		if(callConclutions.size()==0){
			return null;
		}
		return callConclutions.get(0);
	}

	@Override
	public CallConversionCallTrackerModel getSingleCallConversionData(
			String call_ref_no) {
		
		jdbcTemplate = new JdbcTemplate(mysqlds);
		List<CallConversionCallTrackerModel> results = jdbcTemplate.query(SQLQuery.CALLTRACKER_BY_CALLREFNO, new Object[]{call_ref_no},new CallConversionMapper());
		if(results.size()==0){
			return null;
		}
		
		return results.get(0);
	}


	@Override
	public List<CallConclutionO> getListOfCallConclutions(
			List<String> call_ref_nos) {
		
		jdbcTemplate = new JdbcTemplate(pgsqlds);
		
		
		Object[] params = call_ref_nos.toArray();
		
		List<CallConclutionO> results = jdbcTemplate.query(SQLQuery.callConclutionListStmt(call_ref_nos.size()), params,new CallConclutionMapper());
		
		return results;
	}
}
