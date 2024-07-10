package mod1;

public class ShapeDrawer {

    private final Shape shape;

    public ShapeDrawer(Shape shape) {
        this.shape = shape;
    }

    public void process() {
        System.out.println("Start...");
        shape.draw();
        System.out.println("End....");
    }
}
