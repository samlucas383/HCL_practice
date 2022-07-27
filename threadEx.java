package day6; 


class threadEx{
	public static void main(String[] args) {
		forLoop loop = new forLoop(); 
		
		loop.start();
		loop.forloop();
	}
}



class forLoop extends Thread{
	public void forloop() {
		for(int i =0; i < 50; i++) {
			System.out.println(i + 1);
		}
	}
}