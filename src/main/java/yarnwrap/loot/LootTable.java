package yarnwrap.loot;
public class LootTable { public net.minecraft.loot.LootTable wrapperContained; public LootTable(net.minecraft.loot.LootTable wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Optional randomSequenceId() { return wrapperContained.randomSequenceId; }
// public void randomSequenceId(java.util.Optional value) { wrapperContained.randomSequenceId = value; }
public com.mojang.serialization.Codec ENTRY_CODEC() { return wrapperContained.ENTRY_CODEC; }
// public void ENTRY_CODEC(com.mojang.serialization.Codec value) { wrapperContained.ENTRY_CODEC = value; }
public long DEFAULT_SEED() { return wrapperContained.DEFAULT_SEED; }
// public void DEFAULT_SEED(long value) { wrapperContained.DEFAULT_SEED = value; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
// public yarnwrap.loot.context.LootContextType type() { return new yarnwrap.loot.context.LootContextType(wrapperContained.type); }
// public void type(yarnwrap.loot.context.LootContextType value) { wrapperContained.type = value.wrapperContained; }
// public java.util.List pools() { return wrapperContained.pools; }
// public void pools(java.util.List value) { wrapperContained.pools = value; }
// public java.util.List functions() { return wrapperContained.functions; }
// public void functions(java.util.List value) { wrapperContained.functions = value; }
// public java.util.function.BiFunction combinedFunction() { return wrapperContained.combinedFunction; }
// public void combinedFunction(java.util.function.BiFunction value) { wrapperContained.combinedFunction = value; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
public yarnwrap.loot.context.LootContextType GENERIC() { return new yarnwrap.loot.context.LootContextType(wrapperContained.GENERIC); }
// public void GENERIC(yarnwrap.loot.context.LootContextType value) { wrapperContained.GENERIC = value.wrapperContained; }
public yarnwrap.loot.LootTable EMPTY() { return new yarnwrap.loot.LootTable(wrapperContained.EMPTY); }
// public void EMPTY(yarnwrap.loot.LootTable value) { wrapperContained.EMPTY = value.wrapperContained; }
// public LootTable(yarnwrap.loot.context.LootContextType type,java.util.Optional randomSequenceId,java.util.List pools,java.util.List functions) { this.wrapperContained = new net.minecraft.loot.LootTable(type.wrapperContained,randomSequenceId,pools,functions); }
// public it.unimi.dsi.fastutil.objects.ObjectArrayList generateLoot(yarnwrap.loot.context.LootContext context) { return wrapperContained.generateLoot(context.wrapperContained); }
public void generateLoot(yarnwrap.loot.context.LootContext context,java.util.function.Consumer lootConsumer) { wrapperContained.generateLoot(context.wrapperContained,lootConsumer); }
// public java.util.List getFreeSlots(yarnwrap.inventory.Inventory inventory,yarnwrap.util.math.random.Random random) { return wrapperContained.getFreeSlots(inventory.wrapperContained,random.wrapperContained); }
public yarnwrap.loot.context.LootContextType getType() { return new yarnwrap.loot.context.LootContextType(wrapperContained.getType()); }
public Object builder() { return wrapperContained.builder(); }
public void generateUnprocessedLoot(yarnwrap.loot.context.LootContext context,java.util.function.Consumer lootConsumer) { wrapperContained.generateUnprocessedLoot(context.wrapperContained,lootConsumer); }
public void supplyInventory(yarnwrap.inventory.Inventory inventory,yarnwrap.loot.context.LootContextParameterSet parameters,long seed) { wrapperContained.supplyInventory(inventory.wrapperContained,parameters.wrapperContained,seed); }
public void validate(yarnwrap.loot.LootTableReporter reporter) { wrapperContained.validate(reporter.wrapperContained); }
// public void method_331(yarnwrap.server.world.ServerWorld stack) { wrapperContained.method_331(stack.wrapperContained); }
public java.util.function.Consumer processStacks(yarnwrap.server.world.ServerWorld world,java.util.function.Consumer consumer) { return wrapperContained.processStacks(world.wrapperContained,consumer); }
// public void shuffle(it.unimi.dsi.fastutil.objects.ObjectArrayList drops,int freeSlots,yarnwrap.util.math.random.Random random) { wrapperContained.shuffle(drops,freeSlots,random.wrapperContained); }
public it.unimi.dsi.fastutil.objects.ObjectArrayList generateLoot(yarnwrap.loot.context.LootContextParameterSet parameters) { return wrapperContained.generateLoot(parameters.wrapperContained); }
public it.unimi.dsi.fastutil.objects.ObjectArrayList generateLoot(yarnwrap.loot.context.LootContextParameterSet parameters,long seed) { return wrapperContained.generateLoot(parameters.wrapperContained,seed); }
public void generateLoot(yarnwrap.loot.context.LootContextParameterSet parameters,long seed,java.util.function.Consumer lootConsumer) { wrapperContained.generateLoot(parameters.wrapperContained,seed,lootConsumer); }
public void generateUnprocessedLoot(yarnwrap.loot.context.LootContextParameterSet parameters,java.util.function.Consumer lootConsumer) { wrapperContained.generateUnprocessedLoot(parameters.wrapperContained,lootConsumer); }
public void generateLoot(yarnwrap.loot.context.LootContextParameterSet parameters,java.util.function.Consumer lootConsumer) { wrapperContained.generateLoot(parameters.wrapperContained,lootConsumer); }
// public com.mojang.datafixers.kinds.App method_53274(Object instance) { return wrapperContained.method_53274(instance); }
// public java.util.List method_53275(yarnwrap.loot.LootTable table) { return wrapperContained.method_53275(table.wrapperContained); }
// public java.util.List method_53276(yarnwrap.loot.LootTable table) { return wrapperContained.method_53276(table.wrapperContained); }
// public java.util.Optional method_53277(yarnwrap.loot.LootTable table) { return wrapperContained.method_53277(table.wrapperContained); }
// public yarnwrap.loot.context.LootContextType method_53278(yarnwrap.loot.LootTable table) { return new yarnwrap.loot.context.LootContextType(wrapperContained.method_53278(table.wrapperContained)); }
public it.unimi.dsi.fastutil.objects.ObjectArrayList generateLoot(yarnwrap.loot.context.LootContextParameterSet parameters,yarnwrap.util.math.random.Random random) { return wrapperContained.generateLoot(parameters.wrapperContained,random.wrapperContained); }

}