package main.thinkingInJava.collections;

import java.util.*;

public class ListPerformans {
    static Random rand = new Random();
    static int reps = 1000;
    static List<Test2<List<Integer>>> tests =
            new ArrayList<>();
    static List<Test2<LinkedList<Integer>>> qTests =
            new ArrayList<>();

    static {
        tests.add(new Test2<List<Integer>>("add") {
            int test(List<Integer> list, TestParam tp) {
                int loops = tp.loops;
                int listSize = tp.size;
                for (int i = 0; i < loops; i++) {
                    list.clear();
                    for (int j = 0; j < listSize; j++)
                        list.add(j);
                }
                return loops * listSize;
            }
        });
        tests.add(new Test2<List<Integer>>("get") {
            int test(List<Integer> list, TestParam tp) {
                int loops = tp.loops * reps;
                int listSize = list.size();
                for (int i = 0; i < loops; i++)
                    list.get(rand.nextInt(listSize));
                return loops;
            }
        });
        tests.add(new Test2<List<Integer>>("set") {
            int test(List<Integer> list, TestParam tp) {
                int loops = tp.loops * reps;
                int listSize = list.size();
                for (int i = 0; i < loops; i++)
                    list.set(rand.nextInt(listSize), 47);
                return loops;
            }
        });
        tests.add(new Test2<List<Integer>>("iteradd") {
            int test(List<Integer> list, TestParam tp) {
                final int LOOPS = 1000000;
                int half = list.size() / 2;
                ListIterator<Integer> it = list.listIterator(half);
                for (int i = 0; i < LOOPS; i++)
                    it.add(47);
                return LOOPS;
            }
        });
        tests.add(new Test2<List<Integer>>("insert") {
            int test(List<Integer> list, TestParam tp) {
                int loops = tp.loops;
                for (int i = 0; i < loops; i++)
                    list.add(5, 47); // Minimize random-access cost
                return loops;
            }
        });
        tests.add(new Test2<List<Integer>>("remove") {
            int test(List<Integer> list, TestParam tp) {
                int loops = tp.loops;
                int size = tp.size;
                for (int i = 0; i < loops; i++) {
                    list.clear();
                    list.addAll(new CountingIntegerList(size));
                    while (list.size() > 5)
                        list.remove(5); // Minimize random-access cost
                }
                return loops * size;
            }
        });
        qTests.add(new Test2<LinkedList<Integer>>("addFirst") {
            int test(LinkedList<Integer> list, TestParam tp) {
                int loops = tp.loops;
                int size = tp.size;
                for (int i = 0; i < loops; i++) {
                    list.clear();
                    for (int j = 0; j < size; j++)
                        list.addFirst(47);
                }
                return loops * size;
            }
        });
        qTests.add(new Test2<LinkedList<Integer>>("addLast") {
            int test(LinkedList<Integer> list, TestParam tp) {
                int loops = tp.loops;
                int size = tp.size;
                for (int i = 0; i < loops; i++) {
                    list.clear();
                    for (int j = 0; j < size; j++)
                        list.addLast(47);
                }
                return loops * size;
            }
        });
        qTests.add(
                new Test2<LinkedList<Integer>>("rmFirst") {
                    int test(LinkedList<Integer> list, TestParam tp) {
                        int loops = tp.loops;
                        int size = tp.size;
                        for (int i = 0; i < loops; i++) {
                            list.clear();
                            list.addAll(new CountingIntegerList(size));
                            while (list.size() > 0)
                                list.removeFirst();
                        }
                        return loops * size;
                    }
                });
        qTests.add(new Test2<LinkedList<Integer>>("rmLast") {
            int test(LinkedList<Integer> list, TestParam tp) {
                int loops = tp.loops;
                int size = tp.size;
                for (int i = 0; i < loops; i++) {
                    list.clear();
                    list.addAll(new CountingIntegerList(size));
                    while (list.size() > 0)
                        list.removeLast();
                }
                return loops * size;
            }
        });
    }

    static class ListTester extends Tester2<List<Integer>> {
        public ListTester(List<Integer> container,
                          List<Test2<List<Integer>>> tests) {
            super(container, tests);
        }

        @Override
        protected List<Integer> initialize(int size) {
            container.clear();
            container.addAll(new CountingIntegerList(size));
            return container;
        }

        // Convenience method:
        public static void run(List<Integer> list,
                               List<Test2<List<Integer>>> tests) {
            new ListTester(list, tests).timedTest();
        }
    }

    public static void main(String[] args) {
        if (args.length > 0)
            Tester2.defaultParams = TestParam.array(args);
        Tester2<List<Integer>> arrayTest =
                new Tester2<List<Integer>>(null, tests.subList(1, 3)) {
                    @Override
                    protected List<Integer> initialize(int size) {
                        Integer[] ia = Generated.array(Integer.class,
                                new CountingGenerator.Integer(), size);
                        return Arrays.asList(ia);
                    }
                };
        arrayTest.setHeadLine("Array as List");
        arrayTest.timedTest();
        Tester2.defaultParams = TestParam.array(
                10, 5000, 100, 5000, 1000, 1000, 10000, 200);
        if (args.length > 0)
            Tester2.defaultParams = TestParam.array(args);
        ListTester.run(new ArrayList<Integer>(), tests);
        ListTester.run(new LinkedList<Integer>(), tests);
        ListTester.run(new Vector<Integer>(), tests);
        Tester2.fieldWidth = 12;
        Tester2<LinkedList<Integer>> qTest =
                new Tester2<>(new LinkedList<>(), qTests);
        qTest.setHeadLine("Queue tests");
        qTest.timedTest();
    }
}
class Generated{
    static Integer[] array(Class<?> type, Object obj ,int size){
        Integer[] result =new Integer[10];
        return result;
    }
}
class CountingGenerator{
    static class Integer{

    }
}

class CountingIntegerList extends AbstractCollection<Integer>{

    public CountingIntegerList(int size){

    }

    @Override
    public Iterator<Integer> iterator() {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }
}
