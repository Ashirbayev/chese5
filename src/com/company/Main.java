package com.company;



import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        int chessBoardArray[][] = new int[8][8];

        int rowValue;
        int columnValue;

        for (int z = 0; z < 8; z++) {
            if (z == 0) {
                 rowValue = Integer.parseInt(JOptionPane.showInputDialog("Enter the first row value (1-8)")); //первый ферзь устанавливаем сами
                 columnValue = Integer.parseInt(JOptionPane.showInputDialog("Enter the first column value (1-8)"));}
            else{
                 rowValue = (int) ( Math.random() * 7 );// как я пончял для остальных тоже нет определенных мест расположения
                 columnValue = (int) ( Math.random() * 7 );// и задается рандомно
            }

            int rowValueFinal = rowValue - 1;
            int columnValueFinal = columnValue - 1;

            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    if (i == rowValueFinal && j == columnValueFinal) {
                        chessBoardArray[rowValue - 1][columnValue - 1] = 1;// 1 это ФЕРЗЬ
                    } else {
                        chessBoardArray[rowValue - 0][columnValue - 0] = 0;

                    }
                }
            }
        }


        for (int k = 0; k < 8; k++) {
            if (k < 7) {
                System.out.print(chessBoardArray[0][k]);
            } else {
                System.out.println(chessBoardArray[0][k]);
            }
        }
        for (int k = 0; k < 8; k++) {
            if (k < 7) {
                System.out.print(chessBoardArray[1][k]);
            } else {
                System.out.println(chessBoardArray[1][k]);
            }
        }
        for (int k = 0; k < 8; k++) {
            if (k < 7) {
                System.out.print(chessBoardArray[2][k]);
            } else {
                System.out.println(chessBoardArray[2][k]);
            }
        }
        for (int k = 0; k < 8; k++) {
            if (k < 7) {
                System.out.print(chessBoardArray[3][k]);
            } else {
                System.out.println(chessBoardArray[3][k]);
            }
        }
        for (int k = 0; k < 8; k++) {
            if (k < 7) {
                System.out.print(chessBoardArray[4][k]);
            } else {
                System.out.println(chessBoardArray[4][k]);
            }
        }
        for (int k = 0; k < 8; k++) {
            if (k < 7) {
                System.out.print(chessBoardArray[5][k]);
            } else {
                System.out.println(chessBoardArray[5][k]);
            }
        }
        for (int k = 0; k < 8; k++) {
            if (k < 7) {
                System.out.print(chessBoardArray[6][k]);
            } else {
                System.out.println(chessBoardArray[6][k]);
            }
        }
        for (int k = 0; k < 8; k++) {
            if (k < 7) {
                System.out.print(chessBoardArray[7][k]);
            } else {
                System.out.println(chessBoardArray[7][k]);
            }
        }

    }

}