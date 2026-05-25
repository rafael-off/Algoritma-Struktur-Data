package StudiKasus;

public class DLLAntrian {
    NodeAntrian head, tail;
    int counterAntrian = 1; 

    public void tambahAntrian(Pembeli p) {
        NodeAntrian newNode = new NodeAntrian(counterAntrian++, p);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        System.out.println("Antrian berhasil ditambahkan dengan nomor: " + newNode.noAntrian);
    }

    public void cetakAntrian() {
        if (head == null) {
            System.out.println("Antrian saat ini kosong.");
            return;
        }
        System.out.println("=================================================");
        System.out.println("Daftar Antrian Pembeli");
        System.out.println("=================================================");
        System.out.printf("%-15s %-15s %-15s\n", "No Antrian", "Nama", "No HP");
        
        NodeAntrian current = head;
        while (current != null) {
            System.out.printf("%-15d %-15s %-15s\n", current.noAntrian, current.pembeli.namaPembeli, current.pembeli.noHp);
            current = current.next;
        }
    }

    public NodeAntrian hapusAntrianByNomor(int nomor) {
        if (head == null) {
            return null;
        }

        NodeAntrian current = head;
        while (current != null) {
            if (current.noAntrian == nomor) { 
                if (current == head && current == tail) {
                    head = tail = null; 
                } else if (current == head) {
                    head = head.next;
                    head.prev = null; 
                } else if (current == tail) {
                    tail = tail.prev;
                    tail.next = null; 
                } else {
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                }
                return current; 
            }
            current = current.next;
        }
        return null; 
    }
}