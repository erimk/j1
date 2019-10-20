package ex8;

public class TryCatchExamples {
	 static String algo;
	public static void fazAlgumaCoisa() {
		System.out.println("fiz algo.");
	}
	public static void fazAlgumaCoisaFinal() {
		System.out.println("fiz algo finalmente.");
	}
	public static void main(String[] args) {
		try {
			System.out.println(algo.charAt(0));
		} catch (NullPointerException e1) {
			System.out.println("deu nullPointer");
			fazAlgumaCoisa();			
		}finally {
			fazAlgumaCoisaFinal();	
		}	
		fazAlgumaCoisa();
	}
}
