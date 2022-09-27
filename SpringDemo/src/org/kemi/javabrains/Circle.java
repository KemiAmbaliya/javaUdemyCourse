package org.kemi.javabrains;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
//import org.springframework.beans.factory.annotation.Required;

@Controller
public class Circle implements Shape {
	private   center;

	public Circle(Point center) {
		super();
		this.center = center;
	}

	@Override
	public void draw() {
		System.out.println("Drawing Circle");

		System.out.println("Circle: Point is: " + center.getX() + ", " + center.getY() + ")");

	}

	public Point getCenter() {
		return center;
	}

	// @Resource - this will not work
	@Autowired
	/*
	 * we use qualifier to tell spring that it has to find a bean with matching
	 * qualifier and inject here
	 */
	@Qualifier("circleRelated")
	public void setCenter(Point center) {
		this.center = center;
	}

	@Override
	public String toString() {
		return "Circle [center=" + center + "]";
	}

	/*
	 * @PostConstruct public void initializedCircle() {
	 * System.out.println("Init of circle");
	 * 
	 * }
	 */

	/*
	 * @preDestroy public void destroyCircle() {
	 * System.out.println("Destroy of circle");
	 * 
	 * }
	 */

}
