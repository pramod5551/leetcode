import java.util.ArrayList;

void main() {
    String sentence = "thequickbrownfoxjumpsover";
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