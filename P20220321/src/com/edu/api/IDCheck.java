package com.edu.api;

public class IDCheck {
	// 주민번호 입력 >

	public String getGender2(String sno) {
		String newSno = sno.replace("-","");
		newSno = newSno.replace(" ","");
		String love = null;
		int length = sno.length();
		if (length == 13) {
			char sex = sno.charAt(6); 
			switch (sex) {
			case '1':
			case '3':
				love = "남자입니다.";
				break;
			case '2':
			case '4':
				love = "여자입니다.";
				break;
			}

		} else if (length == 14) {
			char sex = sno.charAt(7); //(000000-000000) 짝때기o
			switch (sex) {
			case '1':
			case '3':
				love = "남자입니다.";
				break;
			case '2':
			case '4':
				love = "여자입니다.";
				break;
			}
		}
		return love;
	}
	
	
	
	
	public String getGender(String sno) {
		int length = sno.length();
		String love = null;
		if (length == 13) {
			char sex = sno.charAt(6); 
			switch (sex) {
			case '1':
			case '3':
				love = "남자입니다.";
				break;
			case '2':
			case '4':
				love = "여자입니다.";
				break;
			}

		} else if (length == 14) {
			char sex = sno.charAt(7); //(000000-000000) 짝때기o
			switch (sex) {
			case '1':
			case '3':
				love = "남자입니다.";
				break;
			case '2':
			case '4':
				love = "여자입니다.";
				break;
			}
		}

		return love;
	}

}
