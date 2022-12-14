import java.util.Objects;

public class Birds extends Animal{
    protected String habitat;

    public void hunt() {
        System.out.println("Я выслеживаю добычу и убиваю её!");
    }
    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        if (!habitat.isEmpty() || !habitat.isBlank()) {
            this.habitat = habitat;
        } else {
            this.habitat = "Суша-вода";
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Birds birds = (Birds) o;
        return Objects.equals(habitat, birds.habitat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), habitat);
    }

    @Override
    public String toString() {
        return "Birds{" +
                "habitat='" + habitat + '\'' +
                '}';
    }
}
