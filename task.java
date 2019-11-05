package exercises;

/**
 *
 * @author hp
 */
public class Exercises {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println("the circle has redius "+c1.GetRadius()+"\nAnd area of "+c1.GetArea());
        
        // new object from overloaded instructor
        Circle c2 = new Circle(3.0);
        System.out.println("the circle has redius "+c2.GetRadius()+"\nAnd area of "+c2.GetArea());
        
        Circle c3 = new Circle(4.0,"blue"); //as shrouk love blue..;)
        System.out.println("the of circle "+c3.Getcolor());
        
        Circle c4 = new Circle();
        c4.setcolor("yellow");
        c4.setradius(5.0);
        System.out.println("the color of cirle " +c4.Getcolor());
         System.out.println("the color of radius " +c4.Getcolor());
         System.out.println(c4.tostring());//returns a short description of the instance
    
        Rectangle r1 = new Rectangle();
        System.out.println(r1.tostring());
    }
    
    
    
}

