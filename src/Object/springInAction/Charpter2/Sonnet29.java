package Object.springInAction.Charpter2;

public class Sonnet29 implements Poem{

	private static String[] LINES = {
			"this is sonnet29","this is othe"
	};
	public Sonnet29(){
		
	}
	
	public void recite(){
		for(int i = 0;i<LINES.length;i++){
			System.out.println(LINES[i]);
		}
	}
}
