package yarnwrap.structure.processor;
public class GravityStructureProcessor { public net.minecraft.structure.processor.GravityStructureProcessor wrapperContained; public GravityStructureProcessor(net.minecraft.structure.processor.GravityStructureProcessor wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object heightmap() { return wrapperContained.heightmap; }
// // public void heightmap(Object value) { wrapperContained.heightmap = value; }
// public int offset() { return wrapperContained.offset; }
// public void offset(int value) { wrapperContained.offset = value; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public GravityStructureProcessor(Object heightmap,int offset) { this.wrapperContained = new net.minecraft.structure.processor.GravityStructureProcessor(heightmap,offset); }
// public com.mojang.datafixers.kinds.App method_28972(Object instance) { return wrapperContained.method_28972(instance); }
// public java.lang.Integer method_28973(yarnwrap.structure.processor.GravityStructureProcessor processor) { return wrapperContained.method_28973(processor.wrapperContained); }
// public Object method_28974(yarnwrap.structure.processor.GravityStructureProcessor processor) { return wrapperContained.method_28974(processor.wrapperContained); }

}