package yarnwrap.structure.processor;
public class NopStructureProcessor { public net.minecraft.structure.processor.NopStructureProcessor wrapperContained; public NopStructureProcessor(net.minecraft.structure.processor.NopStructureProcessor wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.structure.processor.NopStructureProcessor INSTANCE() { return new yarnwrap.structure.processor.NopStructureProcessor(wrapperContained.INSTANCE); }
// public void INSTANCE(yarnwrap.structure.processor.NopStructureProcessor value) { wrapperContained.INSTANCE = value.wrapperContained; }
public static yarnwrap.structure.processor.NopStructureProcessor INSTANCE() { return new yarnwrap.structure.processor.NopStructureProcessor(net.minecraft.structure.processor.NopStructureProcessor.INSTANCE); }
// public static void INSTANCE(yarnwrap.structure.processor.NopStructureProcessor value, ) { net.minecraft.structure.processor.NopStructureProcessor.INSTANCE = value.wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.structure.processor.NopStructureProcessor.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.structure.processor.NopStructureProcessor.CODEC = value; }


}