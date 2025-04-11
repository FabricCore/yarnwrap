package yarnwrap.loot.provider.score;
public class ContextLootScoreProvider { public net.minecraft.loot.provider.score.ContextLootScoreProvider wrapperContained; public ContextLootScoreProvider(net.minecraft.loot.provider.score.ContextLootScoreProvider wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public com.mojang.serialization.Codec INLINE_CODEC() { return wrapperContained.INLINE_CODEC; }
// public void INLINE_CODEC(com.mojang.serialization.Codec value) { wrapperContained.INLINE_CODEC = value; }
// public ContextLootScoreProvider(Object target) { this.wrapperContained = new net.minecraft.loot.provider.score.ContextLootScoreProvider(target); }
// public yarnwrap.loot.provider.score.LootScoreProvider create(Object target) { return new yarnwrap.loot.provider.score.LootScoreProvider(wrapperContained.create(target)); }
// public com.mojang.datafixers.kinds.App method_53445(Object instance) { return wrapperContained.method_53445(instance); }

}