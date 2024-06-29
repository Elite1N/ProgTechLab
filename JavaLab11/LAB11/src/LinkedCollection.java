public class LinkedCollection implements SortCollection{
    private MyNode first;
    private int size;
    private int count;

    public LinkedCollection(){
        first = null;
        size = 0;

    }

    @Override
    public void add(Object data) {
        MyNode pre = null;
        MyNode temp = first;
        int count = 0;
        while (temp != null && (Integer) data > (Integer) temp.getData()) {
            pre = temp;
            temp = temp.getNext();
            count++;
        }
        if (temp != null && temp.getData().equals(data)) {
            System.out.println(data + " has already existed in List");
            return;
        }

        System.out.println("Add Value: " + data);

        if (temp == first) {
            first = new MyNode(data,first);
        } else {
            pre.setNext(new MyNode(data,temp));
            System.out.println("count: " + count);
        }
        size++;
        printList();
    }


    @Override
    public void remove(Object data) {
        System.out.println("Remove Value: " + data);
        int count = 0;
        if (isEmpty()) {
         System.out.println("Not Found");
         System.out.println("count: " + count);
            return;
      }
        MyNode pre = null;
        MyNode temp = first;
        while (temp != null && (Integer) data > (Integer) temp.getData()) {
            pre = temp;
            temp = temp.getNext();
            count++;
        }
        if (temp == null) {
            System.out.println("Not Found");
            System.out.println("count: " + count);
            return;
        }
        if (!data.equals(temp.getData())) {
            System.out.println("Not Found");
            System.out.println("count: " + count);
            return;
        } else {
            if (temp == first) {
                first = first.getNext();
            } else {
                pre.setNext(temp.getNext());
            }
            System.out.println("count: " + count);
        }
        size--;
        printList();



}

    @Override
    public void contain(Object data) {
    System.out.println("Is " + data + " in the List?");
    MyNode temp = first;
    while (temp != null && !(temp.getData().equals(data))) {
        if ((Integer) data < (Integer) temp.getData()) {
            System.out.println("false");
            return;
        }
        temp = temp.getNext();
    }
    System.out.println(temp != null);
    }

    @Override
    public boolean isEmpty() {
        return first == null;
    }

    @Override
    public int size() {
        return size;
    }

    public void printList(){ //loop every node til null
        MyNode temp = first;
        while (temp != null) {
            System.out.print(temp.getData() + "\t");
            temp = temp.getNext();
        }
        System.out.println("\n------------------------------------------------");
    }
}
