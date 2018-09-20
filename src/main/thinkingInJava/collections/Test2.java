package main.thinkingInJava.collections;

import java.util.List;

public abstract class Test2<C> {
    String name;

    public Test2(String name){
        this.name = name;
    }

    abstract int test(C container, TestParam tp);
}

class TestParam{
    final int size;
    final int loops;

    public TestParam(int size, int loops){
        this.size=size;
        this.loops=loops;
    }

    static TestParam[] array(int...params){
        int size = params.length/2;
        TestParam[] result =new TestParam[size];
        int n=0;
        for (int i = 0; i <size ; i++) {
            result[i] = new TestParam(params[n++],params[n++]);
        }
        return result;
    }

    static TestParam[] array(String[] params){
        int[] vals = new int[params.length];
        for (int i = 0; i <vals.length; i++) {
            vals[i] = Integer.decode(params[i]);
        }
        return array(vals);
    }

}
class Tester2<C>{
    public static int fieldWidth = 8;
    public static TestParam[] defaultParams = TestParam.array(10,5000, 100, 5000, 1000, 5000, 10000);

    protected C container;
    protected C initialize(int size){return container; }
    private String headLine = "";
    private List<Test2<C>> tests;

    private static String stringField(){
        return "%"+fieldWidth+"s";
    }

    private static String numberField(){
        return "%"+fieldWidth+"d";
    }

    private static int sizeWidth = 5;
    private static String sizeField = "%" + sizeWidth + "s";

    private TestParam[] paramList = defaultParams;

    public Tester2(C container, List<Test2<C>> tests){
        this.container=container;
        this.tests =tests;
        if(container!=null){
            headLine = container.getClass().getSimpleName();
        }
    }
    public Tester2(C container, List<Test2<C>> tests, TestParam[] paramList){
        this(container, tests);
        this.paramList=paramList;
    }

    public void setHeadLine(String headLine) {
        this.headLine = headLine;
    }
    public static <C> void run(C container, List<Test2<C>> tests ){
        new Tester2<>(container,tests).timedTest();
    }
    public static <C> void run(C container, List<Test2<C>> tests, TestParam[] params ){
        new Tester2<>(container,tests, params).timedTest();
    }

    private void displayHeader(){
        int width = fieldWidth * tests.size() + sizeWidth;
        int dashLength = width - headLine.length() - 1;
        StringBuilder head = new StringBuilder(width);
        for(int i = 0; i < dashLength/2; i++)
            head.append('-');
        head.append(' ');
        head.append(headLine);
        head.append(' ');
        for(int i = 0; i < dashLength/2; i++)
            head.append('-');
        System.out.println(head);
// Print column headers:
        System.out.format(sizeField, "size");
        for(Test2 test : tests)
            System.out.format(stringField(), test.name);
        System.out.println();
    }
    public void timedTest() {
        displayHeader();
        for (TestParam param : paramList) {
            System.out.format(sizeField, param.size);
            for (Test2<C> test : tests) {
                C container = initialize(param.size);
                long start = System.nanoTime();
                int reps = test.test(container, param);
                long duration = System.nanoTime() - start;
                long timePerRep = duration / reps;
                System.out.format(numberField(), timePerRep);
            }
            System.out.println();
        }
    }
}