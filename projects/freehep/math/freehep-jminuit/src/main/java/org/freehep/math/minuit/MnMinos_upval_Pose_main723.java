package org.freehep.math.minuit;

import jbse2.meta.Analysis;

public class MnMinos_upval_Pose_main723 {

    public static void main(String[] args) throws Exception {
        try {
            MnMinos mnminos_LTA = Analysis.newSymbolObject("mnminos_LTA", MnMinos.class);
            int par0 = Analysis.newSymbolInt("par0");
            double errDef1 = Analysis.newSymbolDouble("errDef1");
            int maxcalls2 = Analysis.newSymbolInt("maxcalls2");
            mnminos_LTA.upval(par0, errDef1, maxcalls2);
        } catch (Exception e) {
        }
    }
}
