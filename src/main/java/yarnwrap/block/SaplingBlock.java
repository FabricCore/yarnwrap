package yarnwrap.block;
public class SaplingBlock { public net.minecraft.block.SaplingBlock wrapperContained; public SaplingBlock(net.minecraft.block.SaplingBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.state.property.IntProperty STAGE() { return new yarnwrap.state.property.IntProperty(wrapperContained.STAGE); }
// public void STAGE(yarnwrap.state.property.IntProperty value) { wrapperContained.STAGE = value.wrapperContained; }
// public yarnwrap.block.SaplingGenerator generator() { return new yarnwrap.block.SaplingGenerator(wrapperContained.generator); }
// public void generator(yarnwrap.block.SaplingGenerator value) { wrapperContained.generator = value.wrapperContained; }
// public yarnwrap.util.shape.VoxelShape SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.SHAPE); }
// public void SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.SHAPE = value.wrapperContained; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public void generate(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.util.math.random.Random random) { wrapperContained.generate(world.wrapperContained,pos.wrapperContained,state.wrapperContained,random.wrapperContained); }

}