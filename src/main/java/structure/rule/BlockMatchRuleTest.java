package yarnwrap.structure.rule;
public class BlockMatchRuleTest { public net.minecraft.structure.rule.BlockMatchRuleTest wrapperContained; public BlockMatchRuleTest(net.minecraft.structure.rule.BlockMatchRuleTest wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.block.Block block() { return new yarnwrap.block.Block(wrapperContained.block); }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }

}