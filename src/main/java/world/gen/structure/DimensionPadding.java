package yarnwrap.world.gen.structure;
public class DimensionPadding { public net.minecraft.world.gen.structure.DimensionPadding wrapperContained; public DimensionPadding(net.minecraft.world.gen.structure.DimensionPadding wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
public yarnwrap.world.gen.structure.DimensionPadding NONE() { return new yarnwrap.world.gen.structure.DimensionPadding(wrapperContained.NONE); }
// public com.mojang.serialization.Codec OBJECT_CODEC() { return wrapperContained.OBJECT_CODEC; }
public boolean paddedBySameDistance() { return wrapperContained.paddedBySameDistance(); }

}