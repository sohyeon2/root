package day06_20231026;
import java.util.Scanner;

public class java_20231026 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//제어문 7번 문제
		/*
		int fahrenheit = 100;
		float celcius = (int)((5/9f*(fahrenheit-32))*100+0.5)/100f;
		
		System.out.println("Fahrenheit:"+fahrenheit);
		System.out.println("Celcius:"+celcius);
		
		//4-1 번 문제
		//if문을 사용하기 전에 관계연산으로 기초적인 조건식
		//1.int형 변수 x가 10보다 크고 20보다 작을 때 true
		int x = 15;
		System.out.println(10<x && 20>x);
		
		//2.char형 변수 ch가 공백이나 탭이 아닐때 true
		char ch = 'A';
		System.out.println(!(ch == ' ' || ch=='\t'));
		
		//&&연산자가 들어가있어서 0~9사이의 조건을 모두 포함시킬 수 있다
		System.out.println('0' <= ch && ch <='9');
		
		char ch1 = 'a';
		//||(or)연산자 = 논리곱연산자 = 둘 중 하나만 진짜 연산자
		//대문자 또는 소문자를 포함하면 된다(영문자)
		System.out.println(('a'<=ch1 && 'z'>=ch1)||('A'<=ch1 && 'Z'>=ch1));
		
		int year = 2023;
		System.out.println((year%400==0)||(year%4==0&&year%100!=0));
		//int형 변수 year(년도)가 400으로 나눠떨어지거나 혹은 4로 나눠떨어지고
		//100으로 나눠떨어지지 않을때 
		
		//문자를 상호변수 str이 "yes"일 때 true 조건식
		String str = new String();
		str.equals("Yes");
		"Yes".equals(str);
		System.out.println(str.equals("Yes"));
		
		//문제 4-2 1부터 20까지 정수 중에서 2또는 3의 배수가 아닌 수의 종합
		int sum=0;
		
		for(int i=1; i<=20; i++) {
			//i가 2또는 3의 배수가 아닐 때만 sum ++ (1씩 증가)
			if(i%2==0 || i%3!=0) {
				sum += i;
		    }
		}
		System.out.println(sum);
		
		//4-3 1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10)
		//sum = 1+2+3+4+5+6+7+8+9+10 = sum합계
		
		int sum=0;
		int total = 0;
		for(int i =1; i<=10; i++) {
		sum +=i; 
		total +=sum
		System.out.println("total sum=" + total);
		}
		
		
		//문제 5) sum = 1+(-2)+3+(-4)+5+(-6)...이상이 될 때 멈추는거
		//100보다 같거나 크면 반복문이 빠져 나간다.
		//for문으로 증감식 으로 바꿔서 부호 (+)(-)
		//반복문의 증감식 단항연산자를 이용해서 부호를 바꿔줄겨
		//증감식 +1 = -1 증감식 -1=1
		int s = 1;
		int sum5 = 0;
		int num = 0;
		for(int i=1; true; i++, s=-s) {//1, -1, -(-1)=1,-1,-(-1)=1
	
			num = s*i; //부호(s)
			sum += num
			if(sum>=100) {
				break;
		}
}
		
		System.out.println("num="+num); //부호비트로 더해진 숫자
		System.out.println("sum="+sum); //합계를 출력
		
		//문제4-7 숫자로 이루어진 문자열 str "12345 fullname = 1+2+3+4+5
		//15라고 출력하자
		String str7 = "12345";
		
		System.out.println(str7.length());
		int sum7 =0;
		for(int i = 0;i<str7.length();i++) {
			sum7 += str7.charAt(i)-'0'; //문자 객체 '0'을 빼줘야 숫자로 바꿀 수 있음
		}
		System.out.println("sum="+sum7);
		
		
		
		//while문제1) 초기값 없고 증감식 없음
		//I can do it을 5번 출력, 초기값 0
		//I can do it
		//I can do it
		//I can do it
		//I can do it
		
		int k = 0;
		while(k<5) {
			System.out.println(k);
			k++; //내부 증가
		}
		*/
		//문제 2) 1부터 몇까지 더해야 100을 넘지 않을까
		//1. 더해진 수를 조건으로 만든다
		//2. 더해진 수 100이랑 비교해서 100이상이 되는지 확인하고 맞으면 OUT(false)
		
		int sum2 = 0;
		int i = 0;
		while(sum2<=100) {
			System.out.println(i+" - "+sum2);
			sum2 += ++i;
		}
	
		//do while 문제1)
		//1과 100사이의 점수를 입력하고 정답을 알아내는 게임
		//랜덤함수 : (int)(Math.random()*100)+1 //1~100까지 사이의 임의의 수를 저장한다
		//업앤다운 게임을 만들자
		//업앤다운 : 숫자를 랜덤을 만들고 숫자를 알아내는 게임
		
		//1. 랜덤으로 숫자를 랜덤함수가 들어간다
		int answer = (int)(Math.random()*100)+1;
		int input = 0; //입력받을 숫자의 변수

		//2. 스캐너로 반복하면서 숫자가 맞을 때까지 계속 입력
		Scanner scanner = new Scanner(System.in); //스캐너 선언
		do {  
			System.out.println("1과 100사이의 정수를 입력하세요");
			input = scanner.nextInt(); //입력받을 변수를 선언
			
			//3. 입력한 숫자라 랜덤보다 작으면 정답을 크다라고 알려주고 
			//4. 입력한 숫자가 랜덤보다 크면 정답을 작다라고 알려준다
			if(input>answer) { //더 작은수를 적으라고 알려준다
				System.out.println("더 작은수로 다시 시도해보세요");

			}else if(input<answer) {//더 큰수를 적으라고 알려준다
				System.out.println("더 큰수로 다시 시도해보세요");
			}
		}while(input!= answer);
		
		//5. 정답을 맞추면 마지막에 정답입니다. 라고 말해준다
		System.out.println("정답입니다");
		
		//continue : 반복이 진행되는 동안 조건에 해당하는 부분에 넣어준다 -continue
		
		for(int y=1; y<=10; y++) {
			if(y%3==0) {
				continue;
			}
			System.out.println(y);
		}
		
		//break문제1
		// 1.while 조건을 사용 sum 합계가 100 넘어가면 break;
		int sumz = 0;
		int z = 0;
		while(true) { //무한반복
			//if문으로 처리해서 break
			if(sumz>100) {
				break;
			}
			++z; // 증감할소록 사용자가 만들어서 증가시한다
			sumz += z;
		}
		System.out.println("z="+z);
		System.out.println("sumz="+sumz);
		
	}
	
}		