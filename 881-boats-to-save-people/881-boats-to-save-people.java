class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int result=0,i=0,j=people.length-1;
        while(i<=j){
            result++;
            if(people[i]+people[j]<=limit)
                i++;
            j--;
        }
        return result;
    }
}