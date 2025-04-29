package yarnwrap.loot.provider.nbt;
public class StorageLootNbtProvider { public net.minecraft.loot.provider.nbt.StorageLootNbtProvider wrapperContained; public StorageLootNbtProvider(net.minecraft.loot.provider.nbt.StorageLootNbtProvider wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier source() { return new yarnwrap.util.Identifier(wrapperContained.source); }
// public void source(yarnwrap.util.Identifier value) { wrapperContained.source = value.wrapperContained; }
// public static yarnwrap.util.Identifier source() { return new yarnwrap.util.Identifier(net.minecraft.loot.provider.nbt.StorageLootNbtProvider.source); }
// public static void source(yarnwrap.util.Identifier value, ) { net.minecraft.loot.provider.nbt.StorageLootNbtProvider.source = value.wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.loot.provider.nbt.StorageLootNbtProvider.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.loot.provider.nbt.StorageLootNbtProvider.CODEC = value; }

public StorageLootNbtProvider(yarnwrap.util.Identifier source) { this.wrapperContained = new net.minecraft.loot.provider.nbt.StorageLootNbtProvider(source.wrapperContained); }
// public yarnwrap.util.Identifier source() { return new yarnwrap.util.Identifier(wrapperContained.source()); }
// // public static yarnwrap.util.Identifier source() { return new yarnwrap.util.Identifier(net.minecraft.loot.provider.nbt.StorageLootNbtProvider.source()); }
// public com.mojang.datafixers.kinds.App method_53437(Object instance) { return wrapperContained.method_53437(instance); }
// public static com.mojang.datafixers.kinds.App method_53437(Object instance, ) { return net.minecraft.loot.provider.nbt.StorageLootNbtProvider.method_53437(instance); }

}