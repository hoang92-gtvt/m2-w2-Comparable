package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BadExampleOfComparable {
    public static void main(String... args) {
        List<TestSort> characters = new ArrayList<>();
        TestSort hs1 = new TestSort("Hoàng", "1", 29);
        TestSort hs2 = new TestSort("yến", "2", 28);
        TestSort hs3 = new TestSort("Yến", "3", 18);
        characters.add(hs1);
        characters.add(hs2);
        characters.add(hs3);
        System.out.println("Danh sách ban đầu");
        for (TestSort hs :characters
        ) {
            System.out.println(hs);

        }


//        Collections.sort(characters, new Comparator<TestSort>() {
//            @Override
//            public int compare(TestSort o1, TestSort o2) {
//                return o1.getName().compareTo(o2.getName()) ;
//            }
//        });


        characters.sort((p1,p2)->{
            if(p1.getName().compareTo(p2.getName())>0){
                return 1;
            }else if(p1.getName().compareTo(p2.getName())<0){
                return -1;
            }else {
                if(p1.getAge()-p2.getAge()>0){
                    return 1;
                }else if (p1.getAge()-p2.getAge()>0){
                    return -1;
                }else return 0;
            }
        });
        System.out.println("-------------------------");
        System.out.println("Danh sách trước sau khi sort");
        for (TestSort hs :characters
        ) {
            System.out.println(hs);

        }

    }

}
