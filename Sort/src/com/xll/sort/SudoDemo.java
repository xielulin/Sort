package com.xll.sort;

import java.util.Arrays;
import java.util.Date;

/**
 * @author xielulin
 * @create 2019-07-01 16:20
 * @desc 数独
 **/
public class SudoDemo {
    public static void main(String[] args) {
        int [][] board = new int[9][9];
        for (int i = 0; i <board.length ; i++) {
            for (int j = 0; j <board[i].length ; j++) {
                board[i][j] = 0;
            }

        }
        board[0][1] = 5;
        board[0][7] = 2;
        board[1][0] = 4;
        board[1][3] = 2;
        board[1][5] = 6;
        board[1][8] = 7;
        board[2][2] = 8;
        board[2][4] = 3;
        board[2][6] = 1;
        board[3][1] = 1;
        board[3][7] = 6;
        board[4][2] = 9;
        board[4][6] = 5;
        board[5][1] = 7;
        board[5][7] = 9;
        board[6][2] = 5;
        board[6][4] = 8;
        board[6][6] = 3;
        board[7][0] = 7;
        board[7][3] = 9;
        board[7][5] = 1;
        board[7][8] = 4;
        board[8][1] = 2;
        board[8][7] = 7;


        System.out.println("************原题**************");

        long start = new Date().getTime();
        for (int i = 0; i < board.length; i++) {
            System.out.println(Arrays.toString(board[i]));
        }
        solveSudoku(board);
        long end = new Date().getTime();
        System.out.println("************答案*************");
        for (int i = 0; i < board.length; i++) {
            System.out.println(Arrays.toString(board[i]));
        }
        System.out.println("花费时间："+(end-start)+"ms");

    }


    public static void solveSudoku(int [][] board){
        if(board == null || board.length == 0){
            return;
        }
        solve(board);
    }

    /**
     * @description 数独
     * @author xielulin
     * @date 2019/7/2
     * @param board
     * @return boolean
     */
    private static boolean solve(int[][] board) {
        //遍历每个位置
        for (int i = 0; i < board.length ; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if(board[i][j] ==0){
                    //如果位置为0，即未填入数字的位置
                    for (int k = 1; k < 10; k++) {
                        //从1到9依次填入并检查是否有效
                        if(isValid(board,i,j,k)){
                            //如果有效，则将数字填入当前位置，并再次递归
                            board[i][j] = k;
                            if(solve(board)){
                                //如果递归完毕检验有效，则返回true
                                return true;
                            }else {
                                //否则将之前填入的数字清空，进入下一次循环
                                board[i][j] = 0;
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * @description 验证填入的数字是否合法
     * @author xielulin
     * @date 2019/7/2
     * @param board
     * @param row
     * @param col
     * @param c
     * @return boolean
     */
    private static boolean isValid(int[][] board, int row, int col, int c) {
        for (int l = 0; l < 9; l++) {
            //检验列是否合法
            if(board[l][col] != 0 && board[l][col] == c){
                return false;
            }
            //检验行是否合法
            if(board[row][l] != 0 && board[row][l] == c){
                return false;
            }
            //检验每个小九宫格是否合法
            if(board[3*(row/3)+l/3][3*(col/3)+l%3] != 0 && board[3*(row/3)+l/3][3*(col/3)+l%3] == c){
                return false;
            }
        }
        return true;
    }
}
