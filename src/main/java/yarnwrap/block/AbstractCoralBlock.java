package yarnwrap.block;
public class AbstractCoralBlock { public net.minecraft.block.AbstractCoralBlock wrapperContained; public AbstractCoralBlock(net.minecraft.block.AbstractCoralBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.shape.VoxelShape SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.SHAPE); }
// public void SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.SHAPE = value.wrapperContained; }
// public static yarnwrap.util.shape.VoxelShape SHAPE() { return new yarnwrap.util.shape.VoxelShape(net.minecraft.block.AbstractCoralBlock.SHAPE); }
// public static void SHAPE(yarnwrap.util.shape.VoxelShape value, ) { net.minecraft.block.AbstractCoralBlock.SHAPE = value.wrapperContained; }

// public yarnwrap.state.property.BooleanProperty WATERLOGGED() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.WATERLOGGED); }
// public void WATERLOGGED(yarnwrap.state.property.BooleanProperty value) { wrapperContained.WATERLOGGED = value.wrapperContained; }
public static yarnwrap.state.property.BooleanProperty WATERLOGGED() { return new yarnwrap.state.property.BooleanProperty(net.minecraft.block.AbstractCoralBlock.WATERLOGGED); }
// public static void WATERLOGGED(yarnwrap.state.property.BooleanProperty value, ) { net.minecraft.block.AbstractCoralBlock.WATERLOGGED = value.wrapperContained; }

// public void checkLivingConditions(yarnwrap.block.BlockState state,yarnwrap.world.BlockView world,yarnwrap.world.tick.ScheduledTickView tickView,yarnwrap.util.math.random.Random random,yarnwrap.util.math.BlockPos pos) { wrapperContained.checkLivingConditions(state.wrapperContained,world.wrapperContained,tickView.wrapperContained,random.wrapperContained,pos.wrapperContained); }
// public static void checkLivingConditions(yarnwrap.block.BlockState state,yarnwrap.world.BlockView world,yarnwrap.world.tick.ScheduledTickView tickView,yarnwrap.util.math.random.Random random,yarnwrap.util.math.BlockPos pos, ) { net.minecraft.block.AbstractCoralBlock.checkLivingConditions(state.wrapperContained,world.wrapperContained,tickView.wrapperContained,random.wrapperContained,pos.wrapperContained); }
// public boolean isInWater(yarnwrap.block.BlockState state,yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.isInWater(state.wrapperContained,world.wrapperContained,pos.wrapperContained); }
// public static boolean isInWater(yarnwrap.block.BlockState state,yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.block.AbstractCoralBlock.isInWater(state.wrapperContained,world.wrapperContained,pos.wrapperContained); }

}