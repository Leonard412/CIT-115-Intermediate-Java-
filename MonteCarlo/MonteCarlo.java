/*

 */

package montecarlo;

import java.util.*;

public class MonteCarlo {
    


    public static void main(String[] args) {
        Random rand = new Random();

        int tests = 100000;
        int collisionCount = 0;

        for(int people = 10; people <= 100; people += 10)
        {
            collisionCount=0;
            for(int runs = 0; runs < tests; runs++)
            {
                Set<Integer> birthdays = new HashSet<>(people);
                for(int i = 0; i < people;i++)
                    birthdays.add(rand.nextInt(365));
                if(birthdays.size()!= people) collisionCount++;
            }
            System.out.println("Collisions " + collisionCount);
            float prob = (float)collisionCount /(float) tests;

            System.out.println("After " + tests + " tests there were " +
                               collisionCount + " occurrences of shared " +
                               " birthdays in a set of " + people + " people.");
            System.out.println("Probability : " + prob);
    }
  }  
    
}
