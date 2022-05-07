
import model.HUMANS;
import model.Car;

import javax.swing.text.DefaultEditorKit;
import java.util.Locale;

public class LESSON10 {
    public static void main(String[] args) {
        HUMANS human1 = new HUMANS();
        human1.Name = "Ani";
        human1.lastname = "Posxosyan";
        human1.year = 19;
        System.out.println(human1.lastname);
        System.out.println(human1.year);
        HUMANS human2 = new HUMANS();
        human2.year = 25;
        if (human2.year > human1.year) {
            System.out.println("it okay");
            Car car1 = new Car();

            System.out.println(car1.getCity());
            human1.sayhello();
            human2.printFullname();
            human1.printFullname();
            human1.printtoN(6);
        }
        human1.sum(5, 7);
        Car car = new Car();
        car.setEngine(-1.2);
        System.out.println(car.getEngine());
        Car car2= new Car();
        car2.setModel("Aka");

        System.out.println(car2.getModel());
String text = "Hello from Lesson 5";
        System.out.println(text.length());
        System.out.println(text.charAt(2));
        for(int i=0; i<text.length(); i++) {
            System.out.println(text.charAt(i));
        }
            int countf=0;

            for(int i=0; i<text.length(); i++){
                if (text.charAt(i)=='f')
                    countf++;

            }
        System.out.println(countf
        );
        System.out.println(text.toUpperCase());
        System.out.println(text.toLowerCase(Locale.ROOT));
        }
    }

