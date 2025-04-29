package yarnwrap.loot.provider.number;
public class LootNumberProviderTypes { public net.minecraft.loot.provider.number.LootNumberProviderTypes wrapperContained; public LootNumberProviderTypes(net.minecraft.loot.provider.number.LootNumberProviderTypes wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.loot.provider.number.LootNumberProviderTypes.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.loot.provider.number.LootNumberProviderTypes.CODEC = value; }

// public com.mojang.serialization.Codec BASE_CODEC() { return wrapperContained.BASE_CODEC; }
// public void BASE_CODEC(com.mojang.serialization.Codec value) { wrapperContained.BASE_CODEC = value; }
// public static com.mojang.serialization.Codec BASE_CODEC() { return net.minecraft.loot.provider.number.LootNumberProviderTypes.BASE_CODEC; }
// public static void BASE_CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.loot.provider.number.LootNumberProviderTypes.BASE_CODEC = value; }

// public yarnwrap.loot.provider.number.LootNumberProviderType register(java.lang.String id,com.mojang.serialization.MapCodec codec) { return new yarnwrap.loot.provider.number.LootNumberProviderType(wrapperContained.register(id,codec)); }
// public static yarnwrap.loot.provider.number.LootNumberProviderType register(java.lang.String id,com.mojang.serialization.MapCodec codec, ) { return new yarnwrap.loot.provider.number.LootNumberProviderType(net.minecraft.loot.provider.number.LootNumberProviderTypes.register(id,codec)); }
// public com.mojang.datafixers.util.Either method_53442(yarnwrap.loot.provider.number.LootNumberProvider provider) { return wrapperContained.method_53442(provider.wrapperContained); }
// public static com.mojang.datafixers.util.Either method_53442(yarnwrap.loot.provider.number.LootNumberProvider provider, ) { return net.minecraft.loot.provider.number.LootNumberProviderTypes.method_53442(provider.wrapperContained); }

}