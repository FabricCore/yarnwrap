package yarnwrap.loot.function;
public class SetComponentsLootFunction { public net.minecraft.loot.function.SetComponentsLootFunction wrapperContained; public SetComponentsLootFunction(net.minecraft.loot.function.SetComponentsLootFunction wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public yarnwrap.component.ComponentChanges changes() { return new yarnwrap.component.ComponentChanges(wrapperContained.changes); }
// public void changes(yarnwrap.component.ComponentChanges value) { wrapperContained.changes = value.wrapperContained; }
// public SetComponentsLootFunction(java.util.List conditions,yarnwrap.component.ComponentChanges changes) { this.wrapperContained = new net.minecraft.loot.function.SetComponentsLootFunction(conditions,changes.wrapperContained); }
// public yarnwrap.component.ComponentChanges method_57649(yarnwrap.loot.function.SetComponentsLootFunction function) { return new yarnwrap.component.ComponentChanges(wrapperContained.method_57649(function.wrapperContained)); }
public Object builder(yarnwrap.component.ComponentType componentType,java.lang.Object value) { return wrapperContained.builder(componentType.wrapperContained,value); }
// public yarnwrap.loot.function.LootFunction method_57651(yarnwrap.component.ComponentType conditions) { return new yarnwrap.loot.function.LootFunction(wrapperContained.method_57651(conditions.wrapperContained)); }
// public com.mojang.datafixers.kinds.App method_57652(Object instance) { return wrapperContained.method_57652(instance); }

}