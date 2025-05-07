package problems.greatnessarray;

import java.util.Arrays;

//leetcode - 455
public class AssignCookie {
    public int findContentChildren(int[] g, int[] s) {
        int contentChild = 0;

        Arrays.sort(g);
        Arrays.sort(s);

        for(int i = 0, j = 0;i < g.length; i++){
            while(j < s.length){
                if(g[i]<=s[j]){
                    j++;
                    contentChild++;
                    break;
                }else {
                    j++;
                }
            }
        }
        return contentChild;
    }
}
