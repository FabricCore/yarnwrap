package yarnwrap.block;
public class OxidizableBlock { public net.minecraft.block.OxidizableBlock wrapperContained; public OxidizableBlock(net.minecraft.block.OxidizableBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object oxidationLevel() { return wrapperContained.oxidationLevel; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }

}