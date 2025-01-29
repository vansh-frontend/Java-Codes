class Box {
     double length;
     double width;
     double height;

    public Box(double l, double w, double h) {
        length = l;
        width = w;
        height = h;
    }


    public Box() {
        length = 0;
        width = 0;
        height = 0;
    }

    public Box(double side) {
        length = side;
        width = side;
        height = side;
    }


    public double calculateVolume() {
        return length * width * height;
    }

  public void displayDimensions() {
        System.out.println("Length: " + length + ", Width: " + width + ", Height: " + height);
    }
}

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box(5.0, 4.0, 3.0); 
        Box box2 = new Box(7.0, 4.0, 3.0); 
        Box box3 = new Box(6.0);            

        // Displaying the dimensions and volume
        System.out.println("Box 1 dimensions:");
        box1.displayDimensions();
        System.out.println("Volume of Box 1: " + box1.calculateVolume());

        System.out.println("\nBox 2 dimensions:");
        box2.displayDimensions();
        System.out.println("Volume of Box 2: " + box2.calculateVolume());

        System.out.println("\nBox 3 dimensions:");
        box3.displayDimensions();
        System.out.println("Volume of Box 3: " + box3.calculateVolume());
    }
} 