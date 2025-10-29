package org.freehep.math.minuit;

import jbse2.meta.Analysis;

public class MnMinos_upval_Pose_main721 {

    public static void main(String[] args) throws Exception {
        try {
            MnMinos mnminos_LTA = Analysis.newSymbolObject("mnminos_LTA", MnMinos.class);
            int par0 = Analysis.newSymbolInt("par0");
            mnminos_LTA.upval(par0);
        } catch (Exception e) {
        }
    }
}
