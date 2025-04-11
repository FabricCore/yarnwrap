package yarnwrap.loot.function;
public class SetStewEffectLootFunction { public net.minecraft.loot.function.SetStewEffectLootFunction wrapperContained; public SetStewEffectLootFunction(net.minecraft.loot.function.SetStewEffectLootFunction wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public com.mojang.serialization.Codec STEW_EFFECT_LIST_CODEC() { return wrapperContained.STEW_EFFECT_LIST_CODEC; }
// public void STEW_EFFECT_LIST_CODEC(com.mojang.serialization.Codec value) { wrapperContained.STEW_EFFECT_LIST_CODEC = value; }
// public java.util.List stewEffects() { return wrapperContained.stewEffects; }
// public void stewEffects(java.util.List value) { wrapperContained.stewEffects = value; }
// public SetStewEffectLootFunction(java.util.List conditions,java.util.List stewEffects) { this.wrapperContained = new net.minecraft.loot.function.SetStewEffectLootFunction(conditions,stewEffects); }
// public java.util.stream.Stream method_32421(Object stewEffect) { return wrapperContained.method_32421(stewEffect); }
// public java.util.List method_53395(yarnwrap.loot.function.SetStewEffectLootFunction function) { return wrapperContained.method_53395(function.wrapperContained); }
// public com.mojang.serialization.DataResult method_53396(java.util.List stewEffects) { return wrapperContained.method_53396(stewEffects); }
// public com.mojang.datafixers.kinds.App method_53397(Object instance) { return wrapperContained.method_53397(instance); }
public Object builder() { return wrapperContained.builder(); }

}