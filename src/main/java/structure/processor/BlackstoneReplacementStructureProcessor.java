package yarnwrap.structure.processor;
public class BlackstoneReplacementStructureProcessor { public net.minecraft.structure.processor.BlackstoneReplacementStructureProcessor wrapperContained; public BlackstoneReplacementStructureProcessor(net.minecraft.structure.processor.BlackstoneReplacementStructureProcessor wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.structure.processor.BlackstoneReplacementStructureProcessor INSTANCE() { return new yarnwrap.structure.processor.BlackstoneReplacementStructureProcessor(wrapperContained.INSTANCE); }
// public java.util.Map replacementMap() { return wrapperContained.replacementMap; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }

}