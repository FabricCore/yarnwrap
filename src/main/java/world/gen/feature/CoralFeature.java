package yarnwrap.world.gen.feature;
public class CoralFeature { public net.minecraft.world.gen.feature.CoralFeature wrapperContained; public CoralFeature(net.minecraft.world.gen.feature.CoralFeature wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean generateCoral(yarnwrap.world.WorldAccess world,yarnwrap.util.math.random.Random random,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { return wrapperContained.generateCoral(world.wrapperContained,random.wrapperContained,pos.wrapperContained,state.wrapperContained); }
// public boolean generateCoralPiece(yarnwrap.world.WorldAccess world,yarnwrap.util.math.random.Random random,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { return wrapperContained.generateCoralPiece(world.wrapperContained,random.wrapperContained,pos.wrapperContained,state.wrapperContained); }

}