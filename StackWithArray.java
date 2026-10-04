// import java.io.*;
import java.util.*;


class Stack{
    Scanner sc=new Scanner(System.in);
    int s[]=new int[5];
    int top;
    Stack(){
        top=-1;
    }
    public void push(){
        if(top==s.length-1){
            System.out.println("Stack is full");
            return;
        }else{
            try{
                System.out.print("Enter an integer to push...");
                int val=sc.nextInt();
                top++;
                s[top]=val;
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }
    public void pop(){
        int delval;
        if(top==-1){
            System.out.println("Stack is empty");
            return;
        }else{
            delval=s[top];
            top--;
            System.out.println(delval+" has been deleted");
        }
    }
    public void display(){
        if(top==-1){
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Stack follows LIFO");
        for(int i=top;i>=0;i--){
            System.out.println("|   "+s[i]+"    |");
        }
        System.out.println("___________");
    }
    
}
public class StackWithArray{
    public static void main(String[] args) {
        Stack stc1=new Stack();
        stc1.display();
        stc1.push();
        stc1.push();
        stc1.pop();
        stc1.push();
        stc1.pop();
        stc1.push();
        stc1.push();
        stc1.display();

    }
}