package org.la4j.matrix.sparse;

import jbse2.meta.Analysis;

public class CRSMatrix_blankOfShape_Pose_main830 {

    public static void main(String[] args) throws Exception {
        try {
            CRSMatrix crsmatrix_LTA = Analysis.newSymbolObject("crsmatrix_LTA", CRSMatrix.class);
            int rows0 = Analysis.newSymbolInt("rows0");
            int columns1 = Analysis.newSymbolInt("columns1");
            crsmatrix_LTA.blankOfShape(rows0, columns1);
        } catch (Exception e) {
        }
    }
}
