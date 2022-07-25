package day5;



class throwEx{
	public static void main(String[] args) {
		try {
			div(1,0 ); 
			
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}
	
	
	
	public static int div(int a, int b) throws ArithmeticException{
		if(b == 0) {
			throw new ArithmeticException("cannot use 0 to divide"); 
		}
		
		
		return a / b; 
	}
}