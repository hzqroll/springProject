package Object.springInAction.Charpter2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class rehearsePerformer {

	public static void main(String args[]){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-idol.xml");
		System.out.println(ctx);
		Performer performer = (Performer) ctx.getBean("duck");
		performer.performer();
	}
}
