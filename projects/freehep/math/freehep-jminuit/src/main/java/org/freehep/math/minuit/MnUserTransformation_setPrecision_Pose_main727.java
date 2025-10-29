package org.freehep.math.minuit;

import jbse2.meta.Analysis;

public class MnUserTransformation_setPrecision_Pose_main727 {

    public static void main(String[] args) throws Exception {
        try {
            MnUserTransformation mnusertransformation_LTA = Analysis.newSymbolObject("mnusertransformation_LTA", MnUserTransformation.class);
            double eps0 = Analysis.newSymbolDouble("eps0");
            mnusertransformation_LTA.setPrecision(eps0);
        } catch (Exception e) {
        }
    }
}
