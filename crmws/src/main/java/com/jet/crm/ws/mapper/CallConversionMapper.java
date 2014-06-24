package com.jet.crm.ws.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.jet.crm.ws.model.calltracker.CallConversionCallTrackerModel;

public class CallConversionMapper implements RowMapper<CallConversionCallTrackerModel>{

	@Override
	public CallConversionCallTrackerModel mapRow(ResultSet rs, int rowNum)
			throws SQLException {
		
		
		CallConversionCallTrackerModel cccTM = new CallConversionCallTrackerModel();
		cccTM.setAccount_Number(rs.getString("account_number"));
		cccTM.setAnswering_Point(rs.getString("answering_Point"));
		cccTM.setAnswering_Point_Location(rs.getString("answering_point_location"));
		cccTM.setCall_Date(rs.getString("call_date"));
		cccTM.setCall_Duration(rs.getString("call_Duration"));
		cccTM.setCall_ref_no(rs.getString("call_ref_no"));
		cccTM.setCall_Status(rs.getString("call_status"));
		cccTM.setCall_Type(rs.getString("call_type"));
		cccTM.setCaller_ID(rs.getString("caller_id"));
		cccTM.setCaller_Location(rs.getString("caller_location"));
		cccTM.setCost_Center(rs.getString("cost_center"));
		cccTM.setDialed_Number(rs.getString("Dialed_Number"));
		cccTM.setNumber_Type(rs.getString("Number_Type"));
		cccTM.setService_Name(rs.getString("service_name"));
		
		
		return cccTM;
	}

}
