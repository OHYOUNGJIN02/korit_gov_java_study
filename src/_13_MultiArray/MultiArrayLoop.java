package _13_MultiArray;

import java.util.Arrays;

public class MultiArrayLoop {
    public static void main(String[] args) {
        //다차원 배열 순회
        String[][] seats = new String[][]
                {
                        {"A1", "A2", "A3", "A4", "A5"},
                        {"B1", "B2", "B3", "B4", "B5"},
                        {"C1", "C2", "C3", "C4", "C5"}
                };
        for (int i = 0; i < 3; i++) { //행
            for (int j = 0; j < 5; j++) { //열
                System.out.print(seats[i][j] + " ");

            }

            {
                System.out.println();

                for (int j = 0; j < seats.length; j++) {
                    for (int k = 0; k < seats[j].length; k++) {
                        System.out.print(seats[j][k] + " ");

                    }
                    System.out.println();

                    String[][] seats2 = {
                            {"A1", "A2", "A3"},
                            {"B1", "B2", "B3", "B4"},
                            {"C1", "C2", "C3", "C4", "C5"}
                    };

                    for (int k = 0; k < seats2.length; k++) {
                        for (int l = 0; l < seats2[k].length; l++) {
                            System.out.print(seats2[k][l] + " ");

                        }
                        System.out.println();

                    }
                    //아이맥스 영화관
                    //세로 10칸 가로 15칸
                    String[][] imaxSeats = new String[10][15];
                    String[] eng = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
                    for (int k = 0; k < imaxSeats.length; k++) {
                        for (int l = 0; l < imaxSeats[k].length; l++) {
                            imaxSeats[k][l] = eng[k] + (j + 1);

                            {

                                for (int m = 0; m < imaxSeats.length; m++) {
                                    for (int n = 0; n < imaxSeats.length; n++) {
                                        System.out.print(imaxSeats[k][l] + " ");

                                    }
                                }


                            }

                        }
                        System.out.println();

                    }

                    imaxSeats[3][7] = "__";
                    imaxSeats[5][3] = "__";
                    imaxSeats[7][5] = "__";
                    imaxSeats[7][6] = "__";

                }

            }

            //다차원 배열 합 구하기
            //3x3 크기 1부터 홀수 차례대로 넣고 출력해서 확인 후 총합 구하기

            int[][] arr = new int[3][3];
            int num = 1;

            for (int j = 0; j < arr.length; j++) {
                for (int k = 0; k < arr[j].length; k++) {
                    arr[j][k] = num;
                    num+=2;
                    System.out.println(arr[j][k]+"");


                    }
                }

                System.out.println(Arrays.deepToString(arr));

            int sum = 0;
            for (int j = 0; j < arr.length; j++) {
                for (int k = 0; k < arr[j].length; k++) {
                    sum += arr[j][k];
                }
                System.out.println();

                    System.out.println("총합 : " + sum );

                }
            }

            }
            //각 행 합, 각 열 합, 전체 합
            int[][] a = {
                    {1,2,3},
                    {4,5,6}

            };{



            int n = a.length;
            int m = a[0].length;
            int[] rowsum = new int[n];
            int[] colsum = new int[m];
            int total = 0;
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <m; j++) {
                rowsum[i] +=a[i][j]; //[6, 15}
                colsum[j] +=a[i][j]; //[5,7,9]
                total += a[i][j];

            }
            System.out.println("row"+ Arrays.toString(rowsum));
            System.out.println("col"+Arrays.toString(colsum));
            System.out.println("총합 : " + total);

            int[][] A = {{1,2}, {3,4}};
            int[][] B = {{5,6}, {7,8}};
            int n1 = A.length;
            int m1 = A[0].length;

            int[][] add = new int[n1][m1];
            int[][] sub = new int[n1][m1];

            for (int j = 0; j <n1; j++) {
                for (int k = 0; k <m1; k++) {
                    add[j][k] =A[j][k] + B[j][k];
                    sub[j][k] =A[j][k] - B[j][k];
                }

            }
            System.out.println("A+B = " + Arrays.deepToString(add));
            System.out.println("A-B = " + Arrays.deepToString(sub));
        } ;}}


