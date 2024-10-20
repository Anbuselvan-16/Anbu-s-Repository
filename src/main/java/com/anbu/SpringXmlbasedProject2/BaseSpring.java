package com.anbu.SpringXmlbasedProject2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class BaseSpring {
		public static void main(String[] args) {
			ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
			Laptop laptop = context.getBean("laptop",Laptop.class);
		    System.out.println(laptop.getLaptopMobileName());
		}
}
