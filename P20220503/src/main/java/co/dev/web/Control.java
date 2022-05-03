package co.dev.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//memberinsertcontrol 예외를 throw 했지만, 그럼 선언 구문자체가 달라져서 인터페이스에서 똑같이 만들어준다(?)
public interface Control {
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;
	
}
