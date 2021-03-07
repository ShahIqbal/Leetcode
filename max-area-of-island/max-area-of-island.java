class Solution {
        //https://leetcode.com/problems/max-area-of-island/
    public int maxAreaOfIsland(int[][] grid) {
       int maxArea = 0;
       int maxRow = grid.length;
       int maxColumn = grid[0].length;
       for(int row = 0; row < grid.length; row++) {
           for(int column = 0; column < grid[0].length; column++) {
               if(grid[row][column] == 1) {
                    int islandArea = 1;
                    Queue<int[]> island = new ArrayDeque<>();
                    island.add(new int[]{row, column});
                    grid[row][column] = 0;
                    while(!island.isEmpty()) {
                        int[] pair = island.poll();
                        int rowIsland = pair[0];
                        int columnIsland = pair[1];
                        if(rowIsland - 1 >= 0 && grid[rowIsland - 1][columnIsland] == 1) {
                            island.add(new int[]{ rowIsland - 1, columnIsland});
                            islandArea++;
                            grid[rowIsland-1][columnIsland] = 0;
                        }
                        if(rowIsland + 1 < maxRow && grid[rowIsland + 1][columnIsland] == 1) {
                            island.add(new int[]{ rowIsland + 1, columnIsland});
                            islandArea++;
                            grid[rowIsland+1][columnIsland] = 0;
                        }
                        if(columnIsland - 1 >= 0 && grid[rowIsland][columnIsland - 1] == 1) {
                            island.add(new int[]{ rowIsland, columnIsland - 1});
                            islandArea++;
                            grid[rowIsland][columnIsland-1] = 0;
                        }
                        if(columnIsland + 1 < maxColumn && grid[rowIsland][columnIsland+1] == 1) {
                            island.add(new int[]{ rowIsland, columnIsland+1});
                            islandArea++;
                            grid[rowIsland][columnIsland+1] = 0;
                        }
                    }
                    maxArea = Math.max(islandArea, maxArea);
               }
           }
       }

       return maxArea;
    }
}