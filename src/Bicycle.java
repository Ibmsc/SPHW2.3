public class Bicycle implements Transport {

    private String modelName;
    private int wheelsCount;
    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку у велосипеда");
        System.out.println("Меняем покрышку у велосипеда");
    }

    @Override
    public void checkTransport() {
        System.out.println("С велосипедом все в порядке");

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