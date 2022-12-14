import java.util.Objects;

public class Predator extends Mammal{
    protected String typeOfFood;

    public void hunt(){
        System.out.println("Я выслеживаю добычу и убиваю её!");
    }
    protected void eat(){
        System.out.println("Я ем пойманное/-ую " + typeOfFood);
    }
    protected void sleep(){
        System.out.println("Я ищу уютное место и сплю");
    }
    protected void go(){
        System.out.println("Я бегаю и хожу");
    }

    public void getMassagePredator(){
        System.out.println("Я " + animalName + ", мне " + numberOfYears + " лет, моя среда обитания это " + habitat +
                ", я могу бежать со скорстью " + movementSpeed + " км/ч, моя обычная еда это " + typeOfFood);
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

    public void setTypeOfFood(String typeOfFood) {
        if (!typeOfFood.isBlank() || !typeOfFood.isEmpty()){
            this.typeOfFood = typeOfFood;
        }else {
            this.typeOfFood = "Мясо";
        }
    }
     Predator(String animalName, int numberOfYears, String habitat,int movementSpeed,String typeOfFood){
         this.animalName = animalName;
         this.numberOfYears = numberOfYears;
         this.habitat = habitat;
         this.movementSpeed = movementSpeed;
         if (!typeOfFood.isBlank() || !typeOfFood.isEmpty()){
             this.typeOfFood = typeOfFood;
         }else {
             this.typeOfFood = "Мясо";
         }
     }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Predator predator = (Predator) o;
        return Objects.equals(typeOfFood, predator.typeOfFood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfFood);
    }

    @Override
    public String toString() {
        return "Predator{" +
                "typeOfFood='" + typeOfFood + '\'' +
                '}';
    }
}
