package Object.springInAction.Charpter2;

public class Instrumentalist implements Performer{

	public Instrumentalist(){
		
	}

	public void performer() throws PerformanceException {
		// TODO Auto-generated method stub
		System.out.println("Playing "+song+" : ");
		getInstrument().play();
	}
	
	private String song;
	public void setSong(String song){
		this.song = song;
	}
	
	public String getSong(){
		return song;
	}
	
	public String screamSong;

	private Instrument instrument;
	
	public Instrument getInstrument() {
		return instrument;
	}

	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}
	

	
}
