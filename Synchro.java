package day6;

public class Synchro  {
	public static void main(String[] args) {	
		Library library = new Library();
		Customer cs1 = new Customer(library);
		cs1.start();
		Customer cs2 = new Customer(library); 
		cs2.start(); 
	}
}


class Customer extends Thread{
	Library library = null; 
	
	Customer(Library library){
		this.library = library; 
	}
	
	public void run() {
		library.checkOut();
	}
}



class Library{
	
	String comic = "Captain America"; 
	
	
	public synchronized void checkOut() {
		Boolean Available;
	
		if(comic != null) {
			Available = true;
		}else {
			Available = false; 
		}
		
		comic = null; 
		
		
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("The book is available: " + Available);
		
		
		
		
	}
}