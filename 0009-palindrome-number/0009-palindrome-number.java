class Solution {
public boolean isPalindrome(int num) {
        if(num<0){
            return false;
        }
        int reversed=0;
        int reminder;
         int temp=num;
 while(temp !=0){
  reminder = temp % 10;
    reversed= reversed * 10 +reminder;
    temp=temp/10;
 }
return (reversed == num);
}
}