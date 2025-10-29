package org.freehep.math.minuit;

import jbse2.meta.Analysis;

public class MnUserTransformation_int2extError_Pose_main759 {

    public static void main(String[] args) throws Exception {
        try {
            MnUserTransformation mnusertransformation_LTA = Analysis.newSymbolObject("mnusertransformation_LTA", MnUserTransformation.class);
            int i0 = Analysis.newSymbolInt("i0");
            double val1 = Analysis.newSymbolDouble("val1");
            double err2 = Analysis.newSymbolDouble("err2");
            mnusertransformation_LTA.int2extError(i0, val1, err2);
        } catch (Exception e) {
        }
    }
}
