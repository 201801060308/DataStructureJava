package Tree.Test01;

public class Tree {
    private Node root;

    /**
     * 初始化根（树）；
     */
    public Tree(){
        root = null;
    }

    /**
     *左子树小于右子树
     */
    public Node find(int key){
        Node current = root;
        while(current.iData != key){
            if(key < current.iData)
                current = current.lefChild;
            else
                current = current.rightChild;
            if(current == null)
                return  null;
        }
        return current ;
    }

    /**
     * 插入数据
     */
    public void insert(int id,int dd){
        Node newNode = new Node();
        newNode.iData = id;
        newNode.fData = dd;
        if(root == null)
            root = newNode;
        else{
            Node current = new Node();
            Node parent;
            while(true){
                parent = current;
                if(id < current.iData){
                    current = current.lefChild;
                    if(current == null){
                        parent.lefChild = newNode;
                        return;
                    }
                }
                else{
                    current = current.rightChild;
                    if(current == null){
                        parent.rightChild = newNode;
                        return;
                    }
                }
            }
        }
    }

    /**
     * 中序遍历
     */
    public void inOrder(Node root){
        if(root != null){
            inOrder(root.lefChild);
            System.out.println("{"+root.iData+", "+root.fData+"}");
            inOrder(root.rightChild);
        }
    }

    /**
     * 先序遍历
     */
    public void preOrder(Node root){
        if(root != null){
            System.out.println("{"+root.iData+", "+root.fData+"}");
            inOrder(root.lefChild);
            inOrder(root.rightChild);
        }
    }

    /**
     * 后序遍历
     */
    public void afterOrder(Node root){
        if(root != null){
            inOrder(root.lefChild);
            inOrder(root.rightChild);
            System.out.println("{"+root.iData+", "+root.fData+"}");
        }
    }

    /**
     * 查找最小值
     */
    public Node minimum(){
        Node current, last;
        current = root;
        while(current != null){
            last = current;
            current = current.lefChild;
        }
        return current;
    }

    /**
     * 删除节点
     * 1.没有子节点（叶子结点）
     * 2.有一个子节点
     * 3.有两个子节点
     */
     public boolean delete (int key){
         Node current = root;
         Node parent = root;
         boolean isleftChiled = true;
         while(current.iData != key){
             parent = current;
             if(current.iData < key){
                 isleftChiled =true;
                 current = current.lefChild;
             }else{
                 isleftChiled = false;
                 current = current.rightChild;
             }
         }
         if(current == null)
             return false;

         //没有子节点（叶子结点）
         if(current.lefChild == null && current.rightChild == null){
             if(current == root)
                 root = null;
             else if(isleftChiled)
                 parent.lefChild = null;
             else
                 parent.rightChild = null;
         }

         //没有右节点
         else if(current.rightChild == null){
             if(current == root){
                 root = null;
             }
             else if(isleftChiled){
                 parent.lefChild = current.lefChild;
             }
             else{
                 parent.rightChild = current.lefChild;
             }
         }

         //没有左节点
         else if(current.lefChild == null){
             if(current == root)
                 root = null;
             else if(isleftChiled)
                 parent.lefChild = current.rightChild;
             else
                 parent.rightChild = current.rightChild;
         }

         //有两个节点
         else{

         }

         
     }

}
