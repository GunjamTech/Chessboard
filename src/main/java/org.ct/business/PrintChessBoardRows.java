package org.ct.business;

import java.util.Arrays;
import java.util.List;

public class PrintChessBoardRows {

    public  String printChessBoardRows(String board){
        String[] rows = board.split("/");
        StringBuffer rep = new StringBuffer();
        if (rows.length == 8) {
            for (int i = 0; i < rows.length; i++) {

                String rowRepresentation = getRowRepresentation(rows[i]);
                rep.append(rowRepresentation);
                rep.append('\n');
                System.out.println(rowRepresentation);
            }
        } else {
            throw new IllegalArgumentException("Wrong number of rows");
        }
return  rep.toString();
    }

    private String getRowRepresentation(String row) {
        List<Character> validCharacters = Arrays.asList('p', 'k', 'q', 'b', 'n', 'r', 'P', 'K', 'Q', 'B', 'N', 'R');
        StringBuffer rowRepresentation = new StringBuffer();
        for (int i = 0; i < row.length(); i++) {
            if (validCharacters.contains(row.charAt(i))) {
                rowRepresentation = rowRepresentation.append(row.charAt(i));
            } else if (Character.isDigit(row.charAt(i))) {
                for (int j = 0; j < Integer.parseInt(String.valueOf(row.charAt(i))); j++) {
                    rowRepresentation.append('.');
                }
            } else {
                throw new IllegalArgumentException("Unexpected character");
            }
        }
        if (rowRepresentation.length() > 8) {
            throw new IllegalArgumentException("Wrong number of squares on row");
        }
        return rowRepresentation.toString();
    }
}
