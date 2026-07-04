// Last updated: 7/4/2026, 2:45:14 PM
class Person {
    String names;
    int heights;

    Person(String names, int heights) {
        this.names = names;
        this.heights = heights;
    }
}

class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int n= names.length;

        Person[] peoples= new Person[n];

        for(int i=0;i<n;i++){
           peoples[i]= new Person(names[i],heights[i]);
        }

        for (int i =0 ;i<n;i++){
            Person current = peoples[i];
            int j = i-1;

            while(j>=0 && peoples[j].heights < current.heights){
                peoples[j+1]= peoples[j];
                j--;
            }

            peoples[j+1]= current;
        }

        String[] ans = new String[n];

        for(int i=0;i<n;i++){
           ans[i]=peoples[i].names;
        }

        return ans;

    }
}