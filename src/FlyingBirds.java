import java.util.Objects;

public class FlyingBirds extends Birds{
    protected String typeOfMovement;
    public void fly() {
        System.out.println("Я летаю");
    }
    protected void eat() {
        System.out.println("Я ем то, что найду или поймаю");
    }

    protected void sleep() {
        System.out.println("Я сплю в своем гнезде");
    }

    protected void go() {
        System.out.println("Я хожу и летаю");
    }
    public void getMassageFlyingBirds() {
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
    FlyingBirds(String animalName, int numberOfYears, String habitat, String typeOfMovement){
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
        FlyingBirds that = (FlyingBirds) o;
        return Objects.equals(typeOfMovement, that.typeOfMovement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfMovement);
    }

    @Override
    public String toString() {
        return "FlyingBirds{" +
                "typeOfMovement='" + typeOfMovement + '\'' +
                '}';
    }
}
