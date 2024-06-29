public class Point {
    public double x,y;
    public Point(double x, double y){  // constructor
        this.x = x; this.y = y;

    }
    public double distance(double x, double y) {  // calculating distance
        return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
    }

    public void translate(double movebyX , double movebyY){ // move the point by (x,y)
        this.x += movebyX; this.y += movebyY;
    }

    public boolean equals(Point other){ // compare to other point
            //return (this.x == other.x && this.y == other.y);

    }

    public String toString(){
        return ("("+this.x+","+this.y+")");
    }

}
