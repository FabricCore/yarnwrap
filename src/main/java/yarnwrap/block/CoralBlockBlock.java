package yarnwrap.block;
public class CoralBlockBlock { public net.minecraft.block.CoralBlockBlock wrapperContained; public CoralBlockBlock(net.minecraft.block.CoralBlockBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.block.Block deadCoralBlock() { return new yarnwrap.block.Block(wrapperContained.deadCoralBlock); }
// public void deadCoralBlock(yarnwrap.block.Block value) { wrapperContained.deadCoralBlock = value.wrapperContained; }
// public static yarnwrap.block.Block deadCoralBlock() { return new yarnwrap.block.Block(net.minecraft.block.CoralBlockBlock.deadCoralBlock); }
// public static void deadCoralBlock(yarnwrap.block.Block value, ) { net.minecraft.block.CoralBlockBlock.deadCoralBlock = value.wrapperContained; }

// public com.mojang.serialization.MapCodec DEAD_FIELD() { return wrapperContained.DEAD_FIELD; }
// public void DEAD_FIELD(com.mojang.serialization.MapCodec value) { wrapperContained.DEAD_FIELD = value; }
public static com.mojang.serialization.MapCodec DEAD_FIELD() { return net.minecraft.block.CoralBlockBlock.DEAD_FIELD; }
// public static void DEAD_FIELD(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.CoralBlockBlock.DEAD_FIELD = value; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.CoralBlockBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.CoralBlockBlock.CODEC = value; }

// public CoralBlockBlock(yarnwrap.block.Block deadCoralBlock,Object settings) { this.wrapperContained = new net.minecraft.block.CoralBlockBlock(deadCoralBlock.wrapperContained,settings); }
// public com.mojang.datafixers.kinds.App method_54002(Object instance) { return wrapperContained.method_54002(instance); }
// public static com.mojang.datafixers.kinds.App method_54002(Object instance, ) { return net.minecraft.block.CoralBlockBlock.method_54002(instance); }
// public yarnwrap.block.Block method_54003(yarnwrap.block.CoralBlockBlock block) { return new yarnwrap.block.Block(wrapperContained.method_54003(block.wrapperContained)); }
// public static yarnwrap.block.Block method_54003(yarnwrap.block.CoralBlockBlock block, ) { return new yarnwrap.block.Block(net.minecraft.block.CoralBlockBlock.method_54003(block.wrapperContained)); }
// public boolean isInWater(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.isInWater(world.wrapperContained,pos.wrapperContained); }
// public static boolean isInWater(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.block.CoralBlockBlock.isInWater(world.wrapperContained,pos.wrapperContained); }

}