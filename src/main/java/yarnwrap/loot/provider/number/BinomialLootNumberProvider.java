package yarnwrap.loot.provider.number;
public class BinomialLootNumberProvider { public net.minecraft.loot.provider.number.BinomialLootNumberProvider wrapperContained; public BinomialLootNumberProvider(net.minecraft.loot.provider.number.BinomialLootNumberProvider wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public BinomialLootNumberProvider(yarnwrap.loot.provider.number.LootNumberProvider n,yarnwrap.loot.provider.number.LootNumberProvider p) { this.wrapperContained = new net.minecraft.loot.provider.number.BinomialLootNumberProvider(n.wrapperContained,p.wrapperContained); }
public yarnwrap.loot.provider.number.BinomialLootNumberProvider create(int n,float p) { return new yarnwrap.loot.provider.number.BinomialLootNumberProvider(wrapperContained.create(n,p)); }
// public com.mojang.datafixers.kinds.App method_53438(Object instance) { return wrapperContained.method_53438(instance); }

}