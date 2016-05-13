package Object.spring;

public class SpringExm {

	private String mySpring;
    public String getMySpring() {
		return mySpring;
	}
	public void setMySpring(String mySpring) {
		this.mySpring = mySpring;
	}
	public void show(){
        System.out.println("--message--"+getMySpring());
    }
}
