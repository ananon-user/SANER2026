package org.la4j.matrix.sparse;

import jbse2.meta.Analysis;

public class CRSMatrix_to_Pose_main829 {

    public static void main(String[] args) throws Exception {
        try {
            CRSMatrix crsmatrix_LTA = Analysis.newSymbolObject("crsmatrix_LTA", CRSMatrix.class);
            org.la4j.matrix.MatrixFactory<org.la4j.Matrix> factory0 = Analysis.newSymbolObject("factory0", org.la4j.matrix.MatrixFactory.class);
            crsmatrix_LTA.to(factory0);
        } catch (Exception e) {
        }
    }
}
