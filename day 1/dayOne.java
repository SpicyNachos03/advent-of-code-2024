import java.util.*;
import java.io.*;
public class dayOne {
    public static void main(String[] args) {
        try {

            File file = new File("input.txt");
            Scanner s = new Scanner(file);
            
            ArrayList<Integer> leftList = new ArrayList<>();
            ArrayList<Integer> rightList = new ArrayList<>();
            HashMap<Integer, Integer> rightMap = new HashMap<>();
            while (s.hasNext()) {
                int left = s.nextInt();
                int right = s.nextInt();
                leftList.add(left);
                rightList.add(right);
                if (rightMap.containsKey(right)) {
                    rightMap.put(right, rightMap.get(right) + 1);
                } else {
                    rightMap.put(right, 1);
                }
            } // while
        
            Collections.sort(leftList);
            Collections.sort(rightList);
        
            int locationIdOne = 0;
            int locationIdTwo = 0;
            for (int i = 0; i < leftList.size(); i++) {
                locationIdOne += Math.abs(leftList.get(i) - rightList.get(i));
                if (rightMap.containsKey(leftList.get(i))) {
                    locationIdTwo += leftList.get(i) * rightMap.get(leftList.get(i));
                } 
            } // for
        
            System.out.println("ID One: " + locationIdOne);
            System.out.println("ID Two: " + locationIdTwo);
            s.close();
            

        } catch (FileNotFoundException e){
            System.out.print(e);
        }

    }

} // dayOne