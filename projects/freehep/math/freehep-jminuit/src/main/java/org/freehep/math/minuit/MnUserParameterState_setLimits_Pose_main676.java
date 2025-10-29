package org.freehep.math.minuit;

import jbse2.meta.Analysis;

public class MnUserParameterState_setLimits_Pose_main676 {

    public static void main(String[] args) throws Exception {
        try {
            MnUserParameterState mnuserparameterstate_LTA = Analysis.newSymbolObject("mnuserparameterstate_LTA", MnUserParameterState.class);
            java.lang.String name0 = Analysis.newSymbolObject("name0", java.lang.String.class);
            double low1 = Analysis.newSymbolDouble("low1");
            double up2 = Analysis.newSymbolDouble("up2");
            mnuserparameterstate_LTA.setLimits(name0, low1, up2);
        } catch (Exception e) {
        }
    }
}
