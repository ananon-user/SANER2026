package org.la4j;

import jbse2.meta.Analysis;

public class Matrix_mkString_Pose_main973 {

    public static void main(String[] args) throws Exception {
        try {
            Matrix matrix_LTA = Analysis.newSymbolObject("matrix_LTA", Matrix.class);
            java.text.NumberFormat formatter0 = Analysis.newSymbolObject("formatter0", java.text.NumberFormat.class);
            java.lang.String rowsDelimiter1 = Analysis.newSymbolObject("rowsDelimiter1", java.lang.String.class);
            java.lang.String columnsDelimiter2 = Analysis.newSymbolObject("columnsDelimiter2", java.lang.String.class);
            matrix_LTA.mkString(formatter0, rowsDelimiter1, columnsDelimiter2);
        } catch (Exception e) {
        }
    }
}
