package org.la4j;

import jbse2.meta.Analysis;

public class Matrix_fold_Pose_main956 {

    public static void main(String[] args) throws Exception {
        try {
            Matrix matrix_LTA = Analysis.newSymbolObject("matrix_LTA", Matrix.class);
            org.la4j.matrix.functor.MatrixAccumulator accumulator0 = Analysis.newSymbolObject("accumulator0", org.la4j.matrix.functor.MatrixAccumulator.class);
            matrix_LTA.fold(accumulator0);
        } catch (Exception e) {
        }
    }
}
