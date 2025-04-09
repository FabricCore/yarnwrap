package yarnwrap.block;
public class WallPiglinHeadBlock { public net.minecraft.block.WallPiglinHeadBlock wrapperContained; public WallPiglinHeadBlock(net.minecraft.block.WallPiglinHeadBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map SHAPES() { return wrapperContained.SHAPES; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }

}