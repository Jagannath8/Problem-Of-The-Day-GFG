static int temp = Integer.MAX_VALUE;
static void inorder(Node root , int key){
    if(root == null)
    return;
    inorder(root.left,key);
    int n = root.data;
    if(n<key){
        pre = root;
    }
    else if(n>key && root.data<temp){
        suc = root;
        temp = root.data;
        return;
    }
    inorder(root.right,key);
}

public static void findPreSuc(Node root, int key){
    // code here.
    
    /* There are two static nodes defined above pre(representing predecessor) and suc(representing successor) as follows:
       static Node pre=null,suc=null
       You need to update these both.
       And the data inside these classes will be printed automatically by the driver code. 
    */
    temp = Integer.MAX_VALUE;
    inorder(root,key);
}
}
