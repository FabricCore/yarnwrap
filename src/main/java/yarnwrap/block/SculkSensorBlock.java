package yarnwrap.block;
public class SculkSensorBlock { public net.minecraft.block.SculkSensorBlock wrapperContained; public SculkSensorBlock(net.minecraft.block.SculkSensorBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.state.property.EnumProperty SCULK_SENSOR_PHASE() { return new yarnwrap.state.property.EnumProperty(wrapperContained.SCULK_SENSOR_PHASE); }
// public void SCULK_SENSOR_PHASE(yarnwrap.state.property.EnumProperty value) { wrapperContained.SCULK_SENSOR_PHASE = value.wrapperContained; }
public yarnwrap.state.property.IntProperty POWER() { return new yarnwrap.state.property.IntProperty(wrapperContained.POWER); }
// public void POWER(yarnwrap.state.property.IntProperty value) { wrapperContained.POWER = value.wrapperContained; }
public yarnwrap.state.property.BooleanProperty WATERLOGGED() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.WATERLOGGED); }
// public void WATERLOGGED(yarnwrap.state.property.BooleanProperty value) { wrapperContained.WATERLOGGED = value.wrapperContained; }
// public yarnwrap.util.shape.VoxelShape OUTLINE_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.OUTLINE_SHAPE); }
// public void OUTLINE_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.OUTLINE_SHAPE = value.wrapperContained; }
// public float[] RESONATION_NOTE_PITCHES() { return wrapperContained.RESONATION_NOTE_PITCHES; }
// public void RESONATION_NOTE_PITCHES(float[] value) { wrapperContained.RESONATION_NOTE_PITCHES = value; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public void updateNeighbors(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { wrapperContained.updateNeighbors(world.wrapperContained,pos.wrapperContained,state.wrapperContained); }
public void setCooldown(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { wrapperContained.setCooldown(world.wrapperContained,pos.wrapperContained,state.wrapperContained); }
public void setActive(yarnwrap.entity.Entity sourceEntity,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,int power,int frequency) { wrapperContained.setActive(sourceEntity.wrapperContained,world.wrapperContained,pos.wrapperContained,state.wrapperContained,power,frequency); }
public yarnwrap.block.enums.SculkSensorPhase getPhase(yarnwrap.block.BlockState state) { return new yarnwrap.block.enums.SculkSensorPhase(wrapperContained.getPhase(state.wrapperContained)); }
public boolean isInactive(yarnwrap.block.BlockState state) { return wrapperContained.isInactive(state.wrapperContained); }
public void tryResonate(yarnwrap.entity.Entity sourceEntity,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,int frequency) { wrapperContained.tryResonate(sourceEntity.wrapperContained,world.wrapperContained,pos.wrapperContained,frequency); }
public int getCooldownTime() { return wrapperContained.getCooldownTime(); }

}