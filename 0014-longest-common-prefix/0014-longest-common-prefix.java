class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0 || strs == null){
            return ""; 
        }
        String prefix=strs[0];//store flower as a prefix in 0 index of array.
for(int i= 1; i<strs.length; i++){ // "flow" "flower"
while(strs[i].indexOf(prefix) !=0){
    prefix= prefix.substring(0,prefix.length()-1);
}
if(prefix.length() == 0){
    return "";
}
}
return prefix;
}  
}