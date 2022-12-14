import java.util.Objects;

public class Mammal extends Animal {
    protected String habitat;
    protected int movementSpeed;

    public void walk(){
        System.out.println("Я гуляю");
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        if (!habitat.isEmpty() || !habitat.isBlank()) {
            this.habitat = habitat;
        } else {
            this.habitat = "Суша";
        }
    }

    public int getMovementSpeed() {
        return movementSpeed;
    }

    public void setMovementSpeed(int movementSpeed) {
        if (movementSpeed >= 0) {
            this.movementSpeed = movementSpeed;
        } else {
            this.movementSpeed = 0;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Mammal mammal = (Mammal) o;
        return movementSpeed == mammal.movementSpeed && Objects.equals(habitat, mammal.habitat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), habitat, movementSpeed);
    }

    @Override
    public String toString() {
        return "Mammal{" +
                "habitat='" + habitat + '\'' +
                ", movementSpeed=" + movementSpeed +
                '}';
    }
}
