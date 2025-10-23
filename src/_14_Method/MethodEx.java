package _14_Method;



public class MethodEx {

    //최대값 구하기
    //max (3,7,5)=>7
    public static int max(int a, int b, int c) {
        int max = a;
        if (b>max){
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;


    }

    //홀짝 판단
    //isEven(8)=>true (짝수면 true, 홀수면 false)
    public static boolean isEven(int number) {
        if (number % 2 == 0){
            return true;
        }
        return false;


        }


    public static int abs(int n) {
        return n < 0 ? -n : n;


    }

    public static boolean contains(int[]a,int b) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == b) {
                return true;
            }

        } return false;
    }

    public static void main(String[] args) {
        System.out.println(abs(8));
        System.out.println(
                max(3,5,7));


        //포함 여부 (선형탐색)
        //contains([1,3,5],3)=>true, 없으면 false
        int [] nums = {1,3,7,9};
        System.out.println(contains(nums,8));
    }

    public static int sum(int x, int y) {
        return x + y;
    }


}





