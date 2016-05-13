package Object.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class getMessage {
	 public static void main(String[] args){
	        ApplicationContext ctx=new FileSystemXmlApplicationContext("src/SpringWeb.xml");
	        ApplicationContext spingexm = new ClassPathXmlApplicationContext("Springweb.xml");
	        System.out.println(spingexm);
	        SpringExm se=(SpringExm) spingexm.getBean("myBean");
	        se.show();
	        
	    }
}
