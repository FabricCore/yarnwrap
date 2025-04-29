package yarnwrap.structure.rule.blockentity;
public class ClearRuleBlockEntityModifier { public net.minecraft.structure.rule.blockentity.ClearRuleBlockEntityModifier wrapperContained; public ClearRuleBlockEntityModifier(net.minecraft.structure.rule.blockentity.ClearRuleBlockEntityModifier wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.structure.rule.blockentity.ClearRuleBlockEntityModifier.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.structure.rule.blockentity.ClearRuleBlockEntityModifier.CODEC = value; }

// public yarnwrap.structure.rule.blockentity.ClearRuleBlockEntityModifier INSTANCE() { return new yarnwrap.structure.rule.blockentity.ClearRuleBlockEntityModifier(wrapperContained.INSTANCE); }
// public void INSTANCE(yarnwrap.structure.rule.blockentity.ClearRuleBlockEntityModifier value) { wrapperContained.INSTANCE = value.wrapperContained; }
// public static yarnwrap.structure.rule.blockentity.ClearRuleBlockEntityModifier INSTANCE() { return new yarnwrap.structure.rule.blockentity.ClearRuleBlockEntityModifier(net.minecraft.structure.rule.blockentity.ClearRuleBlockEntityModifier.INSTANCE); }
// public static void INSTANCE(yarnwrap.structure.rule.blockentity.ClearRuleBlockEntityModifier value, ) { net.minecraft.structure.rule.blockentity.ClearRuleBlockEntityModifier.INSTANCE = value.wrapperContained; }


}