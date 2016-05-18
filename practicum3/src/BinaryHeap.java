import java.util.TreeMap;

//
//Реалізуйте структуру даних  - Бінарна Купа (Binary Heap).
//        Конструктор проймає один параметр size.
//        Методи insert(int) що працює за O(logN) і poll(),
//        який видаляє і повертає максимальне число з купи і також працює за O(logN).
class BinaryHeap {

    private TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();

    public BinaryHeap(int size) {

    }

    public void insert(int val) {
        map.put(val, val);
    }

    public int poll() {
        if (map.size() > 0) {
            int max = map.lastKey();
            map.remove(max);
            return max;
        }
        return 0;
    }
}