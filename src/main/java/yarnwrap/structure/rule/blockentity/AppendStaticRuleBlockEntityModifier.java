package yarnwrap.structure.rule.blockentity;
public class AppendStaticRuleBlockEntityModifier { public net.minecraft.structure.rule.blockentity.AppendStaticRuleBlockEntityModifier wrapperContained; public AppendStaticRuleBlockEntityModifier(net.minecraft.structure.rule.blockentity.AppendStaticRuleBlockEntityModifier wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public yarnwrap.nbt.NbtCompound nbt() { return new yarnwrap.nbt.NbtCompound(wrapperContained.nbt); }
// public void nbt(yarnwrap.nbt.NbtCompound value) { wrapperContained.nbt = value.wrapperContained; }

}