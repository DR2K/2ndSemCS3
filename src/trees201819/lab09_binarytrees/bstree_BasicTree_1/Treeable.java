package trees201819.lab09_binarytrees.bstree_BasicTree_1;

public interface Treeable {
    public Object getValue();

    public Treeable getLeft();

    public Treeable getRight();

    public void setValue(Comparable value);

    public void setLeft(Treeable left);

    public void setRight(Treeable right);
}