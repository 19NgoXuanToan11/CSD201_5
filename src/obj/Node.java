package obj;

public class Node {
    public Product infor;
    public Node next;

    public Node(Product product) {
        this.infor = product;
        this.next = null;
    }
}
