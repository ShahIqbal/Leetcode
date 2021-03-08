

import java.util.ArrayDeque;
import java.util.Queue;

class Solution {
    public int numIslands(char[][] grid) {
        int num = 0;
        int totalRow = grid.length;
        int totalCol = grid[0].length;
        for(int row = 0; row < totalRow; row++) {
            for(int col = 0; col < totalCol; col++) {
                if(grid[row][col] == '1') {
                    num++;
                    grid[row][col] = '0';
                    Queue<int[]> queue = new ArrayDeque<>();
                    queue.add(new int[]{row, col});

                    while(!queue.isEmpty()) {
                        int[] pair = queue.poll();
                        int rowPair = pair[0];
                        int colPair = pair[1];
                        if((rowPair - 1) >= 0 && grid[rowPair - 1][colPair] == '1') {
                            queue.add(new int[]{rowPair - 1, colPair});
                            grid[rowPair - 1][colPair] = '0';
                        }
                        if((rowPair + 1) < totalRow && grid[rowPair + 1][colPair] == '1') {
                            queue.add(new int[]{rowPair + 1, colPair});
                            grid[rowPair + 1][colPair] = '0';
                        }
                        if((colPair - 1) >= 0 && grid[rowPair][colPair - 1] == '1') {
                            queue.add(new int[]{rowPair, colPair-1});
                            grid[rowPair][colPair - 1] = '0';
                        }
                        if((colPair + 1) < totalCol && grid[rowPair][colPair + 1] == '1') {
                            queue.add(new int[]{rowPair, colPair + 1});
                            grid[rowPair][colPair + 1] = '0';
                        }
                    }
                }
            }
        }

        return num;
    }
}