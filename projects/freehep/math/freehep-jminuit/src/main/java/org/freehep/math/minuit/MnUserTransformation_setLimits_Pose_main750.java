package org.freehep.math.minuit;

import jbse2.meta.Analysis;

public class MnUserTransformation_setLimits_Pose_main750 {

    public static void main(String[] args) throws Exception {
        try {
            MnUserTransformation mnusertransformation_LTA = Analysis.newSymbolObject("mnusertransformation_LTA", MnUserTransformation.class);
            java.lang.String name0 = Analysis.newSymbolObject("name0", java.lang.String.class);
            double low1 = Analysis.newSymbolDouble("low1");
            double up2 = Analysis.newSymbolDouble("up2");
            mnusertransformation_LTA.setLimits(name0, low1, up2);
        } catch (Exception e) {
        }
    }
}
