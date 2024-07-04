public class LinkedList<T> {

    Node<T> head;

    public LinkedList(){
        this.head = null;
    }

    public void add(T data){
        Node<T> newNode = new Node<>(data);
        if(head ==  null){
            head = newNode; //Đặt head là node đầu tiên khi danh sách rỗng
        }else{
            Node<T> curent = head;
            while (curent.next != null){
                curent = curent.next;
            }
            curent.next = newNode; //Thêm node mới vào cuối danh sách
        }
    }

    public void remove(int index){
        if(head == null){
            throw new IndexOutOfBoundsException("Index " + index);
        }
        if(index == 0){
            head = head.next;
            return;
        }
        Node<T> current = head;
        for(int i = 0; i < index - 1; i++){
            if (current.next == null) {
                throw new IndexOutOfBoundsException("Index: " + index);
            }
            current = current.next;
        }
        if (current.next == null) {
            throw new IndexOutOfBoundsException("Index: " + index);
        }
        current.next = current.next.next;
    }

    public void printList(){
        Node<T> current = head;
        while (current != null){
            System.out.println(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

}
