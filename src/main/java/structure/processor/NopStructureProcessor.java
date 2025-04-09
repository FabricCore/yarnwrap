package yarnwrap.structure.processor;
public class NopStructureProcessor { public net.minecraft.structure.processor.NopStructureProcessor wrapperContained; public NopStructureProcessor(net.minecraft.structure.processor.NopStructureProcessor wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.structure.processor.NopStructureProcessor INSTANCE() { return new yarnwrap.structure.processor.NopStructureProcessor(wrapperContained.INSTANCE); }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }

}