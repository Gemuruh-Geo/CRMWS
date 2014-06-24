package com.jet.crm.ws.util;

public class SQLQuery {
	
	public static final String CALLTRACKER_LIST = "select cc.call_ref_no as call_ref_no,"
			+ "'' as Dialed_Number,"
			+ "cc.answering_point as answering_point,"
			+ "cc.answering_point_exchange as answering_point_location,"
			+ "ss.description as service_name,"
			+ "cc.originating_no as caller_id,"
			+ "cc.origin_exchange as caller_location,"
			+ "camp.name as cost_center,"
			+ "cc.call_type as call_type,"
			+ "cc.call_outcome as call_status,"
			+ "cc.call_duration as call_duration,"
			+ "TIMESTAMP(cc.event_date,cc.event_time) as call_date,"
			+ "cc.account_no as account_number,"
			+ "CASE WHEN ss.dynamic_number_feature <= cc.event_date THEN true ELSE false END as number_type "
			+ "from calls cc "
			+ "join services ss on cc.service_no = ss.service_no "
			+ "join campaigns camp on camp.id = ss.campaign_id "
			+ "where cc.account_no = ? and Timestamp(cc.event_date,cc.event_time)>=? and timestamp(cc.event_date,cc.event_time)<=? "
			+ "order by call_date desc ";
	
	public static final String CALLTRACKER_BY_CALLREFNO = "select cc.call_ref_no as call_ref_no,'' as Dialed_Number,"
			+ "cc.answering_point as answering_point,"
			+ "cc.answering_point_exchange as answering_point_location,"
			+ "ss.description as service_name,"
			+ "cc.originating_no as caller_id,"
			+ "cc.origin_exchange as caller_location,"
			+ "camp.name as cost_center,"
			+ "cc.call_type as call_type,"
			+ "cc.call_outcome as call_status,"
			+ "cc.call_duration as call_duration,"
			+ "TIMESTAMP(cc.event_date,cc.event_time) as call_date,"
			+ "cc.account_no as account_number,"
			+ "CASE WHEN ss.dynamic_number_feature <= cc.event_date THEN true ELSE false END as number_type "
			+ "from calls cc  "
			+ "join services ss on cc.service_no = ss.service_no "
			+ "join campaigns camp on camp.id = ss.campaign_id "
			+ "where cc.call_ref_no = ? "
			+ "order by call_date desc ";
	
	
	
	public static String callConclutionListStmt(int size){
		StringBuilder inClause = new StringBuilder();
		
		for( int i = 0; i< size; i++){
			inClause.append(" ?");
            if(i != size -1) inClause.append(",");
        }
		final String sql = "select attributes->'add1'::text as custom_1,"
				+ "attributes->'add2'::varchar as custom_2,"
				+ "case when attributes->'callConclusion'='1' then 'Sale'::text "
				+ "when attributes->'callConclusion'='2' then 'Lead'::text "
				+ "when attributes->'callConclusion'='3' then 'Enquiry'::text "
				+ "when attributes->'callConclusion'='4' then 'Other'::text "
				+ "else 'Undefined'::text "
				+ "end as outcome,"
				+ "attributes->'callValue'::text as value,"
				+ "call_id as call_id "
				+ "from call where call_id in("+inClause+")";
		
		return sql;
	}
	
	public static final String CALL_CONCLUTION_BY_CALLREFNO = "select attributes->'add1'::text as custom_1,"
			+ "attributes->'add2'::varchar as custom_2,"
			+ "case when attributes->'callConclusion'='1' then 'Sale'::text "
			+ "when attributes->'callConclusion'='2' then 'Lead'::text "
			+ "when attributes->'callConclusion'='3' then 'Enquiry'::text "
			+ "when attributes->'callConclusion'='4' then 'Other'::text "
			+ "else 'Undefined'::text "
			+ "end as outcome,"
			+ "attributes->'callValue'::text as value,"
			+ "call_id as call_id "
			+ "from call where call_id =?";
	
	
}
