package yarnwrap.loot.entry;
public class LootPoolEntryTypes { public net.minecraft.loot.entry.LootPoolEntryTypes wrapperContained; public LootPoolEntryTypes(net.minecraft.loot.entry.LootPoolEntryTypes wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
// public yarnwrap.loot.entry.LootPoolEntryType register(java.lang.String id,com.mojang.serialization.MapCodec codec) { return new yarnwrap.loot.entry.LootPoolEntryType(wrapperContained.register(id,codec)); }

}