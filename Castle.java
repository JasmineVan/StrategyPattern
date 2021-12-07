//Castle class
public class Castle extends Chess implements StrategyChess{
    
    public int quantity;

    public Castle(){
        super();
        this.quantity = 2;
    }

    public Castle(String ChessPiece, String Color, int quantity){
        super(ChessPiece, Color);
        this.quantity = quantity;
    }

    public Castle(Castle another){
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
        return "Can not move";
    }

    public int maxRange(){
        return 8;
    }

    public int minRange(){
        return 1;
    }

    public String power(){
        return "Heavy.";
    }

    @Override
    public String toString(){
        return "Chess[Piece = " + this.ChessPiece + ", Color = " + this.Color + ", Quantity = " + this.quantity + "].";
    }
}