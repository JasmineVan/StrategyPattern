//testChess
public class ChessMatch{

    public static void main(String[] args){
        //Usual way        
        Queen d1 = new Queen("Queen", "white", 1);
        System.out.println(d1.horizontalMove());
        System.out.println(d1.verticalMove());
        System.out.println(d1.crossMove());
        System.out.println(d1.power());
        System.out.println(d1.maxRange());
        System.out.println(d1.minRange());
        System.out.println(d1.toString());

        //Use strategy pattern
        Context context = new Context(new King());          
        System.out.println(context.executeHorizontalMove());
        System.out.println(context.executeVerticalMove());
        System.out.println(context.executeCrossMove());
        System.out.println(context.executePower());
        System.out.println(context.executeMaxRange());
        System.out.println(context.executeMinRange());
        System.out.println(context.executeShow());
    }
}