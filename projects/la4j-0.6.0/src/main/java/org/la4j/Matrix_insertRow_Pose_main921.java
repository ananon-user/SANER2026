package org.la4j;

import jbse2.meta.Analysis;

public class Matrix_insertRow_Pose_main921 {

    public static void main(String[] args) throws Exception {
        try {
            Matrix matrix_LTA = Analysis.newSymbolObject("matrix_LTA", Matrix.class);
            int i0 = Analysis.newSymbolInt("i0");
            org.la4j.Vector row1 = Analysis.newSymbolObject("row1", org.la4j.Vector.class);
            matrix_LTA.insertRow(i0, row1);
        } catch (Exception e) {
        }
    }
}
