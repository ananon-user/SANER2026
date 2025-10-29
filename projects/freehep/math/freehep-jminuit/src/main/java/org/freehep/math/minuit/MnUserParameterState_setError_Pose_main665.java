package org.freehep.math.minuit;

import jbse2.meta.Analysis;

public class MnUserParameterState_setError_Pose_main665 {

    public static void main(String[] args) throws Exception {
        try {
            MnUserParameterState mnuserparameterstate_LTA = Analysis.newSymbolObject("mnuserparameterstate_LTA", MnUserParameterState.class);
            int e0 = Analysis.newSymbolInt("e0");
            double err1 = Analysis.newSymbolDouble("err1");
            mnuserparameterstate_LTA.setError(e0, err1);
        } catch (Exception e) {
        }
    }
}
