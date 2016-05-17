package Object.springInAction.Charpter2;

public class PoeticJuggler extends Juggler{
	private Poem poem;
	
	// ע��Poem
    public PoeticJuggler(Poem poem) {
        super();
        this.poem = poem;
    }

    // ע�붹����������Poem
    public PoeticJuggler(int beanBags, Poem poem) {
        super(beanBags);
        this.poem = poem;
    }

    public void performer() {
        super.performer();
        System.out.println("While reciting...");
        poem.recite();
    }

}
