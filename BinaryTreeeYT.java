package BinaryTree;

import java.util.LinkedList;
import java.util.PropertyResourceBundle;
import java.util.Queue;

// this class we used to crate the node of each tree 

public class BinaryTreeeYT {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // this is another class used to create the tree
    static class BinaryTree {
        static int idx = -1;

        public static Node BulidTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newnode = new Node(nodes[idx]);
            newnode.left = BulidTree(nodes);
            newnode.right = BulidTree(nodes);
            return newnode;
        }

    }

    // preorder Travesal in tree
    /*
     * first we have to start form the root then travel the left subtree of root the
     * after that right subTree
     */
    /*
     * Root
     * LeftSubtree
     * Right Subtree
     * 
     */
    public static void preorder(Node root) {
        if (root == null) {
            // System.out.print(-1+" "); // we can print the -1 as null then it give same
            // output as input is given
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);

    }

    // Inorder Traversal
    /*
     * 1-Left Subtree
     * 2-Root
     * 3- Right subtree
     * 
     */
    public static void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    // PostOrder Traversal
    /*
     * 1-left Subtree
     * 2-right subtree
     * 3- root
     */
    public static void PostOrder(Node root) {
        if (root == null) {
            return;
        }
        PostOrder(root.left);
        PostOrder(root.right);
        System.out.print(root.data + " ");
    }


    // Level Order Traversal 
    /*
     * 1
     * 2 3
     * 4 5 6
     */
    // we use queue to this type of traversal 
    // FIFO poprtie  of queue is -- 1 2 3 4 5 6 
    // we null as next line output 
    
    // BFS - Breath First Search - Level order 
    // DFS- Depath First Search -- pre, in ,post order 

    public static void levelOrder(Node root){
        if(root==null){
         return;
        }
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            Node currNode=q.remove();
            if(currNode==null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else{
                System.out.print(currNode.data+" ");
                if(currNode.left!=null){
                    q.add(currNode.left);
                }
                if(currNode.right!=null){
                    q.add(currNode.right);
                }
            }
        }


    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.BulidTree(nodes);
        
        System.out.println(root.data);
        System.out.println("Priorder travesal tree ");
        preorder(root);
        System.out.println();

        System.out.println("Inorderr Travesa ");
        inOrder(root);
        System.out.println();

        System.out.println("Post Order tree");
        PostOrder(root);
        System.out.println();

        System.out.println("Level Order Travesal ");
        levelOrder(root);
    }
}
