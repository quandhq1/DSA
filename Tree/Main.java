// you can also use imports, for example:
import java.util.*;



import node.Node;


// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

/*
 *                  1
 *              2       3 
 *            4   5    6  7     
 */



public class Main
{
    public static void main(String[] args)
    {
        Node root = new Node(1, 
                            new Node(2, new Node(10), new Node(5)), new Node(3, new Node(6), new Node(7))
                        );
        List<Integer> search = List.of(2,10,5, 3, 6, 7, 89, 99, 100);
        System.out.println("Size of tree: " + Node.sizeOfBinaryTreeUsingRecursion(root));
        System.out.println("Size of tree: " + Node.sizeOfBinaryTreeWithourRecursionUsingLevelTraversal(root));


        System.out.println("This is all nodes: ");
        Node.levelTraversal(root);
        System.out.println("Search in tree:");
        for(Integer i : search)
        {
            System.out.print(Node.findInBinaryTreeWithoutRecursion(root, i.intValue()));
        }
        System.out.println();
        Node.insertInBinaryTree(root, 89);
        Node.insertInBinaryTree(root, 99);

        System.out.println("Search in tree:");
        for(Integer i : search)
        {
            System.out.print(Node.findInBinaryTreeWithoutRecursion(root, i.intValue()));
        }
        System.out.println();
    } 
}

