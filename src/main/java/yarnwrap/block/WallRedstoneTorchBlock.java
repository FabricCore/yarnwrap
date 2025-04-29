package yarnwrap.block;
public class WallRedstoneTorchBlock { public net.minecraft.block.WallRedstoneTorchBlock wrapperContained; public WallRedstoneTorchBlock(net.minecraft.block.WallRedstoneTorchBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.state.property.DirectionProperty FACING() { return new yarnwrap.state.property.DirectionProperty(wrapperContained.FACING); }
// public void FACING(yarnwrap.state.property.DirectionProperty value) { wrapperContained.FACING = value.wrapperContained; }
public static yarnwrap.state.property.DirectionProperty FACING() { return new yarnwrap.state.property.DirectionProperty(net.minecraft.block.WallRedstoneTorchBlock.FACING); }
// public static void FACING(yarnwrap.state.property.DirectionProperty value, ) { net.minecraft.block.WallRedstoneTorchBlock.FACING = value.wrapperContained; }

// public yarnwrap.state.property.BooleanProperty LIT() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.LIT); }
// public void LIT(yarnwrap.state.property.BooleanProperty value) { wrapperContained.LIT = value.wrapperContained; }
public static yarnwrap.state.property.BooleanProperty LIT() { return new yarnwrap.state.property.BooleanProperty(net.minecraft.block.WallRedstoneTorchBlock.LIT); }
// public static void LIT(yarnwrap.state.property.BooleanProperty value, ) { net.minecraft.block.WallRedstoneTorchBlock.LIT = value.wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.WallRedstoneTorchBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.WallRedstoneTorchBlock.CODEC = value; }


}