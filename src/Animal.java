import java.util.Objects;

public  class Animal {
    protected String animalName;
    protected int numberOfYears;

    protected void eat(){

    }
    protected void sleep(){

    }
    protected void go(){

    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        if (!animalName.isEmpty() || !animalName.isBlank()) {
            this.animalName = animalName;
        } else {
            this.animalName = "Животное";
        }
    }

    public int getNumberOfYears() {
        return numberOfYears;
    }

    public void setNumberOfYears(int numberOfYears) {
        if (numberOfYears >= 0) {
            this.numberOfYears = numberOfYears;
        } else {
            this.numberOfYears = 0;
        }
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return numberOfYears == animal.numberOfYears && Objects.equals(animalName, animal.animalName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(animalName, numberOfYears);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "animalName='" + animalName + '\'' +
                ", numberOfYears=" + numberOfYears +
                '}';
    }
}
