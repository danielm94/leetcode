package com.github.danielm94.medium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        final var capacity = 9;
        var rowSets = new ArrayList<Set<Character>>(capacity);
        var columnSets = new ArrayList<Set<Character>>(capacity);
        var quadrantSets = new ArrayList<Set<Character>>(capacity);
        fillListWithSets(rowSets, capacity);
        fillListWithSets(columnSets, capacity);
        fillListWithSets(quadrantSets, capacity);

        for (var row = 0; row < board.length; row++) {
            var rowSet = rowSets.get(row);
            for (var column = 0; column < board[row].length; column++) {
                var character = board[row][column];
                if (character == '.') continue;
                var columnSet = columnSets.get(column);
                var quadrantSet = quadrantSets.get(getQuadrantIndex(row, column));
                if (!rowSet.add(character)) return false;
                if (!columnSet.add(character)) return false;
                if (!quadrantSet.add(character)) return false;
            }
        }
        return true;
    }

    private void fillListWithSets(ArrayList<Set<Character>> rowSets, int n) {
        for (var i = 0; i < n; i++) {
            rowSets.add(new HashSet<>());
        }
    }

    private int getQuadrantIndex(int row, int col) {
        return (row / 3) * 3 + (col / 3);
    }
}
