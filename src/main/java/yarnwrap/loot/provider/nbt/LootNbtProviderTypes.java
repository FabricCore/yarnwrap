package yarnwrap.loot.provider.nbt;
public class LootNbtProviderTypes { public net.minecraft.loot.provider.nbt.LootNbtProviderTypes wrapperContained; public LootNbtProviderTypes(net.minecraft.loot.provider.nbt.LootNbtProviderTypes wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
// public com.mojang.serialization.Codec BASE_CODEC() { return wrapperContained.BASE_CODEC; }
// public void BASE_CODEC(com.mojang.serialization.Codec value) { wrapperContained.BASE_CODEC = value; }
// public yarnwrap.loot.provider.nbt.LootNbtProviderType register(java.lang.String id,com.mojang.serialization.MapCodec codec) { return new yarnwrap.loot.provider.nbt.LootNbtProviderType(wrapperContained.register(id,codec)); }
// public com.mojang.datafixers.util.Either method_53436(yarnwrap.loot.provider.nbt.LootNbtProvider provider) { return wrapperContained.method_53436(provider.wrapperContained); }

}