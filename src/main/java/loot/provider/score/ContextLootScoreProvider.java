package yarnwrap.loot.provider.score;
public class ContextLootScoreProvider { public net.minecraft.loot.provider.score.ContextLootScoreProvider wrapperContained; public ContextLootScoreProvider(net.minecraft.loot.provider.score.ContextLootScoreProvider wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
public com.mojang.serialization.Codec INLINE_CODEC() { return wrapperContained.INLINE_CODEC; }
// public yarnwrap.loot.provider.score.LootScoreProvider create(Object target) { return new yarnwrap.loot.provider.score.LootScoreProvider(wrapperContained.create(target)); }

}