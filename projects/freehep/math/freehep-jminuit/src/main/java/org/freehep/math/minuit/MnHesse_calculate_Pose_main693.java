package org.freehep.math.minuit;

import jbse2.meta.Analysis;

public class MnHesse_calculate_Pose_main693 {

    public static void main(String[] args) throws Exception {
        try {
            MnHesse mnhesse_LTA = Analysis.newSymbolObject("mnhesse_LTA", MnHesse.class);
            org.freehep.math.minuit.FCNBase fcn0 = Analysis.newSymbolObject("fcn0", org.freehep.math.minuit.FCNBase.class);
            double[] par1 = Analysis.newSymbolObject("par1", double[].class);
            double[] err2 = Analysis.newSymbolObject("err2", double[].class);
            mnhesse_LTA.calculate(fcn0, par1, err2);
        } catch (Exception e) {
        }
    }
}
