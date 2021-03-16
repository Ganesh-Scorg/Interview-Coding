import postilion.servicesinterface.emv.Tlv;
import postilion.servicesinterface.emv.XEmvUnableToExtract;

import com.aciworldwide.pim.messages.base24eps.components.EMVRqData_Type;

import postilion.realtime.sdk.message.bitmap.StructuredIccData;
import postilion.realtime.sdk.util.convert.Transform;
import postilion.realtime.sdk.xml.iccdata.IccData;
import postilion.realtime.sdk.xml.iccdata.IccRequest;
import postilion.realtime.sdk.xml.iccdata.IccResponse;
import postilion.realtime.sdk.xml.iccdata.IssuerActionCode;
import postilion.servicesinterface.emv.Tag;


public class _127_025_IccData_Builder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//EMVRqData_Type emvRqData_Type;
		//emvRqData_Type.setEMVRqRawData(eMVRqRawData);
		//String emvRawData = "mgMZBiWfAgYAAAABIXlfKgIIQJwBAJ8DBgAAAAAAAJ8aAghAnxAHBgEOA6KIAJ8nAYCfNgIAAp83BDeHbu6CAlgAlQWAAAQAAJ8mCFmc5pYHPJBI";
		//String emvRawData = "nzQGMDIwMjAynzQIMDEwMjAzMDSfMwYyMTQzNjWfAwwwMDAwMDAwMDAxMDCfAgwwMDAwMDAwMTAwMDCCBDQ0NTWfJwIwMU8gMTIzNDU2Nzg5MDAwMDAwMDAwMDAwMDAwMDAwMDAwMDCfJhA0QjYyQ0QwQTJBOUI2MDFFn1MBMd94QDAwMDAwMDAwMDAwMDAwMDAwMDAwMDAwMDAwMDAwMDAwMDAwMDAwMDAwMDAwMDAwMDAwMDAwMDAwMDEwMjAzMDRfKgM4NDCffBE1NTU1ODg4ODk5OTk2NjMzNp98ETU1NTU4ODg4OTk5OTY2MzM2nxoDODQwnAIzOZoGMTgwNjA2n0ECMjOfEA4wNjIzMEE2Nzg5QUJDRJUKMDEwMjAzMDQwNZ8JBDMzNjafNwk4NzY1NDMyMTCfBwQ0MTIznzYEMDEyM581AjAy";
		String emvRawData = "9A031906259F02060000000121795F2A0208409C01009F03060000000000009F1A0208409F100706010E03A288009F2701809F360200029F370437876EEE82025800950580000400009F2608599CE696073C9048";
		byte[] tlv_bytes = emvRawData.getBytes();
		byte[] bindatatlv = Transform.fromHexDataToBinData(tlv_bytes);
		System.out.println("bindatatlv ="+Transform.getString(bindatatlv));
		
		Tlv tlv = new Tlv();
		try {
			tlv.fromMsg(bindatatlv);
		} catch (XEmvUnableToExtract e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String Tag82 = tlv.getField(Tag._82_APPLICATION_INTERCHANGE_PROFILE);
		System.out.println("Tag 82="+Transform.fromBinToHex(Tag82));
		/////////////////
		IccRequest iccRequest = new IccRequest();
		
		iccRequest.setAmountAuthorized(Transform.fromBinToHex(tlv.getField(Tag._9F02_AMOUNT_AUTHORIZED_NUMERIC)));
		iccRequest.setAmountOther(Transform.fromBinToHex(tlv.getField(Tag._9F03_AMOUNT_OTHER_NUMERIC)));
		iccRequest.setApplicationIdentifier(Transform.fromBinToHex(tlv.getField(Tag._4F_APPLICATION_IDENTIFIER)));
		iccRequest.setApplicationInterchangeProfile(
				Transform.fromBinToHex(tlv.getField(Tag._82_APPLICATION_INTERCHANGE_PROFILE)));
		iccRequest.setApplicationTransactionCounter(
				Transform.fromBinToHex(tlv.getField(Tag._9F36_APPLICATION_TRANSACTION_COUNTER)));
		iccRequest.setApplicationUsageControl(Transform.fromBinToHex(tlv.getField(Tag._9F07_APPLICATION_USAGE_CONTROL)));
		iccRequest.setAuthorizationResponseCode(Transform.fromBinToHex(tlv.getField(Tag._8A_AUTHORIZATION_RESPONSE_CODE)));
		iccRequest.setCryptogram(Transform.fromBinToHex(tlv.getField(Tag._9F26_APPLICATION_CRYPTOGRAM)));
		iccRequest
			.setCryptogramInformationData(Transform.fromBinToHex(tlv.getField(Tag._9F27_CRYPTOGRAM_INFORMATION_DATA)));
		iccRequest.setCustomerExclusiveData(Transform.fromBinToHex(tlv.getField(Tag._9F7C_CUSTOMER_EXCLUSIVE_DATA)));
		iccRequest.setCvmList(Transform.fromBinToHex(tlv.getField(Tag._8E_CVM_LIST)));
		iccRequest.setCvmResults(Transform.fromBinToHex(tlv.getField(Tag._9F34_CVM_RESULTS)));
		iccRequest.setInterfaceDeviceSerialNumber(Transform.fromBinToHex(tlv.getField(Tag._9F1E_IFD_SERIAL_NUMBER)));
		iccRequest.setIssuerApplicationData(Transform.fromBinToHex(tlv.getField(Tag._9F10_ISSUER_APPLICATION_DATA)));
		iccRequest.setIssuerScriptResults(Transform.fromBinToHex(tlv.getField(Tag._DF09_ISSUER_SCRIPT_RESULTS)));
		iccRequest.setTerminalApplicationVersionNumber(
				Transform.fromBinToHex(tlv.getField(Tag._9F09_TERM_APPLICATION_VERSION_NR)));
		iccRequest.setTerminalCapabilities(Transform.fromBinToHex(tlv.getField(Tag._9F33_TERMINAL_CAPABILITIES)));
		iccRequest.setTerminalType(Transform.fromBinToHex(tlv.getField(Tag._9F35_TERMINAL_TYPE)));
		iccRequest
			.setTerminalVerificationResult(Transform.fromBinToHex(tlv.getField(Tag._95_TERMINAL_VERIFICATION_RESULTS)));
		iccRequest.setTransactionCategoryCode(Transform.fromBinToHex(tlv.getField(Tag._9F53_TRANSACTION_CATEGORY_CODE)));
		iccRequest.setTransactionDate(Transform.fromBinToHex(tlv.getField(Tag._9A_TRANSACTION_DATE)));
		iccRequest
			.setTransactionSequenceCounter(Transform.fromBinToHex(tlv.getField(Tag._9F41_TRANSACTION_SEQUENCE_COUNTER)));
		iccRequest.setTransactionType(Transform.fromBinToHex(tlv.getField(Tag._9C_TRANSACTION_TYPE)));
		iccRequest.setUnpredictableNumber(Transform.fromBinToHex(tlv.getField(Tag._9F37_UNPREDICTABLE_NUMBER)));
		
		IssuerActionCode issuerActionCode = new IssuerActionCode();
		issuerActionCode.setDefault(Transform.fromBinToHex(tlv.getField(Tag._9F0D_ISSUER_ACTION_CODE_DEFAULT)));
		issuerActionCode.setDenial(Transform.fromBinToHex(tlv.getField(Tag._9F0E_ISSUER_ACTION_CODE_DENIAL)));
		issuerActionCode.setOnline(Transform.fromBinToHex(tlv.getField(Tag._9F0F_ISSUER_ACTION_CODE_ONLINE)));
		iccRequest.setIssuerActionCode(issuerActionCode);
		
		String ffi = Transform.fromBinToHex(tlv.getField(Tag._9F6E_FORM_FACTOR_INDICATOR));
		if (ffi != null && !"".equals(ffi.trim()))
		{
			iccRequest.setFormFactorIndicator(ffi);
		}
		
		String termcc = Transform.fromBinToHex(tlv.getField(Tag._9F1A_TERMINAL_COUNTRY_CODE));
		if (termcc != null)
		{
			iccRequest.setTerminalCountryCode(termcc.substring(1));
		}
		
		String trancc = Transform.fromBinToHex(tlv.getField(Tag._5F2A_TRANSACTION_CURRENCY_CODE));
		if (trancc != null)
		{
			iccRequest.setTransactionCurrencyCode(trancc.substring(1));
		}
		
		// Service Code not in IccRequest anymore?
		
		/**
		 * The following do not have standard EMV tags: CardAuthenticationReliabilityIndicator();
		 * CardAuthenticationResultsCode(); ChipConditionCode();
		 */
		
		IccResponse iccResponse = new IccResponse();
		
		iccResponse.setApplicationTransactionCounter(
				Transform.fromBinToHex(tlv.getField(Tag._9F36_APPLICATION_TRANSACTION_COUNTER)));
		iccResponse.setIssuerAuthenticationData(Transform.fromBinToHex(tlv.getField(Tag._91_ISSUER_AUTHENTICATION_DATA)));
		
		// Set the issuer scripts
		String script1 =
			convertIssuerScriptsFromBinToHex(tlv.getField(Tag._71_ISSUER_SCRIPT_TEMPLATE_1));
		String script2 =
			convertIssuerScriptsFromBinToHex(tlv.getField(Tag._72_ISSUER_SCRIPT_TEMPLATE_2));
		iccResponse.setIssuerScriptTemplate1(script1);
		iccResponse.setIssuerScriptTemplate2(script2);
		
		// Authorization Code not in IccResponse anymore?
		
		/**
		 * The following do not have standard EMV tags: CardAuthenticationResultsCode()
		 */
		
		IccData iccData = new IccData();
		iccData.setIccRequest(iccRequest);
		iccData.setIccResponse(iccResponse);
		
		

		
		
		
		
		
	}

}
