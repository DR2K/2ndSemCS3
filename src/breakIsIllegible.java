import trees201819.lab09_binarytrees.bstree_BasicTree_1.BinarySearchTree;
import trees201819.lab09_binarytrees.bstree_BasicTree_1.TreeNode;

public class breakIsIllegible {
    public static void main(String[]args)
    {
        BinarySearchTree bstree = new BinarySearchTree();
        bstree.add(53);
        bstree.add(56);
        bstree.add(52);
        bstree.add(58);
        bstree.add(43);
        bstree.add(90);
        bstree.add(56);
        bstree.add(34);
        bstree.add(55);
        bstree.add(501);
        bstree.add(5);
        bstree.add(8);
        bstree.inOrder();
        deleteSmallest(bstree.getRoot());
        bstree.inOrder();

    }
    public static void deleteSmallest(TreeNode bs)
    {
        TreeNode prev = bs;
        TreeNode mark = bs;
        TreeNode smallest = bs;
        while(true)
        {
            mark = mark.getLeft();
            if (mark==null)
                break;
            prev = smallest;
            smallest = mark;
        }
        prev.setLeft(null);
    }
}
