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
// public CopyComponentsLootFunction(java.util.List conditions,Object source,java.util.Optional include,java.util.Optional exclude) { this.wrapperContained = new net.minecraft.loot.function.CopyComponentsLootFunction(conditions,source,include,exclude); }
// public Object builder(Object source) { return wrapperContained.builder(source); }
// public java.util.Optional method_57638(yarnwrap.loot.function.CopyComponentsLootFunction function) { return wrapperContained.method_57638(function.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_57639(Object instance) { return wrapperContained.method_57639(instance); }
// public Object method_57640(yarnwrap.loot.function.CopyComponentsLootFunction function) { return wrapperContained.method_57640(function.wrapperContained); }
// public java.util.Optional method_58726(yarnwrap.loot.function.CopyComponentsLootFunction function) { return wrapperContained.method_58726(function.wrapperContained); }
// public void method_58727(java.util.List includedTypes) { wrapperContained.method_58727(includedTypes); }
// public boolean method_58728(java.util.List type) { return wrapperContained.method_58728(type); }
// public void method_58729(java.util.List excludedTypes) { wrapperContained.method_58729(excludedTypes); }

}