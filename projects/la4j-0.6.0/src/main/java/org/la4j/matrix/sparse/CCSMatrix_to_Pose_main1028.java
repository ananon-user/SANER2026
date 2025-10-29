package org.la4j.matrix.sparse;

import jbse2.meta.Analysis;

public class CCSMatrix_to_Pose_main1028 {

    public static void main(String[] args) throws Exception {
        try {
            CCSMatrix ccsmatrix_LTA = Analysis.newSymbolObject("ccsmatrix_LTA", CCSMatrix.class);
            org.la4j.matrix.MatrixFactory<org.la4j.Matrix> factory0 = Analysis.newSymbolObject("factory0", org.la4j.matrix.MatrixFactory.class);
            ccsmatrix_LTA.to(factory0);
        } catch (Exception e) {
        }
    }
}
