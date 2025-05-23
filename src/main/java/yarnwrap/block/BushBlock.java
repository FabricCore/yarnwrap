package yarnwrap.block;
public class BushBlock { public net.minecraft.block.BushBlock wrapperContained; public BushBlock(net.minecraft.block.BushBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.BushBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.BushBlock.CODEC = value; }

// public yarnwrap.util.shape.VoxelShape SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.SHAPE); }
// public void SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.SHAPE = value.wrapperContained; }
// public static yarnwrap.util.shape.VoxelShape SHAPE() { return new yarnwrap.util.shape.VoxelShape(net.minecraft.block.BushBlock.SHAPE); }
// public static void SHAPE(yarnwrap.util.shape.VoxelShape value, ) { net.minecraft.block.BushBlock.SHAPE = value.wrapperContained; }

// public void method_67402(yarnwrap.server.world.ServerWorld pos) { wrapperContained.method_67402(pos.wrapperContained); }
// public static void method_67402(yarnwrap.server.world.ServerWorld pos, ) { net.minecraft.block.BushBlock.method_67402(pos.wrapperContained); }

}