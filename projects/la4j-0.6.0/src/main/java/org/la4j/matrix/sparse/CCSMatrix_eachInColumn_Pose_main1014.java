package org.la4j.matrix.sparse;

import jbse2.meta.Analysis;

public class CCSMatrix_eachInColumn_Pose_main1014 {

    public static void main(String[] args) throws Exception {
        try {
            CCSMatrix ccsmatrix_LTA = Analysis.newSymbolObject("ccsmatrix_LTA", CCSMatrix.class);
            int j0 = Analysis.newSymbolInt("j0");
            org.la4j.vector.functor.VectorProcedure procedure1 = Analysis.newSymbolObject("procedure1", org.la4j.vector.functor.VectorProcedure.class);
            ccsmatrix_LTA.eachInColumn(j0, procedure1);
        } catch (Exception e) {
        }
    }
}
