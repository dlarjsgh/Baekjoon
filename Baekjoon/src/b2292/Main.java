package b2292;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {


        int[] count = new int[26];

        int c = System.in.read();

        while (c > 64) {  //공백을 입력 받는 순간 종료됨
            if (c < 91) {
                count[c - 65]++;
            } else {
                count[c - 97]++;
            } 
            c = System.in.read();
        }

        int max = 0;
        int ch = -2; // ? 는 63 이다

        for (int i = 0; i < count.length; i++) {
            if (count[i] > max) {
                max = count[i];
                ch = i;
            } else if (count[i] == max) {
                ch = -2;
            }
        }

        System.out.println((char) (ch + 65));
    }
}
