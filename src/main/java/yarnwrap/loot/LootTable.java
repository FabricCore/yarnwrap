package yarnwrap.loot;
public class LootTable { public net.minecraft.loot.LootTable wrapperContained; public LootTable(net.minecraft.loot.LootTable wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Optional randomSequenceId() { return wrapperContained.randomSequenceId; }
// public void randomSequenceId(java.util.Optional value) { wrapperContained.randomSequenceId = value; }
// public static java.util.Optional randomSequenceId() { return net.minecraft.loot.LootTable.randomSequenceId; }
// public static void randomSequenceId(java.util.Optional value, ) { net.minecraft.loot.LootTable.randomSequenceId = value; }

// public com.mojang.serialization.Codec ENTRY_CODEC() { return wrapperContained.ENTRY_CODEC; }
// public void ENTRY_CODEC(com.mojang.serialization.Codec value) { wrapperContained.ENTRY_CODEC = value; }
public static com.mojang.serialization.Codec ENTRY_CODEC() { return net.minecraft.loot.LootTable.ENTRY_CODEC; }
// public static void ENTRY_CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.loot.LootTable.ENTRY_CODEC = value; }

// public long DEFAULT_SEED() { return wrapperContained.DEFAULT_SEED; }
// public void DEFAULT_SEED(long value) { wrapperContained.DEFAULT_SEED = value; }
public static long DEFAULT_SEED() { return net.minecraft.loot.LootTable.DEFAULT_SEED; }
// public static void DEFAULT_SEED(long value, ) { net.minecraft.loot.LootTable.DEFAULT_SEED = value; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.loot.LootTable.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.loot.LootTable.CODEC = value; }

// public yarnwrap.loot.context.LootContextType type() { return new yarnwrap.loot.context.LootContextType(wrapperContained.type); }
// public void type(yarnwrap.loot.context.LootContextType value) { wrapperContained.type = value.wrapperContained; }
// public static yarnwrap.loot.context.LootContextType type() { return new yarnwrap.loot.context.LootContextType(net.minecraft.loot.LootTable.type); }
// public static void type(yarnwrap.loot.context.LootContextType value, ) { net.minecraft.loot.LootTable.type = value.wrapperContained; }

// public java.util.List pools() { return wrapperContained.pools; }
// public void pools(java.util.List value) { wrapperContained.pools = value; }
// public static java.util.List pools() { return net.minecraft.loot.LootTable.pools; }
// public static void pools(java.util.List value, ) { net.minecraft.loot.LootTable.pools = value; }

// public java.util.List functions() { return wrapperContained.functions; }
// public void functions(java.util.List value) { wrapperContained.functions = value; }
// public static java.util.List functions() { return net.minecraft.loot.LootTable.functions; }
// public static void functions(java.util.List value, ) { net.minecraft.loot.LootTable.functions = value; }

// public java.util.function.BiFunction combinedFunction() { return wrapperContained.combinedFunction; }
// public void combinedFunction(java.util.function.BiFunction value) { wrapperContained.combinedFunction = value; }
// public static java.util.function.BiFunction combinedFunction() { return net.minecraft.loot.LootTable.combinedFunction; }
// public static void combinedFunction(java.util.function.BiFunction value, ) { net.minecraft.loot.LootTable.combinedFunction = value; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.loot.LootTable.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.loot.LootTable.LOGGER = value; }

// public yarnwrap.loot.context.LootContextType GENERIC() { return new yarnwrap.loot.context.LootContextType(wrapperContained.GENERIC); }
// public void GENERIC(yarnwrap.loot.context.LootContextType value) { wrapperContained.GENERIC = value.wrapperContained; }
public static yarnwrap.loot.context.LootContextType GENERIC() { return new yarnwrap.loot.context.LootContextType(net.minecraft.loot.LootTable.GENERIC); }
// public static void GENERIC(yarnwrap.loot.context.LootContextType value, ) { net.minecraft.loot.LootTable.GENERIC = value.wrapperContained; }

// public yarnwrap.loot.LootTable EMPTY() { return new yarnwrap.loot.LootTable(wrapperContained.EMPTY); }
// public void EMPTY(yarnwrap.loot.LootTable value) { wrapperContained.EMPTY = value.wrapperContained; }
public static yarnwrap.loot.LootTable EMPTY() { return new yarnwrap.loot.LootTable(net.minecraft.loot.LootTable.EMPTY); }
// public static void EMPTY(yarnwrap.loot.LootTable value, ) { net.minecraft.loot.LootTable.EMPTY = value.wrapperContained; }

// public LootTable(yarnwrap.loot.context.LootContextType type,java.util.Optional randomSequenceId,java.util.List pools,java.util.List functions) { this.wrapperContained = new net.minecraft.loot.LootTable(type.wrapperContained,randomSequenceId,pools,functions); }
// public it.unimi.dsi.fastutil.objects.ObjectArrayList generateLoot(yarnwrap.loot.context.LootContext context) { return wrapperContained.generateLoot(context.wrapperContained); }
// public static it.unimi.dsi.fastutil.objects.ObjectArrayList generateLoot(yarnwrap.loot.context.LootContext context, ) { return net.minecraft.loot.LootTable.generateLoot(context.wrapperContained); }
public void generateLoot(yarnwrap.loot.context.LootContext context,java.util.function.Consumer lootConsumer) { wrapperContained.generateLoot(context.wrapperContained,lootConsumer); }
// public static void generateLoot(yarnwrap.loot.context.LootContext context,java.util.function.Consumer lootConsumer, ) { net.minecraft.loot.LootTable.generateLoot(context.wrapperContained,lootConsumer); }
// public java.util.List getFreeSlots(yarnwrap.inventory.Inventory inventory,yarnwrap.util.math.random.Random random) { return wrapperContained.getFreeSlots(inventory.wrapperContained,random.wrapperContained); }
// public static java.util.List getFreeSlots(yarnwrap.inventory.Inventory inventory,yarnwrap.util.math.random.Random random, ) { return net.minecraft.loot.LootTable.getFreeSlots(inventory.wrapperContained,random.wrapperContained); }
public yarnwrap.loot.context.LootContextType getType() { return new yarnwrap.loot.context.LootContextType(wrapperContained.getType()); }
// public static yarnwrap.loot.context.LootContextType getType() { return new yarnwrap.loot.context.LootContextType(net.minecraft.loot.LootTable.getType()); }
// public Object builder() { return wrapperContained.builder(); }
public static Object builder() { return net.minecraft.loot.LootTable.builder(); }
public void generateUnprocessedLoot(yarnwrap.loot.context.LootContext context,java.util.function.Consumer lootConsumer) { wrapperContained.generateUnprocessedLoot(context.wrapperContained,lootConsumer); }
// public static void generateUnprocessedLoot(yarnwrap.loot.context.LootContext context,java.util.function.Consumer lootConsumer, ) { net.minecraft.loot.LootTable.generateUnprocessedLoot(context.wrapperContained,lootConsumer); }
public void supplyInventory(yarnwrap.inventory.Inventory inventory,yarnwrap.loot.context.LootContextParameterSet parameters,long seed) { wrapperContained.supplyInventory(inventory.wrapperContained,parameters.wrapperContained,seed); }
// public static void supplyInventory(yarnwrap.inventory.Inventory inventory,yarnwrap.loot.context.LootContextParameterSet parameters,long seed, ) { net.minecraft.loot.LootTable.supplyInventory(inventory.wrapperContained,parameters.wrapperContained,seed); }
public void validate(yarnwrap.loot.LootTableReporter reporter) { wrapperContained.validate(reporter.wrapperContained); }
// public static void validate(yarnwrap.loot.LootTableReporter reporter, ) { net.minecraft.loot.LootTable.validate(reporter.wrapperContained); }
// public void method_331(yarnwrap.server.world.ServerWorld stack) { wrapperContained.method_331(stack.wrapperContained); }
// public static void method_331(yarnwrap.server.world.ServerWorld stack, ) { net.minecraft.loot.LootTable.method_331(stack.wrapperContained); }
// public java.util.function.Consumer processStacks(yarnwrap.server.world.ServerWorld world,java.util.function.Consumer consumer) { return wrapperContained.processStacks(world.wrapperContained,consumer); }
// public static java.util.function.Consumer processStacks(yarnwrap.server.world.ServerWorld world,java.util.function.Consumer consumer, ) { return net.minecraft.loot.LootTable.processStacks(world.wrapperContained,consumer); }
// public void shuffle(it.unimi.dsi.fastutil.objects.ObjectArrayList drops,int freeSlots,yarnwrap.util.math.random.Random random) { wrapperContained.shuffle(drops,freeSlots,random.wrapperContained); }
// public static void shuffle(it.unimi.dsi.fastutil.objects.ObjectArrayList drops,int freeSlots,yarnwrap.util.math.random.Random random, ) { net.minecraft.loot.LootTable.shuffle(drops,freeSlots,random.wrapperContained); }
public it.unimi.dsi.fastutil.objects.ObjectArrayList generateLoot(yarnwrap.loot.context.LootContextParameterSet parameters) { return wrapperContained.generateLoot(parameters.wrapperContained); }
// public static it.unimi.dsi.fastutil.objects.ObjectArrayList generateLoot(yarnwrap.loot.context.LootContextParameterSet parameters, ) { return net.minecraft.loot.LootTable.generateLoot(parameters.wrapperContained); }
public it.unimi.dsi.fastutil.objects.ObjectArrayList generateLoot(yarnwrap.loot.context.LootContextParameterSet parameters,long seed) { return wrapperContained.generateLoot(parameters.wrapperContained,seed); }
// public static it.unimi.dsi.fastutil.objects.ObjectArrayList generateLoot(yarnwrap.loot.context.LootContextParameterSet parameters,long seed, ) { return net.minecraft.loot.LootTable.generateLoot(parameters.wrapperContained,seed); }
public void generateLoot(yarnwrap.loot.context.LootContextParameterSet parameters,long seed,java.util.function.Consumer lootConsumer) { wrapperContained.generateLoot(parameters.wrapperContained,seed,lootConsumer); }
// public static void generateLoot(yarnwrap.loot.context.LootContextParameterSet parameters,long seed,java.util.function.Consumer lootConsumer, ) { net.minecraft.loot.LootTable.generateLoot(parameters.wrapperContained,seed,lootConsumer); }
public void generateUnprocessedLoot(yarnwrap.loot.context.LootContextParameterSet parameters,java.util.function.Consumer lootConsumer) { wrapperContained.generateUnprocessedLoot(parameters.wrapperContained,lootConsumer); }
// public static void generateUnprocessedLoot(yarnwrap.loot.context.LootContextParameterSet parameters,java.util.function.Consumer lootConsumer, ) { net.minecraft.loot.LootTable.generateUnprocessedLoot(parameters.wrapperContained,lootConsumer); }
public void generateLoot(yarnwrap.loot.context.LootContextParameterSet parameters,java.util.function.Consumer lootConsumer) { wrapperContained.generateLoot(parameters.wrapperContained,lootConsumer); }
// public static void generateLoot(yarnwrap.loot.context.LootContextParameterSet parameters,java.util.function.Consumer lootConsumer, ) { net.minecraft.loot.LootTable.generateLoot(parameters.wrapperContained,lootConsumer); }
// public com.mojang.datafixers.kinds.App method_53274(Object instance) { return wrapperContained.method_53274(instance); }
// public static com.mojang.datafixers.kinds.App method_53274(Object instance, ) { return net.minecraft.loot.LootTable.method_53274(instance); }
// public java.util.List method_53275(yarnwrap.loot.LootTable table) { return wrapperContained.method_53275(table.wrapperContained); }
// public static java.util.List method_53275(yarnwrap.loot.LootTable table, ) { return net.minecraft.loot.LootTable.method_53275(table.wrapperContained); }
// public java.util.List method_53276(yarnwrap.loot.LootTable table) { return wrapperContained.method_53276(table.wrapperContained); }
// public static java.util.List method_53276(yarnwrap.loot.LootTable table, ) { return net.minecraft.loot.LootTable.method_53276(table.wrapperContained); }
// public java.util.Optional method_53277(yarnwrap.loot.LootTable table) { return wrapperContained.method_53277(table.wrapperContained); }
// public static java.util.Optional method_53277(yarnwrap.loot.LootTable table, ) { return net.minecraft.loot.LootTable.method_53277(table.wrapperContained); }
// public yarnwrap.loot.context.LootContextType method_53278(yarnwrap.loot.LootTable table) { return new yarnwrap.loot.context.LootContextType(wrapperContained.method_53278(table.wrapperContained)); }
// public static yarnwrap.loot.context.LootContextType method_53278(yarnwrap.loot.LootTable table, ) { return new yarnwrap.loot.context.LootContextType(net.minecraft.loot.LootTable.method_53278(table.wrapperContained)); }
public it.unimi.dsi.fastutil.objects.ObjectArrayList generateLoot(yarnwrap.loot.context.LootContextParameterSet parameters,yarnwrap.util.math.random.Random random) { return wrapperContained.generateLoot(parameters.wrapperContained,random.wrapperContained); }
// public static it.unimi.dsi.fastutil.objects.ObjectArrayList generateLoot(yarnwrap.loot.context.LootContextParameterSet parameters,yarnwrap.util.math.random.Random random, ) { return net.minecraft.loot.LootTable.generateLoot(parameters.wrapperContained,random.wrapperContained); }

}