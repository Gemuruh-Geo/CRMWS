package com.jet.crm.ws.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ConversionSessionAttributes implements Serializable {

	private static final long serialVersionUID = -8914048116311716450L;
	private String medium;
	private String source;
	private String campaign;

	@JsonProperty("geoip.ip")
	private String geoipIp;
	private String keywords;

	@JsonProperty("geoip.city")
	private String geoipCity;

	@JsonProperty("cookies._ga")
	private String cookiesGa;

	@JsonProperty("method_name")
	private String methodName;

	@JsonProperty("geoip.region")
	private String geoipRegion;
	private String accountNumber;

	@JsonProperty("cookies.__utma")
	private String cookiesUtma;

	@JsonProperty("cookies.__utmz")
	private String cookiesUtmz;

	@JsonProperty("geoip.areaCode")
	private String geoipAreaCode;

	@JsonProperty("geoip.latitude")
	private String geoipLatitude;

	@JsonProperty("geoip.timezone")
	private String geoipTimeZone;

	@JsonProperty("geoip.longitude")
	private String geoipLongitude;

	@JsonProperty("geoip.metroCode")
	private String geoipMetroCode;

	@JsonProperty("landingPage.tld")
	private String landingPageTld;

	@JsonProperty("landingPage.url")
	private String landingPageUrl;

	@JsonProperty("geoip.ipRangeEnd")
	private String geoipipRangeEnd;

	@JsonProperty("geoip.regionName")
	private String geoipregionName;

	@JsonProperty("landingPage.gtld")
	private String landingPagegtld;

	@JsonProperty("landingPage.path")
	private String landingPagepath;

	@JsonProperty("geoip.countryCode")
	private String geoipcountryCode;

	@JsonProperty("landingPage.cctld")
	private String landingPagecctld;

	@JsonProperty("geoip.ipRangeStart")
	private String geoipipRangeStart;

	@JsonProperty("landingPage.domain")
	private String landingPagedomain;

	@JsonProperty("diagnostics.comment")
	private String diagnosticscomment;

	@JsonProperty("contexts.Main.Number")
	private String contextsMainNumber;

	@JsonProperty("diagnostics.isMobile")
	private String diagnosticsisMobile;

	@JsonProperty("googleAnalytics.term")
	private String googleAnalyticsterm;

	@JsonProperty("landingPage.fragment")
	private String landingPagefragment;

	@JsonProperty("landingPage.protocol")
	private String landingPageprotocol;

	@JsonProperty("landingPage.shortName")
	private String landingPageshortName;

	@JsonProperty("landingPage.subdomain")
	private String landingPagesubdomain;

	@JsonProperty("feature.extractor.name")
	private String featureextractorname;

	@JsonProperty("googleAnalytics.medium")
	private String googleAnalyticsmedium;

	@JsonProperty("googleAnalytics.source")
	private String googleAnalyticssource;

	@JsonProperty("landingPage.queryString")
	private String landingPagequeryString;

	@JsonProperty("landingPageReferrer.tld")
	private String landingPageReferrertld;

	@JsonProperty("landingPageReferrer.url")
	private String landingPageReferrerurl;

	@JsonProperty("diagnostics.browser.name")
	private String diagnosticsbrowsername;

	@JsonProperty("googleAnalytics.campaign")
	private String googleAnalyticscampaign;

	@JsonProperty("landingPageReferrer.gtld")
	private String landingPageReferrergtld;

	@JsonProperty("landingPageReferrer.path")
	private String landingPageReferrerpath;

	@JsonProperty("feature.extractor.version")
	private String featureextractorversion;

	@JsonProperty("landingPageReferrer.cctld")
	private String landingPageReferrercctld;

	@JsonProperty("diagnostics.cookiesEnabled")
	private String diagnosticscookiesEnabled;

	@JsonProperty("landingPageReferrer.domain")
	private String landingPageReferrerdomain;

	@JsonProperty("diagnostics.browser.version")
	private String diagnosticsbrowserversion;

	@JsonProperty("diagnostics.hasGACookieUtma")
	private String diagnosticshasGACookieUtma;

	@JsonProperty("diagnostics.hasGACookieUtmz")
	private String diagnosticshasGACookieUtmz;

	@JsonProperty("landingPage.registeredDomain")
	private String landingPageregisteredDomain;

	@JsonProperty("landingPageReferrer.fragment")
	private String landingPageReferrerfragment;

	@JsonProperty("landingPageReferrer.protocol")
	private String landingPageReferrerprotocol;

	@JsonProperty("landingPageReferrer.shortName")
	private String landingPageReferrershortName;

	@JsonProperty("landingPageReferrer.subdomain")
	private String landingPageReferrersubdomain;

	@JsonProperty("landingPageReferrer.queryString")
	private String landingPageReferrerqueryString;

	@JsonProperty("diagnostics.version.trackingServer")
	private String diagnosticsversiontrackingServer;

	@JsonProperty("landingPageReferrer.registeredDomain")
	private String landingPageReferrerregisteredDomain;

	public String getMedium() {
		return medium;
	}

	public void setMedium(String medium) {
		this.medium = medium;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getCampaign() {
		return campaign;
	}

	public void setCampaign(String campaign) {
		this.campaign = campaign;
	}

	public String getGeoipIp() {
		return geoipIp;
	}

	public void setGeoipIp(String geoipIp) {
		this.geoipIp = geoipIp;
	}

	public String getKeywords() {
		return keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	public String getGeoipCity() {
		return geoipCity;
	}

	public void setGeoipCity(String geoipCity) {
		this.geoipCity = geoipCity;
	}

	public String getCookiesGa() {
		return cookiesGa;
	}

	public void setCookiesGa(String cookiesGa) {
		this.cookiesGa = cookiesGa;
	}

	public String getMethodName() {
		return methodName;
	}

	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}

	public String getGeoipRegion() {
		return geoipRegion;
	}

	public void setGeoipRegion(String geoipRegion) {
		this.geoipRegion = geoipRegion;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getCookiesUtma() {
		return cookiesUtma;
	}

	public void setCookiesUtma(String cookiesUtma) {
		this.cookiesUtma = cookiesUtma;
	}

	public String getCookiesUtmz() {
		return cookiesUtmz;
	}

	public void setCookiesUtmz(String cookiesUtmz) {
		this.cookiesUtmz = cookiesUtmz;
	}

	public String getGeoipAreaCode() {
		return geoipAreaCode;
	}

	public void setGeoipAreaCode(String geoipAreaCode) {
		this.geoipAreaCode = geoipAreaCode;
	}

	public String getGeoipLatitude() {
		return geoipLatitude;
	}

	public void setGeoipLatitude(String geoipLatitude) {
		this.geoipLatitude = geoipLatitude;
	}

	public String getGeoipTimeZone() {
		return geoipTimeZone;
	}

	public void setGeoipTimeZone(String geoipTimeZone) {
		this.geoipTimeZone = geoipTimeZone;
	}

	public String getGeoipLongitude() {
		return geoipLongitude;
	}

	public void setGeoipLongitude(String geoipLongitude) {
		this.geoipLongitude = geoipLongitude;
	}

	public String getGeoipMetroCode() {
		return geoipMetroCode;
	}

	public void setGeoipMetroCode(String geoipMetroCode) {
		this.geoipMetroCode = geoipMetroCode;
	}

	public String getLandingPageTld() {
		return landingPageTld;
	}

	public void setLandingPageTld(String landingPageTld) {
		this.landingPageTld = landingPageTld;
	}

	public String getLandingPageUrl() {
		return landingPageUrl;
	}

	public void setLandingPageUrl(String landingPageUrl) {
		this.landingPageUrl = landingPageUrl;
	}

	public String getGeoipipRangeEnd() {
		return geoipipRangeEnd;
	}

	public void setGeoipipRangeEnd(String geoipipRangeEnd) {
		this.geoipipRangeEnd = geoipipRangeEnd;
	}

	public String getGeoipregionName() {
		return geoipregionName;
	}

	public void setGeoipregionName(String geoipregionName) {
		this.geoipregionName = geoipregionName;
	}

	public String getLandingPagegtld() {
		return landingPagegtld;
	}

	public void setLandingPagegtld(String landingPagegtld) {
		this.landingPagegtld = landingPagegtld;
	}

	public String getLandingPagepath() {
		return landingPagepath;
	}

	public void setLandingPagepath(String landingPagepath) {
		this.landingPagepath = landingPagepath;
	}

	public String getGeoipcountryCode() {
		return geoipcountryCode;
	}

	public void setGeoipcountryCode(String geoipcountryCode) {
		this.geoipcountryCode = geoipcountryCode;
	}

	public String getLandingPagecctld() {
		return landingPagecctld;
	}

	public void setLandingPagecctld(String landingPagecctld) {
		this.landingPagecctld = landingPagecctld;
	}

	public String getGeoipipRangeStart() {
		return geoipipRangeStart;
	}

	public void setGeoipipRangeStart(String geoipipRangeStart) {
		this.geoipipRangeStart = geoipipRangeStart;
	}

	public String getLandingPagedomain() {
		return landingPagedomain;
	}

	public void setLandingPagedomain(String landingPagedomain) {
		this.landingPagedomain = landingPagedomain;
	}

	public String getDiagnosticscomment() {
		return diagnosticscomment;
	}

	public void setDiagnosticscomment(String diagnosticscomment) {
		this.diagnosticscomment = diagnosticscomment;
	}

	public String getContextsMainNumber() {
		return contextsMainNumber;
	}

	public void setContextsMainNumber(String contextsMainNumber) {
		this.contextsMainNumber = contextsMainNumber;
	}

	public String getDiagnosticsisMobile() {
		return diagnosticsisMobile;
	}

	public void setDiagnosticsisMobile(String diagnosticsisMobile) {
		this.diagnosticsisMobile = diagnosticsisMobile;
	}

	public String getGoogleAnalyticsterm() {
		return googleAnalyticsterm;
	}

	public void setGoogleAnalyticsterm(String googleAnalyticsterm) {
		this.googleAnalyticsterm = googleAnalyticsterm;
	}

	public String getLandingPagefragment() {
		return landingPagefragment;
	}

	public void setLandingPagefragment(String landingPagefragment) {
		this.landingPagefragment = landingPagefragment;
	}

	public String getLandingPageprotocol() {
		return landingPageprotocol;
	}

	public void setLandingPageprotocol(String landingPageprotocol) {
		this.landingPageprotocol = landingPageprotocol;
	}

	public String getLandingPageshortName() {
		return landingPageshortName;
	}

	public void setLandingPageshortName(String landingPageshortName) {
		this.landingPageshortName = landingPageshortName;
	}

	public String getLandingPagesubdomain() {
		return landingPagesubdomain;
	}

	public void setLandingPagesubdomain(String landingPagesubdomain) {
		this.landingPagesubdomain = landingPagesubdomain;
	}

	public String getFeatureextractorname() {
		return featureextractorname;
	}

	public void setFeatureextractorname(String featureextractorname) {
		this.featureextractorname = featureextractorname;
	}

	public String getGoogleAnalyticsmedium() {
		return googleAnalyticsmedium;
	}

	public void setGoogleAnalyticsmedium(String googleAnalyticsmedium) {
		this.googleAnalyticsmedium = googleAnalyticsmedium;
	}

	public String getGoogleAnalyticssource() {
		return googleAnalyticssource;
	}

	public void setGoogleAnalyticssource(String googleAnalyticssource) {
		this.googleAnalyticssource = googleAnalyticssource;
	}

	public String getLandingPagequeryString() {
		return landingPagequeryString;
	}

	public void setLandingPagequeryString(String landingPagequeryString) {
		this.landingPagequeryString = landingPagequeryString;
	}

	public String getLandingPageReferrertld() {
		return landingPageReferrertld;
	}

	public void setLandingPageReferrertld(String landingPageReferrertld) {
		this.landingPageReferrertld = landingPageReferrertld;
	}

	public String getLandingPageReferrerurl() {
		return landingPageReferrerurl;
	}

	public void setLandingPageReferrerurl(String landingPageReferrerurl) {
		this.landingPageReferrerurl = landingPageReferrerurl;
	}

	public String getDiagnosticsbrowsername() {
		return diagnosticsbrowsername;
	}

	public void setDiagnosticsbrowsername(String diagnosticsbrowsername) {
		this.diagnosticsbrowsername = diagnosticsbrowsername;
	}

	public String getGoogleAnalyticscampaign() {
		return googleAnalyticscampaign;
	}

	public void setGoogleAnalyticscampaign(String googleAnalyticscampaign) {
		this.googleAnalyticscampaign = googleAnalyticscampaign;
	}

	public String getLandingPageReferrergtld() {
		return landingPageReferrergtld;
	}

	public void setLandingPageReferrergtld(String landingPageReferrergtld) {
		this.landingPageReferrergtld = landingPageReferrergtld;
	}

	public String getLandingPageReferrerpath() {
		return landingPageReferrerpath;
	}

	public void setLandingPageReferrerpath(String landingPageReferrerpath) {
		this.landingPageReferrerpath = landingPageReferrerpath;
	}

	public String getFeatureextractorversion() {
		return featureextractorversion;
	}

	public void setFeatureextractorversion(String featureextractorversion) {
		this.featureextractorversion = featureextractorversion;
	}

	public String getLandingPageReferrercctld() {
		return landingPageReferrercctld;
	}

	public void setLandingPageReferrercctld(String landingPageReferrercctld) {
		this.landingPageReferrercctld = landingPageReferrercctld;
	}

	public String getDiagnosticscookiesEnabled() {
		return diagnosticscookiesEnabled;
	}

	public void setDiagnosticscookiesEnabled(String diagnosticscookiesEnabled) {
		this.diagnosticscookiesEnabled = diagnosticscookiesEnabled;
	}

	public String getLandingPageReferrerdomain() {
		return landingPageReferrerdomain;
	}

	public void setLandingPageReferrerdomain(String landingPageReferrerdomain) {
		this.landingPageReferrerdomain = landingPageReferrerdomain;
	}

	public String getDiagnosticsbrowserversion() {
		return diagnosticsbrowserversion;
	}

	public void setDiagnosticsbrowserversion(String diagnosticsbrowserversion) {
		this.diagnosticsbrowserversion = diagnosticsbrowserversion;
	}

	public String getDiagnosticshasGACookieUtma() {
		return diagnosticshasGACookieUtma;
	}

	public void setDiagnosticshasGACookieUtma(String diagnosticshasGACookieUtma) {
		this.diagnosticshasGACookieUtma = diagnosticshasGACookieUtma;
	}

	public String getDiagnosticshasGACookieUtmz() {
		return diagnosticshasGACookieUtmz;
	}

	public void setDiagnosticshasGACookieUtmz(String diagnosticshasGACookieUtmz) {
		this.diagnosticshasGACookieUtmz = diagnosticshasGACookieUtmz;
	}

	public String getLandingPageregisteredDomain() {
		return landingPageregisteredDomain;
	}

	public void setLandingPageregisteredDomain(
			String landingPageregisteredDomain) {
		this.landingPageregisteredDomain = landingPageregisteredDomain;
	}

	public String getLandingPageReferrerfragment() {
		return landingPageReferrerfragment;
	}

	public void setLandingPageReferrerfragment(
			String landingPageReferrerfragment) {
		this.landingPageReferrerfragment = landingPageReferrerfragment;
	}

	public String getLandingPageReferrerprotocol() {
		return landingPageReferrerprotocol;
	}

	public void setLandingPageReferrerprotocol(
			String landingPageReferrerprotocol) {
		this.landingPageReferrerprotocol = landingPageReferrerprotocol;
	}

	public String getLandingPageReferrershortName() {
		return landingPageReferrershortName;
	}

	public void setLandingPageReferrershortName(
			String landingPageReferrershortName) {
		this.landingPageReferrershortName = landingPageReferrershortName;
	}

	public String getLandingPageReferrersubdomain() {
		return landingPageReferrersubdomain;
	}

	public void setLandingPageReferrersubdomain(
			String landingPageReferrersubdomain) {
		this.landingPageReferrersubdomain = landingPageReferrersubdomain;
	}

	public String getLandingPageReferrerqueryString() {
		return landingPageReferrerqueryString;
	}

	public void setLandingPageReferrerqueryString(
			String landingPageReferrerqueryString) {
		this.landingPageReferrerqueryString = landingPageReferrerqueryString;
	}

	public String getDiagnosticsversiontrackingServer() {
		return diagnosticsversiontrackingServer;
	}

	public void setDiagnosticsversiontrackingServer(
			String diagnosticsversiontrackingServer) {
		this.diagnosticsversiontrackingServer = diagnosticsversiontrackingServer;
	}

	public String getLandingPageReferrerregisteredDomain() {
		return landingPageReferrerregisteredDomain;
	}

	public void setLandingPageReferrerregisteredDomain(
			String landingPageReferrerregisteredDomain) {
		this.landingPageReferrerregisteredDomain = landingPageReferrerregisteredDomain;
	}

}
