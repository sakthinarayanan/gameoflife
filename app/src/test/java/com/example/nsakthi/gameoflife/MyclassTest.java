package com.example.nsakthi.gameoflife;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class MyclassTest {
    //Myclass myclass = new Myclass();
    int[][] color = Myclass.color;

    @Test
    public void test1() {
        assertEquals(color.length, 7);
    }
    @Test
    public void testneighbours() {
        int count = Myclass.countliveneighbour(0,0);
        assertEquals(count,1);

    }

    @Test
    public void testcell() {
        assertEquals(Myclass.color[0][0],1);
        Myclass.cellbehaviour(0,0,1);
        assertEquals(Myclass.color[0][0],0);

    }

    @Test
    public void testgrid() {
        assertEquals(Myclass.color[0][0],1);
        System.out.println(Arrays.deepToString(color));
        Myclass.gridbehaviour(color);
        assertEquals(Myclass.color[0][0],0);
        System.out.println(Arrays.deepToString(color));
        Myclass.gridbehaviour(color);
        System.out.println(Arrays.deepToString(color));
        Myclass.gridbehaviour(color);
        System.out.println(Arrays.deepToString(color));
        Myclass.gridbehaviour(color);
        System.out.println(Arrays.deepToString(color));
        Myclass.gridbehaviour(color);
        System.out.println(Arrays.deepToString(color));
        Myclass.gridbehaviour(color);
        System.out.println(Arrays.deepToString(color));Myclass.gridbehaviour(color);
        System.out.println(Arrays.deepToString(color));Myclass.gridbehaviour(color);
        System.out.println(Arrays.deepToString(color));
        Myclass.gridbehaviour(color);
        System.out.println(Arrays.deepToString(color));Myclass.gridbehaviour(color);
        System.out.println(Arrays.deepToString(color));Myclass.gridbehaviour(color);
        System.out.println(Arrays.deepToString(color));Myclass.gridbehaviour(color);
        System.out.println(Arrays.deepToString(color));
        Myclass.gridbehaviour(color);
        System.out.println(Arrays.deepToString(color));









    }
























}
