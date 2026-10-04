import java.util.*;
class Node{
    int data;
    Node link;

    Node(int data){
        this.data=data;
        this.link=null;
    }
}
public class SingleLinkedList {
    Scanner sc=new Scanner(System.in);
    static Node head = null;                     //head pointer as global
    static Node createNode(int dataval){
        Node n1=new Node(dataval);
        return n1;
    }
    static void build1234(){
        Node n1=new Node(1);
        Node n2=new Node(2);
        Node n3=new Node(3);
        Node n4=new Node(4);

        n1.link=n2;
        n2.link=n3;
        n3.link=n4;
        if(head==null){
            head=n1;
        }else{
            getLastNode().link=n1;
        }        
    }


    // Display the list



    static void display(){
        Node s=head;
        while(s!=null){
            System.out.print(s.data+"\t");
            s=s.link;
        }
        System.out.println();
    }


    // Count total nodes



    static int countnode(){
        Node s=head;
        int counter=0;
        while(s!=null){
            counter++;
            s=s.link;
        }
        System.out.println("Total nodes= "+counter);
        return counter;
    }


    // Insert at end



    static void insertAtEnd(int dataval){
        Node n1=new Node(dataval);
        if(head==null){
            head=n1;
        }else{
            Node s=head;
            while(s.link!=null){
                s=s.link;
            }
            s.link=n1;
        }
        
    }



    // Insert at beginning




    static void insertAtBeginning(int dataval){
        Node n1=new Node(dataval);
        n1.link=head;
        head=n1;
    }


    // Delete first node



    static void deleteFirstNode(){
        if(head==null){
            System.out.println("Null linked list can not delete first node");
            return;
        }
        System.out.println("Deleted node: " + head.data);
        head=head.link;
    }

    // Delete last node



    static void deleteLastNode(){
        if(head==null){
            System.out.println("Null linked list can not delete Last node");
            return;
        }
        else if(head.link==null){
            System.out.println("Deleted node: " + head.data);
            head=null;
        }else{
            Node s=head;
            while(s.link.link!=null){
                s=s.link;
            }
            System.out.println("Deleted node: " + s.link.data);
            s.link=null;
        }
        
    }

    // Insert at specific position



    static void InsertatSpecificLocation(int pos, int dataval){

        if(pos <= 0){
            System.out.println("Invalid position");
            return;
        }

        Node n1 = new Node(dataval);
        if(pos == 1){
            n1.link = head;
            head = n1;
            return;
        }

        Node s = head;
        int count = 1;

        while(s != null && count < pos - 1){
            s = s.link;
            count++;
        }
        if(s == null){
            System.out.println("Position exceeds list length. Insertion not possible.");
            return;
        }

        n1.link = s.link;
        s.link = n1;
    }

    static Node getLastNode(){
        Node s=head;
        if(head!=null){
            while(s.link!=null){
                s=s.link;
            }
            return s;
        }else{
            return head;
        }
        
    }


    // Search an element



    static void searchElement(int element){
        Node s=head;
        int counter=1;
        while(s!=null){
            if(s.data==element){
                System.out.println("Element Found at position = "+ counter);
                return;
            }
            s=s.link;
            counter++;
        }
        System.out.println("Element not Found");

    }




    // Delete at specific position
    static void deleteATSpecificLocation(int pos){
        if(pos <= 0){
            System.out.println("Invalid position");
            return;
        }
        if(head==null){
            System.out.println("List is empty... Can not delete any element");
            return;
        }
        if(pos == 1){
            System.out.println("Deleted node: " + head.data);
            head = head.link;
            return;
        }
        Node s=head;
        int count=1;
        while(s!=null&&count!=pos-1){
            s=s.link;
            count++;
        }
        if(s.link==null){
            System.out.println("Position not present");
            return;
        }
        s.link=s.link.link;
    }
    






    // Reverse the linked list (iterative)
    static void reverseList(){
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node prev=null;
        Node curr=head;
        Node next=null;
        while(curr!=null){
            next = curr.link;    
            curr.link = prev;     
            prev = curr;          
            curr = next;
        }
        head=prev;
    }
    
    

    // Reverse the linked list (recursive)

    // Find middle element

    // Find nth node from beginning

    // Find nth node from end

    // Delete nth node from end

    // Insert after a specific value
    
    static void insertAfterSpecificValue(int addval,int after){
        if(head==null){
            System.out.println("No element present");
            return;
        }
        Node s=head;
        Node n1=new Node(addval);
        while(s!=null&&s.data!=after){
            s=s.link;
        }
        if(s == null){
            System.out.println("Value not found, insertion failed");
                return;
        }
        n1.link=s.link;
        s.link=n1;
    }
    // Insert before a specific value

    // Remove duplicate elements (sorted list)

    // Remove duplicate elements (unsorted list)


    // Find maximum element
    static void findMax(){
        if(head==null){
            System.out.println("No element present");
            return;
        }
        Node s=head.link;
        int max=head.data;

        while(s!=null){
            max=Math.max(max, s.data);
            s=s.link;
        }
        System.out.println("Maximum is "+max);
    }
    
    


    // Find minimum element
    static void findMin(){
        if(head==null){
            System.out.println("No element present");
            return;
        }
        Node s=head.link;
        int min=head.data;

        while(s!=null){
            min=Math.min(min, s.data);
            s=s.link;
        }
        System.out.println("Minimum is "+min);
    }

    // Sum of all elements
    static void sumOfElements(){
        if(head==null){
            System.out.println("No element present");
            return;
        }
        int sum=0;
        Node s=head;
        while(s!=null){
            sum+=s.data;
            s=s.link;
        }
        System.out.println("Sum of all elements is "+sum);
    }
    // Detect loop (cycle detection)

    // Find starting point of loop

    // Remove loop

    // Check if linked list is palindrome

    // Merge two sorted linked lists

    // Merge two unsorted linked lists

    // Sort a linked list (merge sort)

    // Split linked list into two halves

    // Rotate linked list by k positions

    // Reverse in groups of k

    // Pairwise swap nodes

    // Swap two nodes without swapping data

    // Clone a linked list
    // Add two numbers represented by linked lists

    // Flatten a multilevel linked list

    // Detect intersection of two linked lists

    // Find intersection node

    // Rearrange list (even nodes after odd nodes)

    // Segregate even and odd nodes

    // Convert linked list to circular linked list

    // Convert circular linked list back to linear

    // LRU cache using linked list

    // Implement stack using linked list

    // Implement queue using linked list
    public static void main(String[] args) {
        insertAtEnd(67);
        build1234();
        display();
        countnode();
        insertAtEnd(5);
        display();
        countnode();
        insertAtBeginning(27);
        insertAtBeginning(21);
        display();
        countnode();
        deleteFirstNode();
        display();
        deleteLastNode();
        display();
        InsertatSpecificLocation(3, 99);
        display();
        searchElement(4);
        deleteATSpecificLocation(2);
        display();
        reverseList();
        display();
        findMax();
        findMin();
        sumOfElements();
        insertAfterSpecificValue(14, 99);
        display();
    }
}
