package org.la4j;

import jbse2.meta.Analysis;

public class Matrix_foldRow_Pose_main957 {

    public static void main(String[] args) throws Exception {
        try {
            Matrix matrix_LTA = Analysis.newSymbolObject("matrix_LTA", Matrix.class);
            int i0 = Analysis.newSymbolInt("i0");
            org.la4j.vector.functor.VectorAccumulator accumulator1 = Analysis.newSymbolObject("accumulator1", org.la4j.vector.functor.VectorAccumulator.class);
            matrix_LTA.foldRow(i0, accumulator1);
        } catch (Exception e) {
        }
    }
}
