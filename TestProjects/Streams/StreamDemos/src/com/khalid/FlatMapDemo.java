package com.khalid;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapDemo {
    public static void main(String[] args) {
        List<Integer> arraysList= Arrays.asList(1,2,3,4,5,6);
        List<Integer> arrayList2=arraysList.stream().map(n->n+10).collect(Collectors.toList());
        System.out.println(arrayList2);

        //! Flat map
        List<Integer> l1=Arrays.asList(1,2);
        List<Integer> l2=Arrays.asList(3,4);
        List<Integer> l3=Arrays.asList(5,6);

        List<List<Integer>> finalList=Arrays.asList(l1,l2,l3);

        List<Integer> finalResult=finalList.stream().flatMap(x->x.stream().map(n->n+10)).collect(Collectors.toList());
        System.out.println(finalResult);

        //!Example 2: print player names from all the collections
        List<String> teamA=Arrays.asList("Scott","David","John");
        List<String> teamB=Arrays.asList("Mary","Luna","Tom");
        List<String> teamC=Arrays.asList("Ken","Jony","Kitty");
        List<List<String>>playersInWorldCup=new ArrayList();
        playersInWorldCup.add(teamA);
        playersInWorldCup.add(teamB);
        playersInWorldCup.add(teamC);

        List<String> allPlayers=playersInWorldCup.stream().flatMap(x->x.stream()).collect(Collectors.toList());
        System.out.println(allPlayers);

        playersInWorldCup.stream().flatMap(x->x.stream()).forEach(s-> System.out.print(s+" "));






    }
}
