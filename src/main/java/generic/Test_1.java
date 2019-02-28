package generic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class Container <T extends Test_1> {

//    Container<Product> c1;
//    Container<Camera> c2;
//    Container<Phone> c3;

    Container<Test_1> c4;
}


public class Test_1 implements Comparable {
    void print(Collection<Object> list){
        for (Object object : list) {
            System.out.println(object.toString());
        }
    }

    public void test1() {

        List<String> strList = new ArrayList<>();
        List<Object> objList = new ArrayList<>();

        print(Collections.singleton(strList));
        print(objList);

        /*List<String> list = new ArrayList<>();
        List rawlist = new ArrayList();

//        rawlist = list;
//        list = rawlist;

//        rawlist = list;
        rawlist.add("8");

//        list.add("25");


        String s = (String) rawlist.get(0);
        System.out.println(s);*/
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
