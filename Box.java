import java.util.ArrayList;

public class Box<T> {
    private T obj;
    ArrayList<String> inBox = new ArrayList<>();


    public Box(T оbj) {
        this.obj = оbj;
    }

    public T getObj() {
        return obj;
    }

    public void addFruitToBox() {
        if (inBox.isEmpty()) inBox.add(0, obj.getClass().getName());
        if (inBox.get(0).equals(obj.getClass().getName())) inBox.add(obj.toString());
        System.out.println(inBox);
    }

    public float getWeight(){
        float sumWeight = 0;
        for(int i = 1; i < inBox.size(); i++)
            sumWeight += Float.parseFloat(inBox.get(i));
        System.out.println("Вес коробки c " + obj.getClass().getName() + " = " + sumWeight);
        return sumWeight;
    }

    public void compare(Box<Object> transferredBox){
        float transferredBoxWeight = transferredBox.getWeight();
        float thisBoxWeight = this.getWeight();
        if (transferredBoxWeight < thisBoxWeight) System.out.println("Переданная коробка легче");
        if (transferredBoxWeight == thisBoxWeight) System.out.println("Коробки равны по весу");
        if (transferredBoxWeight > thisBoxWeight) System.out.println("Переданная коробка тяжелее");
    }

    public void pourBox(Box<Object> boxOut, Box<Object> boxIn){
//      Пересыпание коробки я написать не успею. Нужно делать следующее д/з.
    }

}