package Stack;

public class LinkStack {
    public  static void main(String []args){
        LinkStackPre theStack = new LinkStackPre();
        theStack.push(20);
        theStack.push(40);

        theStack.displayStack();

        theStack.push(60);
        theStack.push(80);

        theStack.displayStack();

        theStack.pop();
        theStack.pop();

        theStack.displayStack();
    }
}
class Link{
    public long dData;
    public Link next;
    public Link(long dData){
        this.dData = dData;
    }
    public void displayLink(){
        System.out.println(dData+" ");
    }
}

class LinkList{
    private Link first;
    public LinkList(){
        first = null;
    }
    public boolean isEmpty(){
        return (first == null);
    }
    public void insertFirst(long dd){
        Link newLink = new Link(dd);
        newLink.next = first;
        first = newLink;
    }
    public long deleteFirst(){
        Link temp = first;
        first = first.next;
        return temp.dData;
    }

    public void displayList(){
        Link current = first;
        while(current != null){
            current.displayLink();
            current = current.next;
        }
        System.out.println("");
    }
}

class LinkStackPre{
    private LinkList theList;
    public LinkStackPre(){
        theList = new LinkList();
    }
    public void push(long d){
        theList.insertFirst(d);
    }
    public long pop(){
        return theList.deleteFirst();
    }
    public boolean isEmpty(){
        return theList.isEmpty();
    }
    public void displayStack(){
        System.out.println("Stack(top-->bottom)");
        theList.displayList();
    }

}
