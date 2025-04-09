package yarnwrap.block;
public class BuddingAmethystBlock { public net.minecraft.block.BuddingAmethystBlock wrapperContained; public BuddingAmethystBlock(net.minecraft.block.BuddingAmethystBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public net.minecraft.util.math.Direction[] DIRECTIONS() { return wrapperContained.DIRECTIONS; }
public int GROW_CHANCE() { return wrapperContained.GROW_CHANCE; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
public boolean canGrowIn(yarnwrap.block.BlockState state) { return wrapperContained.canGrowIn(state.wrapperContained); }

}