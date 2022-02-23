import java.util.*;
public class construct_generic_tree{
    public static class Node{
        int data;
        ArrayList<Node> children = new ArrayList<>();
        Node(){

        }
        Node(int data){
            this.data = data;
        }
    }
    public static Node construct(int arr[]){
        Stack<Node> st = new Stack<>();
        Node root = null;
        for(int ele : arr){
            if(ele == -1){
                st.pop();
            }else{
                Node nn = new Node(ele);
                if(st.size() == 0){
                    root = nn;
                }else{
                    Node top = st.peek();
                    top.children.add(nn);
                }
                st.push(nn);
            }
        }
        return root;
    }
    public static void display(Node root){
        // self work
        Node curr = root;
        System.out.print(curr.data + " -> ");
        for(Node child : curr.children){
            System.out.print(child.data + ", ");
        }
        System.out.println(".");
        for(Node child : curr.children){
            display(child);
        }
    }
    public static void main(String[] args){
        int arr[] = {10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1, -1};
        Node root = construct(arr);
        display(root);
    }
}