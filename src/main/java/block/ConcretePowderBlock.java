package yarnwrap.block;
public class ConcretePowderBlock { public net.minecraft.block.ConcretePowderBlock wrapperContained; public ConcretePowderBlock(net.minecraft.block.ConcretePowderBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.block.Block hardenedState() { return new yarnwrap.block.Block(wrapperContained.hardenedState); }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public boolean shouldHarden(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { return wrapperContained.shouldHarden(world.wrapperContained,pos.wrapperContained,state.wrapperContained); }
// public boolean hardensOnAnySide(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.hardensOnAnySide(world.wrapperContained,pos.wrapperContained); }
// public boolean hardensIn(yarnwrap.block.BlockState state) { return wrapperContained.hardensIn(state.wrapperContained); }

}