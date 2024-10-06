public class Problem2 {
    public static void arrayMagic(int[] myArray){
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = myArray[i] + 1;
        }
    }

    public static void print(int[] myArray){
        String str = "";
        for(int i = 0; i < myArray.length; i++){
            str += myArray[i] + " ";
        }
        System.out.println(str);
    }

    public static void main(String[] args){
        int[] anArray = {1, 5, 6};
        print(anArray); //Prints 1 5 6
        arrayMagic(anArray); //Adds one to each element in the array
        print(anArray); //Prints 2 6 7
    }
}
