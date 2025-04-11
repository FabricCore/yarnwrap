package yarnwrap.loot.function;
public class CopyComponentsLootFunction { public net.minecraft.loot.function.CopyComponentsLootFunction wrapperContained; public CopyComponentsLootFunction(net.minecraft.loot.function.CopyComponentsLootFunction wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public Object source() { return wrapperContained.source; }
// // public void source(Object value) { wrapperContained.source = value; }
// public java.util.Optional include() { return wrapperContained.include; }
// public void include(java.util.Optional value) { wrapperContained.include = value; }
// public java.util.Optional exclude() { return wrapperContained.exclude; }
// public void exclude(java.util.Optional value) { wrapperContained.exclude = value; }
// public java.util.function.Predicate filter() { return wrapperContained.filter; }
// public void filter(java.util.function.Predicate value) { wrapperContained.filter = value; }
// public Object builder(Object source) { return wrapperContained.builder(source); }

}