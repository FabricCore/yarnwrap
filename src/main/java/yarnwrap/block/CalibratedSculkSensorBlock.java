package yarnwrap.block;
public class CalibratedSculkSensorBlock { public net.minecraft.block.CalibratedSculkSensorBlock wrapperContained; public CalibratedSculkSensorBlock(net.minecraft.block.CalibratedSculkSensorBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.state.property.EnumProperty FACING() { return new yarnwrap.state.property.EnumProperty(wrapperContained.FACING); }
// public void FACING(yarnwrap.state.property.EnumProperty value) { wrapperContained.FACING = value.wrapperContained; }
public static yarnwrap.state.property.EnumProperty FACING() { return new yarnwrap.state.property.EnumProperty(net.minecraft.block.CalibratedSculkSensorBlock.FACING); }
// public static void FACING(yarnwrap.state.property.EnumProperty value, ) { net.minecraft.block.CalibratedSculkSensorBlock.FACING = value.wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.CalibratedSculkSensorBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.CalibratedSculkSensorBlock.CODEC = value; }

// public void method_49813(yarnwrap.world.World worldx,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState statex,yarnwrap.block.entity.CalibratedSculkSensorBlockEntity blockEntity) { wrapperContained.method_49813(worldx.wrapperContained,pos.wrapperContained,statex.wrapperContained,blockEntity.wrapperContained); }
// public static void method_49813(yarnwrap.world.World worldx,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState statex,yarnwrap.block.entity.CalibratedSculkSensorBlockEntity blockEntity, ) { net.minecraft.block.CalibratedSculkSensorBlock.method_49813(worldx.wrapperContained,pos.wrapperContained,statex.wrapperContained,blockEntity.wrapperContained); }

}