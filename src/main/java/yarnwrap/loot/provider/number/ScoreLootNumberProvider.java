package yarnwrap.loot.provider.number;
public class ScoreLootNumberProvider { public net.minecraft.loot.provider.number.ScoreLootNumberProvider wrapperContained; public ScoreLootNumberProvider(net.minecraft.loot.provider.number.ScoreLootNumberProvider wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.loot.provider.number.ScoreLootNumberProvider.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.loot.provider.number.ScoreLootNumberProvider.CODEC = value; }

public ScoreLootNumberProvider(yarnwrap.loot.provider.score.LootScoreProvider target,java.lang.String score,float scale) { this.wrapperContained = new net.minecraft.loot.provider.number.ScoreLootNumberProvider(target.wrapperContained,score,scale); }
// public yarnwrap.loot.provider.number.ScoreLootNumberProvider create(Object target,java.lang.String score) { return new yarnwrap.loot.provider.number.ScoreLootNumberProvider(wrapperContained.create(target,score)); }
// public static yarnwrap.loot.provider.number.ScoreLootNumberProvider create(Object target,java.lang.String score, ) { return new yarnwrap.loot.provider.number.ScoreLootNumberProvider(net.minecraft.loot.provider.number.ScoreLootNumberProvider.create(target,score)); }
// public yarnwrap.loot.provider.number.ScoreLootNumberProvider create(Object target,java.lang.String score,float scale) { return new yarnwrap.loot.provider.number.ScoreLootNumberProvider(wrapperContained.create(target,score,scale)); }
// public static yarnwrap.loot.provider.number.ScoreLootNumberProvider create(Object target,java.lang.String score,float scale, ) { return new yarnwrap.loot.provider.number.ScoreLootNumberProvider(net.minecraft.loot.provider.number.ScoreLootNumberProvider.create(target,score,scale)); }
// public com.mojang.datafixers.kinds.App method_53443(Object instance) { return wrapperContained.method_53443(instance); }
// public static com.mojang.datafixers.kinds.App method_53443(Object instance, ) { return net.minecraft.loot.provider.number.ScoreLootNumberProvider.method_53443(instance); }

}