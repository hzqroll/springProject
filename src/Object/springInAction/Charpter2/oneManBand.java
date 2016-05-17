package Object.springInAction.Charpter2;

import java.util.Collection;
import java.util.Map;
import java.util.Properties;

public class oneManBand implements Performer{

	public oneManBand(){
		
	}
	
	/*public void performer() throws PerformanceException{
		for(Instrument instrument:getInstruments()){
			instrument.play();
		}
	}*/
	
	public void performer() throws PerformanceException{
		for(Object obj:instruments.keySet()){
			
			String instrument = (String) instruments.get(obj);
			System.out.println(obj +instrument);
		}
	}

	public Properties getInstruments() {
		return instruments;
	}

	public void setInstruments(Properties instruments) {
		this.instruments = instruments;
	}

	private Properties instruments;
	
	
}
