package Q8旋转数组的最小数字;

/**
 * https://leetcode-cn.com/problems/xuan-zhuan-shu-zu-de-zui-xiao-shu-zi-lcof/
 */

class Solution {
    public int minArray(int[] numbers) {
        int a = 0;
        int b = numbers.length - 1;

        while(a < b){
            int mid = (a+b) / 2;
            if(numbers[a] < numbers[mid]){ //左边升序
                if(numbers[mid] <= numbers[b]){ //a~b整体升序
                    b = mid - 1;
                }else{ //非整体升序
                    a = mid + 1;
                }
            }
            else if(numbers[a] > numbers[mid]){ //右边升序，在左边找最小值
                b = mid;
            }
            else{ //出现连续相等的情况
                if(numbers[mid] < numbers[b]){
                    return numbers[a];
                }else{ //无法判断最小值在左边还是右边，所以在a~b之间遍历后返回最小值
                    int min = numbers[a];
                    for(int i=a+1; i<=b; i++){
                        if(numbers[i] < min){
                            min = numbers[i];
                            a = i;
                        }
                    }
                    break;
                }
            }
        }
        return numbers[a];
    }
}