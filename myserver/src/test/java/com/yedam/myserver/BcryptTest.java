package com.yedam.myserver;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class BcryptTest {

	@Test
	public void test() {
		//암호화 인코딩시간(?)
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(4);
		String result = encoder.encode("1111");
		System.out.println(result);
		//앞 : 로그인페이지에서 넣은 패스워드값 뒤 : db의 패스워드 값
		assertTrue(encoder.matches("1111", result));

	}
}
