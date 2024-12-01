import java.util.*;
import java.io.*;
public class dayOne {
    public static void main(String[] args) {
        try {

            File file = new File("input.txt");
            Scanner s = new Scanner(file);
            
            ArrayList<Integer> leftList = new ArrayList<>();
            ArrayList<Integer> rightList = new ArrayList<>();
        
            while (s.hasNext()) {
                int left = s.nextInt();
                int right = s.nextInt();
                leftList.add(left);
                rightList.add(right);
            } // while
        
            Collections.sort(leftList);
            Collections.sort(rightList);
        
            int totalDistance = 0;
            for (int i = 0; i < leftList.size(); i++) {
                totalDistance += Math.abs(leftList.get(i) - rightList.get(i));
            } // for
        
            System.out.println(totalDistance);
            s.close();
            

        } catch (FileNotFoundException e){
            System.out.print(e);
        }

    }

} // dayOne