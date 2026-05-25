package StudiKasus;

public class NodePesanan {
    Pesanan pesanan;
    NodePesanan prev, next;

    public NodePesanan(Pesanan pesanan) {
        this.pesanan = pesanan;
        this.prev = null;
        this.next = null;
    }
}