package com.jet.crm.ws.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.jet.crm.ws.model.ConversionSessionAttributes;
import com.jet.crm.ws.model.WebtrackerModel;

public class WebtrackerMapper implements RowMapper<WebtrackerModel> {

	@Override
	public WebtrackerModel mapRow(ResultSet rs, int rowNum) throws SQLException {
		ConversionSessionAttributes sessionAttributes = new ConversionSessionAttributes();
		sessionAttributes.setMedium(rs.getString("medium"));
		sessionAttributes.setSource(rs.getString("source"));
		sessionAttributes.setCampaign(rs.getString("campaign"));
		sessionAttributes.setGeoipIp(rs.getString("ipaddress"));
		sessionAttributes.setKeywords(rs.getString("keyword"));
		sessionAttributes.setGeoipCity(rs.getString("visitlocation"));
		sessionAttributes.setCookiesGa(rs.getString("cookies_ga"));
		sessionAttributes.setMethodName(rs.getString("method_name"));
		sessionAttributes.setGeoipRegion(rs.getString("geoip_region"));
		sessionAttributes.setAccountNumber(String.valueOf(rs.getLong("conversion_session_accountnumber")));
		sessionAttributes.setCookiesUtma(rs.getString("cookies_utma"));
		sessionAttributes.setCookiesUtmz(rs.getString("cookies_utmz"));
		sessionAttributes.setGeoipAreaCode(rs.getString("geoip_areacode"));
		sessionAttributes.setGeoipLatitude(rs.getString("geoip_latitude"));
		sessionAttributes.setGeoipTimeZone(rs.getString("geoip_timezone"));
		sessionAttributes.setGeoipLongitude(rs.getString("geoip_longitude"));
		sessionAttributes.setGeoipMetroCode(rs.getString("geoip_metrocode"));
		sessionAttributes.setLandingPageTld(rs.getString("landingPage_tld"));
		sessionAttributes.setLandingPageUrl(rs.getString("landingPage_url"));
		sessionAttributes.setGeoipipRangeEnd(rs.getString("geoip_ipRangeEnd"));
		sessionAttributes.setGeoipregionName(rs.getString("geoip_regionName"));
		sessionAttributes.setLandingPagegtld(rs.getString("landingPage_gtld"));
		sessionAttributes.setLandingPagepath(rs.getString("conversionsessionurl"));
		sessionAttributes.setGeoipcountryCode(rs.getString("geoip_countrycode"));
		sessionAttributes.setLandingPagecctld(rs.getString("landingpage_cctld"));
		sessionAttributes.setGeoipipRangeStart(rs.getString("geoip_iprangestart"));
		sessionAttributes.setLandingPagedomain(rs.getString("trackedsite"));
		sessionAttributes.setDiagnosticscomment(rs.getString("diagnostics_comment"));
		sessionAttributes.setContextsMainNumber(rs.getString("contexts_main_number"));
		sessionAttributes.setDiagnosticsisMobile(rs.getString("diagnostics_ismobile"));
		sessionAttributes.setGoogleAnalyticsterm(rs.getString("googleanalytics_term"));
		sessionAttributes.setLandingPagefragment(rs.getString("landingpage_fragment"));
		sessionAttributes.setLandingPageprotocol(rs.getString("landingpage_protocol"));
		sessionAttributes.setLandingPageshortName(rs.getString("landingPage_shortname"));
		sessionAttributes.setLandingPagesubdomain(rs.getString("landingpage_subdomain"));
		sessionAttributes.setFeatureextractorname(rs.getString("feature_extractor_name"));
		sessionAttributes.setGoogleAnalyticsmedium(rs.getString("googleanalytics_medium"));
		sessionAttributes.setGoogleAnalyticssource(rs.getString("googleanalytics_source"));
		sessionAttributes.setLandingPagequeryString(rs.getString("landingpage_querystring"));
		sessionAttributes.setLandingPageReferrertld(rs.getString("landingPageReferrer_tld"));
		sessionAttributes.setLandingPageReferrerurl(rs.getString("referrer"));
		sessionAttributes.setDiagnosticsbrowsername(rs.getString("diagnostics_browser_name"));
		sessionAttributes.setGoogleAnalyticscampaign(rs.getString("googleanalytics_campaign"));
		sessionAttributes.setLandingPageReferrergtld(rs.getString("landingpagereferrer_gtld"));
		sessionAttributes.setLandingPageReferrerpath(rs.getString("landingpagereferrer_path"));
		sessionAttributes.setFeatureextractorversion(rs.getString("feature_extractor_version"));
		sessionAttributes.setLandingPageReferrercctld(rs.getString("landingpagereferrer_cctld"));
		sessionAttributes.setDiagnosticscookiesEnabled(rs.getString("diagnostics_cookiesenabled"));
		sessionAttributes.setLandingPageReferrerdomain(rs.getString("landingpagereferrer_domain"));
		sessionAttributes.setDiagnosticsbrowserversion(rs.getString("diagnostics_browser_version"));
		sessionAttributes.setDiagnosticshasGACookieUtma(rs.getString("diagnostics_hasgacookieutma"));
		sessionAttributes.setDiagnosticshasGACookieUtmz(rs.getString("diagnostics_hasgacookieutmz"));
		sessionAttributes.setLandingPageregisteredDomain(rs.getString("landingpage_registereddomain"));
		sessionAttributes.setLandingPageReferrerfragment(rs.getString("landingpagereferrer_fragment"));
		sessionAttributes.setLandingPageReferrerprotocol(rs.getString("landingpagereferrer_protocol"));
		sessionAttributes.setLandingPageReferrershortName(rs.getString("landingpagereferrer_shortname"));
		sessionAttributes.setLandingPageReferrersubdomain(rs.getString("landingpagereferrer_subdomain"));
		sessionAttributes.setLandingPageReferrerqueryString(rs.getString("landingpagereferrer_querystring"));
		sessionAttributes.setDiagnosticsversiontrackingServer(rs.getString("diagnostics_version_trackingserver"));
		sessionAttributes.setLandingPageReferrerregisteredDomain(rs.getString("landingpagereferrer_registereddomain"));		
		
		WebtrackerModel wtModel = new WebtrackerModel();
		wtModel.setConversionid(rs.getString("conversionid"));
		wtModel.setTrackedwebsite(rs.getString("tracked_website"));
		wtModel.setConverteddatetime(rs.getString("convertedDateTime"));
		wtModel.setCallid(rs.getString("callid"));
		wtModel.setCallvalue(rs.getString("callValue"));
		wtModel.setAccountnumber(rs.getLong("call_accountNumber"));
		wtModel.setCalldate(rs.getString("calldate"));
		wtModel.setCalltime(rs.getString("calltime"));
		wtModel.setReferrer(rs.getString("referrer"));
		wtModel.setTrackedsite(rs.getString("trackedsite"));
		wtModel.setLandingpage(rs.getString("landingpage"));
		wtModel.setConversionpage(rs.getString("conversionPage"));
		wtModel.setKeyword(rs.getString("keyword"));
		wtModel.setMedium(rs.getString("medium"));
		wtModel.setSource(rs.getString("source"));
		wtModel.setCampaign(rs.getString("campaign"));
		wtModel.setIpaddress(rs.getString("ipaddress"));
		wtModel.setVisitlocation(rs.getString("visitlocation"));
		wtModel.setOriginalsessionurl(rs.getString("originalsessionurl"));
		wtModel.setOriginalsessionurltags(rs.getString("originalsessionurltags"));
		wtModel.setConversionsessionurl(rs.getString("conversionsessionurl"));
		wtModel.setConversionsessionurltags(rs.getString("conversionsessionurltags"));
		wtModel.setIsmobile(rs.getInt("ismobile"));
		wtModel.setQualityscore(rs.getDouble("qualityscore"));
		wtModel.setConversionSessionAttributes(sessionAttributes);
		
		return wtModel;
	}

}
