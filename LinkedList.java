public class LinkedList {
    Node head; 
    LinkedList(){
        head = null; 
    }

    public void InsertNode(int data){
        if (head==null){
            head = new Node(data);    
            System.out.println("Inserted Successfully!");
        }
        else{
            Node itr = head; 
            while (itr.next!=null){
                itr = itr.next; 
            }
            itr.next =new Node(data); 
            System.out.println("Inserted Successfully!");

        }

    }

    public void show(){
        Node itr = head; 
        while (itr.next != null){
            System.out.print(itr.data + "->");
            itr = itr.next; 
        }
        System.out.print(itr.data + "->");
        System.out.print("None");
    }
}
