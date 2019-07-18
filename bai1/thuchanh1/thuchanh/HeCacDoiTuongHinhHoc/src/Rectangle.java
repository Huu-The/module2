public class Rectangle extends shape {
    private double width = 1.0;
    private double length = 1.0;

    public Rectangle(){
    }

    public Rectangle(double with, double length){
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled){
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWitdh(){
        return width;
    }

    public void setWitdh(double witdh){
        this.width = witdh;
    }

    public double getLength(){
        return length;
    }

    public void  setLength(double length){
        this.length =length;
    }

    public double getArea(){
        return width * this.length;
    }

    public double getPerimeter(){
        return 2 * (width * this.length);
    }

    @Override

    public String toString(){
        return "A Rectangle with width = "
                +getWitdh()
                +"and length = "
                +getLength()
                +", which is subclass of "
                +super.toString();
    }
}
