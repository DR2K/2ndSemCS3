package trees201819.lab09_binarytrees.bstree_BasicTree_1;//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import static java.lang.System.*;

import java.util.LinkedList;

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

        return 0;
    }

    public int getWidth() {
        return 0;
    }

    public int getHeight() {

        return 0;
    }

    public int getNumNodes() {
        if (root!=null)
            
        return 0;
    }

    public boolean isFull() {
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
        return "";
    }

    private String toString(TreeNode tree) {
        return "";
    }
}