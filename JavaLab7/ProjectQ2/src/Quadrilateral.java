import java.awt.Point;

public abstract class Quadrilateral {
    private Point a, b, c, d;

    public Quadrilateral(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        a = new Point(x1, y1);
        b = new Point(x2, y2);
        c = new Point(x3, y3);
        d = new Point(x4, y4);
    }

    public Double[] getSortedDist() {
        Point[] points = {a, b, c, d};

        Double[] dis = new Double[6];
        int index = 0;
        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                dis[index] = points[i].distance(points[j]);
                index++;
            }
        }
        dis = insertionSort(dis);
        return dis;
    }

    private Double[] insertionSort(Double[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            double key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j -= 1;
            }
            arr[j + 1] = key;
        }
        return arr;
    }

    public String toString(){
        Point[] points = {a,b,c,d};
        String string = "";
        for (Point eachpoint : points){
            string += eachpoint.getClass().getName() + "[x = " + eachpoint.getX() + " , " + eachpoint.getY() + "]\n";
        }
        return string;
    }
    public abstract double area();

}
