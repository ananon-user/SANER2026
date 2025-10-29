package org.la4j;

import jbse2.meta.Analysis;

public class Matrix_equals_Pose_main970 {

    public static void main(String[] args) throws Exception {
        try {
            Matrix matrix_LTA = Analysis.newSymbolObject("matrix_LTA", Matrix.class);
            org.la4j.Matrix matrix0 = Analysis.newSymbolObject("matrix0", org.la4j.Matrix.class);
            double precision1 = Analysis.newSymbolDouble("precision1");
            matrix_LTA.equals(matrix0, precision1);
        } catch (Exception e) {
        }
    }
}
