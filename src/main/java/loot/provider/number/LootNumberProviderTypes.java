package yarnwrap.loot.provider.number;
public class LootNumberProviderTypes { public net.minecraft.loot.provider.number.LootNumberProviderTypes wrapperContained; public LootNumberProviderTypes(net.minecraft.loot.provider.number.LootNumberProviderTypes wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public com.mojang.serialization.Codec BASE_CODEC() { return wrapperContained.BASE_CODEC; }
// public yarnwrap.loot.provider.number.LootNumberProviderType register(java.lang.String id,com.mojang.serialization.MapCodec codec) { return new yarnwrap.loot.provider.number.LootNumberProviderType(wrapperContained.register(id,codec)); }

}