public class shape {

    private String color = "Green";
    protected boolean filled = true;

    public shape() {
    }

    public shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "A Shape with color of"
                + getColor()
                + "and"
                + (isFilled() ? "filled" : "not filled");
    }


    public static void main(String[] args) {
        shape Shape = new shape();
        System.out.println(Shape);

        Shape = new shape("red", false);
        System.out.println(Shape);
    }
}