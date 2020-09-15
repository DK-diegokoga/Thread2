package controller;
import java.util.Random;
public class Thread2 extends Thread{

	private int n;
	private int x;
	private int soma;
	public Thread2(int x) {
		this.x = x;
	}
	
	@Override
	public void run() {
		soma();
	}
	public void soma(){
		try {
			Thread2.sleep(x*10);
		}catch(InterruptedException e){
			e.printStackTrace();
		}	
		for (int i = 0; i < 5; i++) {
				Random generator = new Random();
				n = generator.nextInt(10)+1;
				soma = soma + n;
				if (i != 4) {
					System.out.print(n + " + ");
				}else {
					System.out.print(n);
					System.out.println(" = " + soma);
				}
			
		}
		System.out.println("\n " + "TID #"+ getId() +"  =  " + soma + "\n ");
	}
}
