package yarnwrap.block;
public class WallTorchBlock { public net.minecraft.block.WallTorchBlock wrapperContained; public WallTorchBlock(net.minecraft.block.WallTorchBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.state.property.DirectionProperty FACING() { return new yarnwrap.state.property.DirectionProperty(wrapperContained.FACING); }
// public void FACING(yarnwrap.state.property.DirectionProperty value) { wrapperContained.FACING = value.wrapperContained; }
public static yarnwrap.state.property.DirectionProperty FACING() { return new yarnwrap.state.property.DirectionProperty(net.minecraft.block.WallTorchBlock.FACING); }
// public static void FACING(yarnwrap.state.property.DirectionProperty value, ) { net.minecraft.block.WallTorchBlock.FACING = value.wrapperContained; }

// public java.util.Map BOUNDING_SHAPES() { return wrapperContained.BOUNDING_SHAPES; }
// public void BOUNDING_SHAPES(java.util.Map value) { wrapperContained.BOUNDING_SHAPES = value; }
// public static java.util.Map BOUNDING_SHAPES() { return net.minecraft.block.WallTorchBlock.BOUNDING_SHAPES; }
// public static void BOUNDING_SHAPES(java.util.Map value, ) { net.minecraft.block.WallTorchBlock.BOUNDING_SHAPES = value; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.WallTorchBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.WallTorchBlock.CODEC = value; }

// public yarnwrap.util.shape.VoxelShape getBoundingShape(yarnwrap.block.BlockState state) { return new yarnwrap.util.shape.VoxelShape(wrapperContained.getBoundingShape(state.wrapperContained)); }
// public static yarnwrap.util.shape.VoxelShape getBoundingShape(yarnwrap.block.BlockState state, ) { return new yarnwrap.util.shape.VoxelShape(net.minecraft.block.WallTorchBlock.getBoundingShape(state.wrapperContained)); }
// public com.mojang.datafixers.kinds.App method_54066(Object instance) { return wrapperContained.method_54066(instance); }
// public static com.mojang.datafixers.kinds.App method_54066(Object instance, ) { return net.minecraft.block.WallTorchBlock.method_54066(instance); }
// public yarnwrap.particle.SimpleParticleType method_54067(yarnwrap.block.WallTorchBlock block) { return new yarnwrap.particle.SimpleParticleType(wrapperContained.method_54067(block.wrapperContained)); }
// public static yarnwrap.particle.SimpleParticleType method_54067(yarnwrap.block.WallTorchBlock block, ) { return new yarnwrap.particle.SimpleParticleType(net.minecraft.block.WallTorchBlock.method_54067(block.wrapperContained)); }
// public boolean canPlaceAt(yarnwrap.world.WorldView world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction facing) { return wrapperContained.canPlaceAt(world.wrapperContained,pos.wrapperContained,facing.wrapperContained); }
// public static boolean canPlaceAt(yarnwrap.world.WorldView world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction facing, ) { return net.minecraft.block.WallTorchBlock.canPlaceAt(world.wrapperContained,pos.wrapperContained,facing.wrapperContained); }

}