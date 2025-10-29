package org.la4j.matrix.sparse;

import jbse2.meta.Analysis;

public class CRSMatrix_getOrElse_Pose_main807 {

    public static void main(String[] args) throws Exception {
        try {
            CRSMatrix crsmatrix_LTA = Analysis.newSymbolObject("crsmatrix_LTA", CRSMatrix.class);
            int i0 = Analysis.newSymbolInt("i0");
            int j1 = Analysis.newSymbolInt("j1");
            double defaultValue2 = Analysis.newSymbolDouble("defaultValue2");
            crsmatrix_LTA.getOrElse(i0, j1, defaultValue2);
        } catch (Exception e) {
        }
    }
}
