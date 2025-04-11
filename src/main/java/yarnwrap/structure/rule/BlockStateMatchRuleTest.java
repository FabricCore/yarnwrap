package yarnwrap.structure.rule;
public class BlockStateMatchRuleTest { public net.minecraft.structure.rule.BlockStateMatchRuleTest wrapperContained; public BlockStateMatchRuleTest(net.minecraft.structure.rule.BlockStateMatchRuleTest wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.block.BlockState blockState() { return new yarnwrap.block.BlockState(wrapperContained.blockState); }
// public void blockState(yarnwrap.block.BlockState value) { wrapperContained.blockState = value.wrapperContained; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public BlockStateMatchRuleTest(yarnwrap.block.BlockState blockState) { this.wrapperContained = new net.minecraft.structure.rule.BlockStateMatchRuleTest(blockState.wrapperContained); }
// public yarnwrap.block.BlockState method_28971(yarnwrap.structure.rule.BlockStateMatchRuleTest ruleTest) { return new yarnwrap.block.BlockState(wrapperContained.method_28971(ruleTest.wrapperContained)); }

}