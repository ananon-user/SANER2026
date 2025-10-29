package org.freehep.math.minuit;

import jbse2.meta.Analysis;

public class MnUserTransformation_transform_Pose_main725 {

    public static void main(String[] args) throws Exception {
        try {
            MnUserTransformation mnusertransformation_LTA = Analysis.newSymbolObject("mnusertransformation_LTA", MnUserTransformation.class);
            org.freehep.math.minuit.MnAlgebraicVector pstates0 = Analysis.newSymbolObject("pstates0", org.freehep.math.minuit.MnAlgebraicVector.class);
            mnusertransformation_LTA.transform(pstates0);
        } catch (Exception e) {
        }
    }
}
