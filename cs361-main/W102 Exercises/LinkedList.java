public class LinkedList<T> {
    private class Node<T> {
        T data;
        Node<T> next;
        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    Node<T> head;
    public LinkedList() {
        this.head = null;
    }

    public void add(T val){
        if(head == null){
            head = new Node<T>(val);
        }
        else{
            Node<T> iterator = head;
            while(iterator.next != null){
                iterator = iterator.next;
            }
            iterator.next = new Node<T>(val);
        }
    }
    
    public Node<T> getHead(){
        return head;
    }

    public int lengthRec(Node<T> list){
        if(list == null){
            return 0;
        }
        else{
            Node<T> trunc =  list.next;
            return 1 + lengthRec(trunc);
        }
    }
    
    public int lengthIt(){
        int count = 0;
        Node<T> iterator = head;
        while(iterator != null){
            count++;
            iterator = iterator.next;
        }
        return count;
    }

    public String toString(){
        String str = "List: ";
        Node<T> iterator = head;
        while(iterator != null){
            str += iterator.data + ", ";
            iterator = iterator.next;
        }
        return str;
    }
}
