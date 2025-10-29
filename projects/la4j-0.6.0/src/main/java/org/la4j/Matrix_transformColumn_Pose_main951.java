package org.la4j;

import jbse2.meta.Analysis;

public class Matrix_transformColumn_Pose_main951 {

    public static void main(String[] args) throws Exception {
        try {
            Matrix matrix_LTA = Analysis.newSymbolObject("matrix_LTA", Matrix.class);
            int j0 = Analysis.newSymbolInt("j0");
            org.la4j.vector.functor.VectorFunction function1 = Analysis.newSymbolObject("function1", org.la4j.vector.functor.VectorFunction.class);
            matrix_LTA.transformColumn(j0, function1);
        } catch (Exception e) {
        }
    }
}
