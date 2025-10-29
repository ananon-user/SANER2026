package org.apache.bcel.generic;

import jbse2.meta.Analysis;

public class InstructionList_redirectLocalVariables_Pose_main270 {

    public static void main(String[] args) throws Exception {
        try {
            InstructionList instructionlist_LTA = Analysis.newSymbolObject("instructionlist_LTA", InstructionList.class);
            org.apache.bcel.generic.LocalVariableGen[] lg0 = Analysis.newSymbolObject("lg0", org.apache.bcel.generic.LocalVariableGen[].class);
            org.apache.bcel.generic.InstructionHandle old_target1 = Analysis.newSymbolObject("old_target1", org.apache.bcel.generic.InstructionHandle.class);
            org.apache.bcel.generic.InstructionHandle new_target2 = Analysis.newSymbolObject("new_target2", org.apache.bcel.generic.InstructionHandle.class);
            instructionlist_LTA.redirectLocalVariables(lg0, old_target1, new_target2);
        } catch (Exception e) {
        }
    }
}
