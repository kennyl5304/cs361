public class Problem1 {
    public static void main(String[] args){
        //With this code create a linked list that contains 5, 7 and 3 in that order.
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(5);
        list.add(7);
        list.add(3);
        System.out.println(list);
        //Write a recursive function lengthRec that counts the number of elements in a linked list.
        System.out.println("Elements in list: " + list.lengthRec(list.getHead()));
        //Write an iterative function lengthIt that counts the number of elements in a linked list.
        System.out.println("Elements in list: " + list.lengthIt());
        //Test your function on an empty list, a list with one element, and a list with 3 elements. 
        LinkedList<String> listOne = new LinkedList<String>();
        listOne.add("11");
        System.out.println("Elements in listOne: " + listOne.lengthRec(listOne.getHead()));
        System.out.println("Elements in listOne: " + listOne.lengthIt());
    }
}
