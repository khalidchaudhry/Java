import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit=new LinkedList<>();
//        placesToVisit.add("Sydney");
//        placesToVisit.add("Melbourne");
//        placesToVisit.add("Brisbane");
//        placesToVisit.add("Perth");
//        placesToVisit.add("Canberra");
//        placesToVisit.add("Darwin");
        printList(placesToVisit);
        addInOrder(placesToVisit,"Seattle");
        printList(placesToVisit);
    }
    private static void printList(LinkedList<String> placesToVisit){
        Iterator<String> iterator=placesToVisit.iterator();
        while (iterator.hasNext()){
            System.out.println("Now visiting "+iterator.next());
        }
        System.out.println("==============================");
    }

    private static boolean addInOrder(LinkedList<String> linkedList,String newCity){
        ListIterator<String> stringListIterator=linkedList.listIterator();
        while (stringListIterator.hasNext()){
          int comparison=stringListIterator.next().compareTo(newCity);
          if(comparison==0){
              return false;
          }
          else if(comparison>0){
              stringListIterator.previous();
              stringListIterator.add(newCity);
              return true;
          }
          else if(comparison<0){

          }

        }
        stringListIterator.add(newCity);
        return true;
    }
}
