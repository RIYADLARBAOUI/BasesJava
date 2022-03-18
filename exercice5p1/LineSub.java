package exercice5p1;

public class LineSub extends Point{
	
	Point end;
	
	
	public LineSub(int beginX,int beginY, int endX, int endY) {
		super(beginX,beginY);  // on peut pas appeler deux fois super
		this.end = new Point(endX,endY);
	}
	
	public LineSub(Point begin, Point end) {
		super(begin.getX(),begin.getY());
		this.end = end;
	}

	@Override
	public String toString() {
		return "LineSub [end=" + end + ", toString()=" + super.toString() + ", getX()=" + getX() + ", getY()=" + getY()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	
	public Point getBegin() {
		return super.getBegin();
	}
	
	public Point getEnd() {
		return end;
	}
	
	public void setBegin(int x, int y) {
		 super.setXY(x, y);
	}
	
	public void setEnd(int x, int y) {
		end.setXY(x,y);
	}
	
	public int getBeginX() {
		return super.getBegin().getX();
	}
	
	public int getBeginY() {
		return super.getBegin().getY();
	}
	
	
	public int getEndX() {
		return end.getX();
	}
	
	public int getEndY() {
		return end.getY();
	}
	
	public void setBeginX(int x) {
		super.getBegin().setX(x);
	}
	
	public void setBeginY(int y) {
		super.getBegin().setY(y);
		
	}
	
	public void setBeginXY(int x, int y) {
		setBeginX(x);
		setBeginY(y);
	}
	
	public void setEndX(int x) {
		end.setX(x);
	}
	
	public void setEndY(int y) {
		end.setY(y);
	}
	
	public void setEndXY(int x, int y) {
		end.setXY(x, y);
	}
	
	public int getLength() {
		int Xdiff = end.getX()-super.getX();
		int Ydiff = end.getY()-super.getY();
		return (int) Math.sqrt(Xdiff * Xdiff + Ydiff * Ydiff);
	}
	
	
	public double getGradient() {
		int Xdiff = end.getX()-super.getX();
		int Ydiff = end.getY()-super.getY();
		return (double) Math.atan2(Ydiff, Xdiff);
	}

}
