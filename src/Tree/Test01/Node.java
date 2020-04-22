package Tree.Test01;

/**
 * class node;
 */
class Node {
    public int iData;
    public double fData;
    public Node lefChild;
    public Node rightChild;
    public void displayNode(){
        System.out.println("{"+iData+", "+fData+"}");
    }
}
