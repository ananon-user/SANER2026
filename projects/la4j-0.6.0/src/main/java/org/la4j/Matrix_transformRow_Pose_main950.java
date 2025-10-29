package org.la4j;

import jbse2.meta.Analysis;

public class Matrix_transformRow_Pose_main950 {

    public static void main(String[] args) throws Exception {
        try {
            Matrix matrix_LTA = Analysis.newSymbolObject("matrix_LTA", Matrix.class);
            int i0 = Analysis.newSymbolInt("i0");
            org.la4j.vector.functor.VectorFunction function1 = Analysis.newSymbolObject("function1", org.la4j.vector.functor.VectorFunction.class);
            matrix_LTA.transformRow(i0, function1);
        } catch (Exception e) {
        }
    }
}
