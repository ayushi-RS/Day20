class Solution {

public ListNode middleNode(ListNode head) {

 int count = 1;
 ListNode node = head;
 ListNode mid = head;
 
 while(node.next != null){
     count++;
     node = node.next;
 }
 
 
 if(count%2 == 0){
     int x = (count+1)/2;
     while(0 < x){
         mid = mid.next;
         x--;
     }
     return mid;
 }
 else{
      int x = (count/2);
     
     while(0 < x){
         mid = mid.next;
         x--;
     }
     return mid;
 }
}

}