package yarnwrap.structure.rule;
public class BlockMatchRuleTest { public net.minecraft.structure.rule.BlockMatchRuleTest wrapperContained; public BlockMatchRuleTest(net.minecraft.structure.rule.BlockMatchRuleTest wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.block.Block block() { return new yarnwrap.block.Block(wrapperContained.block); }
// public void block(yarnwrap.block.Block value) { wrapperContained.block = value.wrapperContained; }
// public static yarnwrap.block.Block block() { return new yarnwrap.block.Block(net.minecraft.structure.rule.BlockMatchRuleTest.block); }
// public static void block(yarnwrap.block.Block value, ) { net.minecraft.structure.rule.BlockMatchRuleTest.block = value.wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.structure.rule.BlockMatchRuleTest.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.structure.rule.BlockMatchRuleTest.CODEC = value; }

public BlockMatchRuleTest(yarnwrap.block.Block block) { this.wrapperContained = new net.minecraft.structure.rule.BlockMatchRuleTest(block.wrapperContained); }
// public yarnwrap.block.Block method_28969(yarnwrap.structure.rule.BlockMatchRuleTest ruleTest) { return new yarnwrap.block.Block(wrapperContained.method_28969(ruleTest.wrapperContained)); }
// public static yarnwrap.block.Block method_28969(yarnwrap.structure.rule.BlockMatchRuleTest ruleTest, ) { return new yarnwrap.block.Block(net.minecraft.structure.rule.BlockMatchRuleTest.method_28969(ruleTest.wrapperContained)); }

}