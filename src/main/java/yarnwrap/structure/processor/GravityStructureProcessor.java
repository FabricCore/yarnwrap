package yarnwrap.structure.processor;
public class GravityStructureProcessor { public net.minecraft.structure.processor.GravityStructureProcessor wrapperContained; public GravityStructureProcessor(net.minecraft.structure.processor.GravityStructureProcessor wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object heightmap() { return wrapperContained.heightmap; }
// // public void heightmap(Object value) { wrapperContained.heightmap = value; }
// public int offset() { return wrapperContained.offset; }
// public void offset(int value) { wrapperContained.offset = value; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }

}