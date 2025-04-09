package yarnwrap.structure.processor;
public class GravityStructureProcessor { public net.minecraft.structure.processor.GravityStructureProcessor wrapperContained; public GravityStructureProcessor(net.minecraft.structure.processor.GravityStructureProcessor wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object heightmap() { return wrapperContained.heightmap; }
// public int offset() { return wrapperContained.offset; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }

}