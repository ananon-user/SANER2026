package org.la4j.matrix.sparse;

import jbse2.meta.Analysis;

public class CRSMatrix_eachNonZeroInRow_Pose_main816 {

    public static void main(String[] args) throws Exception {
        try {
            CRSMatrix crsmatrix_LTA = Analysis.newSymbolObject("crsmatrix_LTA", CRSMatrix.class);
            int i0 = Analysis.newSymbolInt("i0");
            org.la4j.vector.functor.VectorProcedure procedure1 = Analysis.newSymbolObject("procedure1", org.la4j.vector.functor.VectorProcedure.class);
            crsmatrix_LTA.eachNonZeroInRow(i0, procedure1);
        } catch (Exception e) {
        }
    }
}
