package leetcode.opu.practice;

import java.util.ArrayList;
import java.util.List;

//2129. Capitalize the Title
public class CapitalizeTitle {
    public String capitalizeTitle(String title) {
        List<String> result = new ArrayList();
        for (String chunk : title.split(" ")) {
            if (chunk.length() < 3) {
                result.add(chunk.toLowerCase());
            } else {
                char[] ch = chunk.toLowerCase().toCharArray();
                ch[0] ^= 32;
                result.add(String.valueOf(ch));
            }
        }

        return String.join(" ", result);
    }
}
