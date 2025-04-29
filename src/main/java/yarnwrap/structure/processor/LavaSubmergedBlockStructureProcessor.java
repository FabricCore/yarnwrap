package yarnwrap.structure.processor;
public class LavaSubmergedBlockStructureProcessor { public net.minecraft.structure.processor.LavaSubmergedBlockStructureProcessor wrapperContained; public LavaSubmergedBlockStructureProcessor(net.minecraft.structure.processor.LavaSubmergedBlockStructureProcessor wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.structure.processor.LavaSubmergedBlockStructureProcessor.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.structure.processor.LavaSubmergedBlockStructureProcessor.CODEC = value; }

// public yarnwrap.structure.processor.LavaSubmergedBlockStructureProcessor INSTANCE() { return new yarnwrap.structure.processor.LavaSubmergedBlockStructureProcessor(wrapperContained.INSTANCE); }
// public void INSTANCE(yarnwrap.structure.processor.LavaSubmergedBlockStructureProcessor value) { wrapperContained.INSTANCE = value.wrapperContained; }
public static yarnwrap.structure.processor.LavaSubmergedBlockStructureProcessor INSTANCE() { return new yarnwrap.structure.processor.LavaSubmergedBlockStructureProcessor(net.minecraft.structure.processor.LavaSubmergedBlockStructureProcessor.INSTANCE); }
// public static void INSTANCE(yarnwrap.structure.processor.LavaSubmergedBlockStructureProcessor value, ) { net.minecraft.structure.processor.LavaSubmergedBlockStructureProcessor.INSTANCE = value.wrapperContained; }


}