package cm.dart.TestThreads;

public class Test {

	public static void main(String[] args) {
		System.out.println("le nom du threads principal est:" +Thread.currentThread().getName());;
        EssaiThreads t5 = new EssaiThreads("mebal");
        EssaiThreads t6 = new EssaiThreads("frank", t5);
        try{
        	Thread.sleep(5000);
        }catch (InterruptedException e){
        	e.printStackTrace();
        }
        System.out.println("statut du threads" +t5.getName()+ "=" +t5.getState());
        System.out.println("statut du threads" +t6.getName()+ "="+t6.getState());
	}

}
