package yarnwrap.block;
public class SoulFireBlock { public net.minecraft.block.SoulFireBlock wrapperContained; public SoulFireBlock(net.minecraft.block.SoulFireBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public boolean isSoulBase(yarnwrap.block.BlockState state) { return wrapperContained.isSoulBase(state.wrapperContained); }

}