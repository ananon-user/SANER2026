package org.la4j.matrix.sparse;

import jbse2.meta.Analysis;

public class CRSMatrix_eachInRow_Pose_main815 {

    public static void main(String[] args) throws Exception {
        try {
            CRSMatrix crsmatrix_LTA = Analysis.newSymbolObject("crsmatrix_LTA", CRSMatrix.class);
            int i0 = Analysis.newSymbolInt("i0");
            org.la4j.vector.functor.VectorProcedure procedure1 = Analysis.newSymbolObject("procedure1", org.la4j.vector.functor.VectorProcedure.class);
            crsmatrix_LTA.eachInRow(i0, procedure1);
        } catch (Exception e) {
        }
    }
}
