package org.freehep.math.minuit;

import jbse2.meta.Analysis;

public class MnUserTransformation_add_Pose_main734 {

    public static void main(String[] args) throws Exception {
        try {
            MnUserTransformation mnusertransformation_LTA = Analysis.newSymbolObject("mnusertransformation_LTA", MnUserTransformation.class);
            java.lang.String name0 = Analysis.newSymbolObject("name0", java.lang.String.class);
            double val1 = Analysis.newSymbolDouble("val1");
            double err2 = Analysis.newSymbolDouble("err2");
            double low3 = Analysis.newSymbolDouble("low3");
            double up4 = Analysis.newSymbolDouble("up4");
            mnusertransformation_LTA.add(name0, val1, err2, low3, up4);
        } catch (Exception e) {
        }
    }
}
