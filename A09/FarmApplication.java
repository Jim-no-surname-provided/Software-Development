class FarmApplication {
  public static void main(String[] args) throws StableException {
    Out.println("Starting test application with example farm\n");

    Farm farm = Farm.createExampleFarm();

    Out.println("Test farm created:");
    farm.print();
    Out.println();

    farm.run();
  }
}
