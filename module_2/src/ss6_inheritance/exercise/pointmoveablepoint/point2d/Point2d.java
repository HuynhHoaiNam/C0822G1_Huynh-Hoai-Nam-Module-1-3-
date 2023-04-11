package ss6_inheritance.exercise.pointmoveablepoint.point2d;

public class Point2d {
    private float x = 0.0f;
    private float y = 0.0f;


    public Point2d(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point2d() {
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x  = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY() {
        float[] arr = {getX(), getY()};
        return arr;
    }

    @Override
    public String toString() {
        return "Point2d{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
