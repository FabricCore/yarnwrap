package yarnwrap.loot.context;
public class LootContextParameterSet { public net.minecraft.loot.context.LootContextParameterSet wrapperContained; public LootContextParameterSet(net.minecraft.loot.context.LootContextParameterSet wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.server.world.ServerWorld world() { return new yarnwrap.server.world.ServerWorld(wrapperContained.world); }
// public void world(yarnwrap.server.world.ServerWorld value) { wrapperContained.world = value.wrapperContained; }
// public java.util.Map parameters() { return wrapperContained.parameters; }
// public void parameters(java.util.Map value) { wrapperContained.parameters = value; }
// public java.util.Map dynamicDrops() { return wrapperContained.dynamicDrops; }
// public void dynamicDrops(java.util.Map value) { wrapperContained.dynamicDrops = value; }
// public float luck() { return wrapperContained.luck; }
// public void luck(float value) { wrapperContained.luck = value; }
public LootContextParameterSet(yarnwrap.server.world.ServerWorld world,java.util.Map parameters,java.util.Map dynamicDrops,float luck) { this.wrapperContained = new net.minecraft.loot.context.LootContextParameterSet(world.wrapperContained,parameters,dynamicDrops,luck); }
public yarnwrap.server.world.ServerWorld getWorld() { return new yarnwrap.server.world.ServerWorld(wrapperContained.getWorld()); }
public void addDynamicDrops(yarnwrap.util.Identifier id,java.util.function.Consumer lootConsumer) { wrapperContained.addDynamicDrops(id.wrapperContained,lootConsumer); }
public boolean contains(yarnwrap.loot.context.LootContextParameter parameter) { return wrapperContained.contains(parameter.wrapperContained); }
public float getLuck() { return wrapperContained.getLuck(); }
public java.lang.Object get(yarnwrap.loot.context.LootContextParameter parameter) { return wrapperContained.get(parameter.wrapperContained); }
public java.lang.Object method_51868(yarnwrap.loot.context.LootContextParameter parameter) { return wrapperContained.method_51868(parameter.wrapperContained); }
public java.lang.Object getOptional(yarnwrap.loot.context.LootContextParameter parameter) { return wrapperContained.getOptional(parameter.wrapperContained); }

}