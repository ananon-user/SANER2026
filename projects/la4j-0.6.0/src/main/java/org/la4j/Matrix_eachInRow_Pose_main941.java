package org.la4j;

import jbse2.meta.Analysis;

public class Matrix_eachInRow_Pose_main941 {

    public static void main(String[] args) throws Exception {
        try {
            Matrix matrix_LTA = Analysis.newSymbolObject("matrix_LTA", Matrix.class);
            int i0 = Analysis.newSymbolInt("i0");
            org.la4j.vector.functor.VectorProcedure procedure1 = Analysis.newSymbolObject("procedure1", org.la4j.vector.functor.VectorProcedure.class);
            matrix_LTA.eachInRow(i0, procedure1);
        } catch (Exception e) {
        }
    }
}
