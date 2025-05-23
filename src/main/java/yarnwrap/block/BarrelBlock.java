package yarnwrap.block;
public class BarrelBlock { public net.minecraft.block.BarrelBlock wrapperContained; public BarrelBlock(net.minecraft.block.BarrelBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.state.property.EnumProperty FACING() { return new yarnwrap.state.property.EnumProperty(wrapperContained.FACING); }
// public void FACING(yarnwrap.state.property.EnumProperty value) { wrapperContained.FACING = value.wrapperContained; }
public static yarnwrap.state.property.EnumProperty FACING() { return new yarnwrap.state.property.EnumProperty(net.minecraft.block.BarrelBlock.FACING); }
// public static void FACING(yarnwrap.state.property.EnumProperty value, ) { net.minecraft.block.BarrelBlock.FACING = value.wrapperContained; }

// public yarnwrap.state.property.BooleanProperty OPEN() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.OPEN); }
// public void OPEN(yarnwrap.state.property.BooleanProperty value) { wrapperContained.OPEN = value.wrapperContained; }
public static yarnwrap.state.property.BooleanProperty OPEN() { return new yarnwrap.state.property.BooleanProperty(net.minecraft.block.BarrelBlock.OPEN); }
// public static void OPEN(yarnwrap.state.property.BooleanProperty value, ) { net.minecraft.block.BarrelBlock.OPEN = value.wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.BarrelBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.BarrelBlock.CODEC = value; }


}