/**
 * @ClassName Solution
 * @Desc TODO
 * @Auther 28893
 * @Date 2019/7/28  18:08
 * @Veresion 1.0
 */
public class Solution {
    public  Node reverse(Node head){
        Node result=null;
        Node cur=head;
        if(head==null){
            return null;
        }
        while(cur!=null){
            Node next=cur.next;
            cur.next=result;
            result=cur;
            cur=next;
        }
        return result;
    }
    public Node deletement(Node head,int val){
        if(head==null){
            return null;
        }
        Node cur=head;
        Node prev=null;
        while(cur!=null){
            if(cur.val==val){
               if(head.val==val){
                   head=head.next;
                   cur=cur.next;
               }else{
                   prev.next=cur.next;
                   cur=cur.next;
               }
            }
            else{
                prev=cur;
                cur=cur.next;
            }
        }
        return head;
    }
    public Node conList(Node head1,Node head2){
        Node result=null;
        Node cur1=head1;
        Node cur2=head2;
        Node last=null;
        while(cur1!=null&&cur2!=null){
            if(cur1.val<cur2.val){
                if(result==null){
                    result=cur1;
                    last=cur1;
                    cur1=cur1.next;
                }
                else{
                    last.next=cur1;
                    last=cur1;
                    cur1=cur1.next;
                }
            }
            else{
                if(result==null){
                    result=cur2;
                    last=cur2;
                    cur2=cur2.next;
                }
                else{
                    last.next=cur2;
                    last=cur2;
                    cur2=cur2.next;
                }
            }
        }
        if(cur1==null){
            last.next=cur2;
        }
        else{
            last.next=cur1;
        }
        return result;
    }
    public Node sepaList(Node head,int x){
        Node small=null;
        Node smallLast=null;
        Node big=null;
        Node bigLast=null;
        Node cur=head;
        if(head==null){
            return null;
        }
        while(cur!=null){
            if(cur.val<x){
                if(small==null){
                    small=cur;
                    smallLast=cur;
                    cur=cur.next;
                }
                else{
                    smallLast.next=cur;
                    smallLast=cur;
                    cur=cur.next;
                }
            }
            else{
                if(big==null){
                    big=cur;
                    bigLast=cur;
                    cur=cur.next;
                }
                else{
                    bigLast.next=cur;
                    bigLast=cur;
                    cur=cur.next;
                }
            }
        }
        if(small==null){
            return big;
        }
        else{
            smallLast.next=big;
            if(bigLast!=null){
                bigLast.next=null;
            }
        }
        return small;
    }
   /* public Node deleteNode(Node head){
        Node prev=null;
        Node p1=head;
        Node p2=head.next;
        if(head==null){
            return null;
        }
        while(p2!=null){
            while(p1.val!=p2.val){
                prev=p1;
                p1=p2;
                p2=p2.next;
            }

        }
    }*/
}
