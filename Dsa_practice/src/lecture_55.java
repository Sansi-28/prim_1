public class lecture_55 {
    public static class Node{
        int data;
        Node next;
        Node(int data){
             this.data = data;

        }

    }
public static class linledlist{
        Node head = null;
        Node tail = null;
        void insertAtEnd(int data){
            Node temp = new Node(data);
            if (head==null) {
                head = temp;
                tail = temp;
            }
            else{
                tail.next = temp;
            }
            tail = temp;
        }
        void display(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
        }
        int size(){
            int count=0;
            Node temp = head;
            while(temp!=null){
                count++;
            }
            return count;
        }
         void insertionAtBeginning(int val){
            Node temp = new Node(val);
            if(head==null){
                head=tail=temp;
            }
            else{
                temp.next=head;
                head=temp;
            }
        }
        void insert(int val, int indx){
            Node t = new Node(val);
            Node temp = head;
            if(indx==size()){
                insertAtEnd(val);
                return;
            }
            if(indx==0){
                insertionAtBeginning(val);
                return;
            }
            for(int i =1;i<indx;i++){
                temp=temp.next;

            }
            t.next = temp.next;
            temp.next = t;
        }
        int getAt(int indx){
            Node temp = head;
            for (int i=0; i<indx;i++){
                temp=temp.next;
            }
            return temp.data;
        }
}

    public static void main(String[] args) {
//        Node a = new Node(5);
//        Node b = new Node(6);
//        Node c = new Node(7);
//        Node d = new Node(8);
//        Node e = new Node(9);
//        Node i = new Node(10);
//        Node h = new Node(11);
//        Node g = new Node(12);
//        Node f = new Node(13);
//        Node j = new Node(14);
//        a.next = b;
//        b.next = c;
//        c.next = d;
//        d.next = e;
//        e.next = i;
//        i.next = h;
//        h.next = g;
//        f.next = j;
//        j.next = null;
//        d.next = g;
//        g.next = e;
//        System.out.println(d.next.data);
        linledlist ll =  new linledlist();
        ll.insertAtEnd(2);
        ll.insertAtEnd(3);
        ll.insertAtEnd(4);
        ll.insertAtEnd(5);

//        ll.display();

        ll.insertionAtBeginning(1);
        ll.insert(100,2);

        ll.display();
    }
}
