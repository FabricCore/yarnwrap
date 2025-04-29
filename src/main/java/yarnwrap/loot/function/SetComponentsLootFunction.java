package yarnwrap.loot.function;
public class SetComponentsLootFunction { public net.minecraft.loot.function.SetComponentsLootFunction wrapperContained; public SetComponentsLootFunction(net.minecraft.loot.function.SetComponentsLootFunction wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.loot.function.SetComponentsLootFunction.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.loot.function.SetComponentsLootFunction.CODEC = value; }

// public yarnwrap.component.ComponentChanges changes() { return new yarnwrap.component.ComponentChanges(wrapperContained.changes); }
// public void changes(yarnwrap.component.ComponentChanges value) { wrapperContained.changes = value.wrapperContained; }
// public static yarnwrap.component.ComponentChanges changes() { return new yarnwrap.component.ComponentChanges(net.minecraft.loot.function.SetComponentsLootFunction.changes); }
// public static void changes(yarnwrap.component.ComponentChanges value, ) { net.minecraft.loot.function.SetComponentsLootFunction.changes = value.wrapperContained; }

// public SetComponentsLootFunction(java.util.List conditions,yarnwrap.component.ComponentChanges changes) { this.wrapperContained = new net.minecraft.loot.function.SetComponentsLootFunction(conditions,changes.wrapperContained); }
// public yarnwrap.component.ComponentChanges method_57649(yarnwrap.loot.function.SetComponentsLootFunction function) { return new yarnwrap.component.ComponentChanges(wrapperContained.method_57649(function.wrapperContained)); }
// public static yarnwrap.component.ComponentChanges method_57649(yarnwrap.loot.function.SetComponentsLootFunction function, ) { return new yarnwrap.component.ComponentChanges(net.minecraft.loot.function.SetComponentsLootFunction.method_57649(function.wrapperContained)); }
// public Object builder(yarnwrap.component.ComponentType componentType,java.lang.Object value) { return wrapperContained.builder(componentType.wrapperContained,value); }
// public static Object builder(yarnwrap.component.ComponentType componentType,java.lang.Object value, ) { return net.minecraft.loot.function.SetComponentsLootFunction.builder(componentType.wrapperContained,value); }
// public yarnwrap.loot.function.LootFunction method_57651(yarnwrap.component.ComponentType conditions) { return new yarnwrap.loot.function.LootFunction(wrapperContained.method_57651(conditions.wrapperContained)); }
// public static yarnwrap.loot.function.LootFunction method_57651(yarnwrap.component.ComponentType conditions, ) { return new yarnwrap.loot.function.LootFunction(net.minecraft.loot.function.SetComponentsLootFunction.method_57651(conditions.wrapperContained)); }
// public com.mojang.datafixers.kinds.App method_57652(Object instance) { return wrapperContained.method_57652(instance); }
// public static com.mojang.datafixers.kinds.App method_57652(Object instance, ) { return net.minecraft.loot.function.SetComponentsLootFunction.method_57652(instance); }

}