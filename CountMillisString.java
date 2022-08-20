public class CountMillisString {
    public static void main(String[] args) {
        String str="";
        int st = (int) System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            str+=i;
        }
        int et = (int) System.currentTimeMillis();
        int diff = et - st;
        System.out.println(diff);
    }
}
