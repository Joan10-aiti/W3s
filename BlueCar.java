public class BlueCar {
  int modelYear;
  String modelName;

  public BlueCar(int year, String name) {
    modelYear = year;
    modelName = name;
  }

  public static void main(String[] args) {
    BlueCar myCar = new BlueCar(1969, "Mustang");
    System.out.println(myCar.modelYear + " " + myCar.modelName);
  }
}