package yarnwrap.block;
public class BigDripleafBlock { public net.minecraft.block.BigDripleafBlock wrapperContained; public BigDripleafBlock(net.minecraft.block.BigDripleafBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.state.property.BooleanProperty WATERLOGGED() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.WATERLOGGED); }
// public void WATERLOGGED(yarnwrap.state.property.BooleanProperty value) { wrapperContained.WATERLOGGED = value.wrapperContained; }
// public yarnwrap.state.property.EnumProperty TILT() { return new yarnwrap.state.property.EnumProperty(wrapperContained.TILT); }
// public void TILT(yarnwrap.state.property.EnumProperty value) { wrapperContained.TILT = value.wrapperContained; }
// public it.unimi.dsi.fastutil.objects.Object2IntMap NEXT_TILT_DELAYS() { return wrapperContained.NEXT_TILT_DELAYS; }
// public void NEXT_TILT_DELAYS(it.unimi.dsi.fastutil.objects.Object2IntMap value) { wrapperContained.NEXT_TILT_DELAYS = value; }
// public java.util.Map SHAPES_FOR_TILT() { return wrapperContained.SHAPES_FOR_TILT; }
// public void SHAPES_FOR_TILT(java.util.Map value) { wrapperContained.SHAPES_FOR_TILT = value; }
// public java.util.Map SHAPES_FOR_DIRECTION() { return wrapperContained.SHAPES_FOR_DIRECTION; }
// public void SHAPES_FOR_DIRECTION(java.util.Map value) { wrapperContained.SHAPES_FOR_DIRECTION = value; }
// public java.util.Map shapes() { return wrapperContained.shapes; }
// public void shapes(java.util.Map value) { wrapperContained.shapes = value; }
// public yarnwrap.util.shape.VoxelShape BASE_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.BASE_SHAPE); }
// public void BASE_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.BASE_SHAPE = value.wrapperContained; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public void playTiltSound(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.sound.SoundEvent soundEvent) { wrapperContained.playTiltSound(world.wrapperContained,pos.wrapperContained,soundEvent.wrapperContained); }
public void grow(yarnwrap.world.WorldAccess world,yarnwrap.util.math.random.Random random,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction direction) { wrapperContained.grow(world.wrapperContained,random.wrapperContained,pos.wrapperContained,direction.wrapperContained); }
// public void changeTilt(yarnwrap.block.BlockState state,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.enums.Tilt tilt) { wrapperContained.changeTilt(state.wrapperContained,world.wrapperContained,pos.wrapperContained,tilt.wrapperContained); }
// public void changeTilt(yarnwrap.block.BlockState state,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.enums.Tilt tilt,yarnwrap.sound.SoundEvent sound) { wrapperContained.changeTilt(state.wrapperContained,world.wrapperContained,pos.wrapperContained,tilt.wrapperContained,sound.wrapperContained); }
// public boolean isEntityAbove(yarnwrap.util.math.BlockPos pos,yarnwrap.entity.Entity entity) { return wrapperContained.isEntityAbove(pos.wrapperContained,entity.wrapperContained); }
// public void resetTilt(yarnwrap.block.BlockState state,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos) { wrapperContained.resetTilt(state.wrapperContained,world.wrapperContained,pos.wrapperContained); }
// public yarnwrap.util.shape.VoxelShape getShapeForState(yarnwrap.block.BlockState state) { return new yarnwrap.util.shape.VoxelShape(wrapperContained.getShapeForState(state.wrapperContained)); }
// public boolean canGrowInto(yarnwrap.world.HeightLimitView world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { return wrapperContained.canGrowInto(world.wrapperContained,pos.wrapperContained,state.wrapperContained); }
// public boolean placeDripleafAt(yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos,yarnwrap.fluid.FluidState fluidState,yarnwrap.util.math.Direction direction) { return wrapperContained.placeDripleafAt(world.wrapperContained,pos.wrapperContained,fluidState.wrapperContained,direction.wrapperContained); }
// public boolean canGrowInto(yarnwrap.block.BlockState state) { return wrapperContained.canGrowInto(state.wrapperContained); }

}