
public class Task1<T> {
    private T obj;

    public Task1(T оbj) {
        this.obj = оbj;
    }

    public void changeValues(){
        Object[] arr = (Object[]) obj;
        Object temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;

        System.out.println("\n" + "Array after change:");
        for (Object x: arr) System.out.println(x.getClass());
    }

    public void showType() {
        System.out.println("Тип T: " + obj.getClass().getName());
    }
}