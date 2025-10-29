package org.freehep.math.minuit;

import jbse2.meta.Analysis;

public class MnAlgebraicSymMatrix_set_Pose_main636 {

    public static void main(String[] args) throws Exception {
        try {
            MnAlgebraicSymMatrix mnalgebraicsymmatrix_LTA = Analysis.newSymbolObject("mnalgebraicsymmatrix_LTA", MnAlgebraicSymMatrix.class);
            int row0 = Analysis.newSymbolInt("row0");
            int col1 = Analysis.newSymbolInt("col1");
            double value2 = Analysis.newSymbolDouble("value2");
            mnalgebraicsymmatrix_LTA.set(row0, col1, value2);
        } catch (Exception e) {
        }
    }
}
