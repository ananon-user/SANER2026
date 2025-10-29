package org.la4j;

import jbse2.meta.Analysis;

public class Matrix_transform_Pose_main949 {

    public static void main(String[] args) throws Exception {
        try {
            Matrix matrix_LTA = Analysis.newSymbolObject("matrix_LTA", Matrix.class);
            org.la4j.matrix.functor.MatrixFunction function0 = Analysis.newSymbolObject("function0", org.la4j.matrix.functor.MatrixFunction.class);
            matrix_LTA.transform(function0);
        } catch (Exception e) {
        }
    }
}
