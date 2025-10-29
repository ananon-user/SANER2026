package org.freehep.math.minuit;

import jbse2.meta.Analysis;

public class MnUserTransformation_int2extCovariance_Pose_main760 {

    public static void main(String[] args) throws Exception {
        try {
            MnUserTransformation mnusertransformation_LTA = Analysis.newSymbolObject("mnusertransformation_LTA", MnUserTransformation.class);
            org.freehep.math.minuit.MnAlgebraicVector vec0 = Analysis.newSymbolObject("vec0", org.freehep.math.minuit.MnAlgebraicVector.class);
            org.freehep.math.minuit.MnAlgebraicSymMatrix cov1 = Analysis.newSymbolObject("cov1", org.freehep.math.minuit.MnAlgebraicSymMatrix.class);
            mnusertransformation_LTA.int2extCovariance(vec0, cov1);
        } catch (Exception e) {
        }
    }
}
