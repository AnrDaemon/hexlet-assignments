package exercise;

import lombok.AllArgsConstructor;
import lombok.NonNull;

@AllArgsConstructor
class ListThread extends Thread {

    @NonNull
    private SafetyList arr;

    @Override
    public void run() {
        for (var i = 0; i < 1000; i++) {
            try {
                sleep(1);
                arr.add(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
