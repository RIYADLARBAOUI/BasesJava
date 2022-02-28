package MyTime;

public class Main {
    public static void main(String[] args) {
        MyTime T1 =  new MyTime();
        MyTime T2 = new MyTime(23,58,26);
        MyTime T3 = new MyTime(22,00,59);

        System.out.println(T3.previousMinute().toString());
    }



}
