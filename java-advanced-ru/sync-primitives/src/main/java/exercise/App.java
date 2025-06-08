package exercise;

class App {

    public static void main(String[] args) {
        var list = new SafetyList();
        var thread1 = new ListThread(list);
        var thread2 = new ListThread(list);

        try {
            thread1.start();
            thread2.start();

            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(list.size());
    }
}
