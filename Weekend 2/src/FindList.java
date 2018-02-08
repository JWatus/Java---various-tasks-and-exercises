import java.util.*;

class FindList {

    public static List<String> findChildren(List<String> santasList, List<String> children) {

        List<String> goodChildrenList = new ArrayList<>();

        for (int i = 0; i < santasList.size(); i++) {
            if (children.contains(santasList.get(i))) {

                if (goodChildrenList.contains(santasList.get(i))) {
                    continue;
                } else {
                    goodChildrenList.add(santasList.get(i));
                }
            }
        }

        Collections.sort(goodChildrenList);

        System.out.println(goodChildrenList);

        return goodChildrenList;
    }
}

/*
        Christmas is comming, and Santa has a long list to go through, to find who deserves presents
        for the big day. Go through a list of children, and return a list containing every child who appeared on
        Santa's list. Do not add any child more than once. Output should be sorted. For java, use Lists.

        Comparison should be case sensitive, and the returned list return only one copy of each name. "Sam" and "sam"
        is allowed, but "sAm" and "sAm" is not.

*/



















//package findList;
//
//import java.util.*;
//
//public class findList {
//
//    public List<String> findChildren(List<String> santasList, List<String> children) {
//
//        List<String> list = new ArrayList<>();
//
//        for (int i = 0; i < children.size(); i++) {
//
//            for (int j = 0; j < santasList.size(); j++) {
//
//                if (i != j && children.get(i).equals(santasList.get(j)) && santasList.size() <= children.size()) {
//                    list.add(santasList.get(j));
//                }
//
//                for (int z = 0; z < list.size(); z++) {
//
//                    for (int x = 0; x < list.size(); x++) {
//
//                        if (z != x && list.get(z).equals(list.get(x))) {
//
//                            list.remove(z);
//                        }
//                    }
//                }
//            }
//        }
//
//        Collections.sort(list);
//
//        System.out.println(list);
//
//        return list;
//    }
//}
