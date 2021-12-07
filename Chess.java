//class chess
public class Chess{

    final String[] ChessPiecesList = new String[]{"pawn", "knight", "castle", "bishop", "queen", "king"};
    final String[] ChessColorList = new String[]{"white", "black"};

    public String ChessPiece; 
    public String Color;

    public Chess(){
        this.ChessPiece = "pawn"; 
        this.Color = "white";
    }

    public Chess(String ChessPiece, String Color){
        if(isChessPiece(ChessPiece) == true && isChessColor(Color) == true){
            this.ChessPiece = ChessPiece;
            this.Color = Color;
        }else{
            System.out.println("Chess piece or color is not match");
        }
    }

    public boolean isChessPiece(String piece){
        for(int i = 0; i < ChessPiecesList.length; i++){
            if (piece.equalsIgnoreCase(ChessPiecesList[i])){
                return true;
            }
        }
        return false;
    }

    public boolean isChessColor(String Color){
        for(int i = 0; i < ChessPiecesList.length; i++){
            if (Color.equalsIgnoreCase(ChessColorList[i])){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString(){
        return "Chess[Piece = " + this.ChessPiece + ", Color = " + this.Color + "].";
    }
}