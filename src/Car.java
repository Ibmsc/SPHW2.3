public class Car implements Transport {
  private String modelName;
  private int wheelsCount;
    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку у машины");
        System.out.println("Меняем покрышку у машины");
        System.out.println("Меняем покрышку у машины");
        System.out.println("Меняем покрышку у машины");
    }
    @Override
    public void checkTransport() {
    checkEngine();
        System.out.println("С автомобилем все в порядке");
    }
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
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