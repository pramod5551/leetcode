import java.util.ArrayList;

void main() {
    String sentence = "thequickbrownfoxjumpsoverthelazydog";
    System.out.println(checkIfPangram(sentence));
}

public boolean checkIfPangram(String sentence) {
    if (sentence.length() < 26) {
        return false;
    }
    List<String> list = new ArrayList<>(Arrays.asList("abcdefghijklmnopqrstuvwxyz".split("")));
    
    for (String string : Arrays.asList(sentence.split(""))) {
        list.remove(string);
    }
    return list.isEmpty();
}

// Optimized way - using char
public boolean checkIfPangram2(String sentence) {
    if (sentence.length() < 26) {
        return false;
    }
    char ch = 'a';
    for (int i = 0; i < 26; i++) {
        if (sentence.contains(String.valueOf(ch))) {
            ch++;
        } else {
            return false;
        }
    }
    return true;
}