package yarnwrap.block;
public class SculkSensorBlock { public net.minecraft.block.SculkSensorBlock wrapperContained; public SculkSensorBlock(net.minecraft.block.SculkSensorBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.state.property.EnumProperty SCULK_SENSOR_PHASE() { return new yarnwrap.state.property.EnumProperty(wrapperContained.SCULK_SENSOR_PHASE); }
// public void SCULK_SENSOR_PHASE(yarnwrap.state.property.EnumProperty value) { wrapperContained.SCULK_SENSOR_PHASE = value.wrapperContained; }
public static yarnwrap.state.property.EnumProperty SCULK_SENSOR_PHASE() { return new yarnwrap.state.property.EnumProperty(net.minecraft.block.SculkSensorBlock.SCULK_SENSOR_PHASE); }
// public static void SCULK_SENSOR_PHASE(yarnwrap.state.property.EnumProperty value, ) { net.minecraft.block.SculkSensorBlock.SCULK_SENSOR_PHASE = value.wrapperContained; }

// public yarnwrap.state.property.IntProperty POWER() { return new yarnwrap.state.property.IntProperty(wrapperContained.POWER); }
// public void POWER(yarnwrap.state.property.IntProperty value) { wrapperContained.POWER = value.wrapperContained; }
public static yarnwrap.state.property.IntProperty POWER() { return new yarnwrap.state.property.IntProperty(net.minecraft.block.SculkSensorBlock.POWER); }
// public static void POWER(yarnwrap.state.property.IntProperty value, ) { net.minecraft.block.SculkSensorBlock.POWER = value.wrapperContained; }

// public yarnwrap.state.property.BooleanProperty WATERLOGGED() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.WATERLOGGED); }
// public void WATERLOGGED(yarnwrap.state.property.BooleanProperty value) { wrapperContained.WATERLOGGED = value.wrapperContained; }
public static yarnwrap.state.property.BooleanProperty WATERLOGGED() { return new yarnwrap.state.property.BooleanProperty(net.minecraft.block.SculkSensorBlock.WATERLOGGED); }
// public static void WATERLOGGED(yarnwrap.state.property.BooleanProperty value, ) { net.minecraft.block.SculkSensorBlock.WATERLOGGED = value.wrapperContained; }

// public yarnwrap.util.shape.VoxelShape OUTLINE_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.OUTLINE_SHAPE); }
// public void OUTLINE_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.OUTLINE_SHAPE = value.wrapperContained; }
// public static yarnwrap.util.shape.VoxelShape OUTLINE_SHAPE() { return new yarnwrap.util.shape.VoxelShape(net.minecraft.block.SculkSensorBlock.OUTLINE_SHAPE); }
// public static void OUTLINE_SHAPE(yarnwrap.util.shape.VoxelShape value, ) { net.minecraft.block.SculkSensorBlock.OUTLINE_SHAPE = value.wrapperContained; }

// public float[] RESONATION_NOTE_PITCHES() { return wrapperContained.RESONATION_NOTE_PITCHES; }
// public void RESONATION_NOTE_PITCHES(float[] value) { wrapperContained.RESONATION_NOTE_PITCHES = value; }
// public static float[] RESONATION_NOTE_PITCHES() { return net.minecraft.block.SculkSensorBlock.RESONATION_NOTE_PITCHES; }
// public static void RESONATION_NOTE_PITCHES(float[] value, ) { net.minecraft.block.SculkSensorBlock.RESONATION_NOTE_PITCHES = value; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.SculkSensorBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.SculkSensorBlock.CODEC = value; }

// public void updateNeighbors(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { wrapperContained.updateNeighbors(world.wrapperContained,pos.wrapperContained,state.wrapperContained); }
// public static void updateNeighbors(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state, ) { net.minecraft.block.SculkSensorBlock.updateNeighbors(world.wrapperContained,pos.wrapperContained,state.wrapperContained); }
// public void setCooldown(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { wrapperContained.setCooldown(world.wrapperContained,pos.wrapperContained,state.wrapperContained); }
// public static void setCooldown(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state, ) { net.minecraft.block.SculkSensorBlock.setCooldown(world.wrapperContained,pos.wrapperContained,state.wrapperContained); }
public void setActive(yarnwrap.entity.Entity sourceEntity,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,int power,int frequency) { wrapperContained.setActive(sourceEntity.wrapperContained,world.wrapperContained,pos.wrapperContained,state.wrapperContained,power,frequency); }
// public static void setActive(yarnwrap.entity.Entity sourceEntity,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,int power,int frequency, ) { net.minecraft.block.SculkSensorBlock.setActive(sourceEntity.wrapperContained,world.wrapperContained,pos.wrapperContained,state.wrapperContained,power,frequency); }
// public void method_32905(yarnwrap.world.World worldx,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState statex,yarnwrap.block.entity.SculkSensorBlockEntity blockEntity) { wrapperContained.method_32905(worldx.wrapperContained,pos.wrapperContained,statex.wrapperContained,blockEntity.wrapperContained); }
// public static void method_32905(yarnwrap.world.World worldx,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState statex,yarnwrap.block.entity.SculkSensorBlockEntity blockEntity, ) { net.minecraft.block.SculkSensorBlock.method_32905(worldx.wrapperContained,pos.wrapperContained,statex.wrapperContained,blockEntity.wrapperContained); }
// public yarnwrap.block.enums.SculkSensorPhase getPhase(yarnwrap.block.BlockState state) { return new yarnwrap.block.enums.SculkSensorPhase(wrapperContained.getPhase(state.wrapperContained)); }
// public static yarnwrap.block.enums.SculkSensorPhase getPhase(yarnwrap.block.BlockState state, ) { return new yarnwrap.block.enums.SculkSensorPhase(net.minecraft.block.SculkSensorBlock.getPhase(state.wrapperContained)); }
// public boolean isInactive(yarnwrap.block.BlockState state) { return wrapperContained.isInactive(state.wrapperContained); }
// public static boolean isInactive(yarnwrap.block.BlockState state, ) { return net.minecraft.block.SculkSensorBlock.isInactive(state.wrapperContained); }
// public void tryResonate(yarnwrap.entity.Entity sourceEntity,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,int frequency) { wrapperContained.tryResonate(sourceEntity.wrapperContained,world.wrapperContained,pos.wrapperContained,frequency); }
// public static void tryResonate(yarnwrap.entity.Entity sourceEntity,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,int frequency, ) { net.minecraft.block.SculkSensorBlock.tryResonate(sourceEntity.wrapperContained,world.wrapperContained,pos.wrapperContained,frequency); }
// public void method_49823(float frequency) { wrapperContained.method_49823(frequency); }
// public static void method_49823(float frequency, ) { net.minecraft.block.SculkSensorBlock.method_49823(frequency); }
public int getCooldownTime() { return wrapperContained.getCooldownTime(); }
// public static int getCooldownTime() { return net.minecraft.block.SculkSensorBlock.getCooldownTime(); }

}