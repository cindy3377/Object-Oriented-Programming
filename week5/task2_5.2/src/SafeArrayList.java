import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class SafeArrayList<E> {
    private List<E> list = Collections.synchronizedList(new ArrayList<>());

    public void addElement(E element) {
        list.add(element);
    }

    public int getSize() {
        return list.size();
    }

    public E removeElement(int index) {
        if (index >= 0 && index < list.size()) {
            return list.remove(index);
        } else {
            return null;
        }
    }
}

class ArrayListTester implements Runnable {
    private static int threadIDCounter = 1;
    private int threadID;
    private SafeArrayList<String> safeArrayList;

    public ArrayListTester(SafeArrayList<String> safeArrayList) {
        this.threadID = threadIDCounter++;
        this.safeArrayList = safeArrayList;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            safeArrayList.addElement("Thread " + threadID + ": Element " + i);
        }
    }
}

