package exercise;

class MaxThread extends Thread {

    private int[] arr;
    private Integer result = null;

    public MaxThread(int[] numbers) {
        arr = numbers;
    }

    @Override
    public void run() {
        for (int i : arr) {
            if (this.result == null || this.result < i) {
                this.result = i;
            }
        }
    }

    public Integer getResult() {
        return this.result;
    }
}
