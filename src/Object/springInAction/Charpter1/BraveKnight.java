package Object.springInAction.Charpter1;

import org.springframework.dao.QueryTimeoutException;

public class BraveKnight {
	private static Quest quest;
	private static Minstrel minstrel;
	
	public BraveKnight(Quest quest,Minstrel minstrel){
		this.quest = quest;
		this.minstrel = minstrel;
	}
	
	public void embarkOnQuert() {
		//minstrel.singBeforeQuest();
		quest.embark();
		//minstrel.singAfter();
	}
	
	public static void main(String args[]){
		BraveKnight ab = new  BraveKnight(quest, minstrel);
		ab.embarkOnQuert();
	}

}
