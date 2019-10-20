package ex1;


public class Test implements Runnable{

	public void run() {
		System.out.println("Qual é a música?");
			throw new RuntimeException("Opa, temos um problema! ");
	}
	
	public static void main(String[] args) {
		Thread t= new Thread(new Test());
		t.start();
		System.out.println("Executou o Final do Método");
	}	

}
