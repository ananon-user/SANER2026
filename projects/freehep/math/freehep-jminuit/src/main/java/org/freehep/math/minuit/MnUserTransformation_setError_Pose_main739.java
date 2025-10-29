package org.freehep.math.minuit;

import jbse2.meta.Analysis;

public class MnUserTransformation_setError_Pose_main739 {

    public static void main(String[] args) throws Exception {
        try {
            MnUserTransformation mnusertransformation_LTA = Analysis.newSymbolObject("mnusertransformation_LTA", MnUserTransformation.class);
            int index0 = Analysis.newSymbolInt("index0");
            double err1 = Analysis.newSymbolDouble("err1");
            mnusertransformation_LTA.setError(index0, err1);
        } catch (Exception e) {
        }
    }
}
