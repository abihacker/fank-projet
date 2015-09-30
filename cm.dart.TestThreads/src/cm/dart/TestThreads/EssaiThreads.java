package cm.dart.TestThreads;

public class EssaiThreads extends Thread {
	Thread t;
   
	public EssaiThreads(String nom) {
		super(nom);
		System.out.println("statt du Threads"  + nom +  "=" +this.getState());
		this.start();
		System.out.println("statt du Threads" + nom + "=" +this.getState());
	}
	public EssaiThreads(String nom, Thread t) {
		super(nom);
		this.t = t;
		System.out.println("statt du Threads" + nom + "=" +this.getState());
		this.start();
		System.out.println("statt du Threads" + nom + "=" +this.getState());
		
	}
	public void run(){
		for (int i=0; i<10; i++ ){
			System.out.println("statt" +this.getName()+ " = " +this.getState());
			if(t!= null){
			System.out.println("statt de " +t.getName()+ " pendant le threads " +this.getName()+ "=" +t.getState());
			
				
			}
		}
	}
	public  void  setThreads(Thread t){
		this.t = t;
		
	}
}
