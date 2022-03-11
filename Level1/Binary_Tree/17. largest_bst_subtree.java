import java.io.*;
import java.util.*;

public class largest_bst_subtree {
  public static class Node {
    int data;
    Node left;
    Node right;

    Node(int data, Node left, Node right) {
      this.data = data;
      this.left = left;
      this.right = right;
    }
  }

  public static class Pair {
    Node node;
    int state;

    Pair(Node node, int state) {
      this.node = node;
      this.state = state;
    }
  }

  public static Node construct(Integer[] arr) {
    Node root = new Node(arr[0], null, null);
    Pair rtp = new Pair(root, 1);

    Stack<Pair> st = new Stack<>();
    st.push(rtp);

    int idx = 0;
    while (st.size() > 0) {
      Pair top = st.peek();
      if (top.state == 1) {
        idx++;
        if (arr[idx] != null) {
          top.node.left = new Node(arr[idx], null, null);
          Pair lp = new Pair(top.node.left, 1);
          st.push(lp);
        } else {
          top.node.left = null;
        }

        top.state++;
      } else if (top.state == 2) {
        idx++;
        if (arr[idx] != null) {
          top.node.right = new Node(arr[idx], null, null);
          Pair rp = new Pair(top.node.right, 1);
          st.push(rp);
        } else {
          top.node.right = null;
        }

        top.state++;
      } else {
        st.pop();
      }
    }

    return root;
  }

  public static void display(Node node) {
    if (node == null) {
      return;
    }

    String str = "";
    str += node.left == null ? "." : node.left.data + "";
    str += " <- " + node.data + " -> ";
    str += node.right == null ? "." : node.right.data + "";
    System.out.println(str);

    display(node.left);
    display(node.right);
  }
  
  public static class Bpair{
      int min;
      int max;
      boolean isBst;
      Node root;
      int size;
      Bpair(){
          
      }
      Bpair(int min, int max, boolean isBst, Node root, int size){
          this.min = min;
          this.max = max;
          this.isBst = isBst;
          this.root = root;
          this.size = size;
      }
  }
  
  public static Bpair largest(Node node){
      if(node == null){
          Bpair p = new Bpair();
          p.min = Integer.MAX_VALUE;
          p.max = Integer.MIN_VALUE;
          p.isBst = true;
          p.root = null;
          p.size = 0;
          return p;
      }
      Bpair left = largest(node.left);
      Bpair right = largest(node.right);
      boolean nodeok = false;
      if(node.data > left.max && node.data < right.min){
          nodeok = true;
      }
      boolean meBst = false;
      if(nodeok && left.isBst && right.isBst){
          meBst = true;
      }
      Bpair p = new Bpair();
      p.min = Math.min(node.data, left.min);
      p.max = Math.max(node.data, right.max);
      p.isBst = meBst;
      
      if(p.isBst == true){
          p.root = node;
          p.size = left.size + right.size + 1;
      }else if(left.size > right.size){
          p.root = left.root;
          p.size = left.size;
      }else{
          p.root = right.root;
          p.size = right.size;
      }
      return p;
  }
  
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    Integer[] arr = new Integer[n];
    String[] values = br.readLine().split(" ");
    for (int i = 0; i < n; i++) {
      if (values[i].equals("n") == false) {
        arr[i] = Integer.parseInt(values[i]);
      } else {
        arr[i] = null;
      }
    }

    Node root = construct(arr);
    
    // write your code here
    Bpair p = largest(root);
    System.out.println(p.root.data + "@" + p.size);
  }

}