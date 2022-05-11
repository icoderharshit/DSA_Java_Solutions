class Solution {
		public  Character[] arr = { 'a', 'e', 'i', 'o', 'u' };
		public List<List<Character>> list = new ArrayList<>();
		public  int countVowelStrings(int n) {
			List<Character> subList = new ArrayList<>();
			solve(n, 0, subList);
			return list.size();
		}
		public  void solve(int n, int start, List<Character> subList) {
            if (n == 0) {
				list.add(new ArrayList<>(subList));
				subList.remove(subList.size() - 1);
				return;
			} 
			for (int i = start; i < arr.length; i++) {
				subList.add(arr[i]);
				solve(n - 1, i, subList);
			}
			if (!subList.isEmpty())
				subList.remove(subList.size() - 1);
		}
	}