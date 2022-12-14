import java.util.Objects;

public class Herbivores extends Mammal {
    protected String typeOfFood;

    public void graze(){
        System.out.println("Я пасусь");
    }
    protected void eat(){
        System.out.println("Я хожу и жую " + typeOfFood);
    }
    protected void sleep(){
        System.out.println("Я ищу безопасное место и сплю");
    }
    protected void go(){
        System.out.println("Я бегаю и хожу");
    }

    Herbivores(String animalName, int numberOfYears, String habitat,int movementSpeed,String typeOfFood){
        this.animalName = animalName;
        this.numberOfYears = numberOfYears;
        this.habitat = habitat;
        this.movementSpeed = movementSpeed;
        if (!typeOfFood.isBlank() || !typeOfFood.isEmpty()){
            this.typeOfFood = typeOfFood;
        }else {
            this.typeOfFood = "Трава";
        }
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

    public void setTypeOfFood(String typeOfFood) {
        if (!typeOfFood.isBlank() || !typeOfFood.isEmpty()){
            this.typeOfFood = typeOfFood;
        }else {
            this.typeOfFood = "Трава";
        }
    }

    public void getMassageHarbivores(){
        System.out.println("Я " + animalName + ", мне " + numberOfYears + " лет, моя среда обитания это " + habitat +
                ", я могу бежать со скорстью " + movementSpeed + " км/ч, моя обычная еда это " + typeOfFood);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Herbivores that = (Herbivores) o;
        return Objects.equals(typeOfFood, that.typeOfFood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfFood);
    }

    @Override
    public String toString() {
        return "Herbivores{" +
                "typeOfFood='" + typeOfFood + '\'' +
                '}';
    }
}
