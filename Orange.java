public class Orange extends Fruit{

    public float fruitWeight;

    @Override
    public float getFruitWeight() {
        return fruitWeight;
    }

    public Orange(float fruitWeight) {
        super(fruitWeight);
        this.fruitWeight = 1.5f;
    }

    @Override
    public String toString() {
        return Float.toString(fruitWeight);
    }
}
