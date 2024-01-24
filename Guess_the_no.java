import java.util.Random;
import java.util.Scanner;

class Game{
    public int no;
    public int input;
    public int chance=0;
    public int nochances() {
        int chance1 = chance;
        return chance1;
    }

    public void setNo(int chance)
    {
        this.chance=chance;
    }
    Game(){
        Random rand=new Random();
        this.no=rand.nextInt(100);
    }
    int userinput(){
        System.out.println("gusses the number ");
        Scanner sc=new Scanner(System.in);
        input=sc.nextInt();
        return input;
    }
    boolean iscorrect(){
        chance++;
        if(input==no) {
            System.out.format("yes you get it number %d \n you find in %d number of chances\n",no,chance);
            return true;
        }
        else if (input<no)
        {
            System.out.println("to low.....");
        }
        else if(input>no) {
            System.out.println("to high.....");

        }
        return false;

    }
}
public class Guess_the_no{
    public static void main(String[] args) {
        Game g=new Game();
        boolean b=false;
        while(!b)
        {
            g.userinput();
            b=g.iscorrect();
            System.out.println(b);
        }

    }
}
