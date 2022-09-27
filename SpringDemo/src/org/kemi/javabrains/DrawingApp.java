package org.kemi.javabrains;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {
		// Triangle t = new Triangle();
		// BeanFactory factory = new XmlBeanFactory(new
		// FileSystemResource("spring.xml"));

		// @SuppressWarnings("resource")

		/*
		 * ApplicationContext context = new
		 * ClassPathXmlApplicationContext("spring.xml");
		 * 
		 * context.registerShutdownHook(); // this only works with
		 * AbstractApplicationContext
		 * 
		 * Shape s = (Shape) context.getBean("circle"); s.draw();
		 * System.out.println(context.getMessage("greeting", null, "Defaul Greeting",
		 * null));
		 */
		Circle c = new Circle(new Point(22, 33));
		System.out.println(c.getCenter());

	}

}
