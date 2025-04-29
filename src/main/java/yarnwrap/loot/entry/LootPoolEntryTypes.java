package yarnwrap.loot.entry;
public class LootPoolEntryTypes { public net.minecraft.loot.entry.LootPoolEntryTypes wrapperContained; public LootPoolEntryTypes(net.minecraft.loot.entry.LootPoolEntryTypes wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.loot.entry.LootPoolEntryTypes.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.loot.entry.LootPoolEntryTypes.CODEC = value; }

// public yarnwrap.loot.entry.LootPoolEntryType register(java.lang.String id,com.mojang.serialization.MapCodec codec) { return new yarnwrap.loot.entry.LootPoolEntryType(wrapperContained.register(id,codec)); }
// public static yarnwrap.loot.entry.LootPoolEntryType register(java.lang.String id,com.mojang.serialization.MapCodec codec, ) { return new yarnwrap.loot.entry.LootPoolEntryType(net.minecraft.loot.entry.LootPoolEntryTypes.register(id,codec)); }

}