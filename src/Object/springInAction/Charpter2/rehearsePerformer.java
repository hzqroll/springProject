package Object.springInAction.Charpter2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class rehearsePerformer {

	public static void main(String[] args) throws PerformanceException{
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"src/Object/springInAction/Charpter2/spring-idol.xml");
		
		Performer performer = (Performer) ctx.getBean("duck");
		performer.performer();
	}
}
