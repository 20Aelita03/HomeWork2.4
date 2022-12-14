public class Main {
    public static void main(String[] args) {

        System.out.println("Травоядные");
       Herbivores gazelle = new Herbivores("Газель", 2, "Саванна", 97,"трава");
       gazelle.getMassageHarbivores();
       Herbivores giraffe = new Herbivores("Жираф", 4, "Саванна", 60, "листья");
       giraffe.getMassageHarbivores();
       Herbivores horse = new Herbivores("Лошадь", 3, "конюшня", 88, "сено");
       horse.getMassageHarbivores();
        System.out.println("Хищники");
        Predator hyena = new Predator("Гиена", 1, "Саванна",64, "Газель");
        hyena.getMassagePredator();
        Predator tiger = new Predator("Тигр",5, "Лес",60,"Олень");
        tiger.getMassagePredator();
        Predator bear = new Predator("Медведь", 7,"Тайга", 56,"Рыба");
        bear.getMassagePredator();
        System.out.println("Земноводные");
        Amphibian frog = new Amphibian("Лягушка", 1,"Болото");
        frog.getMassageAmphibian();
        Amphibian homalopsisBuccata = new Amphibian("Уж пресноводный", 2,"Поле");
        homalopsisBuccata.getMassageAmphibian();
        System.out.println("Не летающие птицы");
        NonVolanti peacock = new NonVolanti("Павлин", 1, "Джунгли", "Ходьба");
        peacock.getMassageNonVolanti();
        NonVolanti penguin = new NonVolanti("Пингвин", 4, "Арктика", "Ходьба");
        penguin.getMassageNonVolanti();
        NonVolanti dodoBird = new NonVolanti("Птица Додо", 2,"Лес", "Ходьба");
        dodoBird.getMassageNonVolanti();
        System.out.println("Летающие птицы");
        FlyingBirds seagull = new FlyingBirds("Чайка", 5, "Морские скалы", "Летаю");
        seagull.getMassageFlyingBirds();
        FlyingBirds albatross = new FlyingBirds("Альбатрос", 7, "Морские скалы", "Летаю");
        albatross.getMassageFlyingBirds();
        FlyingBirds falcon = new FlyingBirds("Сокол", 2, "Тундра", "Летаю");
        falcon.getMassageFlyingBirds();

        FlyingBirds falcon2 = new FlyingBirds("Сокол", 2, "Тундра", "Летаю");

        checkIdentity(falcon, falcon2);
        checkIdentity(frog, tiger);
    }
    public static void checkIdentity(Animal an1, Animal an2){
       System.out.println(an1.equals(an2));
    }
}