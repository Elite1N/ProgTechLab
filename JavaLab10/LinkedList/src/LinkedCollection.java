public class LinkedCollection implements Collection{
    private MyNode first;
    private int size;
    public LinkedCollection(){
        first = null;
        size = 0;

    }
    @Override
    public void add(Object value) {
        MyNode newNode = new MyNode(value);

        if (isEmpty()){
            first = newNode;
        }else {
            MyNode current = first;
            while (current.getNext() != null){
                current = current.getNext();
            }
            current.setNext(newNode);
        }
        size++;
    }

    @Override
    public void remove(Object element) {
        if (isEmpty()){return;}
        if (first.getData().equals(element)){ // for first
            first = first.getNext();
            size--;
        }

        MyNode current = first;
        while (current.getNext() != null){ // loop every node
            if (current.getNext().getData().equals(element)){
                current.setNext(current.getNext().getNext());
                size--;
                return;
            }
            current = current.getNext(); // move to next node
        }


    }

    @Override
    public boolean contain(Object element) {
        MyNode current = first; // focus point
        while (current != null){
            if (current.getData().equals(element)){
                return true;
            }
            current = current.getNext(); // mobe to next node
        }
        return false;
    }

    @Override
    public boolean isEmpty() {
        return first == null;
    }

    @Override
    public int size() {
        return size;
    }
    public void printlist(){ // print every data in linkedlist
        MyNode current = first;
        while (current != null){
            System.out.println(current.getData());
            current = current.getNext();
        }
    }

    public int findWhichNode(Object value){ //find which node contains value as data
        MyNode current = first;
        int index = 0;
        while (current != null) {
            if (current.getData().equals(value)) {
                return index;
            }
            current = current.getNext();
            index++;
        }
        return -1;

    }
}
