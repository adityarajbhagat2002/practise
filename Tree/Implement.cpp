#include <bits/stdc++.h>
struct Node {
    int data;
    struct Node *left;
    struct Node *right;

    Node(int value){
        data =value;
        left =right =NULL;
    }



};
void main (){
    struct Node *root=new Node(1);
    root->left=new Node(5);
    root->right= new Node(10);
    root->left->right= new Node(45);
}

void preorder(Node){
    if(Node == NULL)
    return ;

    cout<< Node->root);
    preorder(Node->left);
    preorder(Node->right);
    }

void inorder(Node){
    if(Node== NULL)
    return;

    inorder(Node->left);
    cout<<Node-> left;
    inorder(Node->right);
    
}