package com.forobot.Utils;

import java.util.ArrayList;
import java.util.TreeSet;

/**
 * This class isn't serving any purpose, really, just dumping absolutely random methods here that I
 * needed during testing.
 * Neither of this methods are used in the program, most likely, so no documentation will be provided.
 * Although used methods will perhaps be documented, there's no guarantee as i'd probably find place
 * for them in other classes. :)
 */
public class MiscUtils {
    public static void FillFileWithRandomViewers(int count){
        ArrayList<String> randomLines = new ArrayList<>();
        for (int i = 1; i <= count; i++){
            String name = "viewer" + i;
            String amount = String.valueOf(randomWithRange(1, count));
            //randomLines.add(String.format("%s=%s", name, amount));
            randomLines.add(amount);
        }
        FileUtils.writeAllLinesToTheFile(randomLines, "D:\\treeset.txt");
    }

    public static int randomWithRange(int min, int max)
    {
        int range = (max - min) + 1;
        return (int)(Math.random() * range) + min;
    }

    public static ArrayList<Integer> strtoint(ArrayList<String> arrayList){
        ArrayList<Integer> integers = new ArrayList<>();
        for (String string : arrayList){
            integers.add(Integer.parseInt(string));
        }
        return integers;
    }

    public static ArrayList<String> inttostr(ArrayList<Integer> arrayList){
        ArrayList<String> strings = new ArrayList<>();
        for (Integer integer : arrayList){
            strings.add(String.valueOf(integer));
        }
        return strings;
    }

    public static ArrayList<String> treetolist(TreeSet<Integer> treeSet){
        ArrayList<String> arrayList = new ArrayList<>();
        for (Integer integer : treeSet.descendingSet()){
            arrayList.add(String.valueOf(integer));
        }
        return arrayList;
    }
}
