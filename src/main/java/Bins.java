import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Bins{
private Map<Integer, Integer> trackerMap;

    public Bins(int min, int max){
        Map<Integer, Integer> newMap = new HashMap();
        for (int x = min; x <= max; x++){
            newMap.put(x, 0);
        }
        this.trackerMap = newMap;
    }

    public Integer getBin(int binNumber){
        return trackerMap.get(binNumber);
    }

    public void incrementBin(int binNumber){
        Integer number = trackerMap.get(binNumber);
        trackerMap.put(binNumber, number + 1);
    }
}















//package com.dice;
//
//import java.util.HashMap;
//import java.util.Map;
//
//public class Bins {
//    private Map<Integer, Integer> binResults;
//
//    public Bins(Integer minResult, Integer maxResult) {
//        Map newMap = new HashMap<Integer, Integer>();
//        for(int index = minResult; index <= maxResult; index++){
//            newMap.put(index, 0);
//        }
//        this.binResults = newMap;
//    }
//
//    public Integer getBin(Integer result){
//        return binResults.get(result);
//    }
//
//    public void incrementBin(Integer result){
//        Integer oldResult = binResults.get(result);
//        binResults.put(result, oldResult + 1);
//    }
//




