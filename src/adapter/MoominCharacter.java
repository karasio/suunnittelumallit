package adapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class MoominCharacter {
    public abstract String getName();
    public abstract String getCharacteristic();

    public String getVerifiedMoominName(String NAME) {
        String name = NAME.toLowerCase();
        List<String> cryptedList = encrypt(name, combine());
        String cryptedWord = "";
        for (int i = 0; i < cryptedList.size(); i++) {
            cryptedWord += cryptedList.get(i);
        }
        return cryptedWord;
    }

    // Helper functions for the ultimate Moomin test (getVerifiedMoominName)
    public List<String> encrypt(String decrypted, Map<String, String> cryptionValues) {
        List<String> list = new ArrayList<>();

        for( char c : decrypted.toCharArray()) {
            list.add(cryptionValues.get(Character.toString(c)));
        }
        return list;
    }

    public Map<String, String> combine() {
        String[] alpha = createAlphaArray();
        String[] fibo = createFiboArray();
        Map<String, String> charToFibo = new HashMap<>();

        for (int i = 0; i < 26; i++) {
            charToFibo.put(alpha[i], fibo[i]);
        }

        return  charToFibo;
    }


    public String[] createAlphaArray() {
        String[] a = new String[26];
        int i = 0;
        for(char alphabet = 'a'; alphabet <= 'z'; alphabet++) {
            a[i] = Character.toString(alphabet);
            i++;
        }
        return a;
    }

    public String[] createFiboArray() {
        String[] array = new String[26];
        array[0] = "a";
        array[1] = "m";
        String earlier = array[0];
        String current = array[1];

        for (int i = 2; i <= 25; i++) {
            array[i] = current + earlier;
            earlier = array[i-1];
            current = array[i];
        }
        return array;
    }
}
