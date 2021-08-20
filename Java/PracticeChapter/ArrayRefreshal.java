public class ArrayRefreshal {
    public static <T> void print(T[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    public static void main(String[] args) {
        double[] myList = new double[5];
        myList[0] = 1.2;
        myList[1] = 1.3;
        myList[2] = 1.4;
        myList[3] = 1.5;
        myList[4] = 1.6;
//        System.out.println(myList.getClass().getSimpleName());
//        System.out.println(myList[0]);
//        for (int i = 0; i < myList.length; i++) {
//            System.out.println(myList[i]);
//        }
        String [] names = {"Femi", "laitan", "John"};
        Integer [] ages = {2, 5, 7, 9, 10};
        print(names);
        print(ages);




    }
}