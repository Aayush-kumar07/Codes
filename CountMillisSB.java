public class CountMillisSB {

    public static void main(String[] args) {
        Stringbuilder sb = new Stringbuilder();
        int st = (int) System.currentTimeMillis();
        for (int i = 0; i < 1000000000;i++) {
            sb.append(i);
        }
        int et = (int)System.currentTimeMillis();
        int diff = et - st;
        System.out.println(diff);
    }
}