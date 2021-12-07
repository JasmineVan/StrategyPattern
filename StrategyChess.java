//This is strategy pattern class
public interface StrategyChess{

    public String horizontalMove();

    public String verticalMove();

    public String crossMove();

    public int maxRange();

    public int minRange();

    public String power();
}