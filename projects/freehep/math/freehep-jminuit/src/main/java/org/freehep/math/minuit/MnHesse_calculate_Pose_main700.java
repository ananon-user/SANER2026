package org.freehep.math.minuit;

import jbse2.meta.Analysis;

public class MnHesse_calculate_Pose_main700 {

    public static void main(String[] args) throws Exception {
        try {
            MnHesse mnhesse_LTA = Analysis.newSymbolObject("mnhesse_LTA", MnHesse.class);
            org.freehep.math.minuit.FCNBase fcn0 = Analysis.newSymbolObject("fcn0", org.freehep.math.minuit.FCNBase.class);
            org.freehep.math.minuit.MnUserParameters par1 = Analysis.newSymbolObject("par1", org.freehep.math.minuit.MnUserParameters.class);
            org.freehep.math.minuit.MnUserCovariance cov2 = Analysis.newSymbolObject("cov2", org.freehep.math.minuit.MnUserCovariance.class);
            int maxcalls3 = Analysis.newSymbolInt("maxcalls3");
            mnhesse_LTA.calculate(fcn0, par1, cov2, maxcalls3);
        } catch (Exception e) {
        }
    }
}
