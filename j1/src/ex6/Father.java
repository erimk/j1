package ex6;

public class Father extends Man {
	public String isOld(String age) {
		return super.isOld(Integer.valueOf(age))? "idoso":"jovem";
	}
}
