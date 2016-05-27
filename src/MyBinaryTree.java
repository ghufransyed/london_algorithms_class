import apple.laf.JRSUIUtils;

/**
 * Created by ghufran on 5/26/16.
 */
public class MyBinaryTree {
    private TreeNode root = null;
    
    public MyBinaryTree(){
        
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
