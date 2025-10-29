package org.freehep.math.minuit;

import jbse2.meta.Analysis;

public class MnHesse_calculate_Pose_main702 {

    public static void main(String[] args) throws Exception {
        try {
            MnHesse mnhesse_LTA = Analysis.newSymbolObject("mnhesse_LTA", MnHesse.class);
            org.freehep.math.minuit.MnFcn mfcn0 = Analysis.newSymbolObject("mfcn0", org.freehep.math.minuit.MnFcn.class);
            org.freehep.math.minuit.MinimumState st1 = Analysis.newSymbolObject("st1", org.freehep.math.minuit.MinimumState.class);
            org.freehep.math.minuit.MnUserTransformation trafo2 = Analysis.newSymbolObject("trafo2", org.freehep.math.minuit.MnUserTransformation.class);
            int maxcalls3 = Analysis.newSymbolInt("maxcalls3");
            mnhesse_LTA.calculate(mfcn0, st1, trafo2, maxcalls3);
        } catch (Exception e) {
        }
    }
}
