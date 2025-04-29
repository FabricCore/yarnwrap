package yarnwrap.block;
public class DeadCoralWallFanBlock { public net.minecraft.block.DeadCoralWallFanBlock wrapperContained; public DeadCoralWallFanBlock(net.minecraft.block.DeadCoralWallFanBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.DeadCoralWallFanBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.DeadCoralWallFanBlock.CODEC = value; }

// public yarnwrap.state.property.DirectionProperty FACING() { return new yarnwrap.state.property.DirectionProperty(wrapperContained.FACING); }
// public void FACING(yarnwrap.state.property.DirectionProperty value) { wrapperContained.FACING = value.wrapperContained; }
public static yarnwrap.state.property.DirectionProperty FACING() { return new yarnwrap.state.property.DirectionProperty(net.minecraft.block.DeadCoralWallFanBlock.FACING); }
// public static void FACING(yarnwrap.state.property.DirectionProperty value, ) { net.minecraft.block.DeadCoralWallFanBlock.FACING = value.wrapperContained; }

// public java.util.Map FACING_TO_SHAPE() { return wrapperContained.FACING_TO_SHAPE; }
// public void FACING_TO_SHAPE(java.util.Map value) { wrapperContained.FACING_TO_SHAPE = value; }
// public static java.util.Map FACING_TO_SHAPE() { return net.minecraft.block.DeadCoralWallFanBlock.FACING_TO_SHAPE; }
// public static void FACING_TO_SHAPE(java.util.Map value, ) { net.minecraft.block.DeadCoralWallFanBlock.FACING_TO_SHAPE = value; }


}