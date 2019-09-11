package KaprekarsNumber;

import java.util.*;

public class ExerciseKeprekarsConstant {

    public int returnKeprearsNumber2(int num) {

        int counter = 0;

        do {
            if (num < 1000)
                num = num * 10;
            counter++;
            List<Integer> list = new ArrayList<>();
            list.add(Integer.parseInt(Integer.toString(num).substring(0, 1)));
            list.add(Integer.parseInt(Integer.toString(num).substring(1, 2)));
            list.add(Integer.parseInt(Integer.toString(num).substring(2, 3)));
            list.add(Integer.parseInt(Integer.toString(num).substring(3, 4)));
            list.sort(Comparator.naturalOrder());

            int a = list.get(0) * 1000 + list.get(1) * 100 + list.get(2) * 10 + list.get(3);
            int b = list.get(3) * 1000 + list.get(2) * 100 + list.get(1) * 10 + list.get(0);
            if (a > b) {
                num = a - b;

            } else {
                num = b - a;
            }
        }
        while (num != 6174);
        return counter;
    }

    private int returnKeprearsNumber(int num, int i) {


        if (num == 6174) {
            return i;

        } else {

            List<Integer> lista = new ArrayList<>();
            lista.add(Integer.parseInt(Integer.toString(num).substring(0, 1)));
            lista.add(Integer.parseInt(Integer.toString(num).substring(1, 2)));
            lista.add(Integer.parseInt(Integer.toString(num).substring(2, 3)));
            lista.add(Integer.parseInt(Integer.toString(num).substring(3, 4)));
            lista.sort(Comparator.naturalOrder());
            int a1 = lista.get(0) * 1000 + lista.get(1) * 100 + lista.get(2) * 10 + lista.get(3);
            int b2 = lista.get(3) * 1000 + lista.get(2) * 100 + lista.get(1) * 10 + lista.get(0);

            if (a1 > b2) {
                num = a1 - b2;
                return returnKeprearsNumber(num, ++i);
            } else {
                num = b2 - a1;
                return returnKeprearsNumber(num, ++i);
            }
        }

    }

    public static void main(String[] args) {
        ExerciseKeprekarsConstant ex = new ExerciseKeprekarsConstant();

        System.out.println(ex.returnKeprearsNumber2(4560));
    }

}