package day7;

import java.util.Arrays;
import java.util.Comparator;

public class day7_20231031 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [ ] arr = new int[5];
		//참조변수 : 주소를 출력하면 배열의 위치가 주소값으로 출력된다.
		System.out.println(arr);
		
		//배열의 값을 추가
		// 각 배열의 인덱스를 선언, 1~5까지 값을 넣어보자
		
		arr [0] = 1;
		arr [1] = 2;
		arr [2] = 3;
		arr [3] = 4;
		arr [4] = 5;
		
		//배열의 값을 출력하자
		System.out.println("arr[0]="+arr[0]);
		System.out.println("arr[0]="+arr[1]);
		System.out.println("arr[0]="+arr[2]);
		System.out.println("arr[0]="+arr[3]);
		System.out.println("arr[0]="+arr[4]);
		
		//배열의 크기를 출력
		System.out.println("배열의 크기="+arr.length+"입니다.");
		
		//배열의 초기값
		//배열의 초기값 : 선언을 했을 때 자동으로 지정되는 초기값
		
		int [] intArray = new int[5];
		System.out.println(intArray);
		System.out.println(arr);
		String [] strArray = new String[5];
		System.out.println(strArray);
		
		int [] varArray = {1,2,3,4,5};
		System.out.println(varArray);
		
		//intArray 첫번째값 두번째값을 출력
		System.out.println("intArray[0]="+intArray[0]);
		System.out.println("intArray[1]="+intArray[1]);
		//strArray 첫번째값 두번쨰값 출력
		System.out.println("strArray[0]="+strArray[0]);
		System.out.println("strArray[1]="+strArray[1]);
		//varArray 첫번째값 두번째값 출력
		System.out.println("varArray[0]="+varArray[0]);
		System.out.println("varArray[1]="+varArray[1]);
		
		//문제1 : 배열에서 단어만 추출해 출력하기
		//char [ ] 배열 선언하고 = {'1','L','0','2','V','3','E'}
		//소문자 아스키코드 중에서 영문자일 경우나 대문자 아스키코드 중에서 영문자일 때 
		//문자열을 더해서 출력하자
		char [] card = {'1','L','0','2','V','3','E'};
		String myWord = "";
		
		//반복문을 사용하자
		for(int i=0; i<card.length; i++) {
			//System.out.println(card[i]);
			int word = card[i];
			
			//대문자 : 65~90 크거나 같다 && 소문자 : 97~122 작거나 같다
			if((word >= 65 && word <=90) || (word >= 97 && word <=122)){
				myWord += (char)word;
			}	
		}
				
		System.out.println("단어:"+myWord);

		//@Array 클래스
		//배열 출력
		
		int [ ] arrs = {1,6,2,3,10,7,4,5,8,9};
		
		//배열의 있는 값을 간단히 출력해서 보고싶
		System.out.println("정렬 전 배열 : "+Arrays.toString(arrs));
		
		//Arrays.sort(배열이름)
		Arrays.sort(arrs);
		System.out.println("정렬 후 배열 : "+Arrays.toString(arrs));
		
		Integer [ ] arrs2 = {1,6,2,3,10,7,4,5,8,9};
		
		System.out.println("정렬 후 오름차순 : "+Arrays.toString(arrs));
		
		
		//내림차순 : 큰값~작은값 차례대로 정렬
		//Array.sort(arrs,Comparator.reverseOrder());
		
		Arrays.sort(arrs2,Comparator.reverseOrder());
		
		System.out.println("정렬 후 내림차순 : "+Arrays.toString(arrs));
	
		//int형 배열 arr01 선언한 즉시 값을 넣는다. ={1,2,3}
		int [] arr01 = {1,2,3};
		
		//배열의 얕은 복사 한다
		//새로운 배열 arr02 선언, arr01 값 정의
		int [] arr02 = arr01;
		
		//배열을 출력한다 (arr01)= Arrays.toString(배열이름)
		System.out.println("arr02배열:"+Arrays.toString(arr02));
		//arr02[1] :두번째 인덱스 값을 10바꿔준다
		arr02[1] = 10;
		//arr01과 arr02값을 출력해본다
		System.out.println("arr01배열:"+Arrays.toString(arr01));
		System.out.println("arr02배열:"+Arrays.toString(arr02));
	
		
		
		int [ ] card01 = {1,6,4,5,3,2};
		int [ ] card02 = new int[card01.length];
		
		//새로운 배열에 기존 배열값을 insert
		for(int i=0; i<card01.length; i++) {
			card02[i] = card01[i];
		}
		
		//새로 생성된 배열의 첫번째 값을 변경
		card02[0] = 100;
		
		System.out.println("card01 배열:"+Arrays.toString(card01));
		System.out.println("card02 배열:"+Arrays.toString(card02));
	
		
		//int [ ] card03 = Arrays.copyof(원본배열,원본배열크기)
		int [ ] card03 = Arrays.copyOf(card01, card01.length);
		
		//card03[1] = 200 바꿔보자
		card03[1] = 200;
		
		//출력
		System.out.println("card01 배열:"+Arrays.toString(card01));
		System.out.println("card03 배열:"+Arrays.toString(card03));
	
		
		//깊은복사3) System.arrayCopy(원본,0,복사본,0,배열크기)
		//부분적인 깊은 복사가 가능한 형태
		
		int [] card04 = new int[card01.length-2]; //크기를 공간만큼 만들어준다 (=선언)
		System.arraycopy(card01,0,card04,0,card01.length-2);
		
		//card04[2] = 300
		card04[2] = 300;
		
		//출력해보자
		System.out.println("card01 배열:"+Arrays.toString(card01));
		System.out.println("card04 배열:"+Arrays.toString(card04));
	
		//2차원 배열 선언
		
		int [] [] arrys = new int [3][];//행의 크기를 지정하고 열은 지정하지 않았음
		
		//사용자가 임의대로 열을 각각의 크기로 지정할 수 있다.
		arrys[0] = new int[2];
		arrys[1] = new int[3];
		arrys[2] = new int[1];
		
		//2차원 배열의 기본적이고 고정적인 열의 크기를 만드는 방법
	
		int [ ] [ ] arrys02 = new int[2][3];
		
		//2차원 배열을 행2열3 값을 할당해보자
		//첫번쨰 행을 3개의 열로 값을 대입한 예시
		arrys02[0][0] = 1;
		arrys02[0][1] = 2;
		arrys02[0][2] = 3;
	
		//2차원 배열을 행2열3 값을 할당해보자
		//첫번쨰 행을 3개의 열로 값을 대입한 예시
		arrys02[1][0] = 11;
		arrys02[1][1] = 22;
		arrys02[1][2] = 33;
		
		//2차원 배열 주소값 출력
		System.out.println("2차원배열:"+arrys02);
		//2차원 배열 첫번째 행의 주소값을 출력
		System.out.println("2차원 배열 1행:"+arrys02[0]);
		//2차원 배열 두번째 행의 주소값을 출력
		System.out.println("2차원 배열 1행:"+arrys02[1]);
		
		
	}

}
