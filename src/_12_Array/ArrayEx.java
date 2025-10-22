package _12_Array;

public class ArrayEx {
    public static void main(String[] args) {
        int[] heights = {150, 172, 165, 181, 158, 174, 169, 182, 177, 160};
        int sum = 0;
        int count = 0;


        for (int i = 0; i < heights.length; i++) {
            int height = heights[i];
                if (height >= 170 ) {


                System.out.println("조건에 맞는 키 : " + height);
                sum += height;
                count++;


            }

            }

        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("조건에 맞는 키 평균 " + average);

        }

        }


        }
