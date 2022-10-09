package pen;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Solution {

    public static void main(String[] args)
    {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        solve(arrayList,2);
    }

    public static int solve(ArrayList<Integer> A, int B) {
        Map<Integer,Integer> noWaysMap = new HashMap<Integer,Integer>();

        return findWays(A,0,noWaysMap);
    }

    //1 2 1 2 2()

    public static int findWays(ArrayList<Integer> assignments,int startIndex,Map<Integer,Integer> noWaysMap){
        if(startIndex >= assignments.size()){
            noWaysMap.put(startIndex,1);
            return 1;
        }
        if(noWaysMap.containsKey(startIndex)){
            return noWaysMap.get(startIndex);
        }
        HashSet<Integer> subjects = new HashSet<Integer>();
        int currIndex = startIndex;
        int currentWays = 0;
        while(currIndex < assignments.size() && !subjects.contains(assignments.get(currIndex))){
            currentWays += findWays(assignments,currIndex+1,noWaysMap);
            subjects.add(assignments.get(currIndex));
            currIndex++;
        }
        noWaysMap.put(startIndex,currentWays);
        return currentWays;
    }

}

