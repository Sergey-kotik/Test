public class Car {

    private int carSpeed;
    private int carWeight;
    private String carBrand;
    private String carColor;

    public Car(int carSpeed, int carWeight, String carBrand, String carColor) {
        this.carSpeed = carSpeed;
        this.carWeight = carWeight;
        this.carBrand = carBrand;
        this.carColor = carColor;
    }

    public Car() {
        this(170, 910, "LADA", "White");
    }


    public void build() {
        System.out.println("You must build a new car");
    }
    public void buy() {
        System.out.println("I will buy this car");
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    @Override
    public String toString() {
        return getCarBrand() +
                " carSpeed=" + carSpeed +
                ", carWeight=" + carWeight +
                ", carBrand='" + carBrand + '\'' +
                ", carColor='" + carColor + '\'';
    }
}
