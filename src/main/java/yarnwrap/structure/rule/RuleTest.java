package yarnwrap.structure.rule;
public class RuleTest { public net.minecraft.structure.rule.RuleTest wrapperContained; public RuleTest(net.minecraft.structure.rule.RuleTest wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec TYPE_CODEC() { return wrapperContained.TYPE_CODEC; }
// public void TYPE_CODEC(com.mojang.serialization.Codec value) { wrapperContained.TYPE_CODEC = value; }
// public yarnwrap.structure.rule.RuleTestType getType() { return new yarnwrap.structure.rule.RuleTestType(wrapperContained.getType()); }
public boolean test(yarnwrap.block.BlockState state,yarnwrap.util.math.random.Random random) { return wrapperContained.test(state.wrapperContained,random.wrapperContained); }

}