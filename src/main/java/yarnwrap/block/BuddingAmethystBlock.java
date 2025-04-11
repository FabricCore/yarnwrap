package yarnwrap.block;
public class BuddingAmethystBlock { public net.minecraft.block.BuddingAmethystBlock wrapperContained; public BuddingAmethystBlock(net.minecraft.block.BuddingAmethystBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public net.minecraft.util.math.Direction[] DIRECTIONS() { return wrapperContained.DIRECTIONS; }
// public void DIRECTIONS(net.minecraft.util.math.Direction[] value) { wrapperContained.DIRECTIONS = value; }
public int GROW_CHANCE() { return wrapperContained.GROW_CHANCE; }
// public void GROW_CHANCE(int value) { wrapperContained.GROW_CHANCE = value; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public boolean canGrowIn(yarnwrap.block.BlockState state) { return wrapperContained.canGrowIn(state.wrapperContained); }

}