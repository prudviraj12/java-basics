package oops;

// public class xer

class office {
    String off_name;
    int mem_name;

    public office(String s, int n) {
        System.out.println(s + " " + n);
        off_name = s;
        mem_name = n;
    }

}

// public class basic_oops {

// public static void main(String[] args) {
// office branch1 = new office();
// branch1.off_name = "reddy";
// branch1.mem_name = 5;
// System.out.println(branch1.off_name);
// System.out.print(branch1.mem_name);
// }
// }
public class basic_oops {
    public static void main(String[] args) {
        office branch1 = new office("reddy", 6);
        System.out.println(branch1.off_name);
        System.out.println(branch1.mem_name);
    }
}
