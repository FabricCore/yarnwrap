package yarnwrap.block;
public class GrindstoneBlock { public net.minecraft.block.GrindstoneBlock wrapperContained; public GrindstoneBlock(net.minecraft.block.GrindstoneBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.text.Text TITLE() { return new yarnwrap.text.Text(wrapperContained.TITLE); }
// public void TITLE(yarnwrap.text.Text value) { wrapperContained.TITLE = value.wrapperContained; }
// public static yarnwrap.text.Text TITLE() { return new yarnwrap.text.Text(net.minecraft.block.GrindstoneBlock.TITLE); }
// public static void TITLE(yarnwrap.text.Text value, ) { net.minecraft.block.GrindstoneBlock.TITLE = value.wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.GrindstoneBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.GrindstoneBlock.CODEC = value; }

// public java.util.function.Function shapeFunction() { return wrapperContained.shapeFunction; }
// public void shapeFunction(java.util.function.Function value) { wrapperContained.shapeFunction = value; }
// public static java.util.function.Function shapeFunction() { return net.minecraft.block.GrindstoneBlock.shapeFunction; }
// public static void shapeFunction(java.util.function.Function value, ) { net.minecraft.block.GrindstoneBlock.shapeFunction = value; }

// public yarnwrap.util.shape.VoxelShape getShape(yarnwrap.block.BlockState state) { return new yarnwrap.util.shape.VoxelShape(wrapperContained.getShape(state.wrapperContained)); }
// public static yarnwrap.util.shape.VoxelShape getShape(yarnwrap.block.BlockState state, ) { return new yarnwrap.util.shape.VoxelShape(net.minecraft.block.GrindstoneBlock.getShape(state.wrapperContained)); }
// public yarnwrap.screen.ScreenHandler method_17469(yarnwrap.world.World syncId,yarnwrap.util.math.BlockPos inventory,int player) { return new yarnwrap.screen.ScreenHandler(wrapperContained.method_17469(syncId.wrapperContained,inventory.wrapperContained,player)); }
// public static yarnwrap.screen.ScreenHandler method_17469(yarnwrap.world.World syncId,yarnwrap.util.math.BlockPos inventory,int player, ) { return new yarnwrap.screen.ScreenHandler(net.minecraft.block.GrindstoneBlock.method_17469(syncId.wrapperContained,inventory.wrapperContained,player)); }
// public yarnwrap.util.shape.VoxelShape method_66436(java.util.Map state) { return new yarnwrap.util.shape.VoxelShape(wrapperContained.method_66436(state)); }
// public static yarnwrap.util.shape.VoxelShape method_66436(java.util.Map state, ) { return new yarnwrap.util.shape.VoxelShape(net.minecraft.block.GrindstoneBlock.method_66436(state)); }
// public java.util.function.Function createShapeFunction() { return wrapperContained.createShapeFunction(); }
// public static java.util.function.Function createShapeFunction() { return net.minecraft.block.GrindstoneBlock.createShapeFunction(); }

}