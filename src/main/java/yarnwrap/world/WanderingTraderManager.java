package yarnwrap.world;
public class WanderingTraderManager { public net.minecraft.world.WanderingTraderManager wrapperContained; public WanderingTraderManager(net.minecraft.world.WanderingTraderManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.math.random.Random random() { return new yarnwrap.util.math.random.Random(wrapperContained.random); }
// public void random(yarnwrap.util.math.random.Random value) { wrapperContained.random = value.wrapperContained; }
// public int spawnTimer() { return wrapperContained.spawnTimer; }
// public void spawnTimer(int value) { wrapperContained.spawnTimer = value; }
// public int spawnDelay() { return wrapperContained.spawnDelay; }
// public void spawnDelay(int value) { wrapperContained.spawnDelay = value; }
// public int spawnChance() { return wrapperContained.spawnChance; }
// public void spawnChance(int value) { wrapperContained.spawnChance = value; }
// public yarnwrap.world.level.ServerWorldProperties properties() { return new yarnwrap.world.level.ServerWorldProperties(wrapperContained.properties); }
// public void properties(yarnwrap.world.level.ServerWorldProperties value) { wrapperContained.properties = value.wrapperContained; }
public int DEFAULT_SPAWN_DELAY() { return wrapperContained.DEFAULT_SPAWN_DELAY; }
// public void DEFAULT_SPAWN_DELAY(int value) { wrapperContained.DEFAULT_SPAWN_DELAY = value; }
// public int DEFAULT_SPAWN_TIMER() { return wrapperContained.DEFAULT_SPAWN_TIMER; }
// public void DEFAULT_SPAWN_TIMER(int value) { wrapperContained.DEFAULT_SPAWN_TIMER = value; }
// public int MIN_SPAWN_CHANCE() { return wrapperContained.MIN_SPAWN_CHANCE; }
// public void MIN_SPAWN_CHANCE(int value) { wrapperContained.MIN_SPAWN_CHANCE = value; }
// public int MAX_SPAWN_CHANCE() { return wrapperContained.MAX_SPAWN_CHANCE; }
// public void MAX_SPAWN_CHANCE(int value) { wrapperContained.MAX_SPAWN_CHANCE = value; }
// public int DEFAULT_SPAWN_CHANCE() { return wrapperContained.DEFAULT_SPAWN_CHANCE; }
// public void DEFAULT_SPAWN_CHANCE(int value) { wrapperContained.DEFAULT_SPAWN_CHANCE = value; }
// public void spawnLlama(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.passive.WanderingTraderEntity wanderingTrader,int range) { wrapperContained.spawnLlama(world.wrapperContained,wanderingTrader.wrapperContained,range); }
// public yarnwrap.util.math.BlockPos getNearbySpawnPos(yarnwrap.world.WorldView world,yarnwrap.util.math.BlockPos pos,int range) { return new yarnwrap.util.math.BlockPos(wrapperContained.getNearbySpawnPos(world.wrapperContained,pos.wrapperContained,range)); }
// public boolean trySpawn(yarnwrap.server.world.ServerWorld world) { return wrapperContained.trySpawn(world.wrapperContained); }
// public boolean doesNotSuffocateAt(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.doesNotSuffocateAt(world.wrapperContained,pos.wrapperContained); }

}