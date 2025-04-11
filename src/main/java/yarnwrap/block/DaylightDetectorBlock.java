package yarnwrap.block;
public class DaylightDetectorBlock { public net.minecraft.block.DaylightDetectorBlock wrapperContained; public DaylightDetectorBlock(net.minecraft.block.DaylightDetectorBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.state.property.IntProperty POWER() { return new yarnwrap.state.property.IntProperty(wrapperContained.POWER); }
// public void POWER(yarnwrap.state.property.IntProperty value) { wrapperContained.POWER = value.wrapperContained; }
// public yarnwrap.util.shape.VoxelShape SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.SHAPE); }
// public void SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.SHAPE = value.wrapperContained; }
public yarnwrap.state.property.BooleanProperty INVERTED() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.INVERTED); }
// public void INVERTED(yarnwrap.state.property.BooleanProperty value) { wrapperContained.INVERTED = value.wrapperContained; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public void tick(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.block.entity.DaylightDetectorBlockEntity blockEntity) { wrapperContained.tick(world.wrapperContained,pos.wrapperContained,state.wrapperContained,blockEntity.wrapperContained); }
// public void updateState(yarnwrap.block.BlockState state,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos) { wrapperContained.updateState(state.wrapperContained,world.wrapperContained,pos.wrapperContained); }

}