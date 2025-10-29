package org.la4j;

import jbse2.meta.Analysis;

public class Matrix_foldColumns_Pose_main960 {

    public static void main(String[] args) throws Exception {
        try {
            Matrix matrix_LTA = Analysis.newSymbolObject("matrix_LTA", Matrix.class);
            org.la4j.vector.functor.VectorAccumulator accumulator0 = Analysis.newSymbolObject("accumulator0", org.la4j.vector.functor.VectorAccumulator.class);
            matrix_LTA.foldColumns(accumulator0);
        } catch (Exception e) {
        }
    }
}
