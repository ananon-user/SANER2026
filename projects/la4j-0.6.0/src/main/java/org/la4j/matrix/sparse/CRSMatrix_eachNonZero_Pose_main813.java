package org.la4j.matrix.sparse;

import jbse2.meta.Analysis;

public class CRSMatrix_eachNonZero_Pose_main813 {

    public static void main(String[] args) throws Exception {
        try {
            CRSMatrix crsmatrix_LTA = Analysis.newSymbolObject("crsmatrix_LTA", CRSMatrix.class);
            org.la4j.matrix.functor.MatrixProcedure procedure0 = Analysis.newSymbolObject("procedure0", org.la4j.matrix.functor.MatrixProcedure.class);
            crsmatrix_LTA.eachNonZero(procedure0);
        } catch (Exception e) {
        }
    }
}
