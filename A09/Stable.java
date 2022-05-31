class Stable {
  private final int nr;
  private final Animal[] animals;
  private int nAnimals;

  Stable(int nr, int capacity) {
    if (capacity <= 0) {
      throw new IllegalArgumentException("The capacity must be greater than 0.");
    }

    this.nr = nr;
    this.animals = new Animal[capacity];
    this.nAnimals = 0;
  }

  private int getIndexOfAnimal(Animal a) {
    for (int i = 0; i < nAnimals; i++) {
      if (animals[i] == a) {
        return i;
      }
    }
    return -1;
  }

  public void addAnimal(Animal a) throws StableException {
    if (nAnimals >= animals.length) {
      throw new StableFullException(this, animals.length, "The stable is already full");
    }

    if (getIndexOfAnimal(a) != -1) {
      throw new StableException(this, "The animal is already in the Stable");
    }

    animals[nAnimals] = a;
    nAnimals++;
  }

  public void removeAnimal(Animal a) throws StableException {
    int i = getIndexOfAnimal(a);
    if (i == -1) {
      throw new StableException(this, "404. Animal not found.");
    }
    // remove Animal at index i, i.e., shift all following
    // Animals to the left by one position
    for (int j = i; j < nAnimals - 1; j++) {
      animals[j] = animals[j + 1];
    }
    nAnimals--;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(String.format("Stable #%d (capacity %d/%d)", nr, nAnimals, animals.length));
    for (int i = 0; i < nAnimals; i++) {
      sb.append("\n\t- ");
      sb.append(animals[i]);
    }
    return sb.toString();
  }
}
