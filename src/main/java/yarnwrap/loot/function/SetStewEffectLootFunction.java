package yarnwrap.loot.function;
public class SetStewEffectLootFunction { public net.minecraft.loot.function.SetStewEffectLootFunction wrapperContained; public SetStewEffectLootFunction(net.minecraft.loot.function.SetStewEffectLootFunction wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public com.mojang.serialization.Codec STEW_EFFECT_LIST_CODEC() { return wrapperContained.STEW_EFFECT_LIST_CODEC; }
// public void STEW_EFFECT_LIST_CODEC(com.mojang.serialization.Codec value) { wrapperContained.STEW_EFFECT_LIST_CODEC = value; }
// public java.util.List stewEffects() { return wrapperContained.stewEffects; }
// public void stewEffects(java.util.List value) { wrapperContained.stewEffects = value; }
public Object builder() { return wrapperContained.builder(); }

}