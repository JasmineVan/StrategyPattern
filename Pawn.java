//Pawn class
public class Pawn extends Chess implements StrategyChess{
    
    public int quantity;

    public Pawn(){
        super();
        this.quantity = 8;
    }

    public Pawn(String ChessPiece, String Color, int quantity){
        super(ChessPiece, Color);
        this.quantity = quantity;
    }

    public Pawn(Pawn another){
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
        return 1;
    }

    public int minRange(){
        return 1;
    }

    public String power(){
        return "Legendary.";
    }

    @Override
    public String toString(){
        return "Chess[Piece = " + this.ChessPiece + ", Color = " + this.Color + ", Quantity = " + this.quantity + "].";
    }
}