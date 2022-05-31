class Animal {
  String name;
  double foodPerDay;

  Animal(String name, double foodPerDay) {
    if (foodPerDay <= 0) {
      throw new IllegalArgumentException("The food per day must be greater than 0.");
    }

    this.name = name;
    this.foodPerDay = foodPerDay;
  }

  Animal(String name) {
    this(name, 1.0);
  }

  void changeFoodRation(double delta) throws AnimalException {
    double newFoodPerDay = foodPerDay + delta;
    if (newFoodPerDay <= 0) {
      throw new AnimalException(this, "The new food per day would be less than zero, and that's not possible.");
    }
    foodPerDay = newFoodPerDay;
  }

  @Override
  public String toString() {
    return String.format("Animal %s (Food per day: %.2f)", name, foodPerDay);
  }
}
