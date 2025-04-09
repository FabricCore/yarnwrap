package yarnwrap.block;
public class CoralFanBlock { public net.minecraft.block.CoralFanBlock wrapperContained; public CoralFanBlock(net.minecraft.block.CoralFanBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.block.Block deadCoralBlock() { return new yarnwrap.block.Block(wrapperContained.deadCoralBlock); }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }

}