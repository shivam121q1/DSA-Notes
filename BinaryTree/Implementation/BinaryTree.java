package BinaryTree.Implementation;

import java.util.Scanner;

public class BinaryTree {



    private static class Node {
        int value;
        Node left;
        Node right;

        public Node(int value){
            this.value = value;
        }
    
        
    }

    private Node root;

    //inset elements

    public  void populate(Scanner  scanner){
        System.out.println("Enter the root Node value:");
        int value = scanner.nextInt();
        root = new Node(value);
        populate(scanner,root);
    }
    private void populate(Scanner  scanner,Node node){
       System.out.println("Do you want to enter the left of" + node.value);
       boolean left = scanner.nextBoolean();
       if(left){
        System.out.println("Enter the value of the left of "+ node.value);
        int value= scanner.nextInt();
        node.left =  new Node(value);
        populate(scanner,node.left);
       }
       System.out.println("Do you want to enter the right of" + node.value);
       boolean right = scanner.nextBoolean();
       if(right){
        System.out.println("Enter the value of the right of "+ node.value);
        int value= scanner.nextInt();
        node.right =  new Node(value);
        populate(scanner,node.right);
       }

    }
    public void prettyDisplay(){
        prettyDisplay(root,0);
    }
    public void prettyDisplay(Node node , int level){
        if(node==null){
            return;
        }

        prettyDisplay(node.right, level+1);
        if(level!=0){

            for (int i = 0; i < level-1; i++) {
                System.out.println("|\t\t");

                
            }
            System.out.println("|------>" +node.value);

        }else{
            System.out.println(node.value);

        }

    }
    
}