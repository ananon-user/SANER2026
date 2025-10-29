package org.apache.bcel.generic;

import jbse2.meta.Analysis;

public class InstructionList_redirectBranches_Pose_main269 {

    public static void main(String[] args) throws Exception {
        try {
            InstructionList instructionlist_LTA = Analysis.newSymbolObject("instructionlist_LTA", InstructionList.class);
            org.apache.bcel.generic.InstructionHandle old_target0 = Analysis.newSymbolObject("old_target0", org.apache.bcel.generic.InstructionHandle.class);
            org.apache.bcel.generic.InstructionHandle new_target1 = Analysis.newSymbolObject("new_target1", org.apache.bcel.generic.InstructionHandle.class);
            instructionlist_LTA.redirectBranches(old_target0, new_target1);
        } catch (Exception e) {
        }
    }
}
