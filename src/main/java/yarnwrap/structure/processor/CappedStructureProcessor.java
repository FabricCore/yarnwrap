package yarnwrap.structure.processor;
public class CappedStructureProcessor { public net.minecraft.structure.processor.CappedStructureProcessor wrapperContained; public CappedStructureProcessor(net.minecraft.structure.processor.CappedStructureProcessor wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public yarnwrap.structure.processor.StructureProcessor delegate() { return new yarnwrap.structure.processor.StructureProcessor(wrapperContained.delegate); }
// public void delegate(yarnwrap.structure.processor.StructureProcessor value) { wrapperContained.delegate = value.wrapperContained; }
// public yarnwrap.util.math.intprovider.IntProvider limit() { return new yarnwrap.util.math.intprovider.IntProvider(wrapperContained.limit); }
// public void limit(yarnwrap.util.math.intprovider.IntProvider value) { wrapperContained.limit = value.wrapperContained; }
public CappedStructureProcessor(yarnwrap.structure.processor.StructureProcessor delegate,yarnwrap.util.math.intprovider.IntProvider limit) { this.wrapperContained = new net.minecraft.structure.processor.CappedStructureProcessor(delegate.wrapperContained,limit.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_49888(Object instance) { return wrapperContained.method_49888(instance); }
// public yarnwrap.util.math.intprovider.IntProvider method_49889(yarnwrap.structure.processor.CappedStructureProcessor processor) { return new yarnwrap.util.math.intprovider.IntProvider(wrapperContained.method_49889(processor.wrapperContained)); }
// public yarnwrap.structure.processor.StructureProcessor method_49890(yarnwrap.structure.processor.CappedStructureProcessor processor) { return new yarnwrap.structure.processor.StructureProcessor(wrapperContained.method_49890(processor.wrapperContained)); }

}