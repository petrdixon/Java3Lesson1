import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        //1. Написать метод, который меняет два элемента массива местами.(массив может быть любого ссылочного типа);
        ForChangeElem1 f1 = new ForChangeElem1();
        ForChangeElem2 f2 = new ForChangeElem2();
        Object arr1[] = new Object[4];
        for (int i=0; i<arr1.length; i=i+2) {
            arr1[i] = f1;
            arr1[i+1] = f2;
        }
        System.out.println("Array before change:");
        for (Object x: arr1) System.out.println(x.getClass());
        Task1<Object> genStr = new Task1<>(arr1);
        genStr.changeValues();

//        2. Написать метод, который преобразует массив в ArrayList;
        arrToArrayList(arr1);

//        3. Большая задача:
        Apple A = new Apple(0.0f);
        Orange O = new Orange(0.0f);
        Box<Object> genBoxApple = new Box<>(A);
        Box<Object> genBoxOrange = new Box<>(O);

        genBoxApple.addFruitToBox();
        genBoxApple.addFruitToBox();

        genBoxOrange.addFruitToBox();
        genBoxOrange.addFruitToBox();

        genBoxApple.getWeight();

        genBoxApple.compare(genBoxOrange);

//      Пересыпание коробки я написать не успею. Нужно делать следующее д/з.

    }


    public static void arrToArrayList(Object[] arr){
        ArrayList<Object> arrAsArrayList = new ArrayList<>(Arrays.asList(arr));
        System.out.println("\n" + arrAsArrayList.get(0).getClass());
    }


}
class ForChangeElem1{}
class ForChangeElem2{}




