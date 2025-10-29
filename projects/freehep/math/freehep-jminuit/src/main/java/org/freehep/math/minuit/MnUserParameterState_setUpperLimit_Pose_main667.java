package org.freehep.math.minuit;

import jbse2.meta.Analysis;

public class MnUserParameterState_setUpperLimit_Pose_main667 {

    public static void main(String[] args) throws Exception {
        try {
            MnUserParameterState mnuserparameterstate_LTA = Analysis.newSymbolObject("mnuserparameterstate_LTA", MnUserParameterState.class);
            int e0 = Analysis.newSymbolInt("e0");
            double up1 = Analysis.newSymbolDouble("up1");
            mnuserparameterstate_LTA.setUpperLimit(e0, up1);
        } catch (Exception e) {
        }
    }
}
