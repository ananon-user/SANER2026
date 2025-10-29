package org.la4j.matrix.sparse;

import jbse2.meta.Analysis;

public class CCSMatrix_eachNonZero_Pose_main1012 {

    public static void main(String[] args) throws Exception {
        try {
            CCSMatrix ccsmatrix_LTA = Analysis.newSymbolObject("ccsmatrix_LTA", CCSMatrix.class);
            org.la4j.matrix.functor.MatrixProcedure procedure0 = Analysis.newSymbolObject("procedure0", org.la4j.matrix.functor.MatrixProcedure.class);
            ccsmatrix_LTA.eachNonZero(procedure0);
        } catch (Exception e) {
        }
    }
}
