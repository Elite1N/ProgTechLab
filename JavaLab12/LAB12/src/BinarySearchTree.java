public class BinarySearchTree {
    BTNode root;

    public BinarySearchTree(){
        root = null;
    }

    public void add(int value){
        BTNode current = root;
        if (root == null){    //ไม่มี root
            root = new BTNode(value, null, null);
        } else {
            while (current.getRight() != null && current.getLeft() != null){ //move to node
                if (current.getData() > value){
                    current = current.getLeft();
                } else if (current.getData() < value) {
                    current = current.getRight();

                }else {
                    System.out.println("Already add " + value + ".");
                    return;
                }
                //add node depending on value

            }
            if (current.getData() > value){
                current.setLeft(new BTNode(value, null, null));
            }else {
                current.setRight(new BTNode(value, null, null));
            }
        }
    }

    public boolean contain(int value){
        BTNode current = root;
        System.out.println("Is "+value+" in the tree?");
        while (current!=null){
            if (current.getData() > value){
                current = current.getLeft();
            } else if (current.getData() < value) {
                current = current.getRight();

            }else return true;
        }
        return false;
    }

    public int getMax(){
        BTNode current = root;
        while (current.getRight()!=null){
            current = current.getRight();

        }
        return current.getData();
    }

    public int size(BTNode root){
        if (root==null){
            return 0;
        }
        else {
            return 1 + size(root.getLeft())  + size(root.getRight());
        }
    }

    public int nnodes(){
        return size(root);
    }

    public void remove(int d) {
        BTNode current = root;
        BTNode pre = current;
        while (current != null && current.getData() != d) {
            pre = current;
            if (d > current.getData()) {
                current = current.getRight();
            }
            else {
                current = current.getLeft();
            }
        }
        if(current == null) return;

        if(current.getLeft() == null && current.getRight() == null) {
            if (current == root) {
                root = null;
            }
            else if (pre.getRight() == current) {
                pre.setRight(null);
            }
            else {
                pre.setLeft(null);
            }
        }
        else if (current.getLeft() != null && current.getRight() != null) {
            BTNode c = current.getLeft();
            BTNode pre_c = c;
            while(c.getRight() != null) {
                pre_c = c;
                c = c.getRight();
            }
            current.setData(c.getData());
            if (current.getLeft() != c) {
                pre_c.setRight(c.getLeft());
            } else {
                current.setLeft(c.getLeft());
            }
        }
        else {
            if (current == root) {
                if (current.getRight() == null) {
                    root = current.getLeft();
                } else {
                    root = current.getRight();
                }
            } else {
                if (pre.getLeft() == current) {
                    if (current.getRight() == null) {
                        pre.setLeft(current.getLeft());
                    } else {
                        pre.setLeft(current.getRight());
                    }
                } else {
                    if (current.getRight() == null) {
                        pre.setRight(current.getLeft());
                    } else {
                        pre.setRight(current.getRight());
                    }
                }
            }
        }

    }

    public void inOrder(BTNode r){ //helper
        if (r!=null){
            inOrder(r.getLeft());
            System.out.print(r.getData() + "\t");
            inOrder(r.getRight());
        }
    }

    public void printTree(){
        BTNode r = root;
        if (r==null){
            System.out.println("Tree is empty");
            return;
        }
        System.out.println("In Order");
        inOrder(r);
        System.out.println();
    }


}
