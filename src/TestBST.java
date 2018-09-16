public class TestBST {
    public static void main(String[] args) {
        //Create a BST.
        BST<String> tree = new BST<>();
        tree.insert("Tien");
        tree.insert("TuanAnh");
        tree.insert("Long");
        tree.insert("Dat");
        tree.insert("HoangSon");
        tree.insert("Hau");
        tree.insert("Tam");
        tree.insert("Truong");
        // traverse tree
        System.out.println("Inorder (sorted): ");
        tree.inorder();
        System.out.println("The number of nodes is: " +tree.getSize());
    }
}
