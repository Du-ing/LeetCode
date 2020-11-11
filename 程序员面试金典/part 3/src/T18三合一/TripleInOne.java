package T18三合一;

/**
 * https://leetcode-cn.com/problems/three-in-one-lcci/
 */
class TripleInOne {

    private int[] stack;
    private int len;
    private int[] top;

    public TripleInOne(int stackSize) {
        this.stack = new int[stackSize*3];
        this.len = stackSize;
        this.top = new int[3];
    }

    public void push(int stackNum, int value) {
        if (top[stackNum] < len){
            stack[stackNum*len + top[stackNum]] = value;
            top[stackNum]++;
        }
    }

    public int pop(int stackNum) {
        return top[stackNum] == 0 ? -1 : stack[stackNum*len + --top[stackNum]];
    }

    public int peek(int stackNum) {
        return top[stackNum] == 0 ? -1 : stack[stackNum*len + top[stackNum]-1];
    }

    public boolean isEmpty(int stackNum) {
        return top[stackNum] == 0 ? true : false;
    }
}

/**
 * Your TripleInOne object will be instantiated and called as such:
 * TripleInOne obj = new TripleInOne(stackSize);
 * obj.push(stackNum,value);
 * int param_2 = obj.pop(stackNum);
 * int param_3 = obj.peek(stackNum);
 * boolean param_4 = obj.isEmpty(stackNum);
 */