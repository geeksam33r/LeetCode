class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> result = new ArrayList<>();
        backtrack(s, 0, 0, "", result);
        return result;
    }

    private void backtrack(String s, int index, int parts, String current, List<String> result) {
        // If 4 parts are formed and string is fully used
        if (parts == 4 && index == s.length()) {
            result.add(current.substring(0, current.length() - 1)); // remove last dot
            return;
        }

        // If invalid state
        if (parts == 4 || index == s.length()) return;

        for (int len = 1; len <= 3; len++) {
            if (index + len > s.length()) break;

            String part = s.substring(index, index + len);

            // Skip invalid parts
            if ((part.startsWith("0") && part.length() > 1) || Integer.parseInt(part) > 255) {
                continue;
            }

            backtrack(s, index + len, parts + 1, current + part + ".", result);
        }
    }
}