import java.util.Objects;

public class Amphibian extends Animal {
    protected String habitat;

    public void hunt() {
        System.out.println("Я выслеживаю добычу и убиваю её!");

    }

    protected void eat(){
        System.out.println("Я ем пойманное насекомое");
    }
    protected void sleep(){
        System.out.println("Я залезаю в норку и сплю");
    }
    protected void go(){
        System.out.println("Я ползаю или прыгаю");
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

    public void getMassageAmphibian(){
        System.out.println("Я " + animalName + ", мне " + numberOfYears + " лет, моя среда обитания это " + habitat);
    }
    Amphibian(String animalName, int numberOfYears, String habitat){
        this.animalName = animalName;
        this.numberOfYears = numberOfYears;
        if (!habitat.isEmpty() || !habitat.isBlank()) {
            this.habitat = habitat;
        } else {
            this.habitat = "Суша";
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Amphibian amphibian = (Amphibian) o;
        return Objects.equals(habitat, amphibian.habitat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), habitat);
    }

    @Override
    public String toString() {
        return "Amphibian{" +
                "habitat='" + habitat + '\'' +
                '}';
    }
}
