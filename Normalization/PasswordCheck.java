import java.util.*;

public class PasswordCheck { // 정규식 RegEx

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String id = s.next();
		s.nextLine(); // Scanner 는 동시에 두번 사용할 수 없음 (버퍼 비우기)
		String pwd = s.nextLine();
		
		 /*
		 * 숫자 최소 1자 포함
		 * 영문 대, 소문자 최소 1자 이상 포함
		 * 8~20 글자 까지 허용
		 * 특수문자 필수 공백 허용 안함
		 */
		if((id.length()>1)&&(id.length()<=20)) {
			final String pattern = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*\\W)(?=\\S+$).{8,20}$";
			boolean check = pwd.matches(pattern);
			
			if (check==false) {
				System.out.println("fail");
			} else {
				System.out.println("pass");
			}
			
		} else {
			System.out.println("fail");
		}
		
		/*
		
		1) 숫자만 : ^[0-9]*$
		
		2) 영문자만 : ^[a-zA-Z]*$
		
		3) 한글만 : ^[가-힣]*$
		
		4) 영어 & 숫자만 : ^[a-zA-Z0-9]*$
		
		5) E-Mail : ^[a-zA-Z0-9]+@[a-zA-Z0-9]+$
		
		6) 휴대폰 : ^01(?:0|1|[6-9]) - (?:\d{3}|\d{4}) - \d{4}$
		
		7) 일반전화 : ^\d{2,3} - \d{3,4} - \d{4}$
		
		8) 주민등록번호 : \d{6} \- [1-4]\d{6}
		
		9) IP 주소 : ([0-9]{1,3}) \. ([0-9]{1,3}) \. ([0-9]{1,3}) \. ([0-9]{1,3})
		
		 */
	}

}
