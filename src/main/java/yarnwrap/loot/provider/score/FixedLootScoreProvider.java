package yarnwrap.loot.provider.score;
public class FixedLootScoreProvider { public net.minecraft.loot.provider.score.FixedLootScoreProvider wrapperContained; public FixedLootScoreProvider(net.minecraft.loot.provider.score.FixedLootScoreProvider wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.loot.provider.score.FixedLootScoreProvider.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.loot.provider.score.FixedLootScoreProvider.CODEC = value; }

public FixedLootScoreProvider(java.lang.String name) { this.wrapperContained = new net.minecraft.loot.provider.score.FixedLootScoreProvider(name); }
// public yarnwrap.loot.provider.score.LootScoreProvider create(java.lang.String name) { return new yarnwrap.loot.provider.score.LootScoreProvider(wrapperContained.create(name)); }
// public static yarnwrap.loot.provider.score.LootScoreProvider create(java.lang.String name, ) { return new yarnwrap.loot.provider.score.LootScoreProvider(net.minecraft.loot.provider.score.FixedLootScoreProvider.create(name)); }
// public com.mojang.datafixers.kinds.App method_53446(Object instance) { return wrapperContained.method_53446(instance); }
// public static com.mojang.datafixers.kinds.App method_53446(Object instance, ) { return net.minecraft.loot.provider.score.FixedLootScoreProvider.method_53446(instance); }

}