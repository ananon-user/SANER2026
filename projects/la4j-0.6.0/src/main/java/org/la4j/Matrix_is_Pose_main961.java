package org.la4j;

import jbse2.meta.Analysis;

public class Matrix_is_Pose_main961 {

    public static void main(String[] args) throws Exception {
        try {
            Matrix matrix_LTA = Analysis.newSymbolObject("matrix_LTA", Matrix.class);
            org.la4j.matrix.functor.MatrixPredicate predicate0 = Analysis.newSymbolObject("predicate0", org.la4j.matrix.functor.MatrixPredicate.class);
            matrix_LTA.is(predicate0);
        } catch (Exception e) {
        }
    }
}
