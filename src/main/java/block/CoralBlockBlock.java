package yarnwrap.block;
public class CoralBlockBlock { public net.minecraft.block.CoralBlockBlock wrapperContained; public CoralBlockBlock(net.minecraft.block.CoralBlockBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.block.Block deadCoralBlock() { return new yarnwrap.block.Block(wrapperContained.deadCoralBlock); }
public com.mojang.serialization.MapCodec DEAD_FIELD() { return wrapperContained.DEAD_FIELD; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public boolean isInWater(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.isInWater(world.wrapperContained,pos.wrapperContained); }

}