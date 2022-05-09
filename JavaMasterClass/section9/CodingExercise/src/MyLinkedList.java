import java.util.Stack;

public class MyLinkedList implements NodeList{

    private ListItem root;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        if(this.root==null){
            this.root=newItem;
            return true;
        }
        ListItem currentItem=this.root;
        while (currentItem!=null){
            int comparison=currentItem.compareTo(newItem);
            if(comparison<0){
                if(currentItem.next()!=null){
                    currentItem=currentItem.next();
                }else{
                    currentItem.setNext(newItem).setPrevious(currentItem);
                    return true;
                }
            }
            else if(comparison>0){
                if(currentItem.previous()!=null){
                    currentItem.previous().setNext(newItem).setPrevious(currentItem.previous());
                    newItem.setNext(currentItem).setPrevious(newItem);
                }
                else {
                    newItem.setNext(this.root);
                    this.root.setPrevious(newItem);
                    this.root=newItem;
                }
            }
            else {
               return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        if(item!=null){
            ListItem curr=this.root;
            while (curr!=null){
                int comparison=curr.compareTo(item);
                if(comparison==0){
                    if(curr==this.root){
                        this.root=curr.next();
                    }else {
                        curr.previous().setNext(curr.next());
                        if(curr.next()!=null){
                            curr.next().setPrevious(curr.previous());
                        }
                    }
                    return true;
                }
                else if(comparison<0){
                    curr=curr.next();
                }
                else{
                    return false;
                }
            }
        }
        return false;
    }

    @Override
    public void traverse(ListItem root) {
        if(root==null){
            System.out.println("The list is empty");
        }
        ListItem curr=root;
        while (curr!=null){
            System.out.println(root.getValue());
            curr=curr.next();
        }
    }
}
