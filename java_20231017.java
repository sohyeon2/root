package section1;

public class java_20231017 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//2일차 자바 공부
		
		// 소수 : float / double =기본적인 프린트
		/**
		 * 실행결과:)
		 * 마라톤은 42.195km 달립니다.
		 * 하프 마라톤은(=halfmarathon) 21.0975km 달립니다.
		 */
		
		//마라톤은 변수명을 정의하고  double로 자료형을 선언하자.
		double marathon =42.195;
		//하프 마라톤 변수명을 정의하고 float로 자료형을 선언하자.
		float halfmarathon = 21.0975f; 
		
		
		System.out.println("마라톤은" + marathon + "km 달립니다.");
		System.out.println("하프 마라톤은" + halfmarathon + "km 달립니다.");
		
		//소수 : 정밀도(=표현하는방식)
		//3.14(고정소수점)=3.141592653589793
		//double / float 선언 pieDouble / pieFloat
		double pieDouble = 3.141592653589793;
		float pieFloat = 3.141592653589793f;
		System.out.println(pieDouble);
		System.out.println(pieFloat);
		
		//char = 'A';(캐릭터 한글자만 표현)
		//char 자료형을 선언 alphabetA = 'A'선언한고
		//char 자료형을 선언 alphabetB = 'B'선언한고
		//결과) A=65 B=66
		int alphabetA = 'A';
		int alphabetB ='B';
		
		char alphabetC = 'C';
		char alphabetD = 'D';
		
		System.out.println(alphabetA);
		System.out.println(alphabetB);
		
		System.out.println(alphabetC);
		System.out.println(alphabetD);
		
		//기본 논리형 boolean = 1byte = true/false
		
		//학생(=student)이라는 변수이름을 만들고 boolean형을 선언하고
		//출력할 때 학생이 맞다 (=true/false)라는 변수를 선언하자
		//자료형 변수이름 = 값;
		//System.out.println();
		boolean student = true;
		
		System.out.println(student);
		
		
		 
	}

}
