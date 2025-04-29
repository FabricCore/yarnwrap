package yarnwrap.block;
public class VineLogic { public net.minecraft.block.VineLogic wrapperContained; public VineLogic(net.minecraft.block.VineLogic wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean isValidForWeepingStem(yarnwrap.block.BlockState state) { return wrapperContained.isValidForWeepingStem(state.wrapperContained); }
// public static boolean isValidForWeepingStem(yarnwrap.block.BlockState state, ) { return net.minecraft.block.VineLogic.isValidForWeepingStem(state.wrapperContained); }
// public int getGrowthLength(yarnwrap.util.math.random.Random random) { return wrapperContained.getGrowthLength(random.wrapperContained); }
// public static int getGrowthLength(yarnwrap.util.math.random.Random random, ) { return net.minecraft.block.VineLogic.getGrowthLength(random.wrapperContained); }

}