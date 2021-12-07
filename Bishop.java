//Bishop class
public class Bishop extends Chess implements StrategyChess{
    
    public int quantity;

    public Bishop(){
        super();
        this.quantity = 2;
    }

    public Bishop(String ChessPiece, String Color, int quantity){
        super(ChessPiece, Color);
        this.quantity = quantity;
    }

    public Bishop(Bishop another){
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
        return "Moved";
    }

    public int maxRange(){
        return 8;
    }

    public int minRange(){
        return 1;
    }

    public String power(){
        return "Weak.";
    }

    @Override
    public String toString(){
        return "Chess[Piece = " + this.ChessPiece + ", Color = " + this.Color + ", Quantity = " + this.quantity + "].";
    }
}