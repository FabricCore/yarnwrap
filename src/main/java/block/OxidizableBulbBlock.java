package yarnwrap.block;
public class OxidizableBulbBlock { public net.minecraft.block.OxidizableBulbBlock wrapperContained; public OxidizableBulbBlock(net.minecraft.block.OxidizableBulbBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public Object oxidationLevel() { return wrapperContained.oxidationLevel; }

}