/**
 * 
 */
package main;
import java.util.*;

/**
 * @author esangav
 *
 */
public class DemoTest {
    public int solution(int[] A) {
        
        // using "Set"
        Set<Integer> set = new HashSet<>();
        
        for(int i=0; i<A.length; i++){
            // note: using "Math.abs(int)"
            if( set.contains( Math.abs(A[i]) ) == false ){
                set.add( Math.abs(A[i]) );
            }
            else{
                // do nothing (already existed in the set)
            }
        }
        System.out.printf("Broj stringova je %d%n");
        return set.size();
     }
}
