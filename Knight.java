//Knight class
public class Knight extends Chess implements StrategyChess{
    
    public int quantity;

    public Knight(){
        super();
        this.quantity = 2;
    }

    public Knight(String ChessPiece, String Color, int quantity){
        super(ChessPiece, Color);
        this.quantity = quantity;
    }

    public Knight(Knight another){
        super(another.ChessPiece, another.Color);
        this.quantity = another.quantity;
    }

    public String horizontalMove(){
        return "Can not move";
    }

    public String verticalMove(){
        return "Can not move";
    }

    public String crossMove(){
        return "Con not move";
    }

    public int maxRange(){
        return 3;
    }

    public int minRange(){
        return 3;
    }

    public String power(){
        return "Weak.";
    }

    @Override
    public String toString(){
        return "Chess[Piece = " + this.ChessPiece + ", Color = " + this.Color + ", Quantity = " + this.quantity + "].";
    }
}