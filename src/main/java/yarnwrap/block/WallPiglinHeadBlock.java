package yarnwrap.block;
public class WallPiglinHeadBlock { public net.minecraft.block.WallPiglinHeadBlock wrapperContained; public WallPiglinHeadBlock(net.minecraft.block.WallPiglinHeadBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map SHAPES() { return wrapperContained.SHAPES; }
// public void SHAPES(java.util.Map value) { wrapperContained.SHAPES = value; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }

}