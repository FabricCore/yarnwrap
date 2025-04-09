package yarnwrap.loot.context;
public class LootContextParameterSet { public net.minecraft.loot.context.LootContextParameterSet wrapperContained; public LootContextParameterSet(net.minecraft.loot.context.LootContextParameterSet wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.server.world.ServerWorld world() { return new yarnwrap.server.world.ServerWorld(wrapperContained.world); }
// public java.util.Map parameters() { return wrapperContained.parameters; }
// public java.util.Map dynamicDrops() { return wrapperContained.dynamicDrops; }
// public float luck() { return wrapperContained.luck; }
public yarnwrap.server.world.ServerWorld getWorld() { return new yarnwrap.server.world.ServerWorld(wrapperContained.getWorld()); }
public void addDynamicDrops(yarnwrap.util.Identifier id,java.util.function.Consumer lootConsumer) { wrapperContained.addDynamicDrops(id.wrapperContained,lootConsumer); }
public boolean contains(yarnwrap.loot.context.LootContextParameter parameter) { return wrapperContained.contains(parameter.wrapperContained); }
public float getLuck() { return wrapperContained.getLuck(); }
public java.lang.Object get(yarnwrap.loot.context.LootContextParameter parameter) { return wrapperContained.get(parameter.wrapperContained); }
public java.lang.Object getOptional(yarnwrap.loot.context.LootContextParameter parameter) { return wrapperContained.getOptional(parameter.wrapperContained); }

}