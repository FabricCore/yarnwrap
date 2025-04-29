package yarnwrap.loot.function;
public class SetLoreLootFunction { public net.minecraft.loot.function.SetLoreLootFunction wrapperContained; public SetLoreLootFunction(net.minecraft.loot.function.SetLoreLootFunction wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List lore() { return wrapperContained.lore; }
// public void lore(java.util.List value) { wrapperContained.lore = value; }
// public static java.util.List lore() { return net.minecraft.loot.function.SetLoreLootFunction.lore; }
// public static void lore(java.util.List value, ) { net.minecraft.loot.function.SetLoreLootFunction.lore = value; }

// public java.util.Optional entity() { return wrapperContained.entity; }
// public void entity(java.util.Optional value) { wrapperContained.entity = value; }
// public static java.util.Optional entity() { return net.minecraft.loot.function.SetLoreLootFunction.entity; }
// public static void entity(java.util.Optional value, ) { net.minecraft.loot.function.SetLoreLootFunction.entity = value; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.loot.function.SetLoreLootFunction.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.loot.function.SetLoreLootFunction.CODEC = value; }

// public yarnwrap.util.collection.ListOperation operation() { return new yarnwrap.util.collection.ListOperation(wrapperContained.operation); }
// public void operation(yarnwrap.util.collection.ListOperation value) { wrapperContained.operation = value.wrapperContained; }
// public static yarnwrap.util.collection.ListOperation operation() { return new yarnwrap.util.collection.ListOperation(net.minecraft.loot.function.SetLoreLootFunction.operation); }
// public static void operation(yarnwrap.util.collection.ListOperation value, ) { net.minecraft.loot.function.SetLoreLootFunction.operation = value.wrapperContained; }

public SetLoreLootFunction(java.util.List conditions,java.util.List lore,yarnwrap.util.collection.ListOperation operation,java.util.Optional entity) { this.wrapperContained = new net.minecraft.loot.function.SetLoreLootFunction(conditions,lore,operation.wrapperContained,entity); }
// public Object builder() { return wrapperContained.builder(); }
public static Object builder() { return net.minecraft.loot.function.SetLoreLootFunction.builder(); }
// public java.util.Set method_53381(Object entity) { return wrapperContained.method_53381(entity); }
// public static java.util.Set method_53381(Object entity, ) { return net.minecraft.loot.function.SetLoreLootFunction.method_53381(entity); }
// public java.util.Optional method_53382(yarnwrap.loot.function.SetLoreLootFunction function) { return wrapperContained.method_53382(function.wrapperContained); }
// public static java.util.Optional method_53382(yarnwrap.loot.function.SetLoreLootFunction function, ) { return net.minecraft.loot.function.SetLoreLootFunction.method_53382(function.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_53383(Object instance) { return wrapperContained.method_53383(instance); }
// public static com.mojang.datafixers.kinds.App method_53383(Object instance, ) { return net.minecraft.loot.function.SetLoreLootFunction.method_53383(instance); }
// public java.util.List method_53384(yarnwrap.loot.function.SetLoreLootFunction function) { return wrapperContained.method_53384(function.wrapperContained); }
// public static java.util.List method_53384(yarnwrap.loot.function.SetLoreLootFunction function, ) { return net.minecraft.loot.function.SetLoreLootFunction.method_53384(function.wrapperContained); }
// public yarnwrap.util.collection.ListOperation method_53385(yarnwrap.loot.function.SetLoreLootFunction function) { return new yarnwrap.util.collection.ListOperation(wrapperContained.method_53385(function.wrapperContained)); }
// public static yarnwrap.util.collection.ListOperation method_53385(yarnwrap.loot.function.SetLoreLootFunction function, ) { return new yarnwrap.util.collection.ListOperation(net.minecraft.loot.function.SetLoreLootFunction.method_53385(function.wrapperContained)); }
// public java.util.List getNewLoreTexts(yarnwrap.component.type.LoreComponent current,yarnwrap.loot.context.LootContext context) { return wrapperContained.getNewLoreTexts(current.wrapperContained,context.wrapperContained); }
// public static java.util.List getNewLoreTexts(yarnwrap.component.type.LoreComponent current,yarnwrap.loot.context.LootContext context, ) { return net.minecraft.loot.function.SetLoreLootFunction.getNewLoreTexts(current.wrapperContained,context.wrapperContained); }
// public yarnwrap.component.type.LoreComponent method_57659(yarnwrap.loot.context.LootContext component) { return new yarnwrap.component.type.LoreComponent(wrapperContained.method_57659(component.wrapperContained)); }
// public static yarnwrap.component.type.LoreComponent method_57659(yarnwrap.loot.context.LootContext component, ) { return new yarnwrap.component.type.LoreComponent(net.minecraft.loot.function.SetLoreLootFunction.method_57659(component.wrapperContained)); }

}