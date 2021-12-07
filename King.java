//King class
public class King extends Chess implements StrategyChess{
    
    public int quantity;

    public King(){
        super();
        this.quantity = 1;
    }

    public King(String ChessPiece, String Color, int quantity){
        super(ChessPiece, Color);
        this.quantity = quantity;
    }

    public King(King another){
        super(another.ChessPiece, another.Color);
        this.quantity = another.quantity;
    }

    public String horizontalMove(){
        return "Moved";
    }

    public String verticalMove(){
        return "Moved";
    }

    public String crossMove(){
        return "Moved";
    }

    public int maxRange(){
        return 1;
    }

    public int minRange(){
        return 1;
    }

    public String power(){
        return "The most important unit in the game.";
    }

    @Override
    public String toString(){
        return "Chess[Piece = " + this.ChessPiece + ", Color = " + this.Color + ", Quantity = " + this.quantity + "].";
    }
}