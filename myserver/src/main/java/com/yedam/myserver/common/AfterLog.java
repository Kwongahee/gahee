package com.yedam.myserver.common;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


@Component //빈등록
@Aspect //어노테이션 쓰겠다 ?
public class AfterLog {

	//서비스의 리턴 값 확인가능
	@AfterReturning(pointcut ="LogAdvice.allpointcut()", returning ="obj")
	public void printLog(JoinPoint jp, Object obj) {
		String name = jp.getSignature().getName();
		System.out.println("[after] 로그" + name);
		System.out.println(obj);
	}
}
