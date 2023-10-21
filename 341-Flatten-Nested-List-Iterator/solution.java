public class NestedIterator implements Iterator<Integer> {
    List<Integer> FlattenList=null;
    int current=0;
    public NestedIterator(List<NestedInteger> nestedList) {
        FlattenList=new ArrayList<>();
       for(NestedInteger integer:nestedList){
            helper(integer);
       }
    }

    @Override
    public Integer next() {
        return FlattenList.get(current++); 
    }

    @Override
    public boolean hasNext() {
        return current<FlattenList.size();
    }
    public void helper(NestedInteger value){
        if(value.isInteger()){
            FlattenList.add(value.getInteger());
        }
        else{
            for(NestedInteger integer:value.getList()){
              helper(integer);  
            }
        }
    }
}