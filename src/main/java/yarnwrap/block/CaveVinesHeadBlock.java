package yarnwrap.block;
public class CaveVinesHeadBlock { public net.minecraft.block.CaveVinesHeadBlock wrapperContained; public CaveVinesHeadBlock(net.minecraft.block.CaveVinesHeadBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public float GROW_CHANCE() { return wrapperContained.GROW_CHANCE; }
// public void GROW_CHANCE(float value) { wrapperContained.GROW_CHANCE = value; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }

}