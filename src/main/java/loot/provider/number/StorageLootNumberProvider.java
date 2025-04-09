package yarnwrap.loot.provider.number;
public class StorageLootNumberProvider { public net.minecraft.loot.provider.number.StorageLootNumberProvider wrapperContained; public StorageLootNumberProvider(net.minecraft.loot.provider.number.StorageLootNumberProvider wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public java.util.Optional getNumber(yarnwrap.loot.context.LootContext context) { return wrapperContained.getNumber(context.wrapperContained); }

}