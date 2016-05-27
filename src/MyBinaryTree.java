import apple.laf.JRSUIUtils;

/**
 * Created by ghufran on 5/26/16.
 */
public class MyBinaryTree {
    public TreeNode root;
    
    public MyBinaryTree(){
        root = new TreeNode();
    }
    
    public MyBinaryTree(TreeNode newNode){
        root = newNode;
    }
    
    public MyBinaryTree(TreeNode root,
                        MyBinaryTree leftSubTree,
                        MyBinaryTree rightSubTree){
        this.root = root;
        this.addLeftSubTree(leftSubTree);
        this.addRightSubTree(rightSubTree);
    }
    
    public void addLeftSubTree(MyBinaryTree leftSubTree){
        root.setleftChildTreeNode(leftSubTree.root);
    }
    public void addRightSubTree(MyBinaryTree rightSubTree){
        root.setrightChildTreeNode(rightSubTree.root);
    }
    
    
    
}
