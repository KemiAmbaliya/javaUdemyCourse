package org.kemi.javabrains;

import java.util.List;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Triangle implements Shape{
	private Point pointAA;
	private Point abcd;
	private Point pointC;

	public Point getPointA() {
		return pointAA;
	}

	public void setPointA(Point pointA) {
		this.pointAA = pointA;
	}

	public Point getPointB() {
		return abcd;
	}

	public void setPointB(Point pointB) {
		this.abcd = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	public void draw() {
		System.out.println("Drawing Triangle");
		System.out.println("Point AA = (" + getPointA().getX() + "," + getPointA().getY() + ")");
		System.out.println("abcd = (" + getPointB().getX() + "," + getPointB().getY() + ")");
		System.out.println("Point C = (" + getPointC().getX() + "," + getPointC().getY() + ")");

	}

	/*
	 * @Override public void afterPropertiesSet() throws Exception {
	 * System.out.println("Initializing init method called for triangle ");
	 * 
	 * }
	 * 
	 * @Override public void destroy() throws Exception {
	 * System.out.println("DisposableBean destroy method called for Triangle");
	 * 
	 * 
	 * }
	 */

	public void myInit() {
		System.out.println("run this method before creating " + this.toString());

	}

	public void cleanUp() {
		System.out.println("running this method before destroying " + this.toString());
	}

	/*
	 * @Override public void destroy() throws Exception {
	 * System.out.println("destroy method from DisposableBean for triangle");
	 * 
	 * }
	 * 
	 * @Override public void afterPropertiesSet() throws Exception {
	 * System.out.println("method from InitializingBean");
	 * 
	 * }
	 * 
	 * @Override public String toString() { return "Triangle [pointA=" + pointA +
	 * ", pointB=" + pointB + ", pointC=" + pointC + "]"; }
	 */
}
