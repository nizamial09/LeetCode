/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode resultList = new ListNode();
        ListNode head = new ListNode();
        //ListNode maxNode = new ListNode();
        int carry=0,sum=0,flag=1,flagl1=0,flagl2=0;
        
        while(l1 != null || l2 != null){ 
             
            if(l1==null){
                sum=l2.val+carry;
                l2= l2.next;
            }
            else if(l2==null){
                sum=l1.val+carry;
                l1 = l1.next;
            }
            else{
                sum=l1.val+l2.val+carry; 
                l1= l1.next;
                l2 = l2.next;
            }
                    
            carry=sum/10;
            resultList.val=sum%10;
               
            if(flag==1){
                head=resultList;  //to return 
            } 
            
            if(l1 != null || l2 !=null){                
                resultList.next= new ListNode();    
                resultList=resultList.next;
                         
            }                   
             flag++;                         
        }
         if(carry>0){
            resultList.next= new ListNode(carry); 
         }
         return head;
    }
    
  
}
