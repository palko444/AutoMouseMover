package autoMouseMover;

import java.awt.AWTException;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.PointerInfo;
import java.awt.Robot;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PointerInfo a = MouseInfo.getPointerInfo();
		while (true) {

			Point b = a.getLocation();

			try {
				Thread.sleep(60000);
			}
			catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Point c = a.getLocation();
			
			if (! b.equals(c)) {
				moveMouse(c);
			}

		}

	}

	public static void moveMouse(Point c) {
		try {
			Robot rm = new Robot();
			Double gx = c.getX();
			Double gy = c.getY();
			Integer x = gx.intValue();
			Integer y = gy.intValue();
			rm.mouseMove(x+1,y);
		}
		catch (AWTException e) {
		}
	}
}
