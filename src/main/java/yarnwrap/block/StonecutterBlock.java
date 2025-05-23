package yarnwrap.block;
public class StonecutterBlock { public net.minecraft.block.StonecutterBlock wrapperContained; public StonecutterBlock(net.minecraft.block.StonecutterBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.shape.VoxelShape SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.SHAPE); }
// public void SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.SHAPE = value.wrapperContained; }
// public static yarnwrap.util.shape.VoxelShape SHAPE() { return new yarnwrap.util.shape.VoxelShape(net.minecraft.block.StonecutterBlock.SHAPE); }
// public static void SHAPE(yarnwrap.util.shape.VoxelShape value, ) { net.minecraft.block.StonecutterBlock.SHAPE = value.wrapperContained; }

// public yarnwrap.state.property.EnumProperty FACING() { return new yarnwrap.state.property.EnumProperty(wrapperContained.FACING); }
// public void FACING(yarnwrap.state.property.EnumProperty value) { wrapperContained.FACING = value.wrapperContained; }
public static yarnwrap.state.property.EnumProperty FACING() { return new yarnwrap.state.property.EnumProperty(net.minecraft.block.StonecutterBlock.FACING); }
// public static void FACING(yarnwrap.state.property.EnumProperty value, ) { net.minecraft.block.StonecutterBlock.FACING = value.wrapperContained; }

// public yarnwrap.text.Text TITLE() { return new yarnwrap.text.Text(wrapperContained.TITLE); }
// public void TITLE(yarnwrap.text.Text value) { wrapperContained.TITLE = value.wrapperContained; }
// public static yarnwrap.text.Text TITLE() { return new yarnwrap.text.Text(net.minecraft.block.StonecutterBlock.TITLE); }
// public static void TITLE(yarnwrap.text.Text value, ) { net.minecraft.block.StonecutterBlock.TITLE = value.wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.StonecutterBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.StonecutterBlock.CODEC = value; }

// public yarnwrap.screen.ScreenHandler method_17896(yarnwrap.world.World syncId,yarnwrap.util.math.BlockPos playerInventory,int player) { return new yarnwrap.screen.ScreenHandler(wrapperContained.method_17896(syncId.wrapperContained,playerInventory.wrapperContained,player)); }
// public static yarnwrap.screen.ScreenHandler method_17896(yarnwrap.world.World syncId,yarnwrap.util.math.BlockPos playerInventory,int player, ) { return new yarnwrap.screen.ScreenHandler(net.minecraft.block.StonecutterBlock.method_17896(syncId.wrapperContained,playerInventory.wrapperContained,player)); }

}