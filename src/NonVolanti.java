import java.util.Objects;

public class NonVolanti extends Birds {
    protected String typeOfMovement;

    public void walk() {
        System.out.println("Я гуляю");
    }

    protected void eat() {
        System.out.println("Я ем то, что найду");
    }

    protected void sleep() {
        System.out.println("Я сплю в своем гнезде");
    }

    protected void go() {
        System.out.println("Я бегаю и хожу");
    }

    public void getMassageNonVolanti() {
        System.out.println("Я " + animalName + ", мне " + numberOfYears + " лет, моя среда обитания это " + habitat +
                ", я перемещаюсь так - " + typeOfMovement);
    }

    public String getTypeOfMovement() {
        return typeOfMovement;
    }

    public void setTypeOfMovement(String typeOfMovement) {
        if (!typeOfMovement.isBlank() || !typeOfMovement.isEmpty()) {
            this.typeOfMovement = typeOfMovement;
        } else {
            this.typeOfMovement = "Хожу";
        }
    }

    NonVolanti(String animalName, int numberOfYears, String habitat, String typeOfMovement) {
        this.animalName = animalName;
        this.numberOfYears = numberOfYears;
        this.habitat = habitat;
        if (!typeOfMovement.isBlank() || !typeOfMovement.isEmpty()) {
            this.typeOfMovement = typeOfMovement;
        } else {
            this.typeOfMovement = "Хожу";
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        NonVolanti that = (NonVolanti) o;
        return Objects.equals(typeOfMovement, that.typeOfMovement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfMovement);
    }

    @Override
    public String toString() {
        return "NonVolanti{" +
                "typeOfMovement='" + typeOfMovement + '\'' +
                '}';
    }
}
