package lab9;

class Nodee {
    public int value;
    public Nodee next;
    Nodee(int value, Nodee next) {
        this.value = value;
        this.next = next;
    }
}

public class Node {
    public static void main(String[] args) {
        Nodee node0 = new Nodee(0, null);
        Nodee node1 = new Nodee(1, null);
        Nodee node2 = new Nodee(2, null);
        Nodee node3 = new Nodee(0, null);

        node0.next = node1;
        node1.next = node2;
        node2.next = node3;

        Nodee ref = node0;
        while (ref != null) {
            System.out.println(" " + ref.value);
            ref = ref.next;
        }
    }
}
