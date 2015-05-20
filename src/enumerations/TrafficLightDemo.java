package enumerations;

enum TrafficLightColor {
	RED, GREEN, YELLOW
}

class TrafficLightSimulator implements Runnable {
	// A computerised traffic light
	private Thread thrd; // holds the thread that runs the simulator
	private TrafficLightColor tlc;// holds the traffic light color
	boolean stop = false; // set to true to stop the simulation
	boolean change = false; // true when the light has changed

	public TrafficLightSimulator(TrafficLightColor init) {
		tlc = init;
		thrd = new Thread(this);
		thrd.start();
	}

	public TrafficLightSimulator() {
		tlc = TrafficLightColor.RED;
		thrd = new Thread(this);
		thrd.start();
	}

	// start up the light
	@Override
	public void run() {
		while(!stop){
			try {
				switch(tlc) {
				case GREEN:
					Thread.sleep(10000);
					break;
				case RED:
					Thread.sleep(12000);
					break;
				case YELLOW:
					Thread.sleep(2000);
					break;
				}
			} catch (InterruptedException exc) {
				System.out.println(exc);
			}
			changeColor();
		}		
	}

	synchronized void changeColor() {
		switch(tlc) {
		case GREEN:
			tlc = TrafficLightColor.YELLOW;
			break;
		case RED:
			tlc = TrafficLightColor.GREEN;
			break;
		case YELLOW:
			tlc = TrafficLightColor.RED;
			break;
		}
		change = true;
		notify();// signal that light has changed

	}
	
	// Wait until a light change occurs.
	synchronized void waitForChange() {
		try {
			while (!change) 
				wait();
			change = false;
		} catch (InterruptedException exc) {
			System.out.println(exc);
		}
	}
	
	// Return current color
	synchronized TrafficLightColor getColor() {
		return tlc;
	}
	
	// Stop the traffic light.
	synchronized void cancel() {
		stop = true;
	}
}
	public class TrafficLightDemo {

		public static void main(String[] args) {
			TrafficLightSimulator t1 = new TrafficLightSimulator(TrafficLightColor.GREEN);
			
			for (int i = 0 ; i < 9; i++) {
				System.out.println(t1.getColor());
				t1.waitForChange();
			}
			
			t1.cancel();
		}

	}
