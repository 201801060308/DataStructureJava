package LineaeTable;

public class LinkedListApp {
    public static void main(String []args){
        LinkList theList = new LinkList();
        theList.insertFirst(22,2.99);
        theList.insertFirst(44,4.99);
        theList.insertFirst(66,6.99);
        theList.insertFirst(88,8.99);

        theList.displayList();

        while(!theList.isEmpty()){
            Link aLink =  theList.deleteFirst();
            System.out.println("Deleted");
            aLink.displayLink();
            System.out.println("");
        }
        theList.displayList();
    }
}

//节点类
class Link{
    public int iData;
    public double dData;
    public Link next;
    public Link(int id,double dd){
        iData = id;
        dData = dd;
    }

    //打印元素
    public void displayLink(){
        System.out.println(iData+"---"+dData);
    }
}

//链表类
class LinkList{
    private Link first;
    public LinkList(){
        first = null;
    }
    //链表是否为空
    public boolean isEmpty(){
        return (first == null);
    }
    //出入数据至第一位
    public void insertFirst(int id,double dd){
        Link newLink = new Link(id,dd);
        newLink.next = first;
        first = newLink;
    }
    //删除第一个数据
    public Link deleteFirst(){
        Link temp = first;
        first = first.next;
        return temp;
    }
    //打印链表
    public void displayList(){
        System.out.println("List(first-->last):");
        Link current = first;
        while(current != null){
            current.displayLink();
            current = current.next;
        }
        System.out.print("\n");
    }
    //查找数据
    public Link find(int key){
        Link temp = first;
        while(temp.iData != key){
            if(temp.next == null)
                return null;
            else
                temp = temp.next;
        }
        return temp;
    }
    //删除数据
    public Link delete(int key){
        Link current = first;
        Link previous = first;
        while (current.iData != key){
            if(current.next == null)
                return null;
            else{
                previous = current;
                current = current.next;
            }
        }
        if(current == first)
            current = current.next;
        else
            previous.next = current.next;
        return current;
    }
}