package yarnwrap.block;
public class InfestedBlock { public net.minecraft.block.InfestedBlock wrapperContained; public InfestedBlock(net.minecraft.block.InfestedBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.block.Block regularBlock() { return new yarnwrap.block.Block(wrapperContained.regularBlock); }
// public java.util.Map REGULAR_TO_INFESTED_BLOCK() { return wrapperContained.REGULAR_TO_INFESTED_BLOCK; }
// public java.util.Map REGULAR_TO_INFESTED_STATE() { return wrapperContained.REGULAR_TO_INFESTED_STATE; }
// public java.util.Map INFESTED_TO_REGULAR_STATE() { return wrapperContained.INFESTED_TO_REGULAR_STATE; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
public boolean isInfestable(yarnwrap.block.BlockState block) { return wrapperContained.isInfestable(block.wrapperContained); }
public yarnwrap.block.BlockState toRegularState(yarnwrap.block.BlockState infestedState) { return new yarnwrap.block.BlockState(wrapperContained.toRegularState(infestedState.wrapperContained)); }
public yarnwrap.block.Block getRegularBlock() { return new yarnwrap.block.Block(wrapperContained.getRegularBlock()); }
// public void spawnSilverfish(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos) { wrapperContained.spawnSilverfish(world.wrapperContained,pos.wrapperContained); }
// public yarnwrap.block.BlockState copyProperties(java.util.Map stateMap,yarnwrap.block.BlockState fromState,java.util.function.Supplier toStateSupplier) { return new yarnwrap.block.BlockState(wrapperContained.copyProperties(stateMap,fromState.wrapperContained,toStateSupplier)); }
public yarnwrap.block.BlockState fromRegularState(yarnwrap.block.BlockState regularState) { return new yarnwrap.block.BlockState(wrapperContained.fromRegularState(regularState.wrapperContained)); }

}