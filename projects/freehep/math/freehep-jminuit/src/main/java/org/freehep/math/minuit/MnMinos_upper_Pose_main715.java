package org.freehep.math.minuit;

import jbse2.meta.Analysis;

public class MnMinos_upper_Pose_main715 {

    public static void main(String[] args) throws Exception {
        try {
            MnMinos mnminos_LTA = Analysis.newSymbolObject("mnminos_LTA", MnMinos.class);
            int par0 = Analysis.newSymbolInt("par0");
            mnminos_LTA.upper(par0);
        } catch (Exception e) {
        }
    }
}
