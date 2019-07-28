/**
 * @ClassName Node
 * @Desc TODO
 * @Auther 28893
 * @Date 2019/7/28  18:09
 * @Veresion 1.0
 */
public class Node {
    int val;
    Node next=null;
    Node(int val){
        this.val=val;
    }
    public String toString(){
        return String.format(val+" ");
    }
}
