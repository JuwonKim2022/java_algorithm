package ch00;

import java.util.*;

/*
 * <좌표정렬>
 * N개의 평면상의 좌표(x,y)가 주어지면 모든 좌표를 오름차순으로 정렬
 * x 먼저 정렬 -> x 같은 결우 y 정렬
 */

class Point11 implements Comparable<Point11>  {
    public int x,y;
    Point11(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point11 o) {
        if(this.x ==o.x) {
            return this.y - o.y;
        }else {
            return this.x - o.x;
        }
    }
}

class Main11{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Point11> arr = new ArrayList<>();

        for(int i=0; i<n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            arr.add(new Point11(x,y));
        }
        Collections.sort(arr);
        for(Point11 o : arr) System.out.println(o.x + " " + o.y);
    }
}
