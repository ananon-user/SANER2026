package org.la4j;

import jbse2.meta.Analysis;

public class Matrix_foldColumn_Pose_main959 {

    public static void main(String[] args) throws Exception {
        try {
            Matrix matrix_LTA = Analysis.newSymbolObject("matrix_LTA", Matrix.class);
            int j0 = Analysis.newSymbolInt("j0");
            org.la4j.vector.functor.VectorAccumulator accumulator1 = Analysis.newSymbolObject("accumulator1", org.la4j.vector.functor.VectorAccumulator.class);
            matrix_LTA.foldColumn(j0, accumulator1);
        } catch (Exception e) {
        }
    }
}
