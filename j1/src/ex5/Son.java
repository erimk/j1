package ex5;

public class Son extends Father {
	private Son() {
		super("Father ");
		new Father("Son ");
	}

	public static void main(String[] args) {
		new Son();
	}
}