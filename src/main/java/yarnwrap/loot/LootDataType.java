package yarnwrap.loot;
public class LootDataType { public net.minecraft.loot.LootDataType wrapperContained; public LootDataType(net.minecraft.loot.LootDataType wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.loot.LootDataType PREDICATES() { return new yarnwrap.loot.LootDataType(wrapperContained.PREDICATES); }
// public void PREDICATES(yarnwrap.loot.LootDataType value) { wrapperContained.PREDICATES = value.wrapperContained; }
public static yarnwrap.loot.LootDataType PREDICATES() { return new yarnwrap.loot.LootDataType(net.minecraft.loot.LootDataType.PREDICATES); }
// public static void PREDICATES(yarnwrap.loot.LootDataType value, ) { net.minecraft.loot.LootDataType.PREDICATES = value.wrapperContained; }

// public yarnwrap.loot.LootDataType ITEM_MODIFIERS() { return new yarnwrap.loot.LootDataType(wrapperContained.ITEM_MODIFIERS); }
// public void ITEM_MODIFIERS(yarnwrap.loot.LootDataType value) { wrapperContained.ITEM_MODIFIERS = value.wrapperContained; }
public static yarnwrap.loot.LootDataType ITEM_MODIFIERS() { return new yarnwrap.loot.LootDataType(net.minecraft.loot.LootDataType.ITEM_MODIFIERS); }
// public static void ITEM_MODIFIERS(yarnwrap.loot.LootDataType value, ) { net.minecraft.loot.LootDataType.ITEM_MODIFIERS = value.wrapperContained; }

// public yarnwrap.loot.LootDataType LOOT_TABLES() { return new yarnwrap.loot.LootDataType(wrapperContained.LOOT_TABLES); }
// public void LOOT_TABLES(yarnwrap.loot.LootDataType value) { wrapperContained.LOOT_TABLES = value.wrapperContained; }
public static yarnwrap.loot.LootDataType LOOT_TABLES() { return new yarnwrap.loot.LootDataType(net.minecraft.loot.LootDataType.LOOT_TABLES); }
// public static void LOOT_TABLES(yarnwrap.loot.LootDataType value, ) { net.minecraft.loot.LootDataType.LOOT_TABLES = value.wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.loot.LootDataType.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.loot.LootDataType.LOGGER = value; }

public java.util.Optional parse(yarnwrap.util.Identifier id,com.mojang.serialization.DynamicOps ops,java.lang.Object json) { return wrapperContained.parse(id.wrapperContained,ops,json); }
// public static java.util.Optional parse(yarnwrap.util.Identifier id,com.mojang.serialization.DynamicOps ops,java.lang.Object json, ) { return net.minecraft.loot.LootDataType.parse(id.wrapperContained,ops,json); }
// public void method_51207(yarnwrap.loot.LootTableReporter reporter,yarnwrap.registry.RegistryKey key,yarnwrap.loot.context.LootContextAware value) { wrapperContained.method_51207(reporter.wrapperContained,key.wrapperContained,value.wrapperContained); }
// public static void method_51207(yarnwrap.loot.LootTableReporter reporter,yarnwrap.registry.RegistryKey key,yarnwrap.loot.context.LootContextAware value, ) { net.minecraft.loot.LootDataType.method_51207(reporter.wrapperContained,key.wrapperContained,value.wrapperContained); }
// public void method_51208(yarnwrap.loot.LootTableReporter reporter,yarnwrap.registry.RegistryKey key,yarnwrap.loot.LootTable value) { wrapperContained.method_51208(reporter.wrapperContained,key.wrapperContained,value.wrapperContained); }
// public static void method_51208(yarnwrap.loot.LootTableReporter reporter,yarnwrap.registry.RegistryKey key,yarnwrap.loot.LootTable value, ) { net.minecraft.loot.LootDataType.method_51208(reporter.wrapperContained,key.wrapperContained,value.wrapperContained); }
public void validate(yarnwrap.loot.LootTableReporter reporter,yarnwrap.registry.RegistryKey key,java.lang.Object value) { wrapperContained.validate(reporter.wrapperContained,key.wrapperContained,value); }
// public static void validate(yarnwrap.loot.LootTableReporter reporter,yarnwrap.registry.RegistryKey key,java.lang.Object value, ) { net.minecraft.loot.LootDataType.validate(reporter.wrapperContained,key.wrapperContained,value); }
// public java.util.stream.Stream stream() { return wrapperContained.stream(); }
public static java.util.stream.Stream stream() { return net.minecraft.loot.LootDataType.stream(); }
// public Object simpleValidator() { return wrapperContained.simpleValidator(); }
// public static Object simpleValidator() { return net.minecraft.loot.LootDataType.simpleValidator(); }
// public Object tableValidator() { return wrapperContained.tableValidator(); }
// public static Object tableValidator() { return net.minecraft.loot.LootDataType.tableValidator(); }
// public void method_53267(yarnwrap.util.Identifier error) { wrapperContained.method_53267(error.wrapperContained); }
// public static void method_53267(yarnwrap.util.Identifier error, ) { net.minecraft.loot.LootDataType.method_53267(error.wrapperContained); }

}