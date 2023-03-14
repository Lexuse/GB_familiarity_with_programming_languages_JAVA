package Seminar_3_HomeWork_task_1;

import static java.lang.System.arraycopy;

/*
    Реализовать алгоритм сортировки слиянием
 */
public class Seminar_3_HW_task_1 {
    public static void main(String[] args) {
        int[] m1 = new int[] {21, 23, 24, 40, 75, 76, 78, 77, 900, 2100, 2200, 2300, 2400, 2500};
        int[] m2 = new int[] {10, 11, 41, 50, 65, 86, 98, 101, 190, 1100, 1200, 3000, 5000};
        int[] m3 = new int[m1.length + m2.length];

        int i=0, j=0, k=0;
        while(i < m1.length && j < m2.length) {
            m3[k++] = m1[i] < m2[j] ? m1[i++] : m2[j++];
        }
        if(i< m1.length) {
            arraycopy(m1, i, m3, k, m1.length - i);
        } else if(j< m2.length) {
            arraycopy(m2, j, m3, k, m2.length - j);
        }

        for (int l = 0; l < m3.length; l++) {
            System.out.print(m3[l] + ", ");
        }

    }
}
