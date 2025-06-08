package exercise;

import java.util.ArrayList;

class SafetyList extends ArrayList {

    @Override
    public synchronized boolean add(Object item) {
        return super.add(item);
    }

    @Override
    public synchronized void add(int idx, Object item) {
        super.add(idx, item);
    }

    public Integer getSize() {
        return this.size();
    }
}
