package ex2;

public class UserInput {

	public static class TextInput {
		StringBuilder values = new StringBuilder();
		public void add(char c) {
			values.append(c);
		}
		public String getValue() {
			return values.toString();
		}
	}
	
	public static class NumericInput extends TextInput {
		
		public void add(char c) {
			if(isNumeric(String.valueOf(c))) {				
				super.add(c);//sem o super entra em recursão
			}
			
		}
		
		private boolean isNumeric(String valueOf) {
			boolean b1 = valueOf.matches("-?\\d+(d\\.d+)?"); 
			boolean b2 = valueOf.matches("[0-9]+\\.*[0-9]*"); 
			
			return b1 && b2;
		}
	}
	
	public static void main(String[] args) {
		TextInput input = new NumericInput();
		input.add('1');
		input.add('a');
		input.add('0');
		System.out.println(input.getValue());
	}
	
}

