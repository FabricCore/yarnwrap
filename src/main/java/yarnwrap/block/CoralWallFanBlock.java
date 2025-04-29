package yarnwrap.block;
public class CoralWallFanBlock { public net.minecraft.block.CoralWallFanBlock wrapperContained; public CoralWallFanBlock(net.minecraft.block.CoralWallFanBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.block.Block deadCoralBlock() { return new yarnwrap.block.Block(wrapperContained.deadCoralBlock); }
// public void deadCoralBlock(yarnwrap.block.Block value) { wrapperContained.deadCoralBlock = value.wrapperContained; }
// public static yarnwrap.block.Block deadCoralBlock() { return new yarnwrap.block.Block(net.minecraft.block.CoralWallFanBlock.deadCoralBlock); }
// public static void deadCoralBlock(yarnwrap.block.Block value, ) { net.minecraft.block.CoralWallFanBlock.deadCoralBlock = value.wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.CoralWallFanBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.CoralWallFanBlock.CODEC = value; }

// public CoralWallFanBlock(yarnwrap.block.Block deadCoralBlock,Object settings) { this.wrapperContained = new net.minecraft.block.CoralWallFanBlock(deadCoralBlock.wrapperContained,settings); }
// public com.mojang.datafixers.kinds.App method_54008(Object instance) { return wrapperContained.method_54008(instance); }
// public static com.mojang.datafixers.kinds.App method_54008(Object instance, ) { return net.minecraft.block.CoralWallFanBlock.method_54008(instance); }
// public yarnwrap.block.Block method_54009(yarnwrap.block.CoralWallFanBlock block) { return new yarnwrap.block.Block(wrapperContained.method_54009(block.wrapperContained)); }
// public static yarnwrap.block.Block method_54009(yarnwrap.block.CoralWallFanBlock block, ) { return new yarnwrap.block.Block(net.minecraft.block.CoralWallFanBlock.method_54009(block.wrapperContained)); }

}