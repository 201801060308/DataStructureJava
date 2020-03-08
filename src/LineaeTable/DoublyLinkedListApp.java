package LineaeTable;

/**
 * 双端链表，可实现正序输入
 */
public class DoublyLinkedListApp {
    public static void main(String []args){
        DoublyLinkList list = new DoublyLinkList();
        list.insertFirst(22);
        list.insertFirst(44);
        list.insertFirst(66);

        list.insertLast(11);
        list.insertLast(33);
        list.insertLast(55);

        list.displayList();

        list.deleteFirst();
        list.deleteFirst();

        list.displayList();
    }
}
//节点类
class DoublyLink{
    public long dData;
    public DoublyLink next;
    public DoublyLink(long dd){
        dData = dd;
    }
    //打印元素
    public void displayLink(){
        System.out.println(dData);
    }
}

class DoublyLinkList{
    private DoublyLink first;
    private DoublyLink last;
    public DoublyLinkList(){
        first = null;
        last = null;
    }
    public boolean isEmpty(){
        return first == null;
    }
    public void insertFirst(long dd){
        DoublyLink newLink = new DoublyLink(dd);
        if(isEmpty())
            last = newLink;
        newLink.next = first;
        first = newLink;
    }

    //正序输入
    public void insertLast(long dd){
        DoublyLink newLink = new DoublyLink(dd);
        if(isEmpty())
            first = newLink;
        else
            last.next = newLink;
        last = newLink;
    }

    public long deleteFirst(){
        long temp = first.dData;
        if(first.next == null)
            last = null;
        first = first.next;
        return temp;
    }
    public void displayList(){
        System.out.println("List(first->last):");
        DoublyLink current = first;
        while(current != null){
            current.displayLink();
            current = current.next;
        }
        System.out.println("");
    }
}



