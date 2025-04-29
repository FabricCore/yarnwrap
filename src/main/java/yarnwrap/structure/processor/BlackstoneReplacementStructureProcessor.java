package yarnwrap.structure.processor;
public class BlackstoneReplacementStructureProcessor { public net.minecraft.structure.processor.BlackstoneReplacementStructureProcessor wrapperContained; public BlackstoneReplacementStructureProcessor(net.minecraft.structure.processor.BlackstoneReplacementStructureProcessor wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.structure.processor.BlackstoneReplacementStructureProcessor INSTANCE() { return new yarnwrap.structure.processor.BlackstoneReplacementStructureProcessor(wrapperContained.INSTANCE); }
// public void INSTANCE(yarnwrap.structure.processor.BlackstoneReplacementStructureProcessor value) { wrapperContained.INSTANCE = value.wrapperContained; }
public static yarnwrap.structure.processor.BlackstoneReplacementStructureProcessor INSTANCE() { return new yarnwrap.structure.processor.BlackstoneReplacementStructureProcessor(net.minecraft.structure.processor.BlackstoneReplacementStructureProcessor.INSTANCE); }
// public static void INSTANCE(yarnwrap.structure.processor.BlackstoneReplacementStructureProcessor value, ) { net.minecraft.structure.processor.BlackstoneReplacementStructureProcessor.INSTANCE = value.wrapperContained; }

// public java.util.Map replacementMap() { return wrapperContained.replacementMap; }
// public void replacementMap(java.util.Map value) { wrapperContained.replacementMap = value; }
// public static java.util.Map replacementMap() { return net.minecraft.structure.processor.BlackstoneReplacementStructureProcessor.replacementMap; }
// public static void replacementMap(java.util.Map value, ) { net.minecraft.structure.processor.BlackstoneReplacementStructureProcessor.replacementMap = value; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.structure.processor.BlackstoneReplacementStructureProcessor.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.structure.processor.BlackstoneReplacementStructureProcessor.CODEC = value; }

// public void method_27255(java.util.HashMap replacements) { wrapperContained.method_27255(replacements); }
// public static void method_27255(java.util.HashMap replacements, ) { net.minecraft.structure.processor.BlackstoneReplacementStructureProcessor.method_27255(replacements); }

}