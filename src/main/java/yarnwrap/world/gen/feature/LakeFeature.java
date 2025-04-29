package yarnwrap.world.gen.feature;
public class LakeFeature { public net.minecraft.world.gen.feature.LakeFeature wrapperContained; public LakeFeature(net.minecraft.world.gen.feature.LakeFeature wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.block.BlockState CAVE_AIR() { return new yarnwrap.block.BlockState(wrapperContained.CAVE_AIR); }
// public void CAVE_AIR(yarnwrap.block.BlockState value) { wrapperContained.CAVE_AIR = value.wrapperContained; }
// public static yarnwrap.block.BlockState CAVE_AIR() { return new yarnwrap.block.BlockState(net.minecraft.world.gen.feature.LakeFeature.CAVE_AIR); }
// public static void CAVE_AIR(yarnwrap.block.BlockState value, ) { net.minecraft.world.gen.feature.LakeFeature.CAVE_AIR = value.wrapperContained; }

// public boolean canReplace(yarnwrap.block.BlockState state) { return wrapperContained.canReplace(state.wrapperContained); }
// public static boolean canReplace(yarnwrap.block.BlockState state, ) { return net.minecraft.world.gen.feature.LakeFeature.canReplace(state.wrapperContained); }

}