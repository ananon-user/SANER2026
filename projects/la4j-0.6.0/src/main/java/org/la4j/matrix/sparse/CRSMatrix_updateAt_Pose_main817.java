package org.la4j.matrix.sparse;

import jbse2.meta.Analysis;

public class CRSMatrix_updateAt_Pose_main817 {

    public static void main(String[] args) throws Exception {
        try {
            CRSMatrix crsmatrix_LTA = Analysis.newSymbolObject("crsmatrix_LTA", CRSMatrix.class);
            int i0 = Analysis.newSymbolInt("i0");
            int j1 = Analysis.newSymbolInt("j1");
            org.la4j.matrix.functor.MatrixFunction function2 = Analysis.newSymbolObject("function2", org.la4j.matrix.functor.MatrixFunction.class);
            crsmatrix_LTA.updateAt(i0, j1, function2);
        } catch (Exception e) {
        }
    }
}
