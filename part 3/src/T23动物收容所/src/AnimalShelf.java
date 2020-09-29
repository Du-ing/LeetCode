package T23动物收容所.src; /**
 * https://leetcode-cn.com/problems/animal-shelter-lcci/
 */

import java.util.LinkedList;
import java.util.List;

class AnimalShelf {

    private List<int[]> animals;

    public AnimalShelf() {
        animals = new LinkedList<>();
    }
    
    public void enqueue(int[] animal) {
        animals.add(animal);
    }
    
    public int[] dequeueAny() {
        if (animals.isEmpty()){
            int[] res = new int[2];
            res[0] = res[1] = -1;
            return res;
        }else {
            return animals.remove(0);
        }
    }
    
    public int[] dequeueDog() {
        int i = 0;
        while (i < animals.size()){
            if (animals.get(i)[1] == 1){
                return animals.remove(i);
            }
            i++;
        }
        int[] res = new int[2];
        res[0] = res[1] = -1;
        return res;
    }
    
    public int[] dequeueCat() {
        int i = 0;
        while (i < animals.size()){
            if (animals.get(i)[1] == 0){
                return animals.remove(i);
            }
            i++;
        }
        int[] res = new int[2];
        res[0] = res[1] = -1;
        return res;
    }
}

/**
 * Your AnimalShelf object will be instantiated and called as such:
 * AnimalShelf obj = new AnimalShelf();
 * obj.enqueue(animal);
 * int[] param_2 = obj.dequeueAny();
 * int[] param_3 = obj.dequeueDog();
 * int[] param_4 = obj.dequeueCat();
 */