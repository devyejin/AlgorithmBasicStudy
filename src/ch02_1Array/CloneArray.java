package ch02_1Array;

import java.util.Arrays;

/**
 * 배열은 배열의 요소를 0으로 자동 초기화
 */
public class CloneArray {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = a.clone(); // a를 참조

        b[3] = 0;

        System.out.println(Arrays.toString(a)); //[1, 2, 3, 4, 5]
        System.out.println(Arrays.toString(b)); //[1, 2, 3, 0, 5]
        //clone 메서드를 사용하면 복제해서 별개의 객체가 생성되는 것! (동일 객체의 참조를 공유하는게 아님)
    }
}
