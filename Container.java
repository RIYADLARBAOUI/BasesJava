package Exercice3p6;

public class Container {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public Container(int x, int y,int width,int height){
        this.x1 = x;
        this.y1= y;
        this.x2 = this.x1 + width-1;
        this.y2 = this.y1 + height -1;
    }
}
