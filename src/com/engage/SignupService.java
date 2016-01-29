package com.engage;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;



@Path("/SignupService")
public class SignupService {
	
	int i = 0;
	String [] fieldString = new String[200];
	SignupDao signupDao = new SignupDao();
	@PUT
	@Path("/signups")
	@Produces(MediaType.APPLICATION_XML)
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public String createSignup(@FormParam("id") int id, @FormParam("region") String region, @FormParam("fundraiserName") String fundraiserName,@FormParam("teamLeader") String teamLeader,@FormParam("siteName") String siteName,@FormParam("campaign") String campaign,@FormParam("operation") String operation,@FormParam("loginTime") Date loginTime,@FormParam("title") String title,@FormParam("firstName") String firstName,@FormParam("surname") String surname,@FormParam("postcode") String postcode,@FormParam("house") String house,@FormParam("street") String street,@FormParam("town") String town,@FormParam("county") String county,@FormParam("email") String email,@FormParam("dob") Date dob,@FormParam("ageConsent") boolean ageConsent,@FormParam("status") String status,@FormParam("phoneNumber") String phoneNumber,@FormParam("landline") String landline,@FormParam("noNumberGiven") boolean noNumberGiven,@FormParam("autismConnection") String autismConnection,@FormParam("gender") String gender,@FormParam("giftAid") boolean giftAid,@FormParam("optInMail") boolean optInMail ,@FormParam("optInEmail") boolean optInEmail,@FormParam("optInPhone") boolean optInPhone,@FormParam("optInSms") boolean optInSms,@FormParam("donation") int donation,@FormParam("frequency") int frequency,@FormParam("startOn") int startOn,@FormParam("supportAck") boolean supportAck,@FormParam("serviceUserNumber") int serviceUserNumber,@FormParam("sortcode") int sortcode,@FormParam("accountNumber") int accountNumber,@FormParam("bankName") String bankName,@FormParam("accountName") String accountName,@FormParam("signatureName") String signatureName,@FormParam("signatureDate") Date signatureDate,@FormParam("formDate") Date formDate,@FormParam("field1") String field1,@FormParam("field2") String field2,@FormParam("field3") String field3,@FormParam("field4") String field4,@FormParam("field5") String field5,@FormParam("field6") String field6,@FormParam("field7") String field7,@FormParam("field8") String field8,@FormParam("field9") String field9,@FormParam("field10") String field10,@FormParam("field11") String field11,@FormParam("field12") String field12,@FormParam("field13") String field13,@FormParam("field14") String field14,@FormParam("field15") String field15,@FormParam("field16") String field16,@FormParam("field17") String field17,@FormParam("field18") String field18,@FormParam("field19") String field19,@FormParam("field20") String field20,@FormParam("field21") String field21,@FormParam("field22") String field22,@FormParam("field23") String field23,@FormParam("field24") String field24,@FormParam("field25") String field25,@FormParam("field26") String field26,@FormParam("field27") String field27,@FormParam("field28") String field28,@FormParam("field29") String field29,@FormParam("field30") String field30,@FormParam("field31") String field31,@FormParam("field32") String field32,@FormParam("field33") String field33,@FormParam("field34") String field34,@FormParam("field35") String field35,@FormParam("field36") String field36,@FormParam("field37") String field37,@FormParam("field38") String field38,@FormParam("field39") String field39,@FormParam("field40") String field40,@FormParam("field41") String field41,@FormParam("field42") String field42,@FormParam("field43") String field43,@FormParam("field44") String field44,@FormParam("field45") String field45,@FormParam("field46") String field46,@FormParam("field47") String field47,@FormParam("field48") String field48,@FormParam("field49") String field49,@FormParam("field50") String field50,@FormParam("field51") String field51,@FormParam("field52") String field52,@FormParam("field53") String field53,@FormParam("field54") String field54,@FormParam("field55") String field55,@FormParam("field56") String field56,@FormParam("field57") String field57,@FormParam("field58") String field58,@FormParam("field59") String field59,@FormParam("field60") String field60,@FormParam("field61") String field61,@FormParam("field62") String field62,@FormParam("field63") String field63,@FormParam("field64") String field64,@FormParam("field65") String field65,@FormParam("field66") String field66,@FormParam("field67") String field67,@FormParam("field68") String field68,@FormParam("field69") String field69,@FormParam("field70") String field70,@FormParam("field71") String field71,@FormParam("field72") String field72,@FormParam("field73") String field73,@FormParam("field74") String field74,@FormParam("field75") String field75,@FormParam("field76") String field76,@FormParam("field77") String field77,@FormParam("field78") String field78,@FormParam("field79") String field79,@FormParam("field80") String field80,@FormParam("field81") String field81,@FormParam("field82") String field82,@FormParam("field83") String field83,@FormParam("field84") String field84,@FormParam("field85") String field85,@FormParam("field86") String field86,@FormParam("field87") String field87,@FormParam("field88") String field88,@FormParam("field89") String field89,@FormParam("field90") String field90,@FormParam("field91") String field91,@FormParam("field92") String field92,@FormParam("field93") String field93,@FormParam("field94") String field94,@FormParam("field95") String field95,@FormParam("field96") String field96,@FormParam("field97") String field97,@FormParam("field98") String field98,@FormParam("field99") String field99,@FormParam("field100") String field100,@FormParam("field101") String field101,@FormParam("field102") String field102,@FormParam("field103") String field103,@FormParam("field104") String field104,@FormParam("field105") String field105,@FormParam("field106") String field106,@FormParam("field107") String field107,@FormParam("field108") String field108,@FormParam("field109") String field109,@FormParam("field110") String field110,@FormParam("field111") String field111,@FormParam("field112") String field112,@FormParam("field113") String field113,@FormParam("field114") String field114,@FormParam("field115") String field115,@FormParam("field116") String field116,@FormParam("field117") String field117,@FormParam("field118") String field118,@FormParam("field119") String field119,@FormParam("field120") String field120,@FormParam("field121") String field121,@FormParam("field122") String field122,@FormParam("field123") String field123,@FormParam("field124") String field124,@FormParam("field125") String field125,@FormParam("field126") String field126,@FormParam("field127") String field127,@FormParam("field128") String field128,@FormParam("field129") String field129,@FormParam("field130") String field130,@FormParam("field131") String field131,@FormParam("field132") String field132,@FormParam("field133") String field133,@FormParam("field134") String field134,@FormParam("field135") String field135,@FormParam("field136") String field136,@FormParam("field137") String field137,@FormParam("field138") String field138,@FormParam("field139") String field139,@FormParam("field140") String field140,@FormParam("field141") String field141,@FormParam("field142") String field142,@FormParam("field143") String field143,@FormParam("field144") String field144,@FormParam("field145") String field145,@FormParam("field146") String field146,@FormParam("field147") String field147,@FormParam("field148") String field148,@FormParam("field149") String field149,@FormParam("field150") String field150,@FormParam("field151") String field151,@FormParam("field152") String field152,@FormParam("field153") String field153,@FormParam("field154") String field154,@FormParam("field155") String field155,@FormParam("field156") String field156,@FormParam("field157") String field157,@FormParam("field158") String field158,@FormParam("field159") String field159,@FormParam("field160") String field160,@FormParam("field161") String field161,@FormParam("field162") String field162,@FormParam("field163") String field163,@FormParam("field164") String field164,@FormParam("field165") String field165,@FormParam("field166") String field166,@FormParam("field167") String field167,@FormParam("field168") String field168,@FormParam("field169") String field169,@FormParam("field170") String field170,@FormParam("field171") String field171,@FormParam("field172") String field172,@FormParam("field173") String field173,@FormParam("field174") String field174,@FormParam("field175") String field175,@FormParam("field176") String field176,@FormParam("field177") String field177,@FormParam("field178") String field178,@FormParam("field179") String field179,@FormParam("field180") String field180,@FormParam("field181") String field181,@FormParam("field182") String field182,@FormParam("field183") String field183,@FormParam("field184") String field184,@FormParam("field185") String field185,@FormParam("field186") String field186,@FormParam("field187") String field187,@FormParam("field188") String field188,@FormParam("field189") String field189,@FormParam("field190") String field190,@FormParam("field191") String field191,@FormParam("field192") String field192,@FormParam("field193") String field193,@FormParam("field194") String field194,@FormParam("field195") String field195,@FormParam("field196") String field196,@FormParam("field197") String field197,@FormParam("field198") String field198,@FormParam("field199") String field199,@FormParam("field200") String field200, @Context HttpServletResponse servletResponse) throws IOException, ClassNotFoundException{
		
	
	
		Signup su = new Signup();
		
	
		
		su.setId(id);
		su.setRegion(region);
		su.setFundraiserName(fundraiserName);
		su.setTeamLeader(teamLeader);
		su.setSiteName(siteName);
		su.setCampaign(campaign);
		su.setOperations(operation);
		su.setLoginTime(loginTime);
		su.setTitle(title);
		su.setFirstName(firstName);
		su.setSurname(surname);
		su.setPostcode(postcode);
		su.setHouse(house);
		su.setStreet(street);
		su.setTown(town);
		su.setCounty(county);
		su.setEmail(email);
		su.setDob(dob);
		su.setAgeConsent(ageConsent);
		su.setStatus(status);
		su.setPhoneNumber(phoneNumber);
		su.setLandline(landline);
		su.setNoNumberGiven(noNumberGiven);
		su.setAutismConnection(autismConnection);
		su.setGender(gender);
		su.setGiftAid(giftAid);
		su.setOptInMail(optInMail);
		su.setOptInEmail(optInEmail);
		su.setOptInPhone(optInPhone);
		su.setOptInSms(optInSms);
		su.setDonation(donation);
		su.setFrequency(frequency);
		su.setSupportAck(supportAck);
		su.setServiceUserNumber(serviceUserNumber);
		su.setSortcode(sortcode);
		su.setAccountNumber(accountNumber);
		su.setAccountName(accountName);
		su.setSignatureName(signatureName);
		su.setSignatureDate(signatureDate);
		su.setFormDate(formDate);
		
		fieldString[0] = field1;
		fieldString[1] = field2;
		fieldString[2] = field3;
		fieldString[3] = field4;
		fieldString[4] = field5;
		fieldString[5] = field6;
		fieldString[6] = field7;
		fieldString[7] = field8;
		fieldString[8] = field9;
		fieldString[9] = field10;
		fieldString[10] = field11;
		fieldString[11] = field12;
		fieldString[12] = field13;
		fieldString[13] = field14;
		fieldString[14] = field15;
		fieldString[15] = field16;
		fieldString[16] = field17;
		fieldString[17] = field18;
		fieldString[18] = field19;
		fieldString[19] = field20;
		fieldString[20] = field21;
		fieldString[21] = field22;
		fieldString[22] = field23;
		fieldString[23] = field24;
		fieldString[24] = field25;
		fieldString[25] = field26;
		fieldString[26] = field27;
		fieldString[27] = field28;
		fieldString[28] = field29;
		fieldString[29] = field30;
		fieldString[30] = field31;
		fieldString[31] = field32;
		fieldString[32] = field33;
		fieldString[33] = field34;
		fieldString[34] = field35;
		fieldString[35] = field36;
		fieldString[36] = field37;
		fieldString[37] = field38;
		fieldString[38] = field39;
		fieldString[39] = field40;
		fieldString[40] = field41;
		fieldString[41] = field42;
		fieldString[42] = field43;
		fieldString[43] = field44;
		fieldString[44] = field45;
		fieldString[45] = field46;
		fieldString[46] = field47;
		fieldString[47] = field48;
		fieldString[48] = field49;
		fieldString[49] = field50;
		fieldString[50] = field51;
		fieldString[51] = field52;
		fieldString[52] = field53;
		fieldString[53] = field54;
		fieldString[54] = field55;
		fieldString[55] = field56;
		fieldString[56] = field57;
		fieldString[57] = field58;
		fieldString[58] = field59;
		fieldString[59] = field60;
		fieldString[60] = field61;
		fieldString[61] = field62;
		fieldString[62] = field63;
		fieldString[63] = field64;
		fieldString[64] = field65;
		fieldString[65] = field66;
		fieldString[66] = field67;
		fieldString[67] = field68;
		fieldString[68] = field69;
		fieldString[69] = field70;
		fieldString[70] = field71;
		fieldString[71] = field72;
		fieldString[72] = field73;
		fieldString[73] = field74;
		fieldString[74] = field75;
		fieldString[75] = field76;
		fieldString[76] = field77;
		fieldString[77] = field78;
		fieldString[78] = field79;
		fieldString[79] = field80;
		fieldString[80] = field81;
		fieldString[81] = field82;
		fieldString[82] = field83;
		fieldString[83] = field84;
		fieldString[84] = field85;
		fieldString[85] = field86;
		fieldString[86] = field87;
		fieldString[87] = field88;
		fieldString[88] = field89;
		fieldString[89] = field90;
		fieldString[90] = field91;
		fieldString[91] = field92;
		fieldString[92] = field93;
		fieldString[93] = field94;
		fieldString[94] = field95;
		fieldString[95] = field96;
		fieldString[96] = field97;
		fieldString[97] = field98;
		fieldString[98] = field99;
		fieldString[99] = field100;
		fieldString[100] = field101;
		fieldString[101] = field102;
		fieldString[102] = field103;
		fieldString[103] = field104;
		fieldString[104] = field105;
		fieldString[105] = field106;
		fieldString[106] = field107;
		fieldString[107] = field108;
		fieldString[108] = field109;
		fieldString[109] = field110;
		fieldString[110] = field111;
		fieldString[111] = field112;
		fieldString[112] = field113;
		fieldString[113] = field114;
		fieldString[114] = field115;
		fieldString[115] = field116;
		fieldString[116] = field117;
		fieldString[117] = field118;
		fieldString[118] = field119;
		fieldString[119] = field120;
		fieldString[120] = field121;
		fieldString[121] = field122;
		fieldString[122] = field123;
		fieldString[123] = field124;
		fieldString[124] = field125;
		fieldString[125] = field126;
		fieldString[126] = field127;
		fieldString[127] = field128;
		fieldString[128] = field129;
		fieldString[129] = field130;
		fieldString[130] = field131;
		fieldString[131] = field132;
		fieldString[132] = field133;
		fieldString[133] = field134;
		fieldString[134] = field135;
		fieldString[135] = field136;
		fieldString[136] = field137;
		fieldString[137] = field138;
		fieldString[138] = field139;
		fieldString[139] = field140;
		fieldString[140] = field141;
		fieldString[141] = field142;
		fieldString[142] = field143;
		fieldString[143] = field144;
		fieldString[144] = field145;
		fieldString[145] = field146;
		fieldString[146] = field147;
		fieldString[147] = field148;
		fieldString[148] = field149;
		fieldString[149] = field150;
		fieldString[150] = field151;
		fieldString[151] = field152;
		fieldString[152] = field153;
		fieldString[153] = field154;
		fieldString[154] = field155;
		fieldString[155] = field156;
		fieldString[156] = field157;
		fieldString[157] = field158;
		fieldString[158] = field159;
		fieldString[159] = field160;
		fieldString[160] = field161;
		fieldString[161] = field162;
		fieldString[162] = field163;
		fieldString[163] = field164;
		fieldString[164] = field165;
		fieldString[165] = field166;
		fieldString[166] = field167;
		fieldString[167] = field168;
		fieldString[168] = field169;
		fieldString[169] = field170;
		fieldString[170] = field171;
		fieldString[171] = field172;
		fieldString[172] = field173;
		fieldString[173] = field174;
		fieldString[174] = field175;
		fieldString[175] = field176;
		fieldString[176] = field177;
		fieldString[177] = field178;
		fieldString[178] = field179;
		fieldString[179] = field180;
		fieldString[180] = field181;
		fieldString[181] = field182;
		fieldString[182] = field183;
		fieldString[183] = field184;
		fieldString[184] = field185;
		fieldString[185] = field186;
		fieldString[186] = field187;
		fieldString[187] = field188;
		fieldString[188] = field189;
		fieldString[189] = field190;
		fieldString[190] = field191;
		fieldString[191] = field192;
		fieldString[192] = field193;
		fieldString[193] = field194;
		fieldString[194] = field195;
		fieldString[195] = field196;
		fieldString[196] = field197;
		fieldString[197] = field198;
		fieldString[198] = field199;
		fieldString[199] = field200;
		
		
		su.setFields(fieldString);
		
		//System.out.println("form id:: "+id+"fname::"+name);
		int result = signupDao.saveSignUp(su);
		if(result == 1){
			return "<result>success</result>";
		}
		return "<result>failure</result>";
		
	}
	
}
