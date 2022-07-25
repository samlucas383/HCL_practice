package day5;


class uncheckedException{
	public static void main(String[] args) {
		int x = 30; 
		int y = 0; 
		
		
		try {
			int result = x / y;
		}catch(ArithmeticException a){
			System.out.println("Can not divide by zero");
		}
		
	}
	
	
}