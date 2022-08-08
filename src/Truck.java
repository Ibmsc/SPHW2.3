public class Truck extends Transport{

@Override

    public void updateTyre() {
        System.out.println("Меняем покрышку у грузовика");
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}