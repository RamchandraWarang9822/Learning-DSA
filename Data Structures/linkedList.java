import java.util.Currency;

public class linkedList{

    private Node first;
    private Node last;

    private class Node{

        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }
    }

    //METHODS
    private boolean isEmpty(){
        return first == null;
    }

    public void addLast(int item){
        Node node = new Node(item);

        if(isEmpty()){
            first = last = node;
        }else{
            last.next = node;
            last = node;
        }
    }

    public void addFirst(int item){
        Node node = new Node(item);

        if(isEmpty()){
            first = last = node;
        } else{
            node.next = first;
            first = node;
        }
    }

    public int indexOf(int item){
        Node node = new Node(item);
        int index = 0;
        Node current = first;

        while(current != null){
            if(current.value == item){
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }

    public boolean contains(int item){
        return indexOf(item) != -1;
    }

    public void removeFirst(){
        if(first == last){
            first = last = null;
        }
        
        Node second = first.next;
        first.next = null;
        first = second;
    }

    public void removeLast(){

    }

    public void previous(int item){
        Node node = new Node(item);
        Node current = first;

        while(current != null){
            if(current.next == last){
                
            }
        }
        
    }
}