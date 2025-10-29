package org.la4j;

import jbse2.meta.Analysis;

public class Matrix_insertColumn_Pose_main922 {

    public static void main(String[] args) throws Exception {
        try {
            Matrix matrix_LTA = Analysis.newSymbolObject("matrix_LTA", Matrix.class);
            int j0 = Analysis.newSymbolInt("j0");
            org.la4j.Vector column1 = Analysis.newSymbolObject("column1", org.la4j.Vector.class);
            matrix_LTA.insertColumn(j0, column1);
        } catch (Exception e) {
        }
    }
}
