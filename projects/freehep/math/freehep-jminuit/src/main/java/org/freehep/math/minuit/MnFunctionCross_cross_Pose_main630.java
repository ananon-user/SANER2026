package org.freehep.math.minuit;

import jbse2.meta.Analysis;

public class MnFunctionCross_cross_Pose_main630 {

    public static void main(String[] args) throws Exception {
        try {
            MnFunctionCross mnfunctioncross_LTA = Analysis.newSymbolObject("mnfunctioncross_LTA", MnFunctionCross.class);
            int[] par0 = Analysis.newSymbolObject("par0", int[].class);
            double[] pmid1 = Analysis.newSymbolObject("pmid1", double[].class);
            double[] pdir2 = Analysis.newSymbolObject("pdir2", double[].class);
            double tlr3 = Analysis.newSymbolDouble("tlr3");
            int maxcalls4 = Analysis.newSymbolInt("maxcalls4");
            mnfunctioncross_LTA.cross(par0, pmid1, pdir2, tlr3, maxcalls4);
        } catch (Exception e) {
        }
    }
}
