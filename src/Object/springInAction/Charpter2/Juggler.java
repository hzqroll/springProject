package Object.springInAction.Charpter2;

public class Juggler implements Performer{
	private int beanBags = 3;
	
	public Juggler(int beanBags2){
		this.beanBags = beanBags;
	}
	
	public Juggler() {
	}

	public void performer(){
		System.out.println("JUGGLER" + beanBags+"BEANBAGS");
	}
	

}
