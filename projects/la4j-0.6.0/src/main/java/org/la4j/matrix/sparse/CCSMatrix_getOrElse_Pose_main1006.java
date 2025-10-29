package org.la4j.matrix.sparse;

import jbse2.meta.Analysis;

public class CCSMatrix_getOrElse_Pose_main1006 {

    public static void main(String[] args) throws Exception {
        try {
            CCSMatrix ccsmatrix_LTA = Analysis.newSymbolObject("ccsmatrix_LTA", CCSMatrix.class);
            int i0 = Analysis.newSymbolInt("i0");
            int j1 = Analysis.newSymbolInt("j1");
            double defaultValue2 = Analysis.newSymbolDouble("defaultValue2");
            ccsmatrix_LTA.getOrElse(i0, j1, defaultValue2);
        } catch (Exception e) {
        }
    }
}
