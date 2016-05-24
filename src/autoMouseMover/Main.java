package autoMouseMover;

import java.awt.AWTException;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.PointerInfo;
import java.awt.Robot;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		while (true) {

			PointerInfo a = MouseInfo.getPointerInfo();
			Point b = a.getLocation();

			try {
				Thread.sleep(30000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			PointerInfo d = MouseInfo.getPointerInfo();
			Point c = d.getLocation();

			if (b.equals(c)) {
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
			rm.mouseMove(x + 1, y);
			rm.mouseMove(x, y);
		} catch (AWTException e) {
		}
	}
}
