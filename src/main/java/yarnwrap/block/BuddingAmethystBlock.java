package yarnwrap.block;
public class BuddingAmethystBlock { public net.minecraft.block.BuddingAmethystBlock wrapperContained; public BuddingAmethystBlock(net.minecraft.block.BuddingAmethystBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public net.minecraft.util.math.Direction[] DIRECTIONS() { return wrapperContained.DIRECTIONS; }
// public void DIRECTIONS(net.minecraft.util.math.Direction[] value) { wrapperContained.DIRECTIONS = value; }
// public static net.minecraft.util.math.Direction[] DIRECTIONS() { return net.minecraft.block.BuddingAmethystBlock.DIRECTIONS; }
// public static void DIRECTIONS(net.minecraft.util.math.Direction[] value, ) { net.minecraft.block.BuddingAmethystBlock.DIRECTIONS = value; }

// public int GROW_CHANCE() { return wrapperContained.GROW_CHANCE; }
// public void GROW_CHANCE(int value) { wrapperContained.GROW_CHANCE = value; }
public static int GROW_CHANCE() { return net.minecraft.block.BuddingAmethystBlock.GROW_CHANCE; }
// public static void GROW_CHANCE(int value, ) { net.minecraft.block.BuddingAmethystBlock.GROW_CHANCE = value; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.BuddingAmethystBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.BuddingAmethystBlock.CODEC = value; }

// public boolean canGrowIn(yarnwrap.block.BlockState state) { return wrapperContained.canGrowIn(state.wrapperContained); }
// public static boolean canGrowIn(yarnwrap.block.BlockState state, ) { return net.minecraft.block.BuddingAmethystBlock.canGrowIn(state.wrapperContained); }

}