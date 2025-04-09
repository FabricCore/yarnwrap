package yarnwrap.block;
public class OxidizableStairsBlock { public net.minecraft.block.OxidizableStairsBlock wrapperContained; public OxidizableStairsBlock(net.minecraft.block.OxidizableStairsBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object oxidationLevel() { return wrapperContained.oxidationLevel; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }

}