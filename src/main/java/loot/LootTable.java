package yarnwrap.loot;
public class LootTable { public net.minecraft.loot.LootTable wrapperContained; public LootTable(net.minecraft.loot.LootTable wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Optional randomSequenceId() { return wrapperContained.randomSequenceId; }
public com.mojang.serialization.Codec ENTRY_CODEC() { return wrapperContained.ENTRY_CODEC; }
public long DEFAULT_SEED() { return wrapperContained.DEFAULT_SEED; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public yarnwrap.loot.context.LootContextType type() { return new yarnwrap.loot.context.LootContextType(wrapperContained.type); }
// public java.util.List pools() { return wrapperContained.pools; }
// public java.util.List functions() { return wrapperContained.functions; }
// public java.util.function.BiFunction combinedFunction() { return wrapperContained.combinedFunction; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
public yarnwrap.loot.context.LootContextType GENERIC() { return new yarnwrap.loot.context.LootContextType(wrapperContained.GENERIC); }
public yarnwrap.loot.LootTable EMPTY() { return new yarnwrap.loot.LootTable(wrapperContained.EMPTY); }
// public it.unimi.dsi.fastutil.objects.ObjectArrayList generateLoot(yarnwrap.loot.context.LootContext context) { return wrapperContained.generateLoot(context.wrapperContained); }
public void generateLoot(yarnwrap.loot.context.LootContext context,java.util.function.Consumer lootConsumer) { wrapperContained.generateLoot(context.wrapperContained,lootConsumer); }
// public java.util.List getFreeSlots(yarnwrap.inventory.Inventory inventory,yarnwrap.util.math.random.Random random) { return wrapperContained.getFreeSlots(inventory.wrapperContained,random.wrapperContained); }
public yarnwrap.loot.context.LootContextType getType() { return new yarnwrap.loot.context.LootContextType(wrapperContained.getType()); }
public Object builder() { return wrapperContained.builder(); }
public void generateUnprocessedLoot(yarnwrap.loot.context.LootContext context,java.util.function.Consumer lootConsumer) { wrapperContained.generateUnprocessedLoot(context.wrapperContained,lootConsumer); }
public void supplyInventory(yarnwrap.inventory.Inventory inventory,yarnwrap.loot.context.LootContextParameterSet parameters,long seed) { wrapperContained.supplyInventory(inventory.wrapperContained,parameters.wrapperContained,seed); }
public void validate(yarnwrap.loot.LootTableReporter reporter) { wrapperContained.validate(reporter.wrapperContained); }
public java.util.function.Consumer processStacks(yarnwrap.server.world.ServerWorld world,java.util.function.Consumer consumer) { return wrapperContained.processStacks(world.wrapperContained,consumer); }
// public void shuffle(it.unimi.dsi.fastutil.objects.ObjectArrayList drops,int freeSlots,yarnwrap.util.math.random.Random random) { wrapperContained.shuffle(drops,freeSlots,random.wrapperContained); }
public it.unimi.dsi.fastutil.objects.ObjectArrayList generateLoot(yarnwrap.loot.context.LootContextParameterSet parameters) { return wrapperContained.generateLoot(parameters.wrapperContained); }
public it.unimi.dsi.fastutil.objects.ObjectArrayList generateLoot(yarnwrap.loot.context.LootContextParameterSet parameters,long seed) { return wrapperContained.generateLoot(parameters.wrapperContained,seed); }
public void generateLoot(yarnwrap.loot.context.LootContextParameterSet parameters,long seed,java.util.function.Consumer lootConsumer) { wrapperContained.generateLoot(parameters.wrapperContained,seed,lootConsumer); }
public void generateUnprocessedLoot(yarnwrap.loot.context.LootContextParameterSet parameters,java.util.function.Consumer lootConsumer) { wrapperContained.generateUnprocessedLoot(parameters.wrapperContained,lootConsumer); }
public void generateLoot(yarnwrap.loot.context.LootContextParameterSet parameters,java.util.function.Consumer lootConsumer) { wrapperContained.generateLoot(parameters.wrapperContained,lootConsumer); }
public it.unimi.dsi.fastutil.objects.ObjectArrayList generateLoot(yarnwrap.loot.context.LootContextParameterSet parameters,yarnwrap.util.math.random.Random random) { return wrapperContained.generateLoot(parameters.wrapperContained,random.wrapperContained); }

}