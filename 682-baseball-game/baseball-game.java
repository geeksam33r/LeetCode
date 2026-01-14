class Solution {
    public int calPoints(String[] operations) {
        List<Integer> list=new ArrayList<>();
        for (String op:operations){
            if(op.equals("C")){
                list.remove(list.size()-1);
            }
            else if(op.equals("D")){
                int last=list.get(list.size()-1);
                list.add(last*2);
            }
            else if(op.equals("+")){
                int size=list.size();
                int sum=list.get(size-1)+list.get(size-2);
                list.add(sum);
            }
            else{
                list.add(Integer.parseInt(op));
            }
        }
        int total=0;
        for (int Score:list){
            total+=Score;
        }
        return total;
        
    }
}