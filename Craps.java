public class Craps
{
    DiceRoll r;
    
    public Craps()
    {
        r = new DiceRoll ( );

    }

    // Returns 0 if lose, otherwise the amount won.
    public int play ( ) {
        int point = 0;
        while(true){
            int x = r.total();
            if (x == 2 || x ==3 || x== 12){
                return 0;
            }
            if (x==7 || x == 11){
                return point;
            }
            point++;

        }

    }
    }
    
    //simulate play to see your odds of winning
    public void tester(int howMany)
    {
    	
    }
}
