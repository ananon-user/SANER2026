package org.la4j.matrix.sparse;

import jbse2.meta.Analysis;

public class CCSMatrix_select_Pose_main1027 {

    public static void main(String[] args) throws Exception {
        try {
            CCSMatrix ccsmatrix_LTA = Analysis.newSymbolObject("ccsmatrix_LTA", CCSMatrix.class);
            int[] rowIndices0 = Analysis.newSymbolObject("rowIndices0", int[].class);
            int[] columnIndices1 = Analysis.newSymbolObject("columnIndices1", int[].class);
            ccsmatrix_LTA.select(rowIndices0, columnIndices1);
        } catch (Exception e) {
        }
    }
}
