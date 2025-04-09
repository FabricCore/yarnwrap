package yarnwrap.loot.function;
public class SetStewEffectLootFunction { public net.minecraft.loot.function.SetStewEffectLootFunction wrapperContained; public SetStewEffectLootFunction(net.minecraft.loot.function.SetStewEffectLootFunction wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public com.mojang.serialization.Codec STEW_EFFECT_LIST_CODEC() { return wrapperContained.STEW_EFFECT_LIST_CODEC; }
// public java.util.List stewEffects() { return wrapperContained.stewEffects; }
public Object builder() { return wrapperContained.builder(); }

}