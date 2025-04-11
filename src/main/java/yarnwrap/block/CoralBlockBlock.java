package yarnwrap.block;
public class CoralBlockBlock { public net.minecraft.block.CoralBlockBlock wrapperContained; public CoralBlockBlock(net.minecraft.block.CoralBlockBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.block.Block deadCoralBlock() { return new yarnwrap.block.Block(wrapperContained.deadCoralBlock); }
// public void deadCoralBlock(yarnwrap.block.Block value) { wrapperContained.deadCoralBlock = value.wrapperContained; }
public com.mojang.serialization.MapCodec DEAD_FIELD() { return wrapperContained.DEAD_FIELD; }
// public void DEAD_FIELD(com.mojang.serialization.MapCodec value) { wrapperContained.DEAD_FIELD = value; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public boolean isInWater(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.isInWater(world.wrapperContained,pos.wrapperContained); }

}