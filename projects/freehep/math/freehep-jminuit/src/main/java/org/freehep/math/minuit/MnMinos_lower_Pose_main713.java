package org.freehep.math.minuit;

import jbse2.meta.Analysis;

public class MnMinos_lower_Pose_main713 {

    public static void main(String[] args) throws Exception {
        try {
            MnMinos mnminos_LTA = Analysis.newSymbolObject("mnminos_LTA", MnMinos.class);
            int par0 = Analysis.newSymbolInt("par0");
            double errDef1 = Analysis.newSymbolDouble("errDef1");
            mnminos_LTA.lower(par0, errDef1);
        } catch (Exception e) {
        }
    }
}
