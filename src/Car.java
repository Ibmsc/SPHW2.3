public class Car extends Transport {
@Override
    public void updateTyre() {
        System.out.println("Меняем покрышку у машины");
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
}