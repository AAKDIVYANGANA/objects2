class Area {
    private double length;
    private double breadth;


    public void setDim(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }


    public double getArea() {
        return length * breadth;
    }
}

   class Main {
    public static void main(String[] args) {

        Area rectangle = new Area();


        double length = 5.0;
        double breadth = 10.0;
        rectangle.setDim(length, breadth);


        double area = rectangle.getArea();
        System.out.println("Area of the rectangle with length " + length + " and breadth " + breadth + " is: " + area);
    }
}

