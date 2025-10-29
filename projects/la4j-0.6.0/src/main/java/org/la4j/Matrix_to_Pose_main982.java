package org.la4j;

import jbse2.meta.Analysis;

public class Matrix_to_Pose_main982 {

    public static void main(String[] args) throws Exception {
        try {
            Matrix matrix_LTA = Analysis.newSymbolObject("matrix_LTA", Matrix.class);
            org.la4j.matrix.MatrixFactory<org.la4j.Matrix> factory0 = Analysis.newSymbolObject("factory0", org.la4j.matrix.MatrixFactory.class);
            matrix_LTA.to(factory0);
        } catch (Exception e) {
        }
    }
}
