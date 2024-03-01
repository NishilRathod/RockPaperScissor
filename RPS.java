import java.util.*;
class RPS{
    public static int opponent=0,you=0,P1=0,P2=0;
    public static int oppChoice,yourChoice;
    public static List<String> choice=new ArrayList<String>();
    public static RPS obj=new RPS();
    public static int n;
    public static String name1,name2;
    public static void main(String[] args){
       
        choice.add("Rock");
        choice.add("Paper");
        choice.add("Scissor");
        System.out.println("What mode do you want to play:\n1.SinglePlayer\n2.Multiplayer");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        
        
        if(n==1){
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

        else if(n==2){
            System.out.println("Enter the name of Player1");
            Scanner sc1=new Scanner(System.in);
            name1=sc1.next();
            System.out.println("Enter the name of Player2");
            name2=sc1.next();
            
            while(P1<3 && P2<3){
            System.out.println("\n" + name1 + ":Enter your choice\n1.Rock\n2.Paper\n3.Scissors");
            oppChoice=sc1.nextInt();
            if(oppChoice==1){
                System.out.println("\n" + name1 + " picked Rock");
                }
            else if(oppChoice==2){
                System.out.println("\n" + name1 + " picked Paper");
                }
            else if(oppChoice==3){
                System.out.println("\n" + name1 + "picked Scissors");
            }
            else{
                System.out.println("Enter Valid choice");
            }
            if(oppChoice==1 || oppChoice==2 || oppChoice==3)
                obj.pickYourChoice();

            System.out.println("\n" + name1 + "'s Score is :" + P1);
            System.out.println("\n" + name2 + "'s Score is :" + P2);

            }
            if(P1==3){
                System.out.println("\n" + name1 + " WON !!");
            } 
            else{
                System.out.println("\n" + name2 + "WON !!");
            }
        }
        else{
            System.out.println("Enter valid option");
        }
    }

    public void pickYourChoice(){
        System.out.println("\n****************");
        if(n==1)   
            System.out.println("Enter your choice:\n1.Rock\n2.Paper\n3.Scissors");
        else{
            System.out.println(name2 + ":Enter your choice\n1.Rock\n2.Paper\n3.Scissors");   
        }
            Scanner s=new Scanner(System.in);
        yourChoice=s.nextInt();
        

        switch(yourChoice){
            case 1:
                if(yourChoice==1){
                    if(n==1){
                        System.out.println("\nYou picked Rock");
                        obj.getRandomElement(choice);
                    }
                    else{   
                         System.out.println("\n" + name2 + " picked Rock");
                    }
                    obj.Rock();
                }
                break;
            case 2:
                if(yourChoice==2){
                    if(n==1){
                        System.out.println("\nYou picked Paper");
                        obj.getRandomElement(choice);
                        }
                       else{
                         System.out.println("\n" + name2 + " picked Paper");
                       }
                        obj.Paper();
                }
                break;
            case 3:
                if(yourChoice==3){
                    if(n==1){
                        System.out.println("\nYou picked Scissors");
                        obj.getRandomElement(choice);
                    }
                    else{
                    System.out.println("\n" + name2 + " picked Scissors");
                    }   
                    obj.Scissors();
                }
                break;
            default:
                System.out.println("Enter Valid Option");
                break;
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

    public void Rock(){
        if(n==1){
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
        else{
            if(oppChoice==1){
                System.out.println("\nIt's a Draw");
            }
            else if(oppChoice==2){
                System.out.println("\n" + name1 +" wins!!");
                P1++;
            }
            else{
                System.out.println("\n" + name2 +" wins!!");
                P2++;
            }
        }    
    }
    

    public void Paper(){
        if(n==1){
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
        else{
            if(oppChoice==1){
                System.out.println("\n" + name2 +" wins!!");
                P2++;
                }
            else if(oppChoice==2){
                System.out.println("\nIt's a Draw!");
                }
            else{
                System.out.println("\n" + name1 +" wins!!");
                P1++;
                }
        }
    }

    public void Scissors(){
        if(n==1){
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
        else{
            if(oppChoice==1){
                System.out.println("\n" + name1 +" wins!!");
               P1++;
                }
            else if(oppChoice==2){
                System.out.println("\n" + name2 +" wins!!");
                P2++;
                }
            else{
                System.out.println("\nIt's a Draw!");
                }
        }
    }
}