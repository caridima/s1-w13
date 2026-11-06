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
        int x = r.roll();
            if (x == 2 || x ==3 || x== 12){
                return 0;
            }
            else if (x==7 || x == 11){
                return 1;
            }
        else {
            point = x;
            x = r.roll();
            while (x != 7){
                if ( x == point){
                    return 1;
                }
                x = r.roll();
            }
            return 0;

        }

    }
    
    //simulate play to see your odds of winning
    public void tester(int howMany)
    {
    	int k =0;
        while(k <howMany){
            System.out.println(play());
            k = k+1;
        }
    }

    public static void main(String[] args){
        Craps game = new Craps();
        game.tester(10); 
    }
}
