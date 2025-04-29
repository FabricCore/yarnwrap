package yarnwrap.structure.rule.blockentity;
public class AppendStaticRuleBlockEntityModifier { public net.minecraft.structure.rule.blockentity.AppendStaticRuleBlockEntityModifier wrapperContained; public AppendStaticRuleBlockEntityModifier(net.minecraft.structure.rule.blockentity.AppendStaticRuleBlockEntityModifier wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.structure.rule.blockentity.AppendStaticRuleBlockEntityModifier.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.structure.rule.blockentity.AppendStaticRuleBlockEntityModifier.CODEC = value; }

// public yarnwrap.nbt.NbtCompound nbt() { return new yarnwrap.nbt.NbtCompound(wrapperContained.nbt); }
// public void nbt(yarnwrap.nbt.NbtCompound value) { wrapperContained.nbt = value.wrapperContained; }
// public static yarnwrap.nbt.NbtCompound nbt() { return new yarnwrap.nbt.NbtCompound(net.minecraft.structure.rule.blockentity.AppendStaticRuleBlockEntityModifier.nbt); }
// public static void nbt(yarnwrap.nbt.NbtCompound value, ) { net.minecraft.structure.rule.blockentity.AppendStaticRuleBlockEntityModifier.nbt = value.wrapperContained; }

public AppendStaticRuleBlockEntityModifier(yarnwrap.nbt.NbtCompound nbt) { this.wrapperContained = new net.minecraft.structure.rule.blockentity.AppendStaticRuleBlockEntityModifier(nbt.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_49896(Object instance) { return wrapperContained.method_49896(instance); }
// public static com.mojang.datafixers.kinds.App method_49896(Object instance, ) { return net.minecraft.structure.rule.blockentity.AppendStaticRuleBlockEntityModifier.method_49896(instance); }
// public yarnwrap.nbt.NbtCompound method_49897(yarnwrap.structure.rule.blockentity.AppendStaticRuleBlockEntityModifier modifier) { return new yarnwrap.nbt.NbtCompound(wrapperContained.method_49897(modifier.wrapperContained)); }
// public static yarnwrap.nbt.NbtCompound method_49897(yarnwrap.structure.rule.blockentity.AppendStaticRuleBlockEntityModifier modifier, ) { return new yarnwrap.nbt.NbtCompound(net.minecraft.structure.rule.blockentity.AppendStaticRuleBlockEntityModifier.method_49897(modifier.wrapperContained)); }

}