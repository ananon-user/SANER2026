package org.freehep.math.minuit;

import jbse2.meta.Analysis;

public class MnUserParameterState_setLimits_Pose_main666 {

    public static void main(String[] args) throws Exception {
        try {
            MnUserParameterState mnuserparameterstate_LTA = Analysis.newSymbolObject("mnuserparameterstate_LTA", MnUserParameterState.class);
            int e0 = Analysis.newSymbolInt("e0");
            double low1 = Analysis.newSymbolDouble("low1");
            double up2 = Analysis.newSymbolDouble("up2");
            mnuserparameterstate_LTA.setLimits(e0, low1, up2);
        } catch (Exception e) {
        }
    }
}
