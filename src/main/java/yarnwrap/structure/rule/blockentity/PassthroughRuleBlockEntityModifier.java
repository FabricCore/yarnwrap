package yarnwrap.structure.rule.blockentity;
public class PassthroughRuleBlockEntityModifier { public net.minecraft.structure.rule.blockentity.PassthroughRuleBlockEntityModifier wrapperContained; public PassthroughRuleBlockEntityModifier(net.minecraft.structure.rule.blockentity.PassthroughRuleBlockEntityModifier wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.structure.rule.blockentity.PassthroughRuleBlockEntityModifier INSTANCE() { return new yarnwrap.structure.rule.blockentity.PassthroughRuleBlockEntityModifier(wrapperContained.INSTANCE); }
// public void INSTANCE(yarnwrap.structure.rule.blockentity.PassthroughRuleBlockEntityModifier value) { wrapperContained.INSTANCE = value.wrapperContained; }
public static yarnwrap.structure.rule.blockentity.PassthroughRuleBlockEntityModifier INSTANCE() { return new yarnwrap.structure.rule.blockentity.PassthroughRuleBlockEntityModifier(net.minecraft.structure.rule.blockentity.PassthroughRuleBlockEntityModifier.INSTANCE); }
// public static void INSTANCE(yarnwrap.structure.rule.blockentity.PassthroughRuleBlockEntityModifier value, ) { net.minecraft.structure.rule.blockentity.PassthroughRuleBlockEntityModifier.INSTANCE = value.wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.structure.rule.blockentity.PassthroughRuleBlockEntityModifier.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.structure.rule.blockentity.PassthroughRuleBlockEntityModifier.CODEC = value; }


}