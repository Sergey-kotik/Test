import javax.print.DocFlavor;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {
        Car car1 = new Car(210, 1540, "Honda", "Red");
        Car car2 = new Car(220, 1405, "Mazda", "Green");
        Car car3 = new Car();
        System.out.println(car1.getCarBrand());
        car2.setCarBrand("Audi");
        System.out.println(car2.getCarBrand());
        System.out.println(car3.toString());
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("я впервые это делаю, ");
        stringBuilder.append("и делаю это снова");
        System.out.println(stringBuilder);
        String s = "Привет как дела";
        Pattern pattern = Pattern.compile("(.*)(.*)");
        Matcher matcher = pattern.matcher(s);
        System.out.println(matcher.replaceFirst("$2 $1"));

    }

}
