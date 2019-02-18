package trees201819.lab09_binarytrees.bstree_BasicTree_1;

import java.util.LinkedList;
import java.util.Queue;

import static java.lang.System.*;

public class BinarySearchTree {
    private TreeNode root;

    public BinarySearchTree() {
        root = null;
    }

    public void add(Comparable val) {
        root = add(val, root);
    }

    private TreeNode add(Comparable val, TreeNode tree) {
        if (tree == null)
            tree = new TreeNode(val);

        Comparable treeValue = tree.getValue();
        int dirTest = val.compareTo(treeValue);

        if (dirTest < 0)
            tree.setLeft(add(val, tree.getLeft()));
        else if (dirTest > 0)
            tree.setRight(add(val, tree.getRight()));
        return tree;
    }

    public void inOrder() {
        inOrder(root);
        System.out.println("\n\n");
    }

    private void inOrder(TreeNode tree) {
        if (tree != null) {
            inOrder(tree.getLeft());
            System.out.print(tree.getValue() + " ");
            inOrder(tree.getRight());
        }
    }

    public void preOrder() {
        preOrder(root);
        out.println("\n\n");
    }

    public void postOrder() {
        postOrder(root);
        out.println("\n\n");
    }

    public void revOrder() {
        revOrder(root);
        out.println("\n\n");
    }

    private void preOrder(TreeNode tree) {
        if (tree != null) {
            System.out.print(tree.getValue() + " ");
            preOrder(tree.getLeft());
            preOrder(tree.getRight());
        }
    }

    private void postOrder(TreeNode tree) {
        if (tree != null) {
            postOrder(tree.getRight());
            postOrder(tree.getLeft());
            System.out.print(tree.getValue() + " ");
        }
    }

    private void revOrder(TreeNode tree) {
        if (tree != null) {
            revOrder(tree.getRight());
            System.out.print(tree.getValue() + " ");
            revOrder(tree.getLeft());
        }
    }

    public int getNumLevels() {
        return getNumLevels(root);
    }

    private int getNumLevels(TreeNode tree) {
        if (tree == null)
            return 0;
        else if (getNumLevels(tree.getLeft()) > getNumLevels(tree.getRight()))
            return 1 + getNumLevels(tree.getLeft());
        else
            return 1 + getNumLevels(tree.getRight());
    }


    //add getNumLeaves, getWidth, getHeight, getNumNodes, and isFull
    public int getNumLeaves() {
        return getNumLeaves(root);
    }

    private int getNumLeaves(TreeNode tree) {
        if (tree.getRight()==null&&tree.getLeft()==null)
            return 1;
        if (tree.getLeft()!=null&&tree.getRight()!=null)
            return getNumLeaves(tree.getRight())+getNumLeaves(tree.getLeft());
        if (tree.getLeft()!=null)
            return getNumLeaves(tree.getLeft());
        if (tree.getRight()!=null)
            return getNumLeaves(tree.getRight());
        return 0;
    }

    public int getWidth() {
        return getWidth(root);
    }

    private int getWidth(TreeNode tree) {
        Queue<TreeNode> row = new LinkedList<>();
        row.add(root);
        row.add(null); // use null as a marker for the end of a row.
        int maxwidth = 1;
        while (!row.isEmpty()) {
            TreeNode n = row.remove();
            if (n == null) {
                // next row
                int rowsize = row.size();
                if (rowsize > 0) {
                    if (rowsize > maxwidth) {
                        maxwidth = rowsize;
                    }
                    row.add(null); // add new end-of-row-marker.
                }
            } else {
                if (n.getLeft() != null) {
                    row.add(n.getLeft());
                }
                if (n.getRight() != null) {
                    row.add(n.getRight());
                }
            }
        }
        return maxwidth;
    }

    public int getHeight() {
        return getHeight(root);
    }

    private int getHeight(TreeNode tree) {
        if (tree == null) {
            return -1;
        }
        int lef = getHeight(tree.getLeft());
        int rig = getHeight(tree.getRight());
        if (lef > rig) {
            return lef + 1;
        } else {
            return rig + 1;
        }
    }

    public int getNumNodes() {
        return getNumNodes(root);
    }

    private int getNumNodes(TreeNode tree) {
        if (tree != null)
            return getNumNodes(tree.getRight()) + getNumNodes(tree.getLeft()) + 1;
        else
            return 0;
    }

    public boolean isFull() {
        return isFull(root);
    }

    private boolean isFull(TreeNode tree) {
        if (tree.getLeft() != null && tree.getRight() != null)
            return isFull(tree.getLeft()) && isFull(tree.getRight());
        if (tree.getLeft() == null && tree.getRight() == null)
            return true;
        else
            return false;
    }


    //add extra credit options here - 10 points each

    //search

    //maxNode

    //minNode

    //level order

    //display like a tree

    //remove


    public String toString() {
        return toString(root);
    }

    private String toString(TreeNode tree) {
        return "";
    }
}