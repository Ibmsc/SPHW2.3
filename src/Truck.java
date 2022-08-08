public class Truck implements Transport{

   private String modelName;
   private int wheelsCount;
    @Override

    public void updateTyre() {
        System.out.println("Меняем покрышку у грузовика");
        System.out.println("Меняем покрышку у грузовика");
        System.out.println("Меняем покрышку у грузовика");
        System.out.println("Меняем покрышку у грузовика");
        System.out.println("Меняем покрышку у грузовика");
        System.out.println("Меняем покрышку у грузовика");
    }

    @Override
    public void checkTransport() {
        checkEngine();
        checkTrailer();
        System.out.println("С грузовиком все в порядке");

    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }
}