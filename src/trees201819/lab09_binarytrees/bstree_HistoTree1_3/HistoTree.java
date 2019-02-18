package trees201819.lab09_binarytrees.bstree_HistoTree1_3;

public class HistoTree {
    private HistoNode root;

    public HistoTree() {
        root = null;
    }

    public void addData(Comparable data) {
        add(data, root);
    }

    private HistoNode add(Comparable data, HistoNode tree) {
        return null;
    }

    public HistoNode search(Comparable data) {
        return search(data, root);
    }

    private HistoNode search(Comparable data, HistoNode tree) {
        return null;
    }

    public String toString() {
        return toString(root);
    }

    private String toString(HistoNode tree) {
        return "";
    }
}