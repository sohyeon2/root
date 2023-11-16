package java_1116;

public class button { //외부 클래스

	//내부적으로 인터페이스를 만든다
	public static interface ClickListener{
		// 추상메서드
		void onClick();
	}
	
	//객체를 주입하는 Setter 메서드
	public void strClickListener(ClickListener clickListener) {
		//나의 객체를 갖고온다
		this.clickListener = clickListener;
	}

	public void click() {
		this.clickListener.onClick();
	}
}
