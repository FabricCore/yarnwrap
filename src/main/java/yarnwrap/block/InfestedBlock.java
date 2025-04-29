package yarnwrap.block;
public class InfestedBlock { public net.minecraft.block.InfestedBlock wrapperContained; public InfestedBlock(net.minecraft.block.InfestedBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.block.Block regularBlock() { return new yarnwrap.block.Block(wrapperContained.regularBlock); }
// public void regularBlock(yarnwrap.block.Block value) { wrapperContained.regularBlock = value.wrapperContained; }
// public static yarnwrap.block.Block regularBlock() { return new yarnwrap.block.Block(net.minecraft.block.InfestedBlock.regularBlock); }
// public static void regularBlock(yarnwrap.block.Block value, ) { net.minecraft.block.InfestedBlock.regularBlock = value.wrapperContained; }

// public java.util.Map REGULAR_TO_INFESTED_BLOCK() { return wrapperContained.REGULAR_TO_INFESTED_BLOCK; }
// public void REGULAR_TO_INFESTED_BLOCK(java.util.Map value) { wrapperContained.REGULAR_TO_INFESTED_BLOCK = value; }
// public static java.util.Map REGULAR_TO_INFESTED_BLOCK() { return net.minecraft.block.InfestedBlock.REGULAR_TO_INFESTED_BLOCK; }
// public static void REGULAR_TO_INFESTED_BLOCK(java.util.Map value, ) { net.minecraft.block.InfestedBlock.REGULAR_TO_INFESTED_BLOCK = value; }

// public java.util.Map REGULAR_TO_INFESTED_STATE() { return wrapperContained.REGULAR_TO_INFESTED_STATE; }
// public void REGULAR_TO_INFESTED_STATE(java.util.Map value) { wrapperContained.REGULAR_TO_INFESTED_STATE = value; }
// public static java.util.Map REGULAR_TO_INFESTED_STATE() { return net.minecraft.block.InfestedBlock.REGULAR_TO_INFESTED_STATE; }
// public static void REGULAR_TO_INFESTED_STATE(java.util.Map value, ) { net.minecraft.block.InfestedBlock.REGULAR_TO_INFESTED_STATE = value; }

// public java.util.Map INFESTED_TO_REGULAR_STATE() { return wrapperContained.INFESTED_TO_REGULAR_STATE; }
// public void INFESTED_TO_REGULAR_STATE(java.util.Map value) { wrapperContained.INFESTED_TO_REGULAR_STATE = value; }
// public static java.util.Map INFESTED_TO_REGULAR_STATE() { return net.minecraft.block.InfestedBlock.INFESTED_TO_REGULAR_STATE; }
// public static void INFESTED_TO_REGULAR_STATE(java.util.Map value, ) { net.minecraft.block.InfestedBlock.INFESTED_TO_REGULAR_STATE = value; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.InfestedBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.InfestedBlock.CODEC = value; }

// public InfestedBlock(yarnwrap.block.Block regularBlock,Object settings) { this.wrapperContained = new net.minecraft.block.InfestedBlock(regularBlock.wrapperContained,settings); }
// public boolean isInfestable(yarnwrap.block.BlockState block) { return wrapperContained.isInfestable(block.wrapperContained); }
// public static boolean isInfestable(yarnwrap.block.BlockState block, ) { return net.minecraft.block.InfestedBlock.isInfestable(block.wrapperContained); }
public yarnwrap.block.BlockState toRegularState(yarnwrap.block.BlockState infestedState) { return new yarnwrap.block.BlockState(wrapperContained.toRegularState(infestedState.wrapperContained)); }
// public static yarnwrap.block.BlockState toRegularState(yarnwrap.block.BlockState infestedState, ) { return new yarnwrap.block.BlockState(net.minecraft.block.InfestedBlock.toRegularState(infestedState.wrapperContained)); }
public yarnwrap.block.Block getRegularBlock() { return new yarnwrap.block.Block(wrapperContained.getRegularBlock()); }
// public static yarnwrap.block.Block getRegularBlock() { return new yarnwrap.block.Block(net.minecraft.block.InfestedBlock.getRegularBlock()); }
// public void spawnSilverfish(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos) { wrapperContained.spawnSilverfish(world.wrapperContained,pos.wrapperContained); }
// public static void spawnSilverfish(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos, ) { net.minecraft.block.InfestedBlock.spawnSilverfish(world.wrapperContained,pos.wrapperContained); }
// public yarnwrap.block.BlockState copyProperties(java.util.Map stateMap,yarnwrap.block.BlockState fromState,java.util.function.Supplier toStateSupplier) { return new yarnwrap.block.BlockState(wrapperContained.copyProperties(stateMap,fromState.wrapperContained,toStateSupplier)); }
// public static yarnwrap.block.BlockState copyProperties(java.util.Map stateMap,yarnwrap.block.BlockState fromState,java.util.function.Supplier toStateSupplier, ) { return new yarnwrap.block.BlockState(net.minecraft.block.InfestedBlock.copyProperties(stateMap,fromState.wrapperContained,toStateSupplier)); }
// public yarnwrap.block.BlockState method_36364(java.util.function.Supplier infestedState) { return new yarnwrap.block.BlockState(wrapperContained.method_36364(infestedState)); }
// public static yarnwrap.block.BlockState method_36364(java.util.function.Supplier infestedState, ) { return new yarnwrap.block.BlockState(net.minecraft.block.InfestedBlock.method_36364(infestedState)); }
// public yarnwrap.block.BlockState fromRegularState(yarnwrap.block.BlockState regularState) { return new yarnwrap.block.BlockState(wrapperContained.fromRegularState(regularState.wrapperContained)); }
// public static yarnwrap.block.BlockState fromRegularState(yarnwrap.block.BlockState regularState, ) { return new yarnwrap.block.BlockState(net.minecraft.block.InfestedBlock.fromRegularState(regularState.wrapperContained)); }
// public com.mojang.datafixers.kinds.App method_54022(Object instance) { return wrapperContained.method_54022(instance); }
// public static com.mojang.datafixers.kinds.App method_54022(Object instance, ) { return net.minecraft.block.InfestedBlock.method_54022(instance); }

}