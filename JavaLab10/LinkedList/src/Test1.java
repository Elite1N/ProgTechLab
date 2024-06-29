public class Test1 {
    public static void main(String[] args) {
        LinkedCollection linkedlist = new LinkedCollection();

        linkedlist.add(20);
        linkedlist.add(30);
        linkedlist.add(50);
        System.out.println("- Adding nodes with data 20, 30, 50 completed");
        System.out.println(linkedlist.findWhichNode(20));
        linkedlist.remove(20);
        System.out.println("- Removed the node with 20 it's data");
        System.out.println(linkedlist.findWhichNode(20));

        linkedlist.remove(50);
        System.out.println("- Removed the node with 50 as it's data");
        System.out.println();
        System.out.println( "The node in which contained 30 as their data is node " + linkedlist.findWhichNode(30));

    }
}
