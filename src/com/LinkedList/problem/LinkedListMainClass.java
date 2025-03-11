package com.LinkedList.problem;

public class LinkedListMainClass {
    public static void main(String[] args) {
        int arr[] = {12,2,3,4,5,6,7};
        int key = 4;
       Node node = arrayToLinkedList(arr);
     /*   System.out.println(node.data);
        printLinkedlist(node);
        System.out.println(findElementinLinkedList(node,key));
        revrseaLinkedList(node);
        //delete first element
        Node nodewithnewhead = deletefirstelement(node);
       printLinkedlist(nodewithnewhead); */
       //remove k th element
        int k=3;
        Node kthelementDeletion = deleteKthElement(node,k);
        printLinkedlist(kthelementDeletion);
        //delete last element
     /*   Node nodeWithLastElement = deleteLastElement(node);
       printLinkedlist(nodeWithLastElement); */
    }

    private static Node deleteKthElement(Node node,int k) {
        Node temp = node;
        Node pre = null;
        int cnt=0;
        while (temp !=null){
            cnt++;
            if (cnt == k){
               pre.next = temp.next.next;
               break;
            }
             pre = temp;
            temp = temp.next;

        }
       return  temp;
    }

    private static Node deleteLastElement(Node node) {
        Node temp = node;
        while (temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
        return  node;
    }

    private static Node deletefirstelement(Node node) {
        if (node == null) System.out.println("node is empty");
        Node newheadc = node.next;
        Node node1 = newheadc;
        return  node1;

    }

    private static void revrseaLinkedList(Node node) {

        Node temp = node;
        Node pre = null;
        while (temp != null){
            Node front = temp.next;
            temp.next = pre;
            pre = temp;
            temp = front;
        }
        System.out.println("reverse" + pre.data);

    }

    private static boolean findElementinLinkedList(Node node,int key) {
        boolean isPresent = false;
        if (node == null){
            return  isPresent;
        }

        Node current = node;
        while (current != null){
            if (key == current.data){
                isPresent = true;
                return isPresent;
            }
            current = current.next;
        }
        return  isPresent;
    }

    private static void printLinkedlist(Node node) {
        Node current = node;
        while (current != null){
            System.out.print(" "+current.data);
            current = current.next;
        }
    }

    private static Node arrayToLinkedList(int[] arr) {
        if (arr == null || arr.length == 0) {
            return null; // Return null if array is empty
        }
        Node head = new Node(arr[0]);
        Node current = head;

        for (int i=1;i<arr.length;i++){
              Node temp = new Node(arr[i]);
              current.next = temp;
              current = temp;
        }
       return head;
    }
}
