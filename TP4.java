


public class TP4{
    public static void main(String[] args){
        squarePattern(5,'t');
    }
    
    
        public static void squarePattern(int size, char symbol){
            for(int column = 0, row = 0 ; column < size  && row < size ; ++column,++row ){
                System.out.println(symbol);
            }
        }
}