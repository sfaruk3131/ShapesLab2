public class Runner {
    public static void main(String []args)
    {
        Shape Shape1 = new Rectangle(5,4);
        Shape Shape2 = new Circle(6);
        Shape Shape3 = new ETriangle(7);

        Shape[] Shapes = {Shape1, Shape2, Shape3};
        for(Shape cur : Shapes )
        {
            System.out.println(cur);
            System.out.println("My Area is: " + cur.getArea());
            System.out.println("My Perimeter is: " + cur.getPerimeter());
        }
    }

}
