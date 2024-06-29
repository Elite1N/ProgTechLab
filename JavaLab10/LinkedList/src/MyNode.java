public class MyNode {
    private Object data;
    private MyNode next;

    public MyNode(Object obj){
        data = obj;
        next = null;
    }

    public void setNext(MyNode next) {
        this.next = next;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public MyNode getNext() {
        return next;
    }

    public Object getData() {
        return data;
    }
}
