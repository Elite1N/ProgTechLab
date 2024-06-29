public class Main {
    public static void main(String[] args) {
        LinkedCollection list = new LinkedCollection();
        list.add(20);
        list.add(30);
        list.add(15);
        list.add(25);
        list.add(30);
        list.add(40);
        list.contain(30);
        list.contain(28);
        list.remove(15);
        list.remove(25);
        list.remove(40);
        list.remove(35);
    }
}