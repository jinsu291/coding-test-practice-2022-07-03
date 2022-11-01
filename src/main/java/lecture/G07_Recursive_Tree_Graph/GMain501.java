package lecture.G07_Recursive_Tree_Graph;

class GMain501 {
    private static class Node {
        private int data;
        private Node lt, rt;
        private Node(int val) {
            data=val;
            lt=rt=null;
        }
    }

    private Node root;

    private void DFS(Node root) {
        if (root == null) {
            return;
        } else {
            System.out.print(root.data+" ");  // 전위순회
            DFS(root.lt);
            //  System.out.print(root.data+" ");  // 중위순회
            DFS(root.rt);
            //  System.out.print(root.data+" ");  // 후위순회
        }
    }

    public static void main(String[] args) {
        GMain501 tree = new GMain501();
        tree.root=new Node(1);
        tree.root.lt=new Node(2);
        tree.root.rt=new Node(3);
        tree.root.lt.lt=new Node(4);
        tree.root.lt.rt=new Node(5);
        tree.root.rt.lt=new Node(6);
        tree.root.rt.rt=new Node(7);
        tree.DFS(tree.root);
    }
}