package org.la4j;

import jbse2.meta.Analysis;

public class Matrix_each_Pose_main940 {

    public static void main(String[] args) throws Exception {
        try {
            Matrix matrix_LTA = Analysis.newSymbolObject("matrix_LTA", Matrix.class);
            org.la4j.matrix.functor.MatrixProcedure procedure0 = Analysis.newSymbolObject("procedure0", org.la4j.matrix.functor.MatrixProcedure.class);
            matrix_LTA.each(procedure0);
        } catch (Exception e) {
        }
    }
}
