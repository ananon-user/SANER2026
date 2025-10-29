package org.la4j;

import jbse2.meta.Analysis;

public class Matrix_foldRows_Pose_main958 {

    public static void main(String[] args) throws Exception {
        try {
            Matrix matrix_LTA = Analysis.newSymbolObject("matrix_LTA", Matrix.class);
            org.la4j.vector.functor.VectorAccumulator accumulator0 = Analysis.newSymbolObject("accumulator0", org.la4j.vector.functor.VectorAccumulator.class);
            matrix_LTA.foldRows(accumulator0);
        } catch (Exception e) {
        }
    }
}
