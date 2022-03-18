
import java.util.Scanner;

public class TP4{
    public static void main(String[] args){
        isBinary();

    }
    public static void isBinary(){
        String chaine;
        Scanner in = new Scanner(System.in);
        System.out.println("entrez une chaine:");
        chaine = in.nextLine();
        in.close();
        for(int i= 0 ; i<chaine.length() ;++i ){
            if(chaine.charAt(i) != '0' || chaine.charAt(i) != '1'){
                System.out.print(i);
                System.out.println("ce n'est pas un nombre binaire");
                System.exit(-1);
            }
            else{
                System.out.print(i);
            }
        
        }
        System.out.println("c'est un nombre binaire");

                
    }
}


/*/////////////////6.1 //////////////////////////////////
public static void squarePattern(char symbol){
            int size;
            Scanner in = new Scanner(System.in);
            System.out.println("entrez une taille:");
            size = in.nextInt();
            System.out.println(size);
            in.close();
            for(int row = 0 ; row < size ; ++row){
                for(int column = 0 ; column < size ; ++column){
                    System.out.print('t');
                }
                System.out.println();
                
            }
            
                
                
        }

*/


/* ///////////////////////////6.3 /////////////////////

public static void TimeTable(){
        int size;
        Scanner in = new Scanner(System.in);
        System.out.print("Entrez une taille : ");
        size  =  in.nextInt();
        in.close();
        for(int i = 1 ; i <= size ; ++i){
                System.out.printf("%4d",i);
                System.out.print('|');
            }
            for(int j = 1 ; j <= size ; ++j ){
                System.out.printf("%4d",i*j);
            }
            System.out.println();
        }
    }

*/

/*////////////////////////////////////////6.4////////////////////////

 public static void factorial(int n ){
      long factorial = 1;

      for (int i = 1; i <= n; ++i) {  
         factorial *= i; 
      }
      System.out.println("The Factorial of " + n + " is " + factorial);
    }

/////////////////////////////////////////*////////////////////////////


/*/////////////////8.1///////////////////////

  public static void reverseString(){
        String chaine, test;
        Scanner in = new Scanner(System.in);
        System.out.println("entrez une chaine:");
        chaine = in.nextLine();
        in.close();
        for(int i = chaine.length()-1 ; i >= 0; --i){
            test+=chaine.charAt(i);
        }
        System.out.print(test);
    }
   
       
}

*/

