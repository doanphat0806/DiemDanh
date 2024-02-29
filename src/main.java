import model.Circle;
import model.Cylinder;

public class main {
    public static void main(String[] args) {
        //Circle
        Circle circle = new Circle(2.5,"red");
        System.out.println("Hình tròn |"+"Bán Kính :" + circle.getRadius()+ "," + "Màu:"+ circle.getColor());
        System.out.println("Diện Tích :" + circle.getArea());
        System.out.println("Bán Kính :" + circle.getPerimeter());
        //Cylinder
        Cylinder cylinder = new Cylinder(3.0,"red",5.0);
        System.out.println("Hình Trụ |"+"Bán Kính :"+cylinder.getRadius() +","+"Màu:"+cylinder.getColor()+","+"Chiều Cao:"+cylinder.getHeight());
        System.out.println("Thể Tích :" + cylinder.getVolume());
    }
}
