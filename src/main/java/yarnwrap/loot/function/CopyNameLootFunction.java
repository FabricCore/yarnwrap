package yarnwrap.loot.function;
public class CopyNameLootFunction { public net.minecraft.loot.function.CopyNameLootFunction wrapperContained; public CopyNameLootFunction(net.minecraft.loot.function.CopyNameLootFunction wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object source() { return wrapperContained.source; }
// // public void source(Object value) { wrapperContained.source = value; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public Object builder(Object source) { return wrapperContained.builder(source); }

}