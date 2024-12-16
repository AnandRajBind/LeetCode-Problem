class Solution {

    public char getVal(char ch){
        switch(ch){
            case']' : return '[';
            case'}' : return '{';
            case')' : return '(';
default : return 0;
        }
    }
    public boolean isValid(String s) {
        String opening= "({[";// string 
         String closing= "]})";
         Stack<Character> st=new Stack<>();// stack character type
       for(char ch:s.toCharArray()){// string ke character one by one  read karega. 
if(opening.indexOf(ch)!=-1)// indexOf method me character/string pass karte.aur ye  character/string ka index  return karta hai.
st.push(ch);
else
{
    if(st.size()==0) return false;
    char tmp=st.pop();
    if(getVal(ch)!=tmp)
    return false;
}
    }
    return st.size()==0;
    }
}