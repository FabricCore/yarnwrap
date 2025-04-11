package yarnwrap.structure.processor;
public class CappedStructureProcessor { public net.minecraft.structure.processor.CappedStructureProcessor wrapperContained; public CappedStructureProcessor(net.minecraft.structure.processor.CappedStructureProcessor wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public yarnwrap.structure.processor.StructureProcessor delegate() { return new yarnwrap.structure.processor.StructureProcessor(wrapperContained.delegate); }
// public void delegate(yarnwrap.structure.processor.StructureProcessor value) { wrapperContained.delegate = value.wrapperContained; }
// public yarnwrap.util.math.intprovider.IntProvider limit() { return new yarnwrap.util.math.intprovider.IntProvider(wrapperContained.limit); }
// public void limit(yarnwrap.util.math.intprovider.IntProvider value) { wrapperContained.limit = value.wrapperContained; }

}