package yarnwrap.structure.rule.blockentity;
public class PassthroughRuleBlockEntityModifier { public net.minecraft.structure.rule.blockentity.PassthroughRuleBlockEntityModifier wrapperContained; public PassthroughRuleBlockEntityModifier(net.minecraft.structure.rule.blockentity.PassthroughRuleBlockEntityModifier wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.structure.rule.blockentity.PassthroughRuleBlockEntityModifier INSTANCE() { return new yarnwrap.structure.rule.blockentity.PassthroughRuleBlockEntityModifier(wrapperContained.INSTANCE); }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }

}