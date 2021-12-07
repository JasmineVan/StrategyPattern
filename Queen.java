//Queen class
public class Queen extends Chess implements StrategyChess{
    
    public int quantity;

    public Queen(){
        super();
        this.quantity = 1;
    }

    public Queen(String ChessPiece, String Color, int quantity){
        super(ChessPiece, Color);
        this.quantity = quantity;
    }

    public Queen(Queen another){
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