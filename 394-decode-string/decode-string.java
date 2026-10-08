import java.util.Stack;
class Solution {
    public String decodeString(String s) {
        Stack<Integer> counts=new Stack<>();
        Stack<StringBuilder> resultStack=new Stack<>();
        StringBuilder res=new StringBuilder();
        int idx=0;
        while(idx<s.length()){
            char ch=s.charAt(idx);
            if(Character.isDigit(ch)){
            int count=0;
            while(idx<s.length()&&Character.isDigit(s.charAt(idx))){
            count=10*count+(s.charAt(idx)-'0');
            idx++;
                    }
                    counts.push(count);
        }
        else if(ch== '['){
            resultStack.push(res);
            res=new StringBuilder();
            idx++;
        }
        else if(ch==']'){
            StringBuilder temp=resultStack.pop();
            int repeatTimes=counts.pop();
            for(int i=0;i<repeatTimes;i++){
                temp.append(res);
            }
            res=temp;
            idx++;
        }
        else {
            res.append(ch);
            idx++;
        }
    }
    return res.toString();
    }
}