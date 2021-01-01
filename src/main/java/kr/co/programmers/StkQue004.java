package kr.co.programmers;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StkQue004 {

    private static class Printed implements Comparable<Printed> {

        private final int id;
        private final int priority;

        public Printed(int id, int priority) {
            this.id = id;
            this.priority = priority;
        }

        public int getId() {
            return this.id;
        }

        @Override
        public int compareTo(Printed o) {
            return o.priority - this.priority;
        }
    }

    private static class Printer {

        private final List<Printed> list;
        private int count = 0;

        public Printer(int[] priorities) {
            this.list = IntStream.range(0, priorities.length)
                    .mapToObj(id -> new Printed(id, priorities[id]))
                    .collect(Collectors.toList());
        }

        private boolean validateNextPrinted() {
            Printed next = list.get(0);
            return list.stream()
                    .anyMatch(printed -> next.compareTo(printed) > 0);
        }

        public Printed print() {
            while (validateNextPrinted()) {
                Printed next = list.remove(0);
                list.add(next);
            }
            count++;
            return list.remove(0);
        }

        public int getCount() {
            return this.count;
        }
    }

    public static int solve(int[] priorities, int location) {
        Printer printer = new Printer(priorities);

        Printed printed = printer.print();
        while (printed.getId() != location) {
            printed = printer.print();
        }

        return printer.getCount();
    }
}
