package org.apache.bcel.generic;

import jbse2.meta.Analysis;

public class InstructionList_replaceConstantPool_Pose_main262 {

    public static void main(String[] args) throws Exception {
        try {
            InstructionList instructionlist_LTA = Analysis.newSymbolObject("instructionlist_LTA", InstructionList.class);
            org.apache.bcel.generic.ConstantPoolGen old_cp0 = Analysis.newSymbolObject("old_cp0", org.apache.bcel.generic.ConstantPoolGen.class);
            org.apache.bcel.generic.ConstantPoolGen new_cp1 = Analysis.newSymbolObject("new_cp1", org.apache.bcel.generic.ConstantPoolGen.class);
            instructionlist_LTA.replaceConstantPool(old_cp0, new_cp1);
        } catch (Exception e) {
        }
    }
}
