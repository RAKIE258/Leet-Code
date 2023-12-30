//2942. Find Words Containing Character

class Count {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> l = new ArrayList<>();
        int c=0;
        for(String i : words)
        {
            if(i.indexOf(x)>=0){
                l.add(c);
        }
            c++;
        }
        return l;
    }
}