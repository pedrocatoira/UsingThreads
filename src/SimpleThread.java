import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;


public class SimpleThread extends Thread {
	private static DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	
	public void run() {
		for(int i=0; i<=100; i++) {
            //System.out.println(i);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
                return;
            }
        }
		
		Calendar end = Calendar.getInstance();
		System.out.println(dateFormat.format(end.getTime()));
	}
	
	public static void main(String[] args) throws Exception {
		System.out.println("In one thread...");
		
		Calendar start = Calendar.getInstance();
		System.out.println(dateFormat.format(start.getTime()));
		
		for(int i = 0; i <= 200; i++) {
			sleep(50);
		}
		
		start = Calendar.getInstance();
		System.out.println(dateFormat.format(start.getTime()));
		
		// comparison
		SimpleThread thread1 = new SimpleThread();
		SimpleThread thread2 = new SimpleThread();
		
		System.out.println("In two threads...");
		
		start = Calendar.getInstance();
		System.out.println(dateFormat.format(start.getTime()));
		
		thread1.start();
		thread2.start();
		
    }
}
