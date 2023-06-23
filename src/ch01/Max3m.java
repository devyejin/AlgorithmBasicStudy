package ch01;

public class Max3m {

    //세 수 중 최댓값을 구하는 메서드
    static int max3(int a, int b, int c) {
        int max = a;

        if (b > max) max = b;
        if (c > max) max = c;

        return max;
    }

    public static void main(String[] args) {

        System.out.println(max3(3, 6, 1));
        System.out.println(max3(2, 1, 9));
        System.out.println(max3(9, 3, 1));


    }
}
