/**
 * Created by Sounder Liu on 14-3-21.
 */
import sounder.*;
public class btraceTester {
	public static void main(String[] args){
		MyRunner runner = new MyRunner();	
		long i = 0;
		while(true){
			runner.loop_in(i);
			try {
				Thread.sleep(1000);
			}catch (InterruptedException e) {
				return;
			}
			i++;
		}
	}
	public static void loop(long a){
		System.out.println("output: " + a);

	}
}
