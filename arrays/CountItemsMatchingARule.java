import java.util.List;

void main() {
    List<List<String>> items = List.of(
    List.of("phone","blue","pixel"),
    List.of("computer","silver","phone"),
    List.of("phone","gold","iphone"));
    int ans = countMatches2(items, "type", "phone");
    System.out.println(ans);
    
}

public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
    int count = 0;
    for (List<String> list : items) {
        if (ruleKey.equals("type") && list.get(0).equals(ruleValue)) {
            count++;
            continue;
        }
        if (ruleKey.equals("color") && list.get(1).equals(ruleValue)) {
            count++;
            continue;
        }
        if (ruleKey.equals("name") && list.get(2).equals(ruleValue)) {
            count++;
            continue;
        }
    }
    return count;
}

// Optimized version
public int countMatches2(List<List<String>> items, String ruleKey, String ruleValue) {
    int column = 0;
    if (ruleKey.equals("type")) {
        column = 0;
    }
    if (ruleKey.equals("color")) {
        column = 1;
    }
    if (ruleKey.equals("name")) {
        column = 2;
    }

    int count = 0;
    int size = items.size();

    for (int i = 0; i < size; i++) {
        if (items.get(i).get(column).equals(ruleValue)) {
            count++;
        }
    }
    return count;
}    