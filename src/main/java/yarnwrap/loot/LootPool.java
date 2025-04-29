package yarnwrap.loot;
public class LootPool { public net.minecraft.loot.LootPool wrapperContained; public LootPool(net.minecraft.loot.LootPool wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.loot.LootPool.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.loot.LootPool.CODEC = value; }

// public java.util.function.BiFunction javaFunctions() { return wrapperContained.javaFunctions; }
// public void javaFunctions(java.util.function.BiFunction value) { wrapperContained.javaFunctions = value; }
// public static java.util.function.BiFunction javaFunctions() { return net.minecraft.loot.LootPool.javaFunctions; }
// public static void javaFunctions(java.util.function.BiFunction value, ) { net.minecraft.loot.LootPool.javaFunctions = value; }

public java.util.List entries() { return wrapperContained.entries; }
// public void entries(java.util.List value) { wrapperContained.entries = value; }
// public static java.util.List entries() { return net.minecraft.loot.LootPool.entries; }
// public static void entries(java.util.List value, ) { net.minecraft.loot.LootPool.entries = value; }

public java.util.List conditions() { return wrapperContained.conditions; }
// public void conditions(java.util.List value) { wrapperContained.conditions = value; }
// public static java.util.List conditions() { return net.minecraft.loot.LootPool.conditions; }
// public static void conditions(java.util.List value, ) { net.minecraft.loot.LootPool.conditions = value; }

// public java.util.function.Predicate predicate() { return wrapperContained.predicate; }
// public void predicate(java.util.function.Predicate value) { wrapperContained.predicate = value; }
// public static java.util.function.Predicate predicate() { return net.minecraft.loot.LootPool.predicate; }
// public static void predicate(java.util.function.Predicate value, ) { net.minecraft.loot.LootPool.predicate = value; }

public java.util.List functions() { return wrapperContained.functions; }
// public void functions(java.util.List value) { wrapperContained.functions = value; }
// public static java.util.List functions() { return net.minecraft.loot.LootPool.functions; }
// public static void functions(java.util.List value, ) { net.minecraft.loot.LootPool.functions = value; }

public yarnwrap.loot.provider.number.LootNumberProvider rolls() { return new yarnwrap.loot.provider.number.LootNumberProvider(wrapperContained.rolls); }
// public void rolls(yarnwrap.loot.provider.number.LootNumberProvider value) { wrapperContained.rolls = value.wrapperContained; }
// public static yarnwrap.loot.provider.number.LootNumberProvider rolls() { return new yarnwrap.loot.provider.number.LootNumberProvider(net.minecraft.loot.LootPool.rolls); }
// public static void rolls(yarnwrap.loot.provider.number.LootNumberProvider value, ) { net.minecraft.loot.LootPool.rolls = value.wrapperContained; }

public yarnwrap.loot.provider.number.LootNumberProvider bonusRolls() { return new yarnwrap.loot.provider.number.LootNumberProvider(wrapperContained.bonusRolls); }
// public void bonusRolls(yarnwrap.loot.provider.number.LootNumberProvider value) { wrapperContained.bonusRolls = value.wrapperContained; }
// public static yarnwrap.loot.provider.number.LootNumberProvider bonusRolls() { return new yarnwrap.loot.provider.number.LootNumberProvider(net.minecraft.loot.LootPool.bonusRolls); }
// public static void bonusRolls(yarnwrap.loot.provider.number.LootNumberProvider value, ) { net.minecraft.loot.LootPool.bonusRolls = value.wrapperContained; }

// public LootPool(java.util.List entries,java.util.List conditions,java.util.List functions,yarnwrap.loot.provider.number.LootNumberProvider rolls,yarnwrap.loot.provider.number.LootNumberProvider bonusRolls) { this.wrapperContained = new net.minecraft.loot.LootPool(entries,conditions,functions,rolls.wrapperContained,bonusRolls.wrapperContained); }
public void addGeneratedLoot(java.util.function.Consumer lootConsumer,yarnwrap.loot.context.LootContext context) { wrapperContained.addGeneratedLoot(lootConsumer,context.wrapperContained); }
// public static void addGeneratedLoot(java.util.function.Consumer lootConsumer,yarnwrap.loot.context.LootContext context, ) { net.minecraft.loot.LootPool.addGeneratedLoot(lootConsumer,context.wrapperContained); }
// public void method_342(yarnwrap.loot.context.LootContext choice) { wrapperContained.method_342(choice.wrapperContained); }
// public static void method_342(yarnwrap.loot.context.LootContext choice, ) { net.minecraft.loot.LootPool.method_342(choice.wrapperContained); }
// public void supplyOnce(java.util.function.Consumer lootConsumer,yarnwrap.loot.context.LootContext context) { wrapperContained.supplyOnce(lootConsumer,context.wrapperContained); }
// public static void supplyOnce(java.util.function.Consumer lootConsumer,yarnwrap.loot.context.LootContext context, ) { net.minecraft.loot.LootPool.supplyOnce(lootConsumer,context.wrapperContained); }
// public Object builder() { return wrapperContained.builder(); }
public static Object builder() { return net.minecraft.loot.LootPool.builder(); }
public void validate(yarnwrap.loot.LootTableReporter reporter) { wrapperContained.validate(reporter.wrapperContained); }
// public static void validate(yarnwrap.loot.LootTableReporter reporter, ) { net.minecraft.loot.LootPool.validate(reporter.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_53268(Object instance) { return wrapperContained.method_53268(instance); }
// public static com.mojang.datafixers.kinds.App method_53268(Object instance, ) { return net.minecraft.loot.LootPool.method_53268(instance); }
// public yarnwrap.loot.provider.number.LootNumberProvider method_53269(yarnwrap.loot.LootPool pool) { return new yarnwrap.loot.provider.number.LootNumberProvider(wrapperContained.method_53269(pool.wrapperContained)); }
// public static yarnwrap.loot.provider.number.LootNumberProvider method_53269(yarnwrap.loot.LootPool pool, ) { return new yarnwrap.loot.provider.number.LootNumberProvider(net.minecraft.loot.LootPool.method_53269(pool.wrapperContained)); }
// public yarnwrap.loot.provider.number.LootNumberProvider method_53270(yarnwrap.loot.LootPool pool) { return new yarnwrap.loot.provider.number.LootNumberProvider(wrapperContained.method_53270(pool.wrapperContained)); }
// public static yarnwrap.loot.provider.number.LootNumberProvider method_53270(yarnwrap.loot.LootPool pool, ) { return new yarnwrap.loot.provider.number.LootNumberProvider(net.minecraft.loot.LootPool.method_53270(pool.wrapperContained)); }
// public java.util.List method_53271(yarnwrap.loot.LootPool pool) { return wrapperContained.method_53271(pool.wrapperContained); }
// public static java.util.List method_53271(yarnwrap.loot.LootPool pool, ) { return net.minecraft.loot.LootPool.method_53271(pool.wrapperContained); }
// public java.util.List method_53272(yarnwrap.loot.LootPool pool) { return wrapperContained.method_53272(pool.wrapperContained); }
// public static java.util.List method_53272(yarnwrap.loot.LootPool pool, ) { return net.minecraft.loot.LootPool.method_53272(pool.wrapperContained); }
// public java.util.List method_53273(yarnwrap.loot.LootPool pool) { return wrapperContained.method_53273(pool.wrapperContained); }
// public static java.util.List method_53273(yarnwrap.loot.LootPool pool, ) { return net.minecraft.loot.LootPool.method_53273(pool.wrapperContained); }

}