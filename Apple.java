public class Apple extends Fruit{

    public float fruitWeight;

    @Override
    public float getFruitWeight() {
        return fruitWeight;
    }

    public Apple(float fruitWeight) {
        super(fruitWeight);
        this.fruitWeight = 1.0f;
    }

    @Override
    public String toString() {
        return Float.toString(fruitWeight);
    }
}
