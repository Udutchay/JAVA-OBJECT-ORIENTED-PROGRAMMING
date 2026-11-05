public class Shapes {
    static void report(Shape s){
    System.out.printf("%-10s area = %.2f%n", s.name(), s.area());
}
public static void main(String[] args){
        Shape[] shapes = {
                new Circle(3),
                new Rectangle(4,5),
                new Triangle(6,8),
                new Square(5)
        };
        double Total = 0;
        for (Shape s : shapes){
            report(s);
            Total += s.area();
        }
        System.out.printf("Total area = %.2f%n", Total);
}
//EXERCISE 6.2
public static Shape largest(Shape[] shapes){
        if(shapes == null || shapes.length == 0){
            return null;
        }
        Shape maxShape = shapes[0];
        double maxArea = maxShape.area();

        for (int i = 1; i < shapes.length; i++){
            double currentArea = shapes[i].area();
            if(currentArea > maxArea){
                maxArea = currentArea;
                maxShape = shapes[i];
            }
        }
        return maxShape;
}
}


