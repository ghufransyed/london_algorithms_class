/**
 * Created by ghufran on 5/26/16.
 */
public class TreeNode {
    private TreeNode parent = null;
    private TreeNode leftChild = null;
    private TreeNode rightChild = null ;
    private Object data = null;
    
    public TreeNode(){
    }
    
    public TreeNode(Object data){
        this.data = data;
    }
    
    public TreeNode(TreeNode parent,
                    TreeNode leftChild,
                    TreeNode rightChild,
                    Object data){
        
        this.parent = parent;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
        this.data = data;
    }
    
   
    public void setParentTreeNode(TreeNode parentTreeNode){
       parent = parentTreeNode;
    }
    
    public TreeNode getParentTreeNode(){
        return parent;
    }

    public void setleftChildTreeNode(TreeNode leftChildTreeNode){
        leftChild = leftChildTreeNode;
    }

    public TreeNode getleftChildTreeNode(){
        return leftChild;
    }

    public void setrightChildTreeNode(TreeNode rightChildTreeNode){
        rightChild = rightChildTreeNode;
    }

    public TreeNode getrightChildTreeNode(){
        return rightChild;
    }




}
