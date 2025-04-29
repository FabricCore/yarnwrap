package yarnwrap.loot.provider.number;
public class StorageLootNumberProvider { public net.minecraft.loot.provider.number.StorageLootNumberProvider wrapperContained; public StorageLootNumberProvider(net.minecraft.loot.provider.number.StorageLootNumberProvider wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.loot.provider.number.StorageLootNumberProvider.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.loot.provider.number.StorageLootNumberProvider.CODEC = value; }

// public com.mojang.datafixers.kinds.App method_58470(Object instance) { return wrapperContained.method_58470(instance); }
// public static com.mojang.datafixers.kinds.App method_58470(Object instance, ) { return net.minecraft.loot.provider.number.StorageLootNumberProvider.method_58470(instance); }
// public java.util.Optional getNumber(yarnwrap.loot.context.LootContext context) { return wrapperContained.getNumber(context.wrapperContained); }
// public static java.util.Optional getNumber(yarnwrap.loot.context.LootContext context, ) { return net.minecraft.loot.provider.number.StorageLootNumberProvider.getNumber(context.wrapperContained); }

}