class Solution {
    public boolean isValidSudoku(char[][] board) {
   int n = board.length;
   int subGridSize = 3;
   HashMap<Integer, Set<Character>> rowHash = new HashMap<>();
   HashMap<Integer, Set<Character>> columnHash = new HashMap<>();
   HashMap<Integer, Set<Character>> subGridHash = new HashMap<>();

   for (int i = 0; i < n; i++) {
   	rowHash.put(i, new HashSet<>());
   	columnHash.put(i, new HashSet<>());
   	subGridHash.put(i, new HashSet<>());
   }

   for (int i = 0; i < n; i++) {
   	for (int j = 0; j < n; j++) {

   		char ch = board[i][j];
   		if (ch == '.')
   			continue;

   		Set<Character> row = rowHash.get(i);
   		Set<Character> column = columnHash.get(j);
   		Set<Character> subGrid = subGridHash.get((i / subGridSize) * subGridSize + (j / subGridSize));

   		if (row.contains(ch) || column.contains(ch) || subGrid.contains(ch))
   			return false;

   		row.add(ch);
   		column.add(ch);
   		subGrid.add(ch);
   	}
   }
   return true;
}
}