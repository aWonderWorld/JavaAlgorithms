package book.chapter1;

import edu.princeton.cs.algs4.StdDraw;

public class BouncingBall {
    private class Node{
        // Item item;
        Node next;
    }
    public static void main(String[] args) {
        StdDraw.setXscale(-1,1);
        StdDraw.setYscale(0,10);
        StdDraw.enableDoubleBuffering();
    }
}
