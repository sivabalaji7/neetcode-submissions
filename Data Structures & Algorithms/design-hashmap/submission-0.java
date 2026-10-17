class MyHashMap {
    ArrayList<ArrayList<Integer>> arr;
    public MyHashMap() {
        arr=new ArrayList<ArrayList<Integer>>();
    }
    
    public void put(int key, int value) {
        for(ArrayList<Integer> sub:arr){
            if(!sub.isEmpty()){
                if(sub.get(0)==key){
                    sub.add(1,value);
                    return;
                }
            }
        }
        ArrayList<Integer> iarr=new ArrayList<>();
        iarr.add(key);
        iarr.add(value);
        arr.add(iarr);
    }
    
    public int get(int key) {
        for(ArrayList<Integer> sub:arr){
            if(!sub.isEmpty()){
                if(sub.get(0)==key) return sub.get(1);
            }
        }
        return -1;
    }
    
    public void remove(int key) {
        for(ArrayList<Integer> sub:arr){
            if(!sub.isEmpty()){
                if(sub.get(0)==key){
                    arr.remove(sub);
                    break;
                }
            }
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */