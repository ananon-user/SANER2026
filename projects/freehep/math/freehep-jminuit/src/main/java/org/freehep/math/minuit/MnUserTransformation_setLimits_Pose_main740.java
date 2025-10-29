package org.freehep.math.minuit;

import jbse2.meta.Analysis;

public class MnUserTransformation_setLimits_Pose_main740 {

    public static void main(String[] args) throws Exception {
        try {
            MnUserTransformation mnusertransformation_LTA = Analysis.newSymbolObject("mnusertransformation_LTA", MnUserTransformation.class);
            int index0 = Analysis.newSymbolInt("index0");
            double low1 = Analysis.newSymbolDouble("low1");
            double up2 = Analysis.newSymbolDouble("up2");
            mnusertransformation_LTA.setLimits(index0, low1, up2);
        } catch (Exception e) {
        }
    }
}
