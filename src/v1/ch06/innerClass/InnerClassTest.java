package v1.ch06.innerClass;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.Timer;

public class InnerClassTest {

	public static void main(String[] args) {
		TalkingClock clock=new TalkingClock(1000,true);
		clock.start();
		JOptionPane.showMessageDialog(null, "quit program?");
		System.exit(0);
	}

}
class TalkingClock{
	private int interval;
	private boolean beep;
	public TalkingClock(int interval,boolean beep) {
		this.interval=interval;
		this.beep=beep;
	}
	public void start() {
		ActionListener listener=new TimePrinter();
		Timer timer=new Timer(interval, listener);
		timer.start();
	}
	public class TimePrinter implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("at the tone ,the time is "+new Date());
			if(beep)Toolkit.getDefaultToolkit().beep();
		}
		
	}
}
