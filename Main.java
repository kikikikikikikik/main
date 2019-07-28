/**
 * @ClassName main
 * @Desc 复杂链表复制
 * 1）链表的逆置
 * 2)链表中删除制定的val；
 * 3）合并两个有序链表
 * 4）按x把链表分成两部分
 * 5）删除链表中的重复节点
 * 6）找到链表的中间节点
 * 7）找到链表的倒数第k个节点
 * 8）复杂链表的复制
 * @Auther 28893
 * @Date 2019/7/28  17:21
 * @Veresion 1.0
 */
public class Main {
    private static Node prepareList(){
        Node n1=new Node(7);
        Node n2=new Node(6);
        Node n3=new Node(4);
        Node n4=new Node(9);
        n1.next=n2;n2.next=n3;n3.next=n4;
        return n1;
    }
    private static Node prepareList2(){
        Node h1=new Node(7);
        Node h2=new Node(8);
        Node h3=new Node(2);
        Node h4=new Node(9);
        h1.next=h2;h2.next=h3;h3.next=h4;
        return h1;
    }
    private static void print(Node head){

        for(Node cur=head;cur!=null;cur=cur.next){
            System.out.print(cur+"-->");
        }
        System.out.println("null");
    }
    private static void testReverse(Solution solution){
        Node head=prepareList();
        Node result=solution.reverse(head);
        print(result);
    }
    private static void testdeleelement(Solution solution){
        Node head=prepareList();
        Node result=solution.deletement(head,1);
        print(result);
    }

    private static void testconList(Solution solution){
        Node head1=prepareList();
        Node head2=prepareList2();
        Node result=solution.conList(head1,head2);
        print(result);
    }
    private static void testseparate(Solution solution){
        Node head=prepareList();
        Node result=solution.sepaList(head,5);
        print(result);
    }
    public static void main(String[] args) {
        Solution solution=new Solution();
        //testReverse(solution);
        //testdeleelement(solution);
        //testconList(solution);
        testseparate(solution);
    }
}
