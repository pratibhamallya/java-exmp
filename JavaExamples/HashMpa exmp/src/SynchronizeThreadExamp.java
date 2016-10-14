
public class SynchronizeThreadExamp implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}
	public synchronized void m1(){
		System.out.println("m1 implemented");
	}

	public synchronized void m2(){
		System.out.println("m2 implemented");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
