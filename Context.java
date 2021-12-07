public class Context {  
  
    private StrategyChess strategy;  
    
    public Context(StrategyChess strategy){  
        this.strategy = strategy;  
    }  

    public String executeHorizontalMove(){  
        return strategy.horizontalMove();
    }

    public String executeVerticalMove(){  
        return strategy.verticalMove();
    }

    public String executeCrossMove(){  
        return strategy.crossMove();
    }

    public String executePower(){  
        return strategy.power();
    }

    public int executeMaxRange(){  
        return strategy.maxRange();
    }

    public int executeMinRange(){  
        return strategy.minRange();
    }
    
    public String executeShow(){  
        return strategy.toString();
    }
}