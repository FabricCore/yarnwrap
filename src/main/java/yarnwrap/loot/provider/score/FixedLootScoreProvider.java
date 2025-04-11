package yarnwrap.loot.provider.score;
public class FixedLootScoreProvider { public net.minecraft.loot.provider.score.FixedLootScoreProvider wrapperContained; public FixedLootScoreProvider(net.minecraft.loot.provider.score.FixedLootScoreProvider wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public yarnwrap.loot.provider.score.LootScoreProvider create(java.lang.String name) { return new yarnwrap.loot.provider.score.LootScoreProvider(wrapperContained.create(name)); }

}