public class PraktikumASD {
  static class Node {
        String key;
        Node left, right;

        public Node(String key) {
            this.key = key;
        }
    }

    static class BinaryTree {
        Node root;

        // 1. Menambahkan node secara level-order sederhana
        public void add(String key) {
            root = addRecursive(root, key);
        }

        private Node addRecursive(Node current, String key) {
            if (current == null) return new Node(key);
            if (current.left == null) current.left = new Node(key);
            else if (current.right == null) current.right = new Node(key);
            else addRecursive(current.left, key);
            return current;
        }

        // 2. Mencetak Traversal [cite: 11, 12, 13]
        public void preorder(Node node) {
            if (node == null) return;
            System.out.print(node.key + " ");
            preorder(node.left);
            preorder(node.right);
        }

        public void inorder(Node node) {
            if (node == null) return;
            inorder(node.left);
            System.out.print(node.key + " ");
            inorder(node.right);
        }

        public void postorder(Node node) {
            if (node == null) return;
            postorder(node.left);
            postorder(node.right);
            System.out.print(node.key + " ");
        }

        // 3. Mencetak child atau parent dari sebuah node
        public void printNodeInfo(Node node, String target, Node parent) {
            if (node == null) return;
            if (node.key.equals(target)) {
                System.out.println("\n--- Informasi Node: " + target + " ---");
                System.out.println("Parent: " + (parent != null ? parent.key : "Tidak ada (Root)"));
                System.out.println("Child Kiri: " + (node.left != null ? node.left.key : "None"));
                System.out.println("Child Kanan: " + (node.right != null ? node.right.key : "None"));
                return;
            }
            printNodeInfo(node.left, target, node);
            printNodeInfo(node.right, target, node);
        }

        // 4. Mengurangi/Menghapus node (menghapus sub-tree)
        public void delete(String key) {
            root = deleteRecursive(root, key);
        }

        private Node deleteRecursive(Node current, String key) {
            if (current == null) return null;
            if (current.key.equals(key)) return null;
            current.left = deleteRecursive(current.left, key);
            current.right = deleteRecursive(current.right, key);
            return current;
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        // Simulasi input data struktur organisasi
        tree.add("Direktur");
        tree.add("ManagerA");
        tree.add("ManagerB");
        tree.add("Staff1");

        System.out.print("Preorder: "); tree.preorder(tree.root);
        tree.printNodeInfo(tree.root, "ManagerA", null);
        
        tree.delete("ManagerA");
        System.out.println("\nSetelah menghapus ManagerA, Preorder baru:");
        tree.preorder(tree.root);
    }
}