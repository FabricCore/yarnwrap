package yarnwrap.loot.context;
public class LootWorldContext { public net.minecraft.loot.context.LootWorldContext wrapperContained; public LootWorldContext(net.minecraft.loot.context.LootWorldContext wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.server.world.ServerWorld world() { return new yarnwrap.server.world.ServerWorld(wrapperContained.world); }
// public void world(yarnwrap.server.world.ServerWorld value) { wrapperContained.world = value.wrapperContained; }
// public static yarnwrap.server.world.ServerWorld world() { return new yarnwrap.server.world.ServerWorld(net.minecraft.loot.context.LootWorldContext.world); }
// public static void world(yarnwrap.server.world.ServerWorld value, ) { net.minecraft.loot.context.LootWorldContext.world = value.wrapperContained; }

// public yarnwrap.util.context.ContextParameterMap parameters() { return new yarnwrap.util.context.ContextParameterMap(wrapperContained.parameters); }
// public void parameters(yarnwrap.util.context.ContextParameterMap value) { wrapperContained.parameters = value.wrapperContained; }
// public static yarnwrap.util.context.ContextParameterMap parameters() { return new yarnwrap.util.context.ContextParameterMap(net.minecraft.loot.context.LootWorldContext.parameters); }
// public static void parameters(yarnwrap.util.context.ContextParameterMap value, ) { net.minecraft.loot.context.LootWorldContext.parameters = value.wrapperContained; }

// public java.util.Map dynamicDrops() { return wrapperContained.dynamicDrops; }
// public void dynamicDrops(java.util.Map value) { wrapperContained.dynamicDrops = value; }
// public static java.util.Map dynamicDrops() { return net.minecraft.loot.context.LootWorldContext.dynamicDrops; }
// public static void dynamicDrops(java.util.Map value, ) { net.minecraft.loot.context.LootWorldContext.dynamicDrops = value; }

// public float luck() { return wrapperContained.luck; }
// public void luck(float value) { wrapperContained.luck = value; }
// public static float luck() { return net.minecraft.loot.context.LootWorldContext.luck; }
// public static void luck(float value, ) { net.minecraft.loot.context.LootWorldContext.luck = value; }

public LootWorldContext(yarnwrap.server.world.ServerWorld world,yarnwrap.util.context.ContextParameterMap parameters,java.util.Map dynamicDrops,float luck) { this.wrapperContained = new net.minecraft.loot.context.LootWorldContext(world.wrapperContained,parameters.wrapperContained,dynamicDrops,luck); }
public yarnwrap.server.world.ServerWorld getWorld() { return new yarnwrap.server.world.ServerWorld(wrapperContained.getWorld()); }
// public static yarnwrap.server.world.ServerWorld getWorld() { return new yarnwrap.server.world.ServerWorld(net.minecraft.loot.context.LootWorldContext.getWorld()); }
public void addDynamicDrops(yarnwrap.util.Identifier id,java.util.function.Consumer lootConsumer) { wrapperContained.addDynamicDrops(id.wrapperContained,lootConsumer); }
// public static void addDynamicDrops(yarnwrap.util.Identifier id,java.util.function.Consumer lootConsumer, ) { net.minecraft.loot.context.LootWorldContext.addDynamicDrops(id.wrapperContained,lootConsumer); }
public float getLuck() { return wrapperContained.getLuck(); }
// public static float getLuck() { return net.minecraft.loot.context.LootWorldContext.getLuck(); }
public yarnwrap.util.context.ContextParameterMap getParameters() { return new yarnwrap.util.context.ContextParameterMap(wrapperContained.getParameters()); }
// public static yarnwrap.util.context.ContextParameterMap getParameters() { return new yarnwrap.util.context.ContextParameterMap(net.minecraft.loot.context.LootWorldContext.getParameters()); }

}