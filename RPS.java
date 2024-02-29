import java.util.*;
class RPS{
    public static int opponent=0,you=0;
    public static int oppChoice,yourChoice;
    public static List<String> choice=new ArrayList<String>();
    public static RPS obj=new RPS();
    public static void main(String[] args){
       
        choice.add("Rock");
        choice.add("Paper");
        choice.add("Scissor");
        
        while(opponent<3 && you<3){
        obj.pickYourChoice();
        System.out.println("\nYour Score: " + you);
        System.out.println("Opponent Score: " + opponent);
        }
        if(opponent==3){
            System.out.println("\nYOU LOST...\n");
        }
        else{
            System.out.println("\nYOU WON!!\n");
        }
        
    }

    public void getRandomElement(List<String> choice){
        Random rand=new Random();
        oppChoice=rand.nextInt(choice.size());
        if(oppChoice==0){
            System.out.println("Opponent picked Rock");
        }
        else if(oppChoice==1){
            System.out.println("Opponent picked Paper");
        }
        else{
            System.out.println("Opponent picked Scissors");
        }
    }

    public void pickYourChoice(){
        System.out.println("\n****************");
        System.out.println("Enter your choice:\n1.Rock\n2.Paper\n3.Scissors");
        Scanner s=new Scanner(System.in);
        yourChoice=s.nextInt();
        

        switch(yourChoice){
            case 1:
                if(yourChoice==1){
                    System.out.println("\nYou picked Rock");
                    obj.getRandomElement(choice);
                    obj.Rock();
                }
                break;
            case 2:
                if(yourChoice==2){
                    System.out.println("\nYou picked Paper");
                    obj.getRandomElement(choice);
                    obj.Paper();
                }
                break;
            case 3:
                if(yourChoice==3){
                    System.out.println("\nYou picked Scissors");
                    obj.getRandomElement(choice);
                    obj.Scissors();
                }
                break;
            default:
                System.out.println("Enter Valid Option");
                break;
        }


    }

    public void Rock(){
        if(oppChoice==0){
            System.out.println("\nIt's a Draw");
        }
        else if(oppChoice==1){
            System.out.println("\nYou lose!");
            opponent++;
        }
        else{
            System.out.println("\nYou win!");
            you++;
        }
    }

    public void Paper(){
        if(oppChoice==0){
            System.out.println("\nYou win!");
            you++;
        }
        else if(oppChoice==1){
            System.out.println("\nIt's a Draw!");
        }
        else{
            System.out.println("\nYou lose!");
            opponent++;
        }
    }

    public void Scissors(){
        if(oppChoice==0){
            System.out.println("\nYou lose!");
            opponent++;
        }
        else if(oppChoice==1){
            System.out.println("\nYou win!");
            you++;
        }
        else{
            System.out.println("\nIt's a Draw!");
        }
    }
}