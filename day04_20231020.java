package day4;
import java.util.Scanner;

public class day04_20231020 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//if제어문
		//score  60 저장 
		//score가 60보다 크거나 같을 때 합격입니다 출력
		//int score = 60;
		//if(score>=60) {
			//System.out.println("합격입니다");
		//}
		//스캐너이용 : input 
		//나이를 입력하세요 라고 출력하고 입력
		//나이가 19보다 클 경우는 성인입니다 라고 출력
		
		
		System.out.println("나이를 입력하세요");
		Scanner scanner = new Scanner(System.in);
		/*
		int x = scanner.nextInt();
		
		if(x>19) {
			System.out.println("성인입니다");
		}
		*/
		//2)if-else : 조건식에 따라 무조건 실행해야 하는 명령문
		//number 변수를 선언하고 5를 정의함
		//5는 4보다 클 경우 크다라고 출력, 아닐 경우는 작다라고 출력
		int number = 5;
		if(number>4) {
			System.out.println("5는 4보다 크다");
		}else {
			System.out.println("5는 4보다 작다");
		}
		
		//a와 b를 비교해서 큰 값일경우 max안에 변수로 정의한다
		//마지막에 맥스에 값에 들어가 있는 변수와 max 최대값을 출력한다.
		//if-else 처리해서 결과 만드셈 
		int a =4;
		int b = 10;
		int max = 0;
		
		if(a>b) {
			max = a;
			System.out.println(max);
		}else {
			max = b;
			System.out.println(max);
		}
		
		System.out.println("a:"+a+"와 b:"+b+"중에서 큰 수는"+max+"입니다");
		
		//else-if : 조건식을 여러개 만들경우 사용한다
		//문제1) 좋아하는 숫자 선택 = 변수에 넣는다 (7) (변수도 직접 만든다)
		//		1)좋아하는 숫자가 5보다 클 경우는 "좋아하는 숫자가 5보다 큽니다"
		//		2)좋아하는 숫자가 7일 경우에만 "좋아하는 숫자는 7입니다" 라고 출력
		
		int xm = 7;//7을 변수에 넣는다
		
		if(xm>5) {
			System.out.println("좋아하는 숫자가 5보다 크다");
		}
		else if(xm==7){
			System.out.println("좋아하는 숫자는 7");
		}
		
		//문제2) 정수를 입력한다
		//90보다 크거나 같으면 = "A"출력
		//80보다 크거나 같으면 = "B"출력
		//70보다 크거나 같으면 = "C"출력
		//나머지는 = "D" 출력
		/*
		Scanner input = new Scanner(System.in);
		int score = scanner.nextInt(); //점수를 입력받다는다
		//if-elseif 사용해서 학점 출력
		
		if(score>=90) {
			System.out.println("A");
		}else if(score>=80){
			System.out.println("B");
		}else if(score>=70) {
			System.out.println("C");
		}else {
			System.out.println("D");
		}
		*/
		
		//@switch문: if문은 판단(true/false)에 따라 실행문이 결정되었다면 
		//switch문은 변수의 값에 따라 실행문이 결정
		//출력결과 : number 7입니다 출력
		//case 1 : number1입니다 / case 7: number7입니다  / default : 둘 다 아니다
		int result = 7;
		
		switch(result) {
		case 1:
			System.out.println("number1 입니다");
			break;
		case 7:
			System.out.println("number7 입니다");
		default:
			System.out.println("둘 다 아니다");
		}
		
		//문제2) 월을 입력하고 계절을 출력하자
		//case 3월부터 11월까지만 쓰고 계절을 만들어보자
		//각 계절별로 "현재의 계절은 000입니다."
		System.out.println("몇 월인지 입력해주세요");
		int month = scanner.nextInt();
				
		switch(month){
		case 3,4,5:
			System.out.println("현재의 계절은 봄입니다");
			break;
		case 6,7,8:
			System.out.println("현재의 계절은 여름입니다");
			break;
		case 9,10,11:
			System.out.println("현재의 계절은 가을입니다");
			break;
		default:
			System.out.println("현재의 계절은 겨울입니다");
		}
		
		//문제3) 빈칸에 코드를 switch문으로 구현하자
		int a_ = 25;
		
		switch(a_/10){ 
			case 2:
				System.out.println("a는 20 이상의 숫자입니다.");
		}
	}
	

}
