package yarnwrap.structure.processor;
public class BlackstoneReplacementStructureProcessor { public net.minecraft.structure.processor.BlackstoneReplacementStructureProcessor wrapperContained; public BlackstoneReplacementStructureProcessor(net.minecraft.structure.processor.BlackstoneReplacementStructureProcessor wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.structure.processor.BlackstoneReplacementStructureProcessor INSTANCE() { return new yarnwrap.structure.processor.BlackstoneReplacementStructureProcessor(wrapperContained.INSTANCE); }
// public void INSTANCE(yarnwrap.structure.processor.BlackstoneReplacementStructureProcessor value) { wrapperContained.INSTANCE = value.wrapperContained; }
// public java.util.Map replacementMap() { return wrapperContained.replacementMap; }
// public void replacementMap(java.util.Map value) { wrapperContained.replacementMap = value; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }

}