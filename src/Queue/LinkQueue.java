package Queue;

public class LinkQueue {
    public static void main(String []args){

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
    private Link last;
    public LinkList(){
        first = null;
        last = null;
    }

    public boolean isEmpty(){
        return (first == null);
    }
    public void insertLast(long dd){
        Link newLink = new Link(dd);
        if(first == null)
            first = newLink;
        else
            last.next = newLink;
        last = newLink;
    }
    /*public long deleteFirst(){

    }*/
}
