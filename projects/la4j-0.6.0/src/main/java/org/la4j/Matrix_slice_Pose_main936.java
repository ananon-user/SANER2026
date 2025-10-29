package org.la4j;

import jbse2.meta.Analysis;

public class Matrix_slice_Pose_main936 {

    public static void main(String[] args) throws Exception {
        try {
            Matrix matrix_LTA = Analysis.newSymbolObject("matrix_LTA", Matrix.class);
            int fromRow0 = Analysis.newSymbolInt("fromRow0");
            int fromColumn1 = Analysis.newSymbolInt("fromColumn1");
            int untilRow2 = Analysis.newSymbolInt("untilRow2");
            int untilColumn3 = Analysis.newSymbolInt("untilColumn3");
            matrix_LTA.slice(fromRow0, fromColumn1, untilRow2, untilColumn3);
        } catch (Exception e) {
        }
    }
}
