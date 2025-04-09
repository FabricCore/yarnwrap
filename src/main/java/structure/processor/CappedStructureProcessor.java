package yarnwrap.structure.processor;
public class CappedStructureProcessor { public net.minecraft.structure.processor.CappedStructureProcessor wrapperContained; public CappedStructureProcessor(net.minecraft.structure.processor.CappedStructureProcessor wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public yarnwrap.structure.processor.StructureProcessor delegate() { return new yarnwrap.structure.processor.StructureProcessor(wrapperContained.delegate); }
// public yarnwrap.util.math.intprovider.IntProvider limit() { return new yarnwrap.util.math.intprovider.IntProvider(wrapperContained.limit); }

}