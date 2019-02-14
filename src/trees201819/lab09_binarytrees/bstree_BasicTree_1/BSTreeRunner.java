package trees201819.lab09_binarytrees.bstree_BasicTree_1;//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

public class BSTreeRunner
{
   public static void main( String args[] )
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
      bstree.postOrder();
      bstree.preOrder();
      bstree.revOrder();
   }
}