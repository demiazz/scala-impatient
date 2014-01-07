class Car {

  public final String  manufacturer;
  public final String  modelName;
  public final Integer modelYear;
  public       String  licensePlate;

  public final static Integer DEFAULT_MODEL_YEAR = -1;
  public final static String  DEFAULT_LICENSE_PLATE = "";

  public Car(String  manufacturer,
             String  modelName,
             Integer modelYear,
             String  licensePlate) {
      this.manufacturer = manufacturer;
      this.modelName    = modelName;
      this.modelYear    = modelYear;
      this.licensePlate = licensePlate;
  }

  public Car(String manufacturer, String modelName, Integer modelYear) {
    this(manufacturer, modelName, modelYear, Car.DEFAULT_LICENSE_PLATE);
  }

  public Car(String manufacturer, String modelName, String licensePlate) {
    this(manufacturer, modelName, Car.DEFAULT_MODEL_YEAR, licensePlate);
  }

  public Car(String manufacturer, String modelName) {
    this(manufacturer, modelName, Car.DEFAULT_MODEL_YEAR, Car.DEFAULT_LICENSE_PLATE);
  }

  @Override
  public String toString() {
    return "Manufacturer: " + manufacturer + "; Model: " + modelName +
    "; Year: " + modelYear + "; License Plate: " + licensePlate;
  }

}

class CarExample {

  public static void main(String[] args) {
    Car lada   = new Car("Lada", "2110", 2005, "RU 204");
    Car mazda  = new Car("Mazda", "RX 7", 2004);
    Car nissan = new Car("Nissan", "Skyline");

    System.out.println(lada);
    System.out.println(mazda);
    System.out.println(nissan);

    lada.licensePlate = "UA 203";

    System.out.println(lada);
  }

}
