package yarnwrap.loot.provider.nbt;
public class StorageLootNbtProvider { public net.minecraft.loot.provider.nbt.StorageLootNbtProvider wrapperContained; public StorageLootNbtProvider(net.minecraft.loot.provider.nbt.StorageLootNbtProvider wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier source() { return new yarnwrap.util.Identifier(wrapperContained.source); }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public yarnwrap.util.Identifier source() { return new yarnwrap.util.Identifier(wrapperContained.source()); }

}