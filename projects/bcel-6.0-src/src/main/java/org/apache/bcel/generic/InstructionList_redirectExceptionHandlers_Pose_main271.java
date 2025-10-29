package org.apache.bcel.generic;

import jbse2.meta.Analysis;

public class InstructionList_redirectExceptionHandlers_Pose_main271 {

    public static void main(String[] args) throws Exception {
        try {
            InstructionList instructionlist_LTA = Analysis.newSymbolObject("instructionlist_LTA", InstructionList.class);
            org.apache.bcel.generic.CodeExceptionGen[] exceptions0 = Analysis.newSymbolObject("exceptions0", org.apache.bcel.generic.CodeExceptionGen[].class);
            org.apache.bcel.generic.InstructionHandle old_target1 = Analysis.newSymbolObject("old_target1", org.apache.bcel.generic.InstructionHandle.class);
            org.apache.bcel.generic.InstructionHandle new_target2 = Analysis.newSymbolObject("new_target2", org.apache.bcel.generic.InstructionHandle.class);
            instructionlist_LTA.redirectExceptionHandlers(exceptions0, old_target1, new_target2);
        } catch (Exception e) {
        }
    }
}
