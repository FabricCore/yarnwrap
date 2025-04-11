package yarnwrap.block;
public class CoralBlock { public net.minecraft.block.CoralBlock wrapperContained; public CoralBlock(net.minecraft.block.CoralBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.block.Block deadCoralBlock() { return new yarnwrap.block.Block(wrapperContained.deadCoralBlock); }
// public void deadCoralBlock(yarnwrap.block.Block value) { wrapperContained.deadCoralBlock = value.wrapperContained; }
// public yarnwrap.util.shape.VoxelShape SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.SHAPE); }
// public void SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.SHAPE = value.wrapperContained; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public CoralBlock(yarnwrap.block.Block deadCoralBlock,Object settings) { this.wrapperContained = new net.minecraft.block.CoralBlock(deadCoralBlock.wrapperContained,settings); }
// public com.mojang.datafixers.kinds.App method_54006(Object instance) { return wrapperContained.method_54006(instance); }
// public yarnwrap.block.Block method_54007(yarnwrap.block.CoralBlock block) { return new yarnwrap.block.Block(wrapperContained.method_54007(block.wrapperContained)); }

}