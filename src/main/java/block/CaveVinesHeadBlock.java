package yarnwrap.block;
public class CaveVinesHeadBlock { public net.minecraft.block.CaveVinesHeadBlock wrapperContained; public CaveVinesHeadBlock(net.minecraft.block.CaveVinesHeadBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public float GROW_CHANCE() { return wrapperContained.GROW_CHANCE; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }

}