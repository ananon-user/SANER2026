package org.la4j;

import jbse2.meta.Analysis;

public class Matrix_select_Pose_main939 {

    public static void main(String[] args) throws Exception {
        try {
            Matrix matrix_LTA = Analysis.newSymbolObject("matrix_LTA", Matrix.class);
            int[] rowIndices0 = Analysis.newSymbolObject("rowIndices0", int[].class);
            int[] columnIndices1 = Analysis.newSymbolObject("columnIndices1", int[].class);
            matrix_LTA.select(rowIndices0, columnIndices1);
        } catch (Exception e) {
        }
    }
}
