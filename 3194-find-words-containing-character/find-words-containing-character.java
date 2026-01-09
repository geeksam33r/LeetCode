class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<words.length;i++){
            int n = words[i].length();
            for(int j=0;j<n;j++){
                if (words[i].charAt(j) == x){
                    arr.add(i);
                    break;
                }
            }
        }return arr;
    }
}