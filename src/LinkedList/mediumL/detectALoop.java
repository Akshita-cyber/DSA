package LinkedList.mediumL;
import java.util.HashMap;
public class detectALoop {
    static boolean isLoop(Node head){
        HashMap<Node,Integer>map=new HashMap<>();
        Node temp=head;
        while(temp!=null){
            if(map.containsKey(temp))return true;
            map.put(temp,1);
            temp=temp.next;
        }
        return false;
    }
}
