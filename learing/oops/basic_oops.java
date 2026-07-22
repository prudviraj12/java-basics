package oops;   

class office {
    String off_name;
    int mem_name;

    public office(String s, int n) {
        System.out.println(s + " " + n);
        off_name = s;
        mem_name = n;
    }

}

// public c

public class basic_oops {
    public static void main(String[] args) {
        office branch1 = new office("reddy", 6);
        System.out.println(branch1.off_name);
        System.out.println(branch1.mem_name);
    }
}
