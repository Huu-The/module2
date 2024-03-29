public class Point3D extends Point2D {
    private float z = 0.0f;

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float[] getXYZ() {
        float[] xyz = {getY(), getY(), getZ()};
        return xyz;
    }

    public void setXYZ(float x, float y, float z) {
        super.setXY(x, y);
        this.z = z;
    }

    @Override
    public String toString() {
        return super.toString() + " và tọa độ Z là: " + getZ();
    }

    public static void main(String[] args) {
        Point3D point3D = new Point3D(6, 5, 3);
        point3D.setXYZ(9, 9, 9);
        System.out.println(point3D);
    }
}
