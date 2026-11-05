class Solution {

    public String encode(List<String> strs) {
        StringBuffer sb=new StringBuffer(100);
        for(String item: strs){
            sb.append(item);
            sb.append("`");
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> l=new ArrayList<>();
        StringBuffer sb2=new StringBuffer();
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch=='`'){
                l.add(sb2.toString());
                sb2.setLength(0);
            }
            else{
                sb2.append(ch);
            }
        }
        return l;
    }
}
