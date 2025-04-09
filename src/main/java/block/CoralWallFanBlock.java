package yarnwrap.block;
public class CoralWallFanBlock { public net.minecraft.block.CoralWallFanBlock wrapperContained; public CoralWallFanBlock(net.minecraft.block.CoralWallFanBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.block.Block deadCoralBlock() { return new yarnwrap.block.Block(wrapperContained.deadCoralBlock); }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }

}