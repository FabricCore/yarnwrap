package yarnwrap.block;
public class AbstractPlantPartBlock { public net.minecraft.block.AbstractPlantPartBlock wrapperContained; public AbstractPlantPartBlock(net.minecraft.block.AbstractPlantPartBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.math.Direction growthDirection() { return new yarnwrap.util.math.Direction(wrapperContained.growthDirection); }
// public void growthDirection(yarnwrap.util.math.Direction value) { wrapperContained.growthDirection = value.wrapperContained; }
// public static yarnwrap.util.math.Direction growthDirection() { return new yarnwrap.util.math.Direction(net.minecraft.block.AbstractPlantPartBlock.growthDirection); }
// public static void growthDirection(yarnwrap.util.math.Direction value, ) { net.minecraft.block.AbstractPlantPartBlock.growthDirection = value.wrapperContained; }

// public boolean tickWater() { return wrapperContained.tickWater; }
// public void tickWater(boolean value) { wrapperContained.tickWater = value; }
// public static boolean tickWater() { return net.minecraft.block.AbstractPlantPartBlock.tickWater; }
// public static void tickWater(boolean value, ) { net.minecraft.block.AbstractPlantPartBlock.tickWater = value; }

// public yarnwrap.util.shape.VoxelShape outlineShape() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.outlineShape); }
// public void outlineShape(yarnwrap.util.shape.VoxelShape value) { wrapperContained.outlineShape = value.wrapperContained; }
// public static yarnwrap.util.shape.VoxelShape outlineShape() { return new yarnwrap.util.shape.VoxelShape(net.minecraft.block.AbstractPlantPartBlock.outlineShape); }
// public static void outlineShape(yarnwrap.util.shape.VoxelShape value, ) { net.minecraft.block.AbstractPlantPartBlock.outlineShape = value.wrapperContained; }

// public AbstractPlantPartBlock(Object settings,yarnwrap.util.math.Direction growthDirection,yarnwrap.util.shape.VoxelShape outlineShape,boolean tickWater) { this.wrapperContained = new net.minecraft.block.AbstractPlantPartBlock(settings,growthDirection.wrapperContained,outlineShape.wrapperContained,tickWater); }
// public yarnwrap.block.AbstractPlantStemBlock getStem() { return new yarnwrap.block.AbstractPlantStemBlock(wrapperContained.getStem()); }
// public static yarnwrap.block.AbstractPlantStemBlock getStem() { return new yarnwrap.block.AbstractPlantStemBlock(net.minecraft.block.AbstractPlantPartBlock.getStem()); }
// public yarnwrap.block.Block getPlant() { return new yarnwrap.block.Block(wrapperContained.getPlant()); }
// public static yarnwrap.block.Block getPlant() { return new yarnwrap.block.Block(net.minecraft.block.AbstractPlantPartBlock.getPlant()); }
// public boolean canAttachTo(yarnwrap.block.BlockState state) { return wrapperContained.canAttachTo(state.wrapperContained); }
// public static boolean canAttachTo(yarnwrap.block.BlockState state, ) { return net.minecraft.block.AbstractPlantPartBlock.canAttachTo(state.wrapperContained); }
public yarnwrap.block.BlockState getRandomGrowthState(yarnwrap.world.WorldAccess world) { return new yarnwrap.block.BlockState(wrapperContained.getRandomGrowthState(world.wrapperContained)); }
// public static yarnwrap.block.BlockState getRandomGrowthState(yarnwrap.world.WorldAccess world, ) { return new yarnwrap.block.BlockState(net.minecraft.block.AbstractPlantPartBlock.getRandomGrowthState(world.wrapperContained)); }

}