package yarnwrap.block;
public class AbstractPlantPartBlock { public net.minecraft.block.AbstractPlantPartBlock wrapperContained; public AbstractPlantPartBlock(net.minecraft.block.AbstractPlantPartBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.math.Direction growthDirection() { return new yarnwrap.util.math.Direction(wrapperContained.growthDirection); }
// public boolean tickWater() { return wrapperContained.tickWater; }
// public yarnwrap.util.shape.VoxelShape outlineShape() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.outlineShape); }
// public yarnwrap.block.AbstractPlantStemBlock getStem() { return new yarnwrap.block.AbstractPlantStemBlock(wrapperContained.getStem()); }
// public yarnwrap.block.Block getPlant() { return new yarnwrap.block.Block(wrapperContained.getPlant()); }
// public boolean canAttachTo(yarnwrap.block.BlockState state) { return wrapperContained.canAttachTo(state.wrapperContained); }
public yarnwrap.block.BlockState getRandomGrowthState(yarnwrap.world.WorldAccess world) { return new yarnwrap.block.BlockState(wrapperContained.getRandomGrowthState(world.wrapperContained)); }

}