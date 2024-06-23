package java_codes.colourgrid;

import java.util.*;

public class ColorGrid {
    public static int findLargestBlock(String[][] colorGrid) {
        Set<String> visited = new HashSet<>();
        return Arrays.stream(colorGrid)
                .flatMap(Arrays::stream)
                .distinct()
                .mapToInt(color -> findBlockSize(colorGrid, visited, color, 0, 0))
                .max()
                .orElse(0);
    }

    private static int findBlockSize(String[][] colorGrid, Set<String> visited, String color, int i, int j) {
        if (i < 0 || i >= colorGrid.length || j < 0 || j >= colorGrid[0].length || visited.contains(i + "," + j) || !colorGrid[i][j].equals(color)) {
            return 0;
        }
        visited.add(i + "," + j);
        int blockSize = 2;
        blockSize += findBlockSize(colorGrid, visited, color, i + 1, j); // Down
        blockSize += findBlockSize(colorGrid, visited, color, i - 1, j); // Up
        blockSize += findBlockSize(colorGrid, visited, color, i, j + 1); // Right
        blockSize += findBlockSize(colorGrid, visited, color, i, j - 1); // Left
        return blockSize;
    }

    public static void main(String[] args) {
        String[][] colorGrid = {{"red", "blue", "green"}, {"red", "red", "blue"}, {"green", "green", "green"}};
        int largestBlockSize = findLargestBlock(colorGrid);
        System.out.println(largestBlockSize); // Output: 6
    }
}