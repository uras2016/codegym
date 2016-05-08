import java.util.*;

public class BinaryHeap {

    private TreeMap<Integer, Integer> map = new TreeMap<>();

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