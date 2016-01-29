package com.engage;

import java.io.Serializable;
import java.sql.Blob;
import java.sql.Date;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "signup")
public class Signup implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String region;
	private String fundraiserName;
	private String teamLeader;
	private String siteName;
	private String campaign;
	private String operations;
	private Date loginTime;
	private String title;
	private String firstName;
	private String surname;
	private String postcode;
	private String house;
	private String street;
	private String town;
	private String county;
	private String email;
	private Date dob;
	private boolean ageConsent;
	private String status;
	private String phoneNumber;
	private String landline;
	private boolean noNumberGiven;
	private String autismConnection;
	private String gender;
	private boolean giftAid;
	private boolean optInMail;
	private boolean optInEmail;
	private boolean optInPhone;
	private boolean optInSms;
	private int donation;
	private int frequency;
	private int startOn;
	private boolean supportAck;
	private int serviceUserNumber;
	private int sortcode;
	private int accountNumber;
	private String bankName;
	private String accountName;
	private String signatureName;
	private Date signatureDate;
	private Date formDate;
	private String [] fields = new String[200];
	public Signup() {
		super();
	}
	public int getId() {
		return id;
	}
	@XmlElement
	public void setId(int id) {
		this.id = id;
	}
	
	public String getRegion() {
		return region;
	}
	@XmlElement
	public void setRegion(String region) {
		this.region = region;
	}
	public String getFundraiserName() {
		return fundraiserName;
	}
	@XmlElement
	public void setFundraiserName(String fundraiserName) {
		this.fundraiserName = fundraiserName;
	}
	public String getTeamLeader() {
		return teamLeader;
	}
	@XmlElement
	public void setTeamLeader(String teamLeader) {
		this.teamLeader = teamLeader;
	}
	public String getSiteName() {
		return siteName;
	}
	@XmlElement
	public void setSiteName(String siteName) {
		this.siteName = siteName;
	}
	public String getCampaign() {
		return campaign;
	}
	@XmlElement
	public void setCampaign(String campaign) {
		this.campaign = campaign;
	}
	public String getOperations() {
		return operations;
	}
	@XmlElement
	public void setOperations(String operations) {
		this.operations = operations;
	}
	public Date getLoginTime() {
		return loginTime;
	}
	@XmlElement
	public void setLoginTime(Date loginTime) {
		this.loginTime = loginTime;
	}
	public String getTitle() {
		return title;
	}
	@XmlElement
	public void setTitle(String title) {
		this.title = title;
	}
	public String getFirstName() {
		return firstName;
	}
	@XmlElement
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getSurname() {
		return surname;
	}
	@XmlElement
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getPostcode() {
		return postcode;
	}
	@XmlElement
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
	public String getHouse() {
		return house;
	}
	@XmlElement
	public void setHouse(String house) {
		this.house = house;
	}
	public String getStreet() {
		return street;
	}
	@XmlElement
	public void setStreet(String street) {
		this.street = street;
	}
	public String getTown() {
		return town;
	}
	@XmlElement
	public void setTown(String town) {
		this.town = town;
	}
	public String getCounty() {
		return county;
	}
	@XmlElement
	public void setCounty(String county) {
		this.county = county;
	}
	public String getEmail() {
		return email;
	}
	@XmlElement
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDob() {
		return dob;
	}
	@XmlElement
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public boolean isAgeConsent() {
		return ageConsent;
	}
	@XmlElement
	public void setAgeConsent(boolean ageConsent) {
		this.ageConsent = ageConsent;
	}
	public String getStatus() {
		return status;
	}
	@XmlElement
	public void setStatus(String status) {
		this.status = status;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	@XmlElement
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getLandline() {
		return landline;
	}
	@XmlElement
	public void setLandline(String landline) {
		this.landline = landline;
	}
	public boolean isNoNumberGiven() {
		return noNumberGiven;
	}
	@XmlElement
	public void setNoNumberGiven(boolean noNumberGiven) {
		this.noNumberGiven = noNumberGiven;
	}
	public String getAutismConnection() {
		return autismConnection;
	}
	@XmlElement
	public void setAutismConnection(String autismConnection) {
		this.autismConnection = autismConnection;
	}
	public String getGender() {
		return gender;
	}
	@XmlElement
	public void setGender(String gender) {
		this.gender = gender;
	}
	public boolean isGiftAid() {
		return giftAid;
	}
	@XmlElement
	public void setGiftAid(boolean giftAid) {
		this.giftAid = giftAid;
	}
	public boolean isOptInMail() {
		return optInMail;
	}
	@XmlElement
	public void setOptInMail(boolean optInMail) {
		this.optInMail = optInMail;
	}
	public boolean isOptInEmail() {
		return optInEmail;
	}
	@XmlElement
	public void setOptInEmail(boolean optInEmail) {
		this.optInEmail = optInEmail;
	}
	public boolean isOptInPhone() {
		return optInPhone;
	}
	@XmlElement
	public void setOptInPhone(boolean optInPhone) {
		this.optInPhone = optInPhone;
	}
	public boolean isOptInSms() {
		return optInSms;
	}
	@XmlElement
	public void setOptInSms(boolean optInSms) {
		this.optInSms = optInSms;
	}
	public int getDonation() {
		return donation;
	}
	@XmlElement
	public void setDonation(int donation) {
		this.donation = donation;
	}
	public int getFrequency() {
		return frequency;
	}
	@XmlElement
	public void setFrequency(int frequency) {
		this.frequency = frequency;
	}
	public int getStartOn() {
		return startOn;
	}
	@XmlElement
	public void setStartOn(int startOn) {
		this.startOn = startOn;
	}
	public boolean isSupportAck() {
		return supportAck;
	}
	@XmlElement
	public void setSupportAck(boolean supportAck) {
		this.supportAck = supportAck;
	}
	public int getServiceUserNumber() {
		return serviceUserNumber;
	}
	@XmlElement
	public void setServiceUserNumber(int serviceUserNumber) {
		this.serviceUserNumber = serviceUserNumber;
	}
	public int getSortcode() {
		return sortcode;
	}
	@XmlElement
	public void setSortcode(int sortcode) {
		this.sortcode = sortcode;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	@XmlElement
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getBankName() {
		return bankName;
	}
	@XmlElement
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getAccountName() {
		return accountName;
	}
	@XmlElement
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public Date getSignatureDate() {
		return signatureDate;
	}
	@XmlElement
	public void setSignatureDate(Date signatureDate) {
		this.signatureDate = signatureDate;
	}
	public Date getFormDate() {
		return formDate;
	}
	@XmlElement
	public void setFormDate(Date formDate) {
		this.formDate = formDate;
	}
	public String[] getFields() {
		return fields;
	}
	@XmlElement
	public void setFields(String[] fields) {
		this.fields = fields;
	}
	
	public String getSignatureName() {
		return signatureName;
	}
	public void setSignatureName(String signatureName) {
		this.signatureName = signatureName;
	}
	
	
	
	
	
}
