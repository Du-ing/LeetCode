package T67整数的英语表示;

/**
 * https://leetcode-cn.com/problems/english-int-lcci/
 */

class Solution {
    public String numberToWords(int num) {
        if(num == 0) return "Zero";
        StringBuffer res = new StringBuffer();
        int i = 0;
        while(num != 0){
            int t = num % 1000;     //取三位
            if(t != 0){    //该三位不为0时进行接下来的操作
                switch(i){ //判断属于第几个三位
                    case 0: break;
                    case 1: res.insert(0,"Thousand "); break;
                    case 2: res.insert(0,"Million "); break;
                    case 3: res.insert(0,"Billion "); break;
                }
                int n1 = t % 10;        //个位
                int n2 = t / 10 % 10;   //十位
                int n3 = t / 100 % 10;  //百位
                if(n2 == 1){ //如果十位为1，特殊处理
                    res.insert(0,numToWord(n1,1));
                    if(n3 != 0) res.insert(0,numToWord(n3,0)+"Hundred ");
                }else{  //十位不为1，正常处理
                    res.insert(0,numToWord(n1,0));
                    res.insert(0,numToWord(n2,2));
                    if(n3 != 0) res.insert(0,numToWord(n3,0)+"Hundred ");
                }
            }
            num /= 1000; //判断完一个三位
            i++; //计数
        }
        return res.deleteCharAt(res.length()-1).toString(); //结果要去掉最后单词后面的一个空格
    }

    //flag=0表示正常个位的值，flag=1表示十位为1的时候的值，flag=2表示正常十位的值
    private String numToWord(int num,int flag){
        switch(num){
            case 0:{
                if(flag == 1) return "Ten ";
            };break; //注意这里要break
            case 1:{
                if(flag == 0) return "One ";
                else if(flag == 1) return "Eleven ";
            }
            case 2:{
                if(flag == 0)  return "Two ";
                else if(flag == 1) return "Twelve ";
                else return"Twenty ";
            }
            case 3:{
                if(flag == 0) return "Three ";
                else if(flag == 1) return "Thirteen ";
                else return "Thirty ";
            }
            case 4:{
                if(flag == 0) return "Four ";
                else if(flag == 1) return "Fourteen ";
                else return "Forty ";
            }
            case 5:{
                if(flag == 0) return "Five ";
                else if(flag == 1) return "Fifteen ";
                else return "Fifty ";
            }
            case 6:{
                if(flag == 0) return "Six ";
                else if(flag == 1) return "Sixteen ";
                else return "Sixty ";
            }
            case 7:{
                if(flag == 0) return "Seven ";
                else if(flag == 1) return "Seventeen ";
                else return "Seventy ";
            }
            case 8:{
                if(flag == 0) return "Eight ";
                else if(flag == 1)  return "Eighteen ";
                else return "Eighty ";
            }
            case 9:{
                if(flag == 0) return "Nine ";
                else if(flag == 1) return "Nineteen ";
                else return "Ninety ";
            }
        }
        return "";
    }
}