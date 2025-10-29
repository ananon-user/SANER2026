package org.la4j.matrix.sparse;

import jbse2.meta.Analysis;

public class CRSMatrix_select_Pose_main828 {

    public static void main(String[] args) throws Exception {
        try {
            CRSMatrix crsmatrix_LTA = Analysis.newSymbolObject("crsmatrix_LTA", CRSMatrix.class);
            int[] rowIndices0 = Analysis.newSymbolObject("rowIndices0", int[].class);
            int[] columnIndices1 = Analysis.newSymbolObject("columnIndices1", int[].class);
            crsmatrix_LTA.select(rowIndices0, columnIndices1);
        } catch (Exception e) {
        }
    }
}
