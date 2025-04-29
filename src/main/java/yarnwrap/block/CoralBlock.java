package yarnwrap.block;
public class CoralBlock { public net.minecraft.block.CoralBlock wrapperContained; public CoralBlock(net.minecraft.block.CoralBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.block.Block deadCoralBlock() { return new yarnwrap.block.Block(wrapperContained.deadCoralBlock); }
// public void deadCoralBlock(yarnwrap.block.Block value) { wrapperContained.deadCoralBlock = value.wrapperContained; }
// public static yarnwrap.block.Block deadCoralBlock() { return new yarnwrap.block.Block(net.minecraft.block.CoralBlock.deadCoralBlock); }
// public static void deadCoralBlock(yarnwrap.block.Block value, ) { net.minecraft.block.CoralBlock.deadCoralBlock = value.wrapperContained; }

// public yarnwrap.util.shape.VoxelShape SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.SHAPE); }
// public void SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.SHAPE = value.wrapperContained; }
// public static yarnwrap.util.shape.VoxelShape SHAPE() { return new yarnwrap.util.shape.VoxelShape(net.minecraft.block.CoralBlock.SHAPE); }
// public static void SHAPE(yarnwrap.util.shape.VoxelShape value, ) { net.minecraft.block.CoralBlock.SHAPE = value.wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.CoralBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.CoralBlock.CODEC = value; }

// public CoralBlock(yarnwrap.block.Block deadCoralBlock,Object settings) { this.wrapperContained = new net.minecraft.block.CoralBlock(deadCoralBlock.wrapperContained,settings); }
// public com.mojang.datafixers.kinds.App method_54006(Object instance) { return wrapperContained.method_54006(instance); }
// public static com.mojang.datafixers.kinds.App method_54006(Object instance, ) { return net.minecraft.block.CoralBlock.method_54006(instance); }
// public yarnwrap.block.Block method_54007(yarnwrap.block.CoralBlock block) { return new yarnwrap.block.Block(wrapperContained.method_54007(block.wrapperContained)); }
// public static yarnwrap.block.Block method_54007(yarnwrap.block.CoralBlock block, ) { return new yarnwrap.block.Block(net.minecraft.block.CoralBlock.method_54007(block.wrapperContained)); }

}