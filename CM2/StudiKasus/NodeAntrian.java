package StudiKasus;

public class NodeAntrian {
    int noAntrian;
    Pembeli pembeli;
    NodeAntrian prev, next;

    public NodeAntrian(int noAntrian, Pembeli pembeli) {
        this.noAntrian = noAntrian;
        this.pembeli = pembeli;
        this.prev = null;
        this.next = null;
    }
}