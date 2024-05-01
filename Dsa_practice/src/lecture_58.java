import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class lecture_58 {
    public static class stacks{
        int indx;
        int [] arr = new int [6];
        void push(int x){
            arr[indx] = x;
            indx++;
        }
        int peek(){
            if(indx == 0){
                System.out.println("stack is empty");
                return -1;
            }
            return arr[indx -1];
        }
        int pop(){
            if(indx == 0) {
                System.out.println("Stack is Empty");
                return -1;
            }
            int top = arr[indx-1];
            arr[indx -1] = 0;
            indx--;
            return top;
        }
        void display(){
            for(int i = 0; i<indx; i++){
                System.out.println(arr[i]);
            }
        }
    }
    Stack<Integer> reverseCopyOfStacks(Stack<Integer> st){
        Stack<Integer> rt = new Stack<>();
        while(st.isEmpty()){
            rt.push(st.pop());
        }
        return  rt;
    }
    static void display(Stack<Integer> st){
        if(st.size()==0)return;
        System.out.print(st.pop()+" ");
        display(st);
    }
    public static class Node{
        int data;
        Node next;
//        Node(int data){
//            this.data = data;
//        }
    }
    public static class Stacks{
        Node head = null;
        Node tail = null;
        int size = 0;
        void push(int x){
            Node temp = new Node();
            temp.data = x;
            temp.next = head;
            size++;
//            head.data = x;
//            tail = tail.next;
        }
        int pop(){
            if(head==null){
                System.out.println("Stack is Empty!");
                return -1;
            }
            int x =  head.data;
            head = head.next;
            return x;
        }
        int  peek() {
            if (head == null) {
                System.out.println("Stack is Empty!");
                return -1;
            }
            return head.data;
        }
        int size(){
            return size;
        }

        boolean isEmpty(){
            if(size==0)return true;
            return false;
        }
        void display(){
            Node temp = head;
            while(temp!=null){
                System.out.println(temp.data);
                temp = temp.next;
            }
        }

    }
    static void revereDisplay(Stack<Integer> st){
        if(st.size()==0)return;
            revereDisplay(st);
            System.out.println(st.pop());
    }
    public static void main(String[] args) {

//        ArrayList<Integer> arr = new ArrayList<>();
        Stacks st = new Stacks();
        st.push(1);

        st.push(23);
        st.push(90);
        st.push(5);


st.display();

//        display(st);
//        revereDisplay(st);
//        peek
//        System.out.println(st.peek());
//        System.out.println(st);
//        st.pop();
//        System.out.println("Size of stack: "+st.size());
//        while(st.size()>1){
//            st.pop();
//        }
//        System.out.println(st);


//Copy of Stack
//Stack<Integer> temp = new Stack<>();
//while(st.size()!=0){
//    temp.push(st.pop());
//}
//        System.out.println(temp);
//Stack<Integer> ans = new Stack<>();
//while(temp.size()!=0){
//    ans.push(temp.pop());
//}
//        System.out.println(ans);



//Insert at bottom/any index
//        int indx = 2,num = 7;
//Stack<Integer> temp = new Stack<>();
//while(st.size()!=indx){
//    temp.push(st.pop());
//}
//st.push(num);
//while(temp.size()!=0){
//    st.push(temp.pop());
//}
//        System.out.println(st);




//delete at any index
//        int indx = 2;
//        Stack<Integer> temp = new Stack<>();
//        while(st.size()!=indx){
//            temp.push(st.pop());
//        }
//        st.pop();
//        while(temp.size()!=0){
//            st.push(temp.pop());
//        }
//        System.out.println(st);



//display stack
//        while(st.size()!=0){
//            System.out.print(st.pop() + " ");
//        }





//display stack using recursion



//push at bottom using recursion






//reverse stack using recursion





//        merits of stacks - unlimited size
//        demerit "   "    - space and time complexity both are O(n)




    }
}
