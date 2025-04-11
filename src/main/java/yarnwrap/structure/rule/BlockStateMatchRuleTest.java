package yarnwrap.structure.rule;
public class BlockStateMatchRuleTest { public net.minecraft.structure.rule.BlockStateMatchRuleTest wrapperContained; public BlockStateMatchRuleTest(net.minecraft.structure.rule.BlockStateMatchRuleTest wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.block.BlockState blockState() { return new yarnwrap.block.BlockState(wrapperContained.blockState); }
// public void blockState(yarnwrap.block.BlockState value) { wrapperContained.blockState = value.wrapperContained; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }

}