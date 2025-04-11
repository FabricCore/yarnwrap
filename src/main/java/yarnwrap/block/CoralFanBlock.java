package yarnwrap.block;
public class CoralFanBlock { public net.minecraft.block.CoralFanBlock wrapperContained; public CoralFanBlock(net.minecraft.block.CoralFanBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.block.Block deadCoralBlock() { return new yarnwrap.block.Block(wrapperContained.deadCoralBlock); }
// public void deadCoralBlock(yarnwrap.block.Block value) { wrapperContained.deadCoralBlock = value.wrapperContained; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public CoralFanBlock(yarnwrap.block.Block deadCoralBlock,Object settings) { this.wrapperContained = new net.minecraft.block.CoralFanBlock(deadCoralBlock.wrapperContained,settings); }
// public com.mojang.datafixers.kinds.App method_54004(Object instance) { return wrapperContained.method_54004(instance); }
// public yarnwrap.block.Block method_54005(yarnwrap.block.CoralFanBlock block) { return new yarnwrap.block.Block(wrapperContained.method_54005(block.wrapperContained)); }

}