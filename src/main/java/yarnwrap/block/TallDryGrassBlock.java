package yarnwrap.block;
public class TallDryGrassBlock { public net.minecraft.block.TallDryGrassBlock wrapperContained; public TallDryGrassBlock(net.minecraft.block.TallDryGrassBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.TallDryGrassBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.TallDryGrassBlock.CODEC = value; }

// public yarnwrap.util.shape.VoxelShape SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.SHAPE); }
// public void SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.SHAPE = value.wrapperContained; }
// public static yarnwrap.util.shape.VoxelShape SHAPE() { return new yarnwrap.util.shape.VoxelShape(net.minecraft.block.TallDryGrassBlock.SHAPE); }
// public static void SHAPE(yarnwrap.util.shape.VoxelShape value, ) { net.minecraft.block.TallDryGrassBlock.SHAPE = value.wrapperContained; }

// public void method_67542(yarnwrap.server.world.ServerWorld posx) { wrapperContained.method_67542(posx.wrapperContained); }
// public static void method_67542(yarnwrap.server.world.ServerWorld posx, ) { net.minecraft.block.TallDryGrassBlock.method_67542(posx.wrapperContained); }

}