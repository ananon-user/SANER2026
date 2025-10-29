package org.freehep.math.minuit;

import jbse2.meta.Analysis;

public class MnUserTransformation_setLowerLimit_Pose_main742 {

    public static void main(String[] args) throws Exception {
        try {
            MnUserTransformation mnusertransformation_LTA = Analysis.newSymbolObject("mnusertransformation_LTA", MnUserTransformation.class);
            int index0 = Analysis.newSymbolInt("index0");
            double low1 = Analysis.newSymbolDouble("low1");
            mnusertransformation_LTA.setLowerLimit(index0, low1);
        } catch (Exception e) {
        }
    }
}
