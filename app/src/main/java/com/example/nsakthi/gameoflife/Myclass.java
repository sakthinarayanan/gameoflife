package com.example.nsakthi.gameoflife;

import android.util.Log;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Myclass {

        static int[][] color = {{1, 1, 1, 1, 1, 1, 1}, {0, 0, 0, 0, 0, 0, 0}, {1,1,1,0,0,0,1}, {0, 0, 1, 1, 1, 1, 0},{0, 0, 1, 1, 1, 1, 0},{0, 0, 1, 1, 1, 1, 0},{0, 0, 1, 1, 1, 1, 0}};

        public static int countliveneighbour(int i,int j) {
                int count = 0;
                for(int k = i-1; k<=i+1 ; k++) {
                        for (int l = j - 1; l <=j + 1 ; l++) {
                              if(k>=0 && l>=0 &&(k!=i || l!=j )&& k<=6 && l<=6) {
                                  //neighbour.add(k + "" + l);
                                  if(color[k][l] == 1 )
                                      count++;
                              }
                        }
                }

                return count;
        }

        public static void cellbehaviour(int i, int j, int liveneigbour){
            if(color[i][j]==1)
            {
                if(liveneigbour<2)
                {
                    color[i][j]=0;
                }
                if(liveneigbour==2 || liveneigbour==3)
                {
                    color[i][j]=1;
                }
                if(liveneigbour>3)
                {
                    color[i][j]=0;
                }
            }
            if(color[i][j]==0) {
                if (liveneigbour == 3) {
                    color[i][j] = 1;
                }
            }
        }
        //

    public static void gridbehaviour(int[][] color)
    {
        //System.out.println(Arrays.deepToString(color));
        for(int i=0; i<=6;i++)
        {
            for(int j=0; j<=6;j++) {
                int liveneighbours= countliveneighbour(i,j);
                  cellbehaviour(i,j,liveneighbours);

            }
            }
    }

    public static void main(String[] args) {


//        ArrayList<Integer> neighbour =new ArrayList<>() ;
//        neighbour = findneighbour(1,3);
//        System.out.println(color[0][3]);
//        //color[1][3]=0;
//        int occurrences = Collections.frequency(neighbour, 1);
//        System.out.println(neighbour + " " + neighbour.size()+" "+occurrences);
//        System.out.println(Arrays.deepToString(color));
//        cellbehaviour(1,3,occurrences);
//        System.out.println(Arrays.deepToString(color));
        System.out.println(Arrays.deepToString(color));
        for(int i=0;i<15; i++) {
            gridbehaviour(color);
            System.out.println(Arrays.deepToString(color));
        }
    }

}

