package yarnwrap.block;
public class OxidizableTrapdoorBlock { public net.minecraft.block.OxidizableTrapdoorBlock wrapperContained; public OxidizableTrapdoorBlock(net.minecraft.block.OxidizableTrapdoorBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public Object oxidationLevel() { return wrapperContained.oxidationLevel; }

}