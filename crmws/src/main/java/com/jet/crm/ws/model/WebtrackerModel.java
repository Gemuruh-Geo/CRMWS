package com.jet.crm.ws.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WebtrackerModel implements Serializable {

	private static final long serialVersionUID = 2046435190259343218L;
	private String conversionid;

	private String converteddatetime;
	private String callid;
	private String callvalue;

	private ConversionSessionAttributes conversionSessionAttributes;

	private Long accountnumber;
	private String calldate;
	private String calltime;
	private String referrer;
	private String trackedsite;

	@JsonProperty("tracked_website")
	private String trackedwebsite;
	
	@JsonProperty("landing_page")
	private String landingpage;
	
	@JsonProperty("conversion_page")
	private String conversionpage;
	private String keyword;
	private String medium;
	private String source;
	private String campaign;
	private String ipaddress;
	private String visitlocation;
	private String originalsessionurl;
	private String originalsessionurltags;
	private String conversionsessionurl;
	private String conversionsessionurltags;
	private Integer ismobile;
	private Double qualityscore;

	public String getConversionid() {
		return conversionid;
	}

	public void setConversionid(String conversionid) {
		this.conversionid = conversionid;
	}

	public String getConverteddatetime() {
		return converteddatetime;
	}

	public void setConverteddatetime(String converteddatetime) {
		this.converteddatetime = converteddatetime;
	}

	public String getCallid() {
		return callid;
	}

	public void setCallid(String callid) {
		this.callid = callid;
	}

	public String getCallvalue() {
		return callvalue;
	}

	public void setCallvalue(String callvalue) {
		this.callvalue = callvalue;
	}

	public Long getAccountnumber() {
		return accountnumber;
	}

	public void setAccountnumber(Long accountnumber) {
		this.accountnumber = accountnumber;
	}

	public String getCalldate() {
		return calldate;
	}

	public void setCalldate(String calldate) {
		this.calldate = calldate;
	}

	public String getCalltime() {
		return calltime;
	}

	public void setCalltime(String calltime) {
		this.calltime = calltime;
	}

	public String getReferrer() {
		return referrer;
	}

	public void setReferrer(String referrer) {
		this.referrer = referrer;
	}

	public String getTrackedsite() {
		return trackedsite;
	}

	public void setTrackedsite(String trackedsite) {
		this.trackedsite = trackedsite;
	}

	public String getLandingpage() {
		return landingpage;
	}

	public void setLandingpage(String landingpage) {
		this.landingpage = landingpage;
	}

	public String getConversionpage() {
		return conversionpage;
	}

	public void setConversionpage(String conversionpage) {
		this.conversionpage = conversionpage;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

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

	public String getIpaddress() {
		return ipaddress;
	}

	public void setIpaddress(String ipaddress) {
		this.ipaddress = ipaddress;
	}

	public String getVisitlocation() {
		return visitlocation;
	}

	public void setVisitlocation(String visitlocation) {
		this.visitlocation = visitlocation;
	}

	public String getOriginalsessionurl() {
		return originalsessionurl;
	}

	public void setOriginalsessionurl(String originalsessionurl) {
		this.originalsessionurl = originalsessionurl;
	}

	public String getOriginalsessionurltags() {
		return originalsessionurltags;
	}

	public void setOriginalsessionurltags(String originalsessionurltags) {
		this.originalsessionurltags = originalsessionurltags;
	}

	public String getConversionsessionurl() {
		return conversionsessionurl;
	}

	public void setConversionsessionurl(String conversionsessionurl) {
		this.conversionsessionurl = conversionsessionurl;
	}

	public String getConversionsessionurltags() {
		return conversionsessionurltags;
	}

	public void setConversionsessionurltags(String conversionsessionurltags) {
		this.conversionsessionurltags = conversionsessionurltags;
	}

	public Integer getIsmobile() {
		return ismobile;
	}

	public void setIsmobile(Integer ismobile) {
		this.ismobile = ismobile;
	}

	public Double getQualityscore() {
		return qualityscore;
	}

	public void setQualityscore(Double qualityscore) {
		this.qualityscore = qualityscore;
	}

	public ConversionSessionAttributes getConversionSessionAttributes() {
		return conversionSessionAttributes;
	}

	public void setConversionSessionAttributes(
			ConversionSessionAttributes conversionSessionAttributes) {
		this.conversionSessionAttributes = conversionSessionAttributes;
	}

	public String getTrackedwebsite() {
		return trackedwebsite;
	}

	public void setTrackedwebsite(String trackedwebsite) {
		this.trackedwebsite = trackedwebsite;
	}

}
