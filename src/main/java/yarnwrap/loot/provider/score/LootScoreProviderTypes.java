package yarnwrap.loot.provider.score;
public class LootScoreProviderTypes { public net.minecraft.loot.provider.score.LootScoreProviderTypes wrapperContained; public LootScoreProviderTypes(net.minecraft.loot.provider.score.LootScoreProviderTypes wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.loot.provider.score.LootScoreProviderTypes.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.loot.provider.score.LootScoreProviderTypes.CODEC = value; }

// public com.mojang.serialization.Codec BASE_CODEC() { return wrapperContained.BASE_CODEC; }
// public void BASE_CODEC(com.mojang.serialization.Codec value) { wrapperContained.BASE_CODEC = value; }
// public static com.mojang.serialization.Codec BASE_CODEC() { return net.minecraft.loot.provider.score.LootScoreProviderTypes.BASE_CODEC; }
// public static void BASE_CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.loot.provider.score.LootScoreProviderTypes.BASE_CODEC = value; }

// public yarnwrap.loot.provider.score.LootScoreProviderType register(java.lang.String id,com.mojang.serialization.MapCodec codec) { return new yarnwrap.loot.provider.score.LootScoreProviderType(wrapperContained.register(id,codec)); }
// public static yarnwrap.loot.provider.score.LootScoreProviderType register(java.lang.String id,com.mojang.serialization.MapCodec codec, ) { return new yarnwrap.loot.provider.score.LootScoreProviderType(net.minecraft.loot.provider.score.LootScoreProviderTypes.register(id,codec)); }
// public com.mojang.datafixers.util.Either method_53449(yarnwrap.loot.provider.score.LootScoreProvider provider) { return wrapperContained.method_53449(provider.wrapperContained); }
// public static com.mojang.datafixers.util.Either method_53449(yarnwrap.loot.provider.score.LootScoreProvider provider, ) { return net.minecraft.loot.provider.score.LootScoreProviderTypes.method_53449(provider.wrapperContained); }

}