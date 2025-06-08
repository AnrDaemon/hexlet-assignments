package exercise;

class MinThread extends Thread {

    private int[] arr;
    private Integer result = null;

    public MinThread(int[] numbers) {
        arr = numbers;
    }

    @Override
    public void run() {
        for (int i : arr) {
            if (this.result == null || this.result > i) {
                this.result = i;
            }
        }
    }

    public Integer getResult() {
        return this.result;
    }
}
