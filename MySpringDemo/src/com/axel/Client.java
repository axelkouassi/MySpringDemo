package com.axel;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {

	public static void main(String[] args) {
		// General Way
		System.out.println("General usual way to create java objects");
		Employee eRef = new Employee();
		eRef.setName("John");
		eRef.setEid(101);
		eRef.setDept("R&D");
		eRef.setSalary(65000);
		eRef.setEmail("john@cde.com");
		
		System.out.println("eRef Details: " + eRef);
		
		
		System.out.println("");
		
		//Spring Way
		//Inversion of control
		System.out.println("Inversion of control with Spring\n");
		
		System.out.println("BeanFactory");
		System.out.println("BeanFactory constructs object ONLY when we do request");
		//1. BeanFactory | Spring IOC Container | Construct object when we request
		Resource resource = new ClassPathResource("employeebean.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		Employee emp1 = (Employee) factory.getBean("e1");
		System.out.println("emp1: " + emp1);
		System.out.println("");
		
		Employee emp2 = (Employee) factory.getBean("e2");
		System.out.println("emp2: " + emp2);
		System.out.println("");
		
		
		
		
		
		System.out.println("ApplicationContext");
		//1. Application Context | Spring IOC Container | Construct object even when we do not request
		System.out.println("ApplicationContext constructs object EVEN when we do NOT request");
		ApplicationContext context = new ClassPathXmlApplicationContext("employeebean.xml");
		Employee emp3 = (Employee) factory.getBean("e1");
		System.out.println("");
		System.out.println("emp1: " + emp1);
		System.out.println("");
		
		System.out.println("");
		Employee emp4 = factory.getBean("e2", Employee.class);
		System.out.println("emp2: " + emp2);
		
		
		
	

	}

}
