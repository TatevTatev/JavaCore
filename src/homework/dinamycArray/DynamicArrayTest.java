package homework.dinamycArray;

public class DynamicArrayTest {
    public static void main(String[] args) {
        DynamicArray dynamicArray=new DynamicArray();
        dynamicArray.add(5);
        dynamicArray.add(6);
        dynamicArray.add(7);

       int value=dynamicArray.getByIndex(1);
        System.out.println(value);

    }
}
