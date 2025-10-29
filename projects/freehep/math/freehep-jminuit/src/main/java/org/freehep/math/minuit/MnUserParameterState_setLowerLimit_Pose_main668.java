package org.freehep.math.minuit;

import jbse2.meta.Analysis;

public class MnUserParameterState_setLowerLimit_Pose_main668 {

    public static void main(String[] args) throws Exception {
        try {
            MnUserParameterState mnuserparameterstate_LTA = Analysis.newSymbolObject("mnuserparameterstate_LTA", MnUserParameterState.class);
            int e0 = Analysis.newSymbolInt("e0");
            double low1 = Analysis.newSymbolDouble("low1");
            mnuserparameterstate_LTA.setLowerLimit(e0, low1);
        } catch (Exception e) {
        }
    }
}
