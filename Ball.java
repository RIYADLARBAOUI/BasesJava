package Exercice3p6;

public class Ball {

    private float x;
    private float y;
    private int radius;
    private float xDelta;
    private float yDelta;


    public Ball(float x, float y, int radius , int speed, int direction){
        if(direction<=180 && direction>=-180){
            this.x = x;
            this.y = y;
            xDelta = (float)(speed * Math.cos((double)direction));
            yDelta = (float) (-speed * Math.cos((double)(direction)));
        }

    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public float getXDelta() {
        return xDelta;
    }

    public void setXDelta(float xDelta) {
        this.xDelta = xDelta;
    }

    public float getYDelta() {
        return yDelta;
    }



    public void setYDelta(float yDelta) {
        this.yDelta = yDelta;
    }

    public void move(){
        x+=xDelta;
        y+=yDelta;
    }

    public void reflectHorizontal(){
        --xDelta;
    }

    public void reflectVertical(){
        --yDelta;
    }

    public String toString(){
        return "Ball[("+this.x+","+this.y+"),speed=("+xDelta+","+yDelta+")]";
    }


}
