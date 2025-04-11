package yarnwrap.world.gen.structure;
public class DimensionPadding { public net.minecraft.world.gen.structure.DimensionPadding wrapperContained; public DimensionPadding(net.minecraft.world.gen.structure.DimensionPadding wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public yarnwrap.world.gen.structure.DimensionPadding NONE() { return new yarnwrap.world.gen.structure.DimensionPadding(wrapperContained.NONE); }
// public void NONE(yarnwrap.world.gen.structure.DimensionPadding value) { wrapperContained.NONE = value.wrapperContained; }
// public com.mojang.serialization.Codec OBJECT_CODEC() { return wrapperContained.OBJECT_CODEC; }
// public void OBJECT_CODEC(com.mojang.serialization.Codec value) { wrapperContained.OBJECT_CODEC = value; }
public boolean paddedBySameDistance() { return wrapperContained.paddedBySameDistance(); }

}