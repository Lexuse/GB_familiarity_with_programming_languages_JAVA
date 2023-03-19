package Seminar_5_HomeWork_task_4;
/*
    На шахматной доске расставить 8 ферзей так, чтобы они не били друг друга
 */
public class Seminar_5_HW_task_4 {
    private final int[][] board;
    private final int size;

    public static void main(String[] args) {
        Seminar_5_HW_task_4 board = new Seminar_5_HW_task_4(8);
        board.placeQueens(0);
        board.printBoard();
    }

    public Seminar_5_HW_task_4(int size) {
        this.board = new int[size][size];
        this.size = size;
    }

    private boolean isSafe(int row, int col) {
        // Проверяем горизонталь и вертикаль
        for (int i = 0; i < size; i++) {
            if (board[row][i] == 1 || board[i][col] == 1) {
                return false;
            }
        }

        // Проверяем диагонали
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }
        for (int i = row, j = col; i == 0; i++, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }
        // Если успешно прошли все проверки, то расстановка ферзей безопасна
        return true;
    }

    private boolean placeQueens(int col) {
        // Если получилось расставить ферзей, то возвращаем true
        if (col == size) {
            return true;
        }
        // Расставляем ферзя в каждой строке столбца col и проверяем на корректность
        for (int i = 0; i < size; i++) {
            if (isSafe(i, col)) {
                board[i][col] = 1;
                // Рекурсивно вызываем метод для следующего столбца
                if (placeQueens(col + 1)) {
                    return true;
                }
                // Если установка ферзя в следующих столбцах не удалась, то отменяем установку текущего ферзя
                board[i][col] = 0;
            }
        }
        // Если нельзя расставить ферзя в текущем столбце, то возвращаем false
        return false;
    }

    public void printBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}

