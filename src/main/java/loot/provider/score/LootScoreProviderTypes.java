package yarnwrap.loot.provider.score;
public class LootScoreProviderTypes { public net.minecraft.loot.provider.score.LootScoreProviderTypes wrapperContained; public LootScoreProviderTypes(net.minecraft.loot.provider.score.LootScoreProviderTypes wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public com.mojang.serialization.Codec BASE_CODEC() { return wrapperContained.BASE_CODEC; }
// public yarnwrap.loot.provider.score.LootScoreProviderType register(java.lang.String id,com.mojang.serialization.MapCodec codec) { return new yarnwrap.loot.provider.score.LootScoreProviderType(wrapperContained.register(id,codec)); }

}