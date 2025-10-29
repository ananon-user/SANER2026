package org.la4j;

import jbse2.meta.Analysis;

public class Matrix_swapColumns_Pose_main888 {

    public static void main(String[] args) throws Exception {
        try {
            Matrix matrix_LTA = Analysis.newSymbolObject("matrix_LTA", Matrix.class);
            int i0 = Analysis.newSymbolInt("i0");
            int j1 = Analysis.newSymbolInt("j1");
            matrix_LTA.swapColumns(i0, j1);
        } catch (Exception e) {
        }
    }
}
