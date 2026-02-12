public class Traversal {
  public static void main(String[] args) {
    TreeNode root = new TreeNode(10, null, null);
    root.left = new TreeNode(9, null, null);
    root.left.left = new TreeNode(5, null, null);
    root.left.right = new TreeNode(2, null, null);

    root.right = new TreeNode(15, null, null);
    root.right.left = new TreeNode(-3, null, null);
    root.right.right = new TreeNode(5,  null, null);
    root.right.right.right = new TreeNode(22,  null, null);

    // preOrder(root); // root in the beginning
    // postOrder(root); // root in the end
    inOrder(root); // root in the middle
  } 

  // print a tree routed at the given node in pre order
    public static void preOrder(TreeNode node) {
      // if full return
      if(node == null) {
        return;
      }
      // print value
      System.out.println(node.value);
      // traverse left
      preOrder(node.left);
      // traverse right
      preOrder(node.right);

    }
    // print after recursion
        public static void postOrder(TreeNode node) {
          if (node == null) return;
          postOrder(node.left);
          postOrder(node.right);
          System.out.println(node.value);
        }

        public static void inOrder(TreeNode node) {
          if (node == null) return;
          inOrder(node.left);
          System.out.println(node.value);
          inOrder(node.right);
          
            
        }
      }


