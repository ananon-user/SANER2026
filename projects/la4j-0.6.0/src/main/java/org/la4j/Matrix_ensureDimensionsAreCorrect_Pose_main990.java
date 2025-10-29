package org.la4j;

import jbse2.meta.Analysis;

public class Matrix_ensureDimensionsAreCorrect_Pose_main990 {

    public static void main(String[] args) throws Exception {
        try {
            Matrix matrix_LTA = Analysis.newSymbolObject("matrix_LTA", Matrix.class);
            int rows0 = Analysis.newSymbolInt("rows0");
            int columns1 = Analysis.newSymbolInt("columns1");
            matrix_LTA.ensureDimensionsAreCorrect(rows0, columns1);
        } catch (Exception e) {
        }
    }
}
