package day6;

public class evenOdd  {
	public static void main(String[] args) {
		loop even = new loop(); 
		loop odd = new loop(); 
		
		
		even.start(); 
		even.even();
		
		
		odd.start();
		odd.odd();
	}

}

class loop extends Thread{
	public void even() {
		for(int i = 0; i < 50; i+=2) {
			System.out.println(i);
		}
	}
	
	
	public void odd() {
		for(int i = 1; i < 50; i+=2) {
			System.out.println(i);
		}
	}
}