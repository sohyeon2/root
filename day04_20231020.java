package day4;
import java.util.Scanner;

public class day04_20231020 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//if���
		//score  60 ���� 
		//score�� 60���� ũ�ų� ���� �� �հ��Դϴ� ���
		//int score = 60;
		//if(score>=60) {
			//System.out.println("�հ��Դϴ�");
		//}
		//��ĳ���̿� : input 
		//���̸� �Է��ϼ��� ��� ����ϰ� �Է�
		//���̰� 19���� Ŭ ���� �����Դϴ� ��� ���
		
		
		System.out.println("���̸� �Է��ϼ���");
		Scanner scanner = new Scanner(System.in);
		/*
		int x = scanner.nextInt();
		
		if(x>19) {
			System.out.println("�����Դϴ�");
		}
		*/
		//2)if-else : ���ǽĿ� ���� ������ �����ؾ� �ϴ� ��ɹ�
		//number ������ �����ϰ� 5�� ������
		//5�� 4���� Ŭ ��� ũ�ٶ�� ���, �ƴ� ���� �۴ٶ�� ���
		int number = 5;
		if(number>4) {
			System.out.println("5�� 4���� ũ��");
		}else {
			System.out.println("5�� 4���� �۴�");
		}
		
		//a�� b�� ���ؼ� ū ���ϰ�� max�ȿ� ������ �����Ѵ�
		//�������� �ƽ��� ���� �� �ִ� ������ max �ִ밪�� ����Ѵ�.
		//if-else ó���ؼ� ��� ����� 
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
		
		System.out.println("a:"+a+"�� b:"+b+"�߿��� ū ����"+max+"�Դϴ�");
		
		//else-if : ���ǽ��� ������ ������ ����Ѵ�
		//����1) �����ϴ� ���� ���� = ������ �ִ´� (7) (������ ���� �����)
		//		1)�����ϴ� ���ڰ� 5���� Ŭ ���� "�����ϴ� ���ڰ� 5���� Ů�ϴ�"
		//		2)�����ϴ� ���ڰ� 7�� ��쿡�� "�����ϴ� ���ڴ� 7�Դϴ�" ��� ���
		
		int xm = 7;//7�� ������ �ִ´�
		
		if(xm>5) {
			System.out.println("�����ϴ� ���ڰ� 5���� ũ��");
		}
		else if(xm==7){
			System.out.println("�����ϴ� ���ڴ� 7");
		}
		
		//����2) ������ �Է��Ѵ�
		//90���� ũ�ų� ������ = "A"���
		//80���� ũ�ų� ������ = "B"���
		//70���� ũ�ų� ������ = "C"���
		//�������� = "D" ���
		/*
		Scanner input = new Scanner(System.in);
		int score = scanner.nextInt(); //������ �Է¹޴ٴ´�
		//if-elseif ����ؼ� ���� ���
		
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
		
		//@switch��: if���� �Ǵ�(true/false)�� ���� ���๮�� �����Ǿ��ٸ� 
		//switch���� ������ ���� ���� ���๮�� ����
		//��°�� : number 7�Դϴ� ���
		//case 1 : number1�Դϴ� / case 7: number7�Դϴ�  / default : �� �� �ƴϴ�
		int result = 7;
		
		switch(result) {
		case 1:
			System.out.println("number1 �Դϴ�");
			break;
		case 7:
			System.out.println("number7 �Դϴ�");
		default:
			System.out.println("�� �� �ƴϴ�");
		}
		
		//����2) ���� �Է��ϰ� ������ �������
		//case 3������ 11�������� ���� ������ ������
		//�� �������� "������ ������ 000�Դϴ�."
		System.out.println("�� ������ �Է����ּ���");
		int month = scanner.nextInt();
				
		switch(month){
		case 3,4,5:
			System.out.println("������ ������ ���Դϴ�");
			break;
		case 6,7,8:
			System.out.println("������ ������ �����Դϴ�");
			break;
		case 9,10,11:
			System.out.println("������ ������ �����Դϴ�");
			break;
		default:
			System.out.println("������ ������ �ܿ��Դϴ�");
		}
		
		//����3) ��ĭ�� �ڵ带 switch������ ��������
		int a_ = 25;
		
		switch(a_/10){ 
			case 2:
				System.out.println("a�� 20 �̻��� �����Դϴ�.");
		}
	}
	

}
