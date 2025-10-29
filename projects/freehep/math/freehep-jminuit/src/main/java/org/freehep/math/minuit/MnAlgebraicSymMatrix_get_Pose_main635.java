package org.freehep.math.minuit;

import jbse2.meta.Analysis;

public class MnAlgebraicSymMatrix_get_Pose_main635 {

    public static void main(String[] args) throws Exception {
        try {
            MnAlgebraicSymMatrix mnalgebraicsymmatrix_LTA = Analysis.newSymbolObject("mnalgebraicsymmatrix_LTA", MnAlgebraicSymMatrix.class);
            int row0 = Analysis.newSymbolInt("row0");
            int col1 = Analysis.newSymbolInt("col1");
            mnalgebraicsymmatrix_LTA.get(row0, col1);
        } catch (Exception e) {
        }
    }
}
