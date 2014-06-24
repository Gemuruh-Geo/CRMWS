package com.jet.crm.ws.dao;

import java.sql.Timestamp;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.jet.crm.ws.mapper.WebtrackerMapper;
import com.jet.crm.ws.model.WebtrackerModel;

@Repository
public class CallConversionWTDaoImpl implements CallConversionWTDao {

	@Autowired
	private DataSource postgreDs;

	private JdbcTemplate jdbcTemplate;
	@Override
	public List<WebtrackerModel> getListWebtracker(String siteCode, Timestamp startDate, Timestamp enddate) {
		String sqlQuery = "SELECT"
				+ " conversion.conversion_id as conversionid,"
				+ " conversion_session.tracking_site_code as tracked_website,"
				+ " conversion.converted_date_time as convertedDateTime,"
				+ " call.call_id as callid,"
				+ " (call.attributes->'callValue')::numeric as callValue,"
				+ " conversion_session.attributes as conversionSessionAttributes,"
				+ " (call.attributes->'accountNumber')::BIGINT as call_accountNumber,"
				+ " DATE((call.call_time at time zone 'UTC') at time zone COALESCE(conversion_session.attributes->'timezone', 'Australia/Sydney')) AS calldate,"
				+ " to_char((call.call_time at time zone 'UTC') at time zone COALESCE(conversion_session.attributes->'timezone', 'Australia/Sydney'), 'HH24:MI') AS calltime,"
				+ " (conversion_session.attributes->'accountNumber')::BIGINT as conversion_session_accountnumber,"
				+ " (CASE "
				+ " WHEN position('?' in origin_session.attributes->'landingPageReferrer.url') > 0"
				+ " THEN substring(origin_session.attributes->'landingPageReferrer.url' for position('?' in origin_session.attributes->'landingPageReferrer.url')-1)"
				+ " WHEN position('#' in origin_session.attributes->'landingPageReferrer.url') > 0"
				+ " THEN substring(origin_session.attributes->'landingPageReferrer.url' for position('#' in origin_session.attributes->'landingPageReferrer.url')-1)"
				+ " ELSE"
				+ " origin_session.attributes->'landingPageReferrer.url'"
				+ " END) as referrer,"
				+ " origin_session.attributes->'landingPageReferrer.tld'::text as landingPageReferrer_tld,"
				+ " origin_session.attributes->'landingPage.domain' as trackedsite,"
				+ " COALESCE(origin_session.attributes->'landingPage.path', '/') as landingpage,"
				+ " COALESCE(regexp_replace(conversion_page.url, '^[^/]*//[^/]*(/[^#?]*).*', E'\\\\1'), '/') as conversionPage,"
				+ " SUBSTRING(COALESCE(NULLIF(origin_session.attributes->'keywords',''), '') FOR 255) AS keyword,"
				+ " conversion_session.attributes->'cookies._ga'::text AS cookies_ga,"
				+ " conversion_session.attributes->'method_name'::text AS method_name,"
				+ " conversion_session.attributes->'diagnostics.comment'::text AS diagnostics_comment,"
				+ " conversion_session.attributes->'googleAnalytics.term'::text AS googleanalytics_term,"
				+ " conversion_session.attributes->'feature.extractor.name'::text AS feature_extractor_name,"
				+ " conversion_session.attributes->'googleAnalytics.medium'::text AS googleanalytics_medium,"
				+ " conversion_session.attributes->'googleAnalytics.source'::text AS googleanalytics_source,"
				+ " conversion_session.attributes->'diagnostics.browser.name'::text AS diagnostics_browser_name,"
				+ " conversion_session.attributes->'googleAnalytics.campaign'::text AS googleanalytics_campaign,"
				+ " conversion_session.attributes->'landingPageReferrer.gtld'::text AS landingpagereferrer_gtld,"
				+ " conversion_session.attributes->'landingPageReferrer.path'::text AS landingpagereferrer_path,"
				+ " conversion_session.attributes->'feature.extractor.version'::text AS feature_extractor_version,"
				+ " conversion_session.attributes->'landingPageReferrer.cctld'::text AS landingpagereferrer_cctld,"
				+ " conversion_session.attributes->'diagnostics.cookiesEnabled'::text AS diagnostics_cookiesenabled,"
				+ " conversion_session.attributes->'landingPageReferrer.domain'::text AS landingpagereferrer_domain,"
				+ " conversion_session.attributes->'diagnostics.browser.version'::text AS diagnostics_browser_version,"
				+ " conversion_session.attributes->'diagnostics.hasGACookieUtma'::text AS diagnostics_hasgacookieutma,"
				+ " conversion_session.attributes->'diagnostics.hasGACookieUtmz'::text AS diagnostics_hasgacookieutmz,"
				+ " conversion_session.attributes->'landingPageReferrer.fragment'::text AS landingpagereferrer_fragment,"
				+ " conversion_session.attributes->'landingPageReferrer.protocol'::text AS landingpagereferrer_protocol,"
				+ " conversion_session.attributes->'landingPageReferrer.shortName'::text AS landingpagereferrer_shortname,"
				+ " conversion_session.attributes->'landingPageReferrer.subdomain'::text AS landingpagereferrer_subdomain,"
				+ " conversion_session.attributes->'landingPageReferrer.queryString'::text AS landingpagereferrer_querystring,"
				+ " conversion_session.attributes->'diagnostics.version.trackingServer'::text AS diagnostics_version_trackingserver,"
				+ " conversion_session.attributes->'landingPageReferrer.registeredDomain'::text AS landingpagereferrer_registereddomain,"
				+ " conversion_session.attributes->'medium' AS medium,"
				+ " conversion_session.attributes->'source' AS source,"
				+ " conversion_session.attributes->'campaign' AS campaign,"
				+ " conversion_session.attributes->'geoip.ip' AS ipaddress,"
				+ " conversion_session.attributes->'geoip.city' AS visitlocation,"
				+ " conversion_session.attributes->'geoip.region'::text AS geoip_region,"
				+ " conversion_session.attributes->'cookies.__utma'::text AS cookies_utma,"
				+ " conversion_session.attributes->'cookies.__utmz'::text AS cookies_utmz,"
				+ " conversion_session.attributes->'geoip.areaCode'::text AS geoip_areacode,"
				+ " conversion_session.attributes->'geoip.latitude'::text AS geoip_latitude,"
				+ " conversion_session.attributes->'geoip.timezone'::text AS geoip_timezone,"
				+ " conversion_session.attributes->'geoip.longitude'::text AS geoip_longitude,"
				+ " conversion_session.attributes->'geoip.metroCode'::text AS geoip_metrocode,"
				+ " conversion_session.attributes->'landingPage.tld'::text AS landingPage_tld,"
				+ " conversion_session.attributes->'landingPage.url'::text AS landingPage_url,"
				+ " conversion_session.attributes->'geoip.ipRangeEnd'::text AS geoip_ipRangeEnd,"
				+ " conversion_session.attributes->'geoip.regionName'::text AS geoip_regionName,"
				+ " conversion_session.attributes->'landingPage.gtld'::text AS landingPage_gtld,"
				+ " conversion_session.attributes->'geoip.countryCode'::text AS geoip_countrycode,"
				+ " conversion_session.attributes->'landingPage.cctld'::text AS landingpage_cctld,"
				+ " conversion_session.attributes->'geoip.ipRangeStart'::text AS geoip_iprangestart,"
				+ " conversion_session.attributes->'contexts.Main.Number'::text AS contexts_main_number,"
				+ " conversion_session.attributes->'diagnostics.isMobile'::text AS diagnostics_ismobile,"
				+ " conversion_session.attributes->'landingPage.fragment'::text AS landingpage_fragment,"
				+ " conversion_session.attributes->'landingPage.protocol'::text AS landingpage_protocol,"
				+ " conversion_session.attributes->'landingPage.shortName'::text AS landingpage_shortname,"
				+ " conversion_session.attributes->'landingPage.subdomain'::text AS landingpage_subdomain,"
				+ " conversion_session.attributes->'landingPage.queryString'::text AS landingpage_querystring,"
				+ " conversion_session.attributes->'landingPage.registeredDomain'::text AS landingpage_registereddomain,"
				+ " COALESCE(origin_session.attributes->'landingPage.path', '/') AS originalsessionurl,"
				+ " CONCAT(COALESCE(origin_session.attributes->'landingPage.queryString', ''), COALESCE(conversion_session.attributes->'landingPage.fragment', '')) AS originalsessionurltags,"
				+ " COALESCE(conversion_session.attributes->'landingPage.path', '/') AS conversionsessionurl,"
				+ " CONCAT(COALESCE(conversion_session.attributes->'landingPage.queryString', ''), COALESCE(conversion_session.attributes->'landingPage.fragment', '')) AS conversionsessionurltags,"
				+ " (CASE WHEN (conversion_session.attributes->'diagnostics.isMobile') = 'true' THEN 1 ELSE 0 END) AS isMobile,"
				+ " conversion.quality_score AS qualityscore"
				+ " FROM (SELECT context.id as context_id FROM context WHERE tracking_site_code = ?) context"
				+ " JOIN context_pool ON context_pool.context_id = context.context_id"
				+ " JOIN phone_number ON phone_number.context_pool_id = context_pool.id"
				+ " JOIN call ON call.phone_number = phone_number.number"
				+ " AND call.call_time >= ?"
				+ " AND call.call_time < ?"
//				+ " AND call.call_time >= cast(? as timestamp)"
//				+ " AND call.call_time < cast(? as timestamp)"
//				+ " AND call.call_time >= (TIMESTAMP WITH TIME ZONE 'epoch' + (select extract(epoch from timestamp with time zone ?::timestamp)) * INTERVAL '1 second') AT TIME ZONE 'UTC'"
//				+ " AND call.call_time < (TIMESTAMP WITH TIME ZONE 'epoch' + (select extract(epoch from timestamp with time zone ?::timestamp)) * INTERVAL '1 second') AT TIME ZONE 'UTC'"
				+ " JOIN conversion ON conversion.call_id = call.id"
				+ " JOIN mapping_session AS conversion_session ON conversion_session.session_id = COALESCE(conversion.web_session_id,conversion.session_id)"
				+ " JOIN mapping_session AS origin_session ON origin_session.session_id = COALESCE(conversion_session.origin_session_id, conversion_session.session_id)"
				+ " JOIN page_view as conversion_page ON conversion.page_view_id = conversion_page.view_id"
				+ " ORDER BY conversion_id";
		
		jdbcTemplate = new JdbcTemplate(postgreDs);
		
		List<WebtrackerModel> list = jdbcTemplate.query(sqlQuery, new Object[] {siteCode, startDate, enddate}, new WebtrackerMapper());
		
		return list;
	}
}
