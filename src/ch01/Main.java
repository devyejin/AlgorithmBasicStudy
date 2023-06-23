package ch01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * BufferedReader : Line 단위, String 타입으로 읽음
 */
public class Main {
    //3개의 정수값을 입력하고 최댓값을 구해라

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int first, second, third, max;
        try {

            first = Integer.parseInt(br.readLine());
            second = Integer.parseInt(br.readLine());
            third = Integer.parseInt(br.readLine());
            br.close();

            max = first;

            if(second > max) {
                max = second;
            }
            if (third > max) {
                max = third;
            }

            System.out.println(max);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }






    }
}
