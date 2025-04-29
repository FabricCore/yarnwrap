package yarnwrap.world;
public class WanderingTraderManager { public net.minecraft.world.WanderingTraderManager wrapperContained; public WanderingTraderManager(net.minecraft.world.WanderingTraderManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.math.random.Random random() { return new yarnwrap.util.math.random.Random(wrapperContained.random); }
// public void random(yarnwrap.util.math.random.Random value) { wrapperContained.random = value.wrapperContained; }
// public static yarnwrap.util.math.random.Random random() { return new yarnwrap.util.math.random.Random(net.minecraft.world.WanderingTraderManager.random); }
// public static void random(yarnwrap.util.math.random.Random value, ) { net.minecraft.world.WanderingTraderManager.random = value.wrapperContained; }

// public int spawnTimer() { return wrapperContained.spawnTimer; }
// public void spawnTimer(int value) { wrapperContained.spawnTimer = value; }
// public static int spawnTimer() { return net.minecraft.world.WanderingTraderManager.spawnTimer; }
// public static void spawnTimer(int value, ) { net.minecraft.world.WanderingTraderManager.spawnTimer = value; }

// public int spawnDelay() { return wrapperContained.spawnDelay; }
// public void spawnDelay(int value) { wrapperContained.spawnDelay = value; }
// public static int spawnDelay() { return net.minecraft.world.WanderingTraderManager.spawnDelay; }
// public static void spawnDelay(int value, ) { net.minecraft.world.WanderingTraderManager.spawnDelay = value; }

// public int spawnChance() { return wrapperContained.spawnChance; }
// public void spawnChance(int value) { wrapperContained.spawnChance = value; }
// public static int spawnChance() { return net.minecraft.world.WanderingTraderManager.spawnChance; }
// public static void spawnChance(int value, ) { net.minecraft.world.WanderingTraderManager.spawnChance = value; }

// public yarnwrap.world.level.ServerWorldProperties properties() { return new yarnwrap.world.level.ServerWorldProperties(wrapperContained.properties); }
// public void properties(yarnwrap.world.level.ServerWorldProperties value) { wrapperContained.properties = value.wrapperContained; }
// public static yarnwrap.world.level.ServerWorldProperties properties() { return new yarnwrap.world.level.ServerWorldProperties(net.minecraft.world.WanderingTraderManager.properties); }
// public static void properties(yarnwrap.world.level.ServerWorldProperties value, ) { net.minecraft.world.WanderingTraderManager.properties = value.wrapperContained; }

// public int DEFAULT_SPAWN_DELAY() { return wrapperContained.DEFAULT_SPAWN_DELAY; }
// public void DEFAULT_SPAWN_DELAY(int value) { wrapperContained.DEFAULT_SPAWN_DELAY = value; }
public static int DEFAULT_SPAWN_DELAY() { return net.minecraft.world.WanderingTraderManager.DEFAULT_SPAWN_DELAY; }
// public static void DEFAULT_SPAWN_DELAY(int value, ) { net.minecraft.world.WanderingTraderManager.DEFAULT_SPAWN_DELAY = value; }

// public int DEFAULT_SPAWN_TIMER() { return wrapperContained.DEFAULT_SPAWN_TIMER; }
// public void DEFAULT_SPAWN_TIMER(int value) { wrapperContained.DEFAULT_SPAWN_TIMER = value; }
// public static int DEFAULT_SPAWN_TIMER() { return net.minecraft.world.WanderingTraderManager.DEFAULT_SPAWN_TIMER; }
// public static void DEFAULT_SPAWN_TIMER(int value, ) { net.minecraft.world.WanderingTraderManager.DEFAULT_SPAWN_TIMER = value; }

// public int MIN_SPAWN_CHANCE() { return wrapperContained.MIN_SPAWN_CHANCE; }
// public void MIN_SPAWN_CHANCE(int value) { wrapperContained.MIN_SPAWN_CHANCE = value; }
// public static int MIN_SPAWN_CHANCE() { return net.minecraft.world.WanderingTraderManager.MIN_SPAWN_CHANCE; }
// public static void MIN_SPAWN_CHANCE(int value, ) { net.minecraft.world.WanderingTraderManager.MIN_SPAWN_CHANCE = value; }

// public int MAX_SPAWN_CHANCE() { return wrapperContained.MAX_SPAWN_CHANCE; }
// public void MAX_SPAWN_CHANCE(int value) { wrapperContained.MAX_SPAWN_CHANCE = value; }
// public static int MAX_SPAWN_CHANCE() { return net.minecraft.world.WanderingTraderManager.MAX_SPAWN_CHANCE; }
// public static void MAX_SPAWN_CHANCE(int value, ) { net.minecraft.world.WanderingTraderManager.MAX_SPAWN_CHANCE = value; }

// public int DEFAULT_SPAWN_CHANCE() { return wrapperContained.DEFAULT_SPAWN_CHANCE; }
// public void DEFAULT_SPAWN_CHANCE(int value) { wrapperContained.DEFAULT_SPAWN_CHANCE = value; }
// public static int DEFAULT_SPAWN_CHANCE() { return net.minecraft.world.WanderingTraderManager.DEFAULT_SPAWN_CHANCE; }
// public static void DEFAULT_SPAWN_CHANCE(int value, ) { net.minecraft.world.WanderingTraderManager.DEFAULT_SPAWN_CHANCE = value; }

public WanderingTraderManager(yarnwrap.world.level.ServerWorldProperties properties) { this.wrapperContained = new net.minecraft.world.WanderingTraderManager(properties.wrapperContained); }
// public void spawnLlama(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.passive.WanderingTraderEntity wanderingTrader,int range) { wrapperContained.spawnLlama(world.wrapperContained,wanderingTrader.wrapperContained,range); }
// public static void spawnLlama(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.passive.WanderingTraderEntity wanderingTrader,int range, ) { net.minecraft.world.WanderingTraderManager.spawnLlama(world.wrapperContained,wanderingTrader.wrapperContained,range); }
// public yarnwrap.util.math.BlockPos getNearbySpawnPos(yarnwrap.world.WorldView world,yarnwrap.util.math.BlockPos pos,int range) { return new yarnwrap.util.math.BlockPos(wrapperContained.getNearbySpawnPos(world.wrapperContained,pos.wrapperContained,range)); }
// public static yarnwrap.util.math.BlockPos getNearbySpawnPos(yarnwrap.world.WorldView world,yarnwrap.util.math.BlockPos pos,int range, ) { return new yarnwrap.util.math.BlockPos(net.minecraft.world.WanderingTraderManager.getNearbySpawnPos(world.wrapperContained,pos.wrapperContained,range)); }
// public boolean trySpawn(yarnwrap.server.world.ServerWorld world) { return wrapperContained.trySpawn(world.wrapperContained); }
// public static boolean trySpawn(yarnwrap.server.world.ServerWorld world, ) { return net.minecraft.world.WanderingTraderManager.trySpawn(world.wrapperContained); }
// public boolean method_19631(yarnwrap.util.math.BlockPos pos) { return wrapperContained.method_19631(pos.wrapperContained); }
// public static boolean method_19631(yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.world.WanderingTraderManager.method_19631(pos.wrapperContained); }
// public boolean doesNotSuffocateAt(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.doesNotSuffocateAt(world.wrapperContained,pos.wrapperContained); }
// public static boolean doesNotSuffocateAt(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.world.WanderingTraderManager.doesNotSuffocateAt(world.wrapperContained,pos.wrapperContained); }
// public boolean method_44010(yarnwrap.registry.entry.RegistryEntry poiType) { return wrapperContained.method_44010(poiType.wrapperContained); }
// public static boolean method_44010(yarnwrap.registry.entry.RegistryEntry poiType, ) { return net.minecraft.world.WanderingTraderManager.method_44010(poiType.wrapperContained); }

}