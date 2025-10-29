package org.freehep.math.minuit;

import jbse2.meta.Analysis;

public class SimplexBuilder_minimum_Pose_main692 {

    public static void main(String[] args) throws Exception {
        try {
            SimplexBuilder simplexbuilder_LTA = Analysis.newSymbolObject("simplexbuilder_LTA", SimplexBuilder.class);
            org.freehep.math.minuit.MnFcn mfcn0 = Analysis.newSymbolObject("mfcn0", org.freehep.math.minuit.MnFcn.class);
            org.freehep.math.minuit.GradientCalculator gc1 = Analysis.newSymbolObject("gc1", org.freehep.math.minuit.GradientCalculator.class);
            org.freehep.math.minuit.MinimumSeed seed2 = Analysis.newSymbolObject("seed2", org.freehep.math.minuit.MinimumSeed.class);
            org.freehep.math.minuit.MnStrategy strategy3 = Analysis.newSymbolObject("strategy3", org.freehep.math.minuit.MnStrategy.class);
            int maxfcn4 = Analysis.newSymbolInt("maxfcn4");
            double minedm5 = Analysis.newSymbolDouble("minedm5");
            simplexbuilder_LTA.minimum(mfcn0, gc1, seed2, strategy3, maxfcn4, minedm5);
        } catch (Exception e) {
        }
    }
}
