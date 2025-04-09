package yarnwrap.world.gen.feature;
public class LakeFeature { public net.minecraft.world.gen.feature.LakeFeature wrapperContained; public LakeFeature(net.minecraft.world.gen.feature.LakeFeature wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.block.BlockState CAVE_AIR() { return new yarnwrap.block.BlockState(wrapperContained.CAVE_AIR); }
// public boolean canReplace(yarnwrap.block.BlockState state) { return wrapperContained.canReplace(state.wrapperContained); }

}