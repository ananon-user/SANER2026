package org.la4j;

import jbse2.meta.Analysis;

public class Matrix_insert_Pose_main905 {

    public static void main(String[] args) throws Exception {
        try {
            Matrix matrix_LTA = Analysis.newSymbolObject("matrix_LTA", Matrix.class);
            org.la4j.Matrix that0 = Analysis.newSymbolObject("that0", org.la4j.Matrix.class);
            int srcRow1 = Analysis.newSymbolInt("srcRow1");
            int srcColumn2 = Analysis.newSymbolInt("srcColumn2");
            int destRow3 = Analysis.newSymbolInt("destRow3");
            int destColumn4 = Analysis.newSymbolInt("destColumn4");
            int rows5 = Analysis.newSymbolInt("rows5");
            int columns6 = Analysis.newSymbolInt("columns6");
            matrix_LTA.insert(that0, srcRow1, srcColumn2, destRow3, destColumn4, rows5, columns6);
        } catch (Exception e) {
        }
    }
}
