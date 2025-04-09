package yarnwrap.structure.processor;
public class LavaSubmergedBlockStructureProcessor { public net.minecraft.structure.processor.LavaSubmergedBlockStructureProcessor wrapperContained; public LavaSubmergedBlockStructureProcessor(net.minecraft.structure.processor.LavaSubmergedBlockStructureProcessor wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
public yarnwrap.structure.processor.LavaSubmergedBlockStructureProcessor INSTANCE() { return new yarnwrap.structure.processor.LavaSubmergedBlockStructureProcessor(wrapperContained.INSTANCE); }

}