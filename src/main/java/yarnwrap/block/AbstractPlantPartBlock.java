package yarnwrap.block;
public class AbstractPlantPartBlock { public net.minecraft.block.AbstractPlantPartBlock wrapperContained; public AbstractPlantPartBlock(net.minecraft.block.AbstractPlantPartBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.math.Direction growthDirection() { return new yarnwrap.util.math.Direction(wrapperContained.growthDirection); }
// public void growthDirection(yarnwrap.util.math.Direction value) { wrapperContained.growthDirection = value.wrapperContained; }
// public boolean tickWater() { return wrapperContained.tickWater; }
// public void tickWater(boolean value) { wrapperContained.tickWater = value; }
// public yarnwrap.util.shape.VoxelShape outlineShape() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.outlineShape); }
// public void outlineShape(yarnwrap.util.shape.VoxelShape value) { wrapperContained.outlineShape = value.wrapperContained; }
// public yarnwrap.block.AbstractPlantStemBlock getStem() { return new yarnwrap.block.AbstractPlantStemBlock(wrapperContained.getStem()); }
// public yarnwrap.block.Block getPlant() { return new yarnwrap.block.Block(wrapperContained.getPlant()); }
// public boolean canAttachTo(yarnwrap.block.BlockState state) { return wrapperContained.canAttachTo(state.wrapperContained); }
public yarnwrap.block.BlockState getRandomGrowthState(yarnwrap.world.WorldAccess world) { return new yarnwrap.block.BlockState(wrapperContained.getRandomGrowthState(world.wrapperContained)); }

}