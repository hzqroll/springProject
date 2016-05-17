package Object.springInAction.Charpter2;

public class PoeticJuggler extends Juggler{
	private Poem poem;
	
	// 注入Poem
    public PoeticJuggler(Poem poem) {
        super();
        this.poem = poem;
    }

    // 注入豆袋子数量和Poem
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
