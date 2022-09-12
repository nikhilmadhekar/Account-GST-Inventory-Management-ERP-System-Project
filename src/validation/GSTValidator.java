/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package validation;



/**
 *
 * @author Innovatus Tech
 */
public class GSTValidator
{
public static final String GSTINFORMAT_REGEX = "[0-9]{2}[a-zA-Z]{5}[0-9]{4}[a-zA-Z]{1}[1-9A-Za-z]{1}[Z]{1}[0-9a-zA-Z]{1}";
	public static final String GSTN_CODEPOINT_CHARS = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        
        /**
	 * Method to check if a GSTIN is valid. Checks the GSTIN format and the
	 * check digit is valid for the passed input GSTIN
	 * 
	 * @param gstin
	 * @return boolean - valid or not
	 * @throws Exception
	 */
	public  boolean validGSTIN(String gstin) throws Exception {
		boolean isValidFormat = false;
		if (checkPattern(gstin, GSTINFORMAT_REGEX)) {
			isValidFormat = verifyCheckDigit(gstin);
		}
		return isValidFormat;

	}

	/**
	 * Method for checkDigit verification.
	 * 
	 * @param gstinWCheckDigit
	 * @return
	 * @throws Exception
	 */
	public  boolean verifyCheckDigit(String gstinWCheckDigit) throws Exception {
		Boolean isCDValid = false;
		String newGstninWCheckDigit = getGSTINWithCheckDigit(
				gstinWCheckDigit.substring(0, gstinWCheckDigit.length() - 1));

		if (gstinWCheckDigit.trim().equals(newGstninWCheckDigit)) {
			isCDValid = true;
		}
		return isCDValid;
	}

	/**
	 * Method to check if an input string matches the regex pattern passed
	 * 
	 * @param inputval
	 * @param regxpatrn
	 * @return boolean
	 */
	public  boolean checkPattern(String inputval, String regxpatrn) {
		boolean result = false;
		if ((inputval.trim()).matches(regxpatrn)) {
			result = true;
		}
		return result;
	}

	/**
	 * Method to get the check digit for the gstin (without checkdigit)
	 * 
	 * @param gstinWOCheckDigit
	 * @return : GSTIN with check digit
	 * @throws Exception
	 */
	public  String getGSTINWithCheckDigit(String gstinWOCheckDigit) throws Exception {
		int factor = 2;
		int sum = 0;
		int checkCodePoint = 0;
		char[] cpChars;
		char[] inputChars;

		try {
			if (gstinWOCheckDigit == null) {
				throw new Exception("GSTIN supplied for checkdigit calculation is null");
			}
			cpChars = GSTN_CODEPOINT_CHARS.toCharArray();
			inputChars = gstinWOCheckDigit.trim().toUpperCase().toCharArray();

			int mod = cpChars.length;
			for (int i = inputChars.length - 1; i >= 0; i--) {
				int codePoint = -1;
				for (int j = 0; j < cpChars.length; j++) {
					if (cpChars[j] == inputChars[i]) {
						codePoint = j;
					}
				}
				int digit = factor * codePoint;
				factor = (factor == 2) ? 1 : 2;
				digit = (digit / mod) + (digit % mod);
				sum += digit;
			}
			checkCodePoint = (mod - (sum % mod)) % mod;
			return gstinWOCheckDigit + cpChars[checkCodePoint];
		} finally {
			inputChars = null;
			cpChars = null;
		}
	}
}
