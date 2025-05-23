package yarnwrap.world;
public class World { public net.minecraft.world.World wrapperContained; public World(net.minecraft.world.World wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.world.border.WorldBorder border() { return new yarnwrap.world.border.WorldBorder(wrapperContained.border); }
// public void border(yarnwrap.world.border.WorldBorder value) { wrapperContained.border = value.wrapperContained; }
// public static yarnwrap.world.border.WorldBorder border() { return new yarnwrap.world.border.WorldBorder(net.minecraft.world.World.border); }
// public static void border(yarnwrap.world.border.WorldBorder value, ) { net.minecraft.world.World.border = value.wrapperContained; }

// public int ambientDarkness() { return wrapperContained.ambientDarkness; }
// public void ambientDarkness(int value) { wrapperContained.ambientDarkness = value; }
// public static int ambientDarkness() { return net.minecraft.world.World.ambientDarkness; }
// public static void ambientDarkness(int value, ) { net.minecraft.world.World.ambientDarkness = value; }

public yarnwrap.util.math.random.Random random() { return new yarnwrap.util.math.random.Random(wrapperContained.random); }
// public void random(yarnwrap.util.math.random.Random value) { wrapperContained.random = value.wrapperContained; }
// public static yarnwrap.util.math.random.Random random() { return new yarnwrap.util.math.random.Random(net.minecraft.world.World.random); }
// public static void random(yarnwrap.util.math.random.Random value, ) { net.minecraft.world.World.random = value.wrapperContained; }

// public yarnwrap.world.MutableWorldProperties properties() { return new yarnwrap.world.MutableWorldProperties(wrapperContained.properties); }
// public void properties(yarnwrap.world.MutableWorldProperties value) { wrapperContained.properties = value.wrapperContained; }
// public static yarnwrap.world.MutableWorldProperties properties() { return new yarnwrap.world.MutableWorldProperties(net.minecraft.world.World.properties); }
// public static void properties(yarnwrap.world.MutableWorldProperties value, ) { net.minecraft.world.World.properties = value.wrapperContained; }

// public float thunderGradient() { return wrapperContained.thunderGradient; }
// public void thunderGradient(float value) { wrapperContained.thunderGradient = value; }
// public static float thunderGradient() { return net.minecraft.world.World.thunderGradient; }
// public static void thunderGradient(float value, ) { net.minecraft.world.World.thunderGradient = value; }

// public float rainGradient() { return wrapperContained.rainGradient; }
// public void rainGradient(float value) { wrapperContained.rainGradient = value; }
// public static float rainGradient() { return net.minecraft.world.World.rainGradient; }
// public static void rainGradient(float value, ) { net.minecraft.world.World.rainGradient = value; }

public boolean isClient() { return wrapperContained.isClient; }
// public void isClient(boolean value) { wrapperContained.isClient = value; }
// public static boolean isClient() { return net.minecraft.world.World.isClient; }
// public static void isClient(boolean value, ) { net.minecraft.world.World.isClient = value; }

// public int lcgBlockSeedIncrement() { return wrapperContained.lcgBlockSeedIncrement; }
// public void lcgBlockSeedIncrement(int value) { wrapperContained.lcgBlockSeedIncrement = value; }
// public static int lcgBlockSeedIncrement() { return net.minecraft.world.World.lcgBlockSeedIncrement; }
// public static void lcgBlockSeedIncrement(int value, ) { net.minecraft.world.World.lcgBlockSeedIncrement = value; }

// public boolean iteratingTickingBlockEntities() { return wrapperContained.iteratingTickingBlockEntities; }
// public void iteratingTickingBlockEntities(boolean value) { wrapperContained.iteratingTickingBlockEntities = value; }
// public static boolean iteratingTickingBlockEntities() { return net.minecraft.world.World.iteratingTickingBlockEntities; }
// public static void iteratingTickingBlockEntities(boolean value, ) { net.minecraft.world.World.iteratingTickingBlockEntities = value; }

// public float lastThunderGradient() { return wrapperContained.lastThunderGradient; }
// public void lastThunderGradient(float value) { wrapperContained.lastThunderGradient = value; }
// public static float lastThunderGradient() { return net.minecraft.world.World.lastThunderGradient; }
// public static void lastThunderGradient(float value, ) { net.minecraft.world.World.lastThunderGradient = value; }

// public float lastRainGradient() { return wrapperContained.lastRainGradient; }
// public void lastRainGradient(float value) { wrapperContained.lastRainGradient = value; }
// public static float lastRainGradient() { return net.minecraft.world.World.lastRainGradient; }
// public static void lastRainGradient(float value, ) { net.minecraft.world.World.lastRainGradient = value; }

// public int lcgBlockSeed() { return wrapperContained.lcgBlockSeed; }
// public void lcgBlockSeed(int value) { wrapperContained.lcgBlockSeed = value; }
// public static int lcgBlockSeed() { return net.minecraft.world.World.lcgBlockSeed; }
// public static void lcgBlockSeed(int value, ) { net.minecraft.world.World.lcgBlockSeed = value; }

// public java.lang.Thread thread() { return wrapperContained.thread; }
// public void thread(java.lang.Thread value) { wrapperContained.thread = value; }
// public static java.lang.Thread thread() { return net.minecraft.world.World.thread; }
// public static void thread(java.lang.Thread value, ) { net.minecraft.world.World.thread = value; }

// public yarnwrap.world.biome.source.BiomeAccess biomeAccess() { return new yarnwrap.world.biome.source.BiomeAccess(wrapperContained.biomeAccess); }
// public void biomeAccess(yarnwrap.world.biome.source.BiomeAccess value) { wrapperContained.biomeAccess = value.wrapperContained; }
// public static yarnwrap.world.biome.source.BiomeAccess biomeAccess() { return new yarnwrap.world.biome.source.BiomeAccess(net.minecraft.world.World.biomeAccess); }
// public static void biomeAccess(yarnwrap.world.biome.source.BiomeAccess value, ) { net.minecraft.world.World.biomeAccess = value.wrapperContained; }

// public boolean debugWorld() { return wrapperContained.debugWorld; }
// public void debugWorld(boolean value) { wrapperContained.debugWorld = value; }
// public static boolean debugWorld() { return net.minecraft.world.World.debugWorld; }
// public static void debugWorld(boolean value, ) { net.minecraft.world.World.debugWorld = value; }

// public yarnwrap.registry.RegistryKey registryKey() { return new yarnwrap.registry.RegistryKey(wrapperContained.registryKey); }
// public void registryKey(yarnwrap.registry.RegistryKey value) { wrapperContained.registryKey = value.wrapperContained; }
// public static yarnwrap.registry.RegistryKey registryKey() { return new yarnwrap.registry.RegistryKey(net.minecraft.world.World.registryKey); }
// public static void registryKey(yarnwrap.registry.RegistryKey value, ) { net.minecraft.world.World.registryKey = value.wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.world.World.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.world.World.CODEC = value; }

// public yarnwrap.registry.RegistryKey OVERWORLD() { return new yarnwrap.registry.RegistryKey(wrapperContained.OVERWORLD); }
// public void OVERWORLD(yarnwrap.registry.RegistryKey value) { wrapperContained.OVERWORLD = value.wrapperContained; }
public static yarnwrap.registry.RegistryKey OVERWORLD() { return new yarnwrap.registry.RegistryKey(net.minecraft.world.World.OVERWORLD); }
// public static void OVERWORLD(yarnwrap.registry.RegistryKey value, ) { net.minecraft.world.World.OVERWORLD = value.wrapperContained; }

// public yarnwrap.registry.RegistryKey NETHER() { return new yarnwrap.registry.RegistryKey(wrapperContained.NETHER); }
// public void NETHER(yarnwrap.registry.RegistryKey value) { wrapperContained.NETHER = value.wrapperContained; }
public static yarnwrap.registry.RegistryKey NETHER() { return new yarnwrap.registry.RegistryKey(net.minecraft.world.World.NETHER); }
// public static void NETHER(yarnwrap.registry.RegistryKey value, ) { net.minecraft.world.World.NETHER = value.wrapperContained; }

// public yarnwrap.registry.RegistryKey END() { return new yarnwrap.registry.RegistryKey(wrapperContained.END); }
// public void END(yarnwrap.registry.RegistryKey value) { wrapperContained.END = value.wrapperContained; }
public static yarnwrap.registry.RegistryKey END() { return new yarnwrap.registry.RegistryKey(net.minecraft.world.World.END); }
// public static void END(yarnwrap.registry.RegistryKey value, ) { net.minecraft.world.World.END = value.wrapperContained; }

// public java.util.List pendingBlockEntityTickers() { return wrapperContained.pendingBlockEntityTickers; }
// public void pendingBlockEntityTickers(java.util.List value) { wrapperContained.pendingBlockEntityTickers = value; }
// public static java.util.List pendingBlockEntityTickers() { return net.minecraft.world.World.pendingBlockEntityTickers; }
// public static void pendingBlockEntityTickers(java.util.List value, ) { net.minecraft.world.World.pendingBlockEntityTickers = value; }

// public java.util.List blockEntityTickers() { return wrapperContained.blockEntityTickers; }
// public void blockEntityTickers(java.util.List value) { wrapperContained.blockEntityTickers = value; }
// public static java.util.List blockEntityTickers() { return net.minecraft.world.World.blockEntityTickers; }
// public static void blockEntityTickers(java.util.List value, ) { net.minecraft.world.World.blockEntityTickers = value; }

// public int HORIZONTAL_LIMIT() { return wrapperContained.HORIZONTAL_LIMIT; }
// public void HORIZONTAL_LIMIT(int value) { wrapperContained.HORIZONTAL_LIMIT = value; }
public static int HORIZONTAL_LIMIT() { return net.minecraft.world.World.HORIZONTAL_LIMIT; }
// public static void HORIZONTAL_LIMIT(int value, ) { net.minecraft.world.World.HORIZONTAL_LIMIT = value; }

// public int MAX_UPDATE_DEPTH() { return wrapperContained.MAX_UPDATE_DEPTH; }
// public void MAX_UPDATE_DEPTH(int value) { wrapperContained.MAX_UPDATE_DEPTH = value; }
public static int MAX_UPDATE_DEPTH() { return net.minecraft.world.World.MAX_UPDATE_DEPTH; }
// public static void MAX_UPDATE_DEPTH(int value, ) { net.minecraft.world.World.MAX_UPDATE_DEPTH = value; }

// public int MAX_Y() { return wrapperContained.MAX_Y; }
// public void MAX_Y(int value) { wrapperContained.MAX_Y = value; }
public static int MAX_Y() { return net.minecraft.world.World.MAX_Y; }
// public static void MAX_Y(int value, ) { net.minecraft.world.World.MAX_Y = value; }

// public int MIN_Y() { return wrapperContained.MIN_Y; }
// public void MIN_Y(int value) { wrapperContained.MIN_Y = value; }
public static int MIN_Y() { return net.minecraft.world.World.MIN_Y; }
// public static void MIN_Y(int value, ) { net.minecraft.world.World.MIN_Y = value; }

// public long tickOrder() { return wrapperContained.tickOrder; }
// public void tickOrder(long value) { wrapperContained.tickOrder = value; }
// public static long tickOrder() { return net.minecraft.world.World.tickOrder; }
// public static void tickOrder(long value, ) { net.minecraft.world.World.tickOrder = value; }

// public yarnwrap.registry.entry.RegistryEntry dimensionEntry() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.dimensionEntry); }
// public void dimensionEntry(yarnwrap.registry.entry.RegistryEntry value) { wrapperContained.dimensionEntry = value.wrapperContained; }
// public static yarnwrap.registry.entry.RegistryEntry dimensionEntry() { return new yarnwrap.registry.entry.RegistryEntry(net.minecraft.world.World.dimensionEntry); }
// public static void dimensionEntry(yarnwrap.registry.entry.RegistryEntry value, ) { net.minecraft.world.World.dimensionEntry = value.wrapperContained; }

// public yarnwrap.world.block.NeighborUpdater neighborUpdater() { return new yarnwrap.world.block.NeighborUpdater(wrapperContained.neighborUpdater); }
// public void neighborUpdater(yarnwrap.world.block.NeighborUpdater value) { wrapperContained.neighborUpdater = value.wrapperContained; }
// public static yarnwrap.world.block.NeighborUpdater neighborUpdater() { return new yarnwrap.world.block.NeighborUpdater(net.minecraft.world.World.neighborUpdater); }
// public static void neighborUpdater(yarnwrap.world.block.NeighborUpdater value, ) { net.minecraft.world.World.neighborUpdater = value.wrapperContained; }

// public yarnwrap.util.math.random.Random threadSafeRandom() { return new yarnwrap.util.math.random.Random(wrapperContained.threadSafeRandom); }
// public void threadSafeRandom(yarnwrap.util.math.random.Random value) { wrapperContained.threadSafeRandom = value.wrapperContained; }
// public static yarnwrap.util.math.random.Random threadSafeRandom() { return new yarnwrap.util.math.random.Random(net.minecraft.world.World.threadSafeRandom); }
// public static void threadSafeRandom(yarnwrap.util.math.random.Random value, ) { net.minecraft.world.World.threadSafeRandom = value.wrapperContained; }

// public yarnwrap.registry.DynamicRegistryManager registryManager() { return new yarnwrap.registry.DynamicRegistryManager(wrapperContained.registryManager); }
// public void registryManager(yarnwrap.registry.DynamicRegistryManager value) { wrapperContained.registryManager = value.wrapperContained; }
// public static yarnwrap.registry.DynamicRegistryManager registryManager() { return new yarnwrap.registry.DynamicRegistryManager(net.minecraft.world.World.registryManager); }
// public static void registryManager(yarnwrap.registry.DynamicRegistryManager value, ) { net.minecraft.world.World.registryManager = value.wrapperContained; }

// public yarnwrap.entity.damage.DamageSources damageSources() { return new yarnwrap.entity.damage.DamageSources(wrapperContained.damageSources); }
// public void damageSources(yarnwrap.entity.damage.DamageSources value) { wrapperContained.damageSources = value.wrapperContained; }
// public static yarnwrap.entity.damage.DamageSources damageSources() { return new yarnwrap.entity.damage.DamageSources(net.minecraft.world.World.damageSources); }
// public static void damageSources(yarnwrap.entity.damage.DamageSources value, ) { net.minecraft.world.World.damageSources = value.wrapperContained; }

// public World(yarnwrap.world.MutableWorldProperties properties,yarnwrap.registry.RegistryKey registryRef,yarnwrap.registry.DynamicRegistryManager registryManager,yarnwrap.registry.entry.RegistryEntry dimensionEntry,boolean isClient,boolean debugWorld,long seed,int maxChainedNeighborUpdates) { this.wrapperContained = new net.minecraft.world.World(properties.wrapperContained,registryRef.wrapperContained,registryManager.wrapperContained,dimensionEntry.wrapperContained,isClient,debugWorld,seed,maxChainedNeighborUpdates); }
public void updateListeners(yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState oldState,yarnwrap.block.BlockState newState,int flags) { wrapperContained.updateListeners(pos.wrapperContained,oldState.wrapperContained,newState.wrapperContained,flags); }
// public static void updateListeners(yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState oldState,yarnwrap.block.BlockState newState,int flags, ) { net.minecraft.world.World.updateListeners(pos.wrapperContained,oldState.wrapperContained,newState.wrapperContained,flags); }
public boolean isRaining() { return wrapperContained.isRaining(); }
// public static boolean isRaining() { return net.minecraft.world.World.isRaining(); }
public void sendEntityStatus(yarnwrap.entity.Entity entity,byte status) { wrapperContained.sendEntityStatus(entity.wrapperContained,status); }
// public static void sendEntityStatus(yarnwrap.entity.Entity entity,byte status, ) { net.minecraft.world.World.sendEntityStatus(entity.wrapperContained,status); }
public void setMobSpawnOptions(boolean spawnMonsters) { wrapperContained.setMobSpawnOptions(spawnMonsters); }
// public static void setMobSpawnOptions(boolean spawnMonsters, ) { net.minecraft.world.World.setMobSpawnOptions(spawnMonsters); }
public void addSyncedBlockEvent(yarnwrap.util.math.BlockPos pos,yarnwrap.block.Block block,int type,int data) { wrapperContained.addSyncedBlockEvent(pos.wrapperContained,block.wrapperContained,type,data); }
// public static void addSyncedBlockEvent(yarnwrap.util.math.BlockPos pos,yarnwrap.block.Block block,int type,int data, ) { net.minecraft.world.World.addSyncedBlockEvent(pos.wrapperContained,block.wrapperContained,type,data); }
public yarnwrap.scoreboard.Scoreboard getScoreboard() { return new yarnwrap.scoreboard.Scoreboard(wrapperContained.getScoreboard()); }
// public static yarnwrap.scoreboard.Scoreboard getScoreboard() { return new yarnwrap.scoreboard.Scoreboard(net.minecraft.world.World.getScoreboard()); }
public float getRainGradient(float tickProgress) { return wrapperContained.getRainGradient(tickProgress); }
// public static float getRainGradient(float tickProgress, ) { return net.minecraft.world.World.getRainGradient(tickProgress); }
public yarnwrap.recipe.RecipeManager getRecipeManager() { return new yarnwrap.recipe.RecipeManager(wrapperContained.getRecipeManager()); }
// public static yarnwrap.recipe.RecipeManager getRecipeManager() { return new yarnwrap.recipe.RecipeManager(net.minecraft.world.World.getRecipeManager()); }
// public void createExplosion(yarnwrap.entity.Entity entity,double x,double y,double z,float power,Object explosionSourceType) { wrapperContained.createExplosion(entity.wrapperContained,x,y,z,power,explosionSourceType); }
// public static void createExplosion(yarnwrap.entity.Entity entity,double x,double y,double z,float power,Object explosionSourceType, ) { net.minecraft.world.World.createExplosion(entity.wrapperContained,x,y,z,power,explosionSourceType); }
public void addBlockEntity(yarnwrap.block.entity.BlockEntity blockEntity) { wrapperContained.addBlockEntity(blockEntity.wrapperContained); }
// public static void addBlockEntity(yarnwrap.block.entity.BlockEntity blockEntity, ) { net.minecraft.world.World.addBlockEntity(blockEntity.wrapperContained); }
public float getSkyAngleRadians(float tickProgress) { return wrapperContained.getSkyAngleRadians(tickProgress); }
// public static float getSkyAngleRadians(float tickProgress, ) { return net.minecraft.world.World.getSkyAngleRadians(tickProgress); }
public void playSoundFromEntity(yarnwrap.entity.Entity source,yarnwrap.entity.Entity entity,yarnwrap.registry.entry.RegistryEntry sound,yarnwrap.sound.SoundCategory category,float volume,float pitch,long seed) { wrapperContained.playSoundFromEntity(source.wrapperContained,entity.wrapperContained,sound.wrapperContained,category.wrapperContained,volume,pitch,seed); }
// public static void playSoundFromEntity(yarnwrap.entity.Entity source,yarnwrap.entity.Entity entity,yarnwrap.registry.entry.RegistryEntry sound,yarnwrap.sound.SoundCategory category,float volume,float pitch,long seed, ) { net.minecraft.world.World.playSoundFromEntity(source.wrapperContained,entity.wrapperContained,sound.wrapperContained,category.wrapperContained,volume,pitch,seed); }
public void updateNeighborsAlways(yarnwrap.util.math.BlockPos pos,yarnwrap.block.Block sourceBlock,yarnwrap.world.block.WireOrientation orientation) { wrapperContained.updateNeighborsAlways(pos.wrapperContained,sourceBlock.wrapperContained,orientation.wrapperContained); }
// public static void updateNeighborsAlways(yarnwrap.util.math.BlockPos pos,yarnwrap.block.Block sourceBlock,yarnwrap.world.block.WireOrientation orientation, ) { net.minecraft.world.World.updateNeighborsAlways(pos.wrapperContained,sourceBlock.wrapperContained,orientation.wrapperContained); }
// public void createExplosion(yarnwrap.entity.Entity entity,yarnwrap.entity.damage.DamageSource damageSource,yarnwrap.world.explosion.ExplosionBehavior behavior,double x,double y,double z,float power,boolean createFire,Object explosionSourceType,yarnwrap.particle.ParticleEffect smallParticle,yarnwrap.particle.ParticleEffect largeParticle,yarnwrap.registry.entry.RegistryEntry soundEvent) { wrapperContained.createExplosion(entity.wrapperContained,damageSource.wrapperContained,behavior.wrapperContained,x,y,z,power,createFire,explosionSourceType,smallParticle.wrapperContained,largeParticle.wrapperContained,soundEvent.wrapperContained); }
// public static void createExplosion(yarnwrap.entity.Entity entity,yarnwrap.entity.damage.DamageSource damageSource,yarnwrap.world.explosion.ExplosionBehavior behavior,double x,double y,double z,float power,boolean createFire,Object explosionSourceType,yarnwrap.particle.ParticleEffect smallParticle,yarnwrap.particle.ParticleEffect largeParticle,yarnwrap.registry.entry.RegistryEntry soundEvent, ) { net.minecraft.world.World.createExplosion(entity.wrapperContained,damageSource.wrapperContained,behavior.wrapperContained,x,y,z,power,createFire,explosionSourceType,smallParticle.wrapperContained,largeParticle.wrapperContained,soundEvent.wrapperContained); }
public void updateComparators(yarnwrap.util.math.BlockPos pos,yarnwrap.block.Block block) { wrapperContained.updateComparators(pos.wrapperContained,block.wrapperContained); }
// public static void updateComparators(yarnwrap.util.math.BlockPos pos,yarnwrap.block.Block block, ) { net.minecraft.world.World.updateComparators(pos.wrapperContained,block.wrapperContained); }
public boolean isSavingDisabled() { return wrapperContained.isSavingDisabled(); }
// public static boolean isSavingDisabled() { return net.minecraft.world.World.isSavingDisabled(); }
public void playSound(yarnwrap.entity.Entity source,double x,double y,double z,yarnwrap.registry.entry.RegistryEntry sound,yarnwrap.sound.SoundCategory category,float volume,float pitch,long seed) { wrapperContained.playSound(source.wrapperContained,x,y,z,sound.wrapperContained,category.wrapperContained,volume,pitch,seed); }
// public static void playSound(yarnwrap.entity.Entity source,double x,double y,double z,yarnwrap.registry.entry.RegistryEntry sound,yarnwrap.sound.SoundCategory category,float volume,float pitch,long seed, ) { net.minecraft.world.World.playSound(source.wrapperContained,x,y,z,sound.wrapperContained,category.wrapperContained,volume,pitch,seed); }
public void addParticleClient(yarnwrap.particle.ParticleEffect parameters,boolean force,boolean canSpawnOnMinimal,double x,double y,double z,double velocityX,double velocityY,double velocityZ) { wrapperContained.addParticleClient(parameters.wrapperContained,force,canSpawnOnMinimal,x,y,z,velocityX,velocityY,velocityZ); }
// public static void addParticleClient(yarnwrap.particle.ParticleEffect parameters,boolean force,boolean canSpawnOnMinimal,double x,double y,double z,double velocityX,double velocityY,double velocityZ, ) { net.minecraft.world.World.addParticleClient(parameters.wrapperContained,force,canSpawnOnMinimal,x,y,z,velocityX,velocityY,velocityZ); }
public yarnwrap.entity.Entity getEntityById(int id) { return new yarnwrap.entity.Entity(wrapperContained.getEntityById(id)); }
// public static yarnwrap.entity.Entity getEntityById(int id, ) { return new yarnwrap.entity.Entity(net.minecraft.world.World.getEntityById(id)); }
public void syncGlobalEvent(int eventId,yarnwrap.util.math.BlockPos pos,int data) { wrapperContained.syncGlobalEvent(eventId,pos.wrapperContained,data); }
// public static void syncGlobalEvent(int eventId,yarnwrap.util.math.BlockPos pos,int data, ) { net.minecraft.world.World.syncGlobalEvent(eventId,pos.wrapperContained,data); }
public boolean isPosLoaded(yarnwrap.util.math.BlockPos pos) { return wrapperContained.isPosLoaded(pos.wrapperContained); }
// public static boolean isPosLoaded(yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.world.World.isPosLoaded(pos.wrapperContained); }
public float getThunderGradient(float tickProgress) { return wrapperContained.getThunderGradient(tickProgress); }
// public static float getThunderGradient(float tickProgress, ) { return net.minecraft.world.World.getThunderGradient(tickProgress); }
public void playSoundClient(double x,double y,double z,yarnwrap.sound.SoundEvent sound,yarnwrap.sound.SoundCategory category,float volume,float pitch,boolean useDistance) { wrapperContained.playSoundClient(x,y,z,sound.wrapperContained,category.wrapperContained,volume,pitch,useDistance); }
// public static void playSoundClient(double x,double y,double z,yarnwrap.sound.SoundEvent sound,yarnwrap.sound.SoundCategory category,float volume,float pitch,boolean useDistance, ) { net.minecraft.world.World.playSoundClient(x,y,z,sound.wrapperContained,category.wrapperContained,volume,pitch,useDistance); }
public void updateNeighbor(yarnwrap.util.math.BlockPos pos,yarnwrap.block.Block sourceBlock,yarnwrap.world.block.WireOrientation orientation) { wrapperContained.updateNeighbor(pos.wrapperContained,sourceBlock.wrapperContained,orientation.wrapperContained); }
// public static void updateNeighbor(yarnwrap.util.math.BlockPos pos,yarnwrap.block.Block sourceBlock,yarnwrap.world.block.WireOrientation orientation, ) { net.minecraft.world.World.updateNeighbor(pos.wrapperContained,sourceBlock.wrapperContained,orientation.wrapperContained); }
public void addImportantParticleClient(yarnwrap.particle.ParticleEffect parameters,double x,double y,double z,double velocityX,double velocityY,double velocityZ) { wrapperContained.addImportantParticleClient(parameters.wrapperContained,x,y,z,velocityX,velocityY,velocityZ); }
// public static void addImportantParticleClient(yarnwrap.particle.ParticleEffect parameters,double x,double y,double z,double velocityX,double velocityY,double velocityZ, ) { net.minecraft.world.World.addImportantParticleClient(parameters.wrapperContained,x,y,z,velocityX,velocityY,velocityZ); }
public void setThunderGradient(float thunderGradient) { wrapperContained.setThunderGradient(thunderGradient); }
// public static void setThunderGradient(float thunderGradient, ) { net.minecraft.world.World.setThunderGradient(thunderGradient); }
public yarnwrap.world.chunk.WorldChunk getWorldChunk(yarnwrap.util.math.BlockPos pos) { return new yarnwrap.world.chunk.WorldChunk(wrapperContained.getWorldChunk(pos.wrapperContained)); }
// public static yarnwrap.world.chunk.WorldChunk getWorldChunk(yarnwrap.util.math.BlockPos pos, ) { return new yarnwrap.world.chunk.WorldChunk(net.minecraft.world.World.getWorldChunk(pos.wrapperContained)); }
public boolean setBlockState(yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { return wrapperContained.setBlockState(pos.wrapperContained,state.wrapperContained); }
// public static boolean setBlockState(yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state, ) { return net.minecraft.world.World.setBlockState(pos.wrapperContained,state.wrapperContained); }
public boolean canEntityModifyAt(yarnwrap.entity.Entity entity,yarnwrap.util.math.BlockPos pos) { return wrapperContained.canEntityModifyAt(entity.wrapperContained,pos.wrapperContained); }
// public static boolean canEntityModifyAt(yarnwrap.entity.Entity entity,yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.world.World.canEntityModifyAt(entity.wrapperContained,pos.wrapperContained); }
public void updateNeighborsExcept(yarnwrap.util.math.BlockPos pos,yarnwrap.block.Block sourceBlock,yarnwrap.util.math.Direction direction,yarnwrap.world.block.WireOrientation orientation) { wrapperContained.updateNeighborsExcept(pos.wrapperContained,sourceBlock.wrapperContained,direction.wrapperContained,orientation.wrapperContained); }
// public static void updateNeighborsExcept(yarnwrap.util.math.BlockPos pos,yarnwrap.block.Block sourceBlock,yarnwrap.util.math.Direction direction,yarnwrap.world.block.WireOrientation orientation, ) { net.minecraft.world.World.updateNeighborsExcept(pos.wrapperContained,sourceBlock.wrapperContained,direction.wrapperContained,orientation.wrapperContained); }
public void setLightningTicksLeft(int lightningTicksLeft) { wrapperContained.setLightningTicksLeft(lightningTicksLeft); }
// public static void setLightningTicksLeft(int lightningTicksLeft, ) { net.minecraft.world.World.setLightningTicksLeft(lightningTicksLeft); }
public long getTime() { return wrapperContained.getTime(); }
// public static long getTime() { return net.minecraft.world.World.getTime(); }
public boolean isTopSolid(yarnwrap.util.math.BlockPos pos,yarnwrap.entity.Entity entity) { return wrapperContained.isTopSolid(pos.wrapperContained,entity.wrapperContained); }
// public static boolean isTopSolid(yarnwrap.util.math.BlockPos pos,yarnwrap.entity.Entity entity, ) { return net.minecraft.world.World.isTopSolid(pos.wrapperContained,entity.wrapperContained); }
public void setBlockBreakingInfo(int entityId,yarnwrap.util.math.BlockPos pos,int progress) { wrapperContained.setBlockBreakingInfo(entityId,pos.wrapperContained,progress); }
// public static void setBlockBreakingInfo(int entityId,yarnwrap.util.math.BlockPos pos,int progress, ) { net.minecraft.world.World.setBlockBreakingInfo(entityId,pos.wrapperContained,progress); }
public void setRainGradient(float rainGradient) { wrapperContained.setRainGradient(rainGradient); }
// public static void setRainGradient(float rainGradient, ) { net.minecraft.world.World.setRainGradient(rainGradient); }
public boolean hasRain(yarnwrap.util.math.BlockPos pos) { return wrapperContained.hasRain(pos.wrapperContained); }
// public static boolean hasRain(yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.world.World.hasRain(pos.wrapperContained); }
public void sendPacket(yarnwrap.network.packet.Packet packet) { wrapperContained.sendPacket(packet.wrapperContained); }
// public static void sendPacket(yarnwrap.network.packet.Packet packet, ) { net.minecraft.world.World.sendPacket(packet.wrapperContained); }
public void markDirty(yarnwrap.util.math.BlockPos pos) { wrapperContained.markDirty(pos.wrapperContained); }
// public static void markDirty(yarnwrap.util.math.BlockPos pos, ) { net.minecraft.world.World.markDirty(pos.wrapperContained); }
public void disconnect() { wrapperContained.disconnect(); }
// public static void disconnect() { net.minecraft.world.World.disconnect(); }
public boolean isDay() { return wrapperContained.isDay(); }
// public static boolean isDay() { return net.minecraft.world.World.isDay(); }
public long getTimeOfDay() { return wrapperContained.getTimeOfDay(); }
// public static long getTimeOfDay() { return net.minecraft.world.World.getTimeOfDay(); }
public void calculateAmbientDarkness() { wrapperContained.calculateAmbientDarkness(); }
// public static void calculateAmbientDarkness() { net.minecraft.world.World.calculateAmbientDarkness(); }
// public yarnwrap.util.math.BlockPos getRandomPosInChunk(int x,int y,int z) { return new yarnwrap.util.math.BlockPos(wrapperContained.getRandomPosInChunk(x,y,z)); }
// public static yarnwrap.util.math.BlockPos getRandomPosInChunk(int x,int y,int z, ) { return new yarnwrap.util.math.BlockPos(net.minecraft.world.World.getRandomPosInChunk(x,y,z)); }
// public void createExplosion(yarnwrap.entity.Entity entity,double x,double y,double z,float power,boolean createFire,Object explosionSourceType) { wrapperContained.createExplosion(entity.wrapperContained,x,y,z,power,createFire,explosionSourceType); }
// public static void createExplosion(yarnwrap.entity.Entity entity,double x,double y,double z,float power,boolean createFire,Object explosionSourceType, ) { net.minecraft.world.World.createExplosion(entity.wrapperContained,x,y,z,power,createFire,explosionSourceType); }
public yarnwrap.util.crash.CrashReportSection addDetailsToCrashReport(yarnwrap.util.crash.CrashReport report) { return new yarnwrap.util.crash.CrashReportSection(wrapperContained.addDetailsToCrashReport(report.wrapperContained)); }
// public static yarnwrap.util.crash.CrashReportSection addDetailsToCrashReport(yarnwrap.util.crash.CrashReport report, ) { return new yarnwrap.util.crash.CrashReportSection(net.minecraft.world.World.addDetailsToCrashReport(report.wrapperContained)); }
// public void initWeatherGradients() { wrapperContained.initWeatherGradients(); }
// public static void initWeatherGradients() { net.minecraft.world.World.initWeatherGradients(); }
public void removeBlockEntity(yarnwrap.util.math.BlockPos pos) { wrapperContained.removeBlockEntity(pos.wrapperContained); }
// public static void removeBlockEntity(yarnwrap.util.math.BlockPos pos, ) { net.minecraft.world.World.removeBlockEntity(pos.wrapperContained); }
public boolean isThundering() { return wrapperContained.isThundering(); }
// public static boolean isThundering() { return net.minecraft.world.World.isThundering(); }
public void addFireworkParticle(double x,double y,double z,double velocityX,double velocityY,double velocityZ,java.util.List explosions) { wrapperContained.addFireworkParticle(x,y,z,velocityX,velocityY,velocityZ,explosions); }
// public static void addFireworkParticle(double x,double y,double z,double velocityX,double velocityY,double velocityZ,java.util.List explosions, ) { net.minecraft.world.World.addFireworkParticle(x,y,z,velocityX,velocityY,velocityZ,explosions); }
// public boolean isValidHorizontally(yarnwrap.util.math.BlockPos pos) { return wrapperContained.isValidHorizontally(pos.wrapperContained); }
// public static boolean isValidHorizontally(yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.world.World.isValidHorizontally(pos.wrapperContained); }
public void scheduleBlockRerenderIfNeeded(yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState old,yarnwrap.block.BlockState updated) { wrapperContained.scheduleBlockRerenderIfNeeded(pos.wrapperContained,old.wrapperContained,updated.wrapperContained); }
// public static void scheduleBlockRerenderIfNeeded(yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState old,yarnwrap.block.BlockState updated, ) { net.minecraft.world.World.scheduleBlockRerenderIfNeeded(pos.wrapperContained,old.wrapperContained,updated.wrapperContained); }
public void addImportantParticleClient(yarnwrap.particle.ParticleEffect parameters,boolean force,double x,double y,double z,double velocityX,double velocityY,double velocityZ) { wrapperContained.addImportantParticleClient(parameters.wrapperContained,force,x,y,z,velocityX,velocityY,velocityZ); }
// public static void addImportantParticleClient(yarnwrap.particle.ParticleEffect parameters,boolean force,double x,double y,double z,double velocityX,double velocityY,double velocityZ, ) { net.minecraft.world.World.addImportantParticleClient(parameters.wrapperContained,force,x,y,z,velocityX,velocityY,velocityZ); }
public yarnwrap.item.map.MapState getMapState(yarnwrap.component.type.MapIdComponent id) { return new yarnwrap.item.map.MapState(wrapperContained.getMapState(id.wrapperContained)); }
// public static yarnwrap.item.map.MapState getMapState(yarnwrap.component.type.MapIdComponent id, ) { return new yarnwrap.item.map.MapState(net.minecraft.world.World.getMapState(id.wrapperContained)); }
// public void tickBlockEntities() { wrapperContained.tickBlockEntities(); }
// public static void tickBlockEntities() { net.minecraft.world.World.tickBlockEntities(); }
public void tickEntity(java.util.function.Consumer tickConsumer,yarnwrap.entity.Entity entity) { wrapperContained.tickEntity(tickConsumer,entity.wrapperContained); }
// public static void tickEntity(java.util.function.Consumer tickConsumer,yarnwrap.entity.Entity entity, ) { net.minecraft.world.World.tickEntity(tickConsumer,entity.wrapperContained); }
public boolean isNight() { return wrapperContained.isNight(); }
// public static boolean isNight() { return net.minecraft.world.World.isNight(); }
public boolean isDirectionSolid(yarnwrap.util.math.BlockPos pos,yarnwrap.entity.Entity entity,yarnwrap.util.math.Direction direction) { return wrapperContained.isDirectionSolid(pos.wrapperContained,entity.wrapperContained,direction.wrapperContained); }
// public static boolean isDirectionSolid(yarnwrap.util.math.BlockPos pos,yarnwrap.entity.Entity entity,yarnwrap.util.math.Direction direction, ) { return net.minecraft.world.World.isDirectionSolid(pos.wrapperContained,entity.wrapperContained,direction.wrapperContained); }
public boolean isInBuildLimit(yarnwrap.util.math.BlockPos pos) { return wrapperContained.isInBuildLimit(pos.wrapperContained); }
// public static boolean isInBuildLimit(yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.world.World.isInBuildLimit(pos.wrapperContained); }
// public boolean isInvalidVertically(int y) { return wrapperContained.isInvalidVertically(y); }
// public static boolean isInvalidVertically(int y, ) { return net.minecraft.world.World.isInvalidVertically(y); }
// public boolean isValid(yarnwrap.util.math.BlockPos pos) { return wrapperContained.isValid(pos.wrapperContained); }
// public static boolean isValid(yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.world.World.isValid(pos.wrapperContained); }
public boolean isDebugWorld() { return wrapperContained.isDebugWorld(); }
// public static boolean isDebugWorld() { return net.minecraft.world.World.isDebugWorld(); }
public yarnwrap.registry.RegistryKey getRegistryKey() { return new yarnwrap.registry.RegistryKey(wrapperContained.getRegistryKey()); }
// public static yarnwrap.registry.RegistryKey getRegistryKey() { return new yarnwrap.registry.RegistryKey(net.minecraft.world.World.getRegistryKey()); }
public java.lang.String asString() { return wrapperContained.asString(); }
// public static java.lang.String asString() { return net.minecraft.world.World.asString(); }
// public yarnwrap.world.entity.EntityLookup getEntityLookup() { return new yarnwrap.world.entity.EntityLookup(wrapperContained.getEntityLookup()); }
// public static yarnwrap.world.entity.EntityLookup getEntityLookup() { return new yarnwrap.world.entity.EntityLookup(net.minecraft.world.World.getEntityLookup()); }
// public void method_31593(yarnwrap.entity.Entity entity) { wrapperContained.method_31593(entity.wrapperContained); }
// public static void method_31593(yarnwrap.entity.Entity entity, ) { net.minecraft.world.World.method_31593(entity.wrapperContained); }
public void addBlockEntityTicker(yarnwrap.world.chunk.BlockEntityTickInvoker ticker) { wrapperContained.addBlockEntityTicker(ticker.wrapperContained); }
// public static void addBlockEntityTicker(yarnwrap.world.chunk.BlockEntityTickInvoker ticker, ) { net.minecraft.world.World.addBlockEntityTicker(ticker.wrapperContained); }
public void addBlockBreakParticles(yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { wrapperContained.addBlockBreakParticles(pos.wrapperContained,state.wrapperContained); }
// public static void addBlockBreakParticles(yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state, ) { net.minecraft.world.World.addBlockBreakParticles(pos.wrapperContained,state.wrapperContained); }
public boolean shouldUpdatePostDeath(yarnwrap.entity.Entity entity) { return wrapperContained.shouldUpdatePostDeath(entity.wrapperContained); }
// public static boolean shouldUpdatePostDeath(yarnwrap.entity.Entity entity, ) { return net.minecraft.world.World.shouldUpdatePostDeath(entity.wrapperContained); }
public boolean shouldTickBlocksInChunk(long chunkPos) { return wrapperContained.shouldTickBlocksInChunk(chunkPos); }
// public static boolean shouldTickBlocksInChunk(long chunkPos, ) { return net.minecraft.world.World.shouldTickBlocksInChunk(chunkPos); }
public yarnwrap.registry.entry.RegistryEntry getDimensionEntry() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.getDimensionEntry()); }
// public static yarnwrap.registry.entry.RegistryEntry getDimensionEntry() { return new yarnwrap.registry.entry.RegistryEntry(net.minecraft.world.World.getDimensionEntry()); }
public void updateNeighbor(yarnwrap.block.BlockState state,yarnwrap.util.math.BlockPos pos,yarnwrap.block.Block sourceBlock,yarnwrap.world.block.WireOrientation orientation,boolean notify) { wrapperContained.updateNeighbor(state.wrapperContained,pos.wrapperContained,sourceBlock.wrapperContained,orientation.wrapperContained,notify); }
// public static void updateNeighbor(yarnwrap.block.BlockState state,yarnwrap.util.math.BlockPos pos,yarnwrap.block.Block sourceBlock,yarnwrap.world.block.WireOrientation orientation,boolean notify, ) { net.minecraft.world.World.updateNeighbor(state.wrapperContained,pos.wrapperContained,sourceBlock.wrapperContained,orientation.wrapperContained,notify); }
public boolean shouldTickBlockPos(yarnwrap.util.math.BlockPos pos) { return wrapperContained.shouldTickBlockPos(pos.wrapperContained); }
// public static boolean shouldTickBlockPos(yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.world.World.shouldTickBlockPos(pos.wrapperContained); }
public yarnwrap.util.math.BlockPos getSpawnPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.getSpawnPos()); }
// public static yarnwrap.util.math.BlockPos getSpawnPos() { return new yarnwrap.util.math.BlockPos(net.minecraft.world.World.getSpawnPos()); }
public float getSpawnAngle() { return wrapperContained.getSpawnAngle(); }
// public static float getSpawnAngle() { return net.minecraft.world.World.getSpawnAngle(); }
public void playSound(yarnwrap.entity.Entity source,double x,double y,double z,yarnwrap.sound.SoundEvent sound,yarnwrap.sound.SoundCategory category,float volume,float pitch) { wrapperContained.playSound(source.wrapperContained,x,y,z,sound.wrapperContained,category.wrapperContained,volume,pitch); }
// public static void playSound(yarnwrap.entity.Entity source,double x,double y,double z,yarnwrap.sound.SoundEvent sound,yarnwrap.sound.SoundCategory category,float volume,float pitch, ) { net.minecraft.world.World.playSound(source.wrapperContained,x,y,z,sound.wrapperContained,category.wrapperContained,volume,pitch); }
public void playSoundFromEntity(yarnwrap.entity.Entity source,yarnwrap.entity.Entity entity,yarnwrap.sound.SoundEvent sound,yarnwrap.sound.SoundCategory category,float volume,float pitch) { wrapperContained.playSoundFromEntity(source.wrapperContained,entity.wrapperContained,sound.wrapperContained,category.wrapperContained,volume,pitch); }
// public static void playSoundFromEntity(yarnwrap.entity.Entity source,yarnwrap.entity.Entity entity,yarnwrap.sound.SoundEvent sound,yarnwrap.sound.SoundCategory category,float volume,float pitch, ) { net.minecraft.world.World.playSoundFromEntity(source.wrapperContained,entity.wrapperContained,sound.wrapperContained,category.wrapperContained,volume,pitch); }
public void playSoundAtBlockCenterClient(yarnwrap.util.math.BlockPos pos,yarnwrap.sound.SoundEvent sound,yarnwrap.sound.SoundCategory category,float volume,float pitch,boolean useDistance) { wrapperContained.playSoundAtBlockCenterClient(pos.wrapperContained,sound.wrapperContained,category.wrapperContained,volume,pitch,useDistance); }
// public static void playSoundAtBlockCenterClient(yarnwrap.util.math.BlockPos pos,yarnwrap.sound.SoundEvent sound,yarnwrap.sound.SoundCategory category,float volume,float pitch,boolean useDistance, ) { net.minecraft.world.World.playSoundAtBlockCenterClient(pos.wrapperContained,sound.wrapperContained,category.wrapperContained,volume,pitch,useDistance); }
// public void createExplosion(yarnwrap.entity.Entity entity,yarnwrap.entity.damage.DamageSource damageSource,yarnwrap.world.explosion.ExplosionBehavior behavior,yarnwrap.util.math.Vec3d pos,float power,boolean createFire,Object explosionSourceType) { wrapperContained.createExplosion(entity.wrapperContained,damageSource.wrapperContained,behavior.wrapperContained,pos.wrapperContained,power,createFire,explosionSourceType); }
// public static void createExplosion(yarnwrap.entity.Entity entity,yarnwrap.entity.damage.DamageSource damageSource,yarnwrap.world.explosion.ExplosionBehavior behavior,yarnwrap.util.math.Vec3d pos,float power,boolean createFire,Object explosionSourceType, ) { net.minecraft.world.World.createExplosion(entity.wrapperContained,damageSource.wrapperContained,behavior.wrapperContained,pos.wrapperContained,power,createFire,explosionSourceType); }
public void collectEntitiesByType(yarnwrap.util.TypeFilter filter,yarnwrap.util.math.Box box,java.util.function.Predicate predicate,java.util.List result) { wrapperContained.collectEntitiesByType(filter.wrapperContained,box.wrapperContained,predicate,result); }
// public static void collectEntitiesByType(yarnwrap.util.TypeFilter filter,yarnwrap.util.math.Box box,java.util.function.Predicate predicate,java.util.List result, ) { net.minecraft.world.World.collectEntitiesByType(filter.wrapperContained,box.wrapperContained,predicate,result); }
public void collectEntitiesByType(yarnwrap.util.TypeFilter filter,yarnwrap.util.math.Box box,java.util.function.Predicate predicate,java.util.List result,int limit) { wrapperContained.collectEntitiesByType(filter.wrapperContained,box.wrapperContained,predicate,result,limit); }
// public static void collectEntitiesByType(yarnwrap.util.TypeFilter filter,yarnwrap.util.math.Box box,java.util.function.Predicate predicate,java.util.List result,int limit, ) { net.minecraft.world.World.collectEntitiesByType(filter.wrapperContained,box.wrapperContained,predicate,result,limit); }
// public Object method_47576(java.util.function.Predicate entity) { return wrapperContained.method_47576(entity); }
// public static Object method_47576(java.util.function.Predicate entity, ) { return net.minecraft.world.World.method_47576(entity); }
public void playSound(yarnwrap.entity.Entity source,double x,double y,double z,yarnwrap.sound.SoundEvent sound,yarnwrap.sound.SoundCategory category,float volume,float pitch,long seed) { wrapperContained.playSound(source.wrapperContained,x,y,z,sound.wrapperContained,category.wrapperContained,volume,pitch,seed); }
// public static void playSound(yarnwrap.entity.Entity source,double x,double y,double z,yarnwrap.sound.SoundEvent sound,yarnwrap.sound.SoundCategory category,float volume,float pitch,long seed, ) { net.minecraft.world.World.playSound(source.wrapperContained,x,y,z,sound.wrapperContained,category.wrapperContained,volume,pitch,seed); }
public void sendEntityDamage(yarnwrap.entity.Entity entity,yarnwrap.entity.damage.DamageSource damageSource) { wrapperContained.sendEntityDamage(entity.wrapperContained,damageSource.wrapperContained); }
// public static void sendEntityDamage(yarnwrap.entity.Entity entity,yarnwrap.entity.damage.DamageSource damageSource, ) { net.minecraft.world.World.sendEntityDamage(entity.wrapperContained,damageSource.wrapperContained); }
public yarnwrap.entity.damage.DamageSources getDamageSources() { return new yarnwrap.entity.damage.DamageSources(wrapperContained.getDamageSources()); }
// public static yarnwrap.entity.damage.DamageSources getDamageSources() { return new yarnwrap.entity.damage.DamageSources(net.minecraft.world.World.getDamageSources()); }
public yarnwrap.world.tick.TickManager getTickManager() { return new yarnwrap.world.tick.TickManager(wrapperContained.getTickManager()); }
// public static yarnwrap.world.tick.TickManager getTickManager() { return new yarnwrap.world.tick.TickManager(net.minecraft.world.World.getTickManager()); }
public void playSound(yarnwrap.entity.Entity source,double x,double y,double z,yarnwrap.sound.SoundEvent sound,yarnwrap.sound.SoundCategory category) { wrapperContained.playSound(source.wrapperContained,x,y,z,sound.wrapperContained,category.wrapperContained); }
// public static void playSound(yarnwrap.entity.Entity source,double x,double y,double z,yarnwrap.sound.SoundEvent sound,yarnwrap.sound.SoundCategory category, ) { net.minecraft.world.World.playSound(source.wrapperContained,x,y,z,sound.wrapperContained,category.wrapperContained); }
public void playSoundFromEntityClient(yarnwrap.entity.Entity entity,yarnwrap.sound.SoundEvent sound,yarnwrap.sound.SoundCategory category,float volume,float pitch) { wrapperContained.playSoundFromEntityClient(entity.wrapperContained,sound.wrapperContained,category.wrapperContained,volume,pitch); }
// public static void playSoundFromEntityClient(yarnwrap.entity.Entity entity,yarnwrap.sound.SoundEvent sound,yarnwrap.sound.SoundCategory category,float volume,float pitch, ) { net.minecraft.world.World.playSoundFromEntityClient(entity.wrapperContained,sound.wrapperContained,category.wrapperContained,volume,pitch); }
// public void createExplosion(yarnwrap.entity.Entity entity,yarnwrap.entity.damage.DamageSource damageSource,yarnwrap.world.explosion.ExplosionBehavior behavior,double x,double y,double z,float power,boolean createFire,Object explosionSourceType) { wrapperContained.createExplosion(entity.wrapperContained,damageSource.wrapperContained,behavior.wrapperContained,x,y,z,power,createFire,explosionSourceType); }
// public static void createExplosion(yarnwrap.entity.Entity entity,yarnwrap.entity.damage.DamageSource damageSource,yarnwrap.world.explosion.ExplosionBehavior behavior,double x,double y,double z,float power,boolean createFire,Object explosionSourceType, ) { net.minecraft.world.World.createExplosion(entity.wrapperContained,damageSource.wrapperContained,behavior.wrapperContained,x,y,z,power,createFire,explosionSourceType); }
public yarnwrap.recipe.BrewingRecipeRegistry getBrewingRecipeRegistry() { return new yarnwrap.recipe.BrewingRecipeRegistry(wrapperContained.getBrewingRecipeRegistry()); }
// public static yarnwrap.recipe.BrewingRecipeRegistry getBrewingRecipeRegistry() { return new yarnwrap.recipe.BrewingRecipeRegistry(net.minecraft.world.World.getBrewingRecipeRegistry()); }
public void playSound(yarnwrap.entity.Entity source,double x,double y,double z,yarnwrap.registry.entry.RegistryEntry sound,yarnwrap.sound.SoundCategory category,float volume,float pitch) { wrapperContained.playSound(source.wrapperContained,x,y,z,sound.wrapperContained,category.wrapperContained,volume,pitch); }
// public static void playSound(yarnwrap.entity.Entity source,double x,double y,double z,yarnwrap.registry.entry.RegistryEntry sound,yarnwrap.sound.SoundCategory category,float volume,float pitch, ) { net.minecraft.world.World.playSound(source.wrapperContained,x,y,z,sound.wrapperContained,category.wrapperContained,volume,pitch); }
public yarnwrap.item.FuelRegistry getFuelRegistry() { return new yarnwrap.item.FuelRegistry(wrapperContained.getFuelRegistry()); }
// public static yarnwrap.item.FuelRegistry getFuelRegistry() { return new yarnwrap.item.FuelRegistry(net.minecraft.world.World.getFuelRegistry()); }
// public boolean canHaveWeather() { return wrapperContained.canHaveWeather(); }
// public static boolean canHaveWeather() { return net.minecraft.world.World.canHaveWeather(); }
public java.util.Collection getEnderDragonParts() { return wrapperContained.getEnderDragonParts(); }
// public static java.util.Collection getEnderDragonParts() { return net.minecraft.world.World.getEnderDragonParts(); }
public void onBlockStateChanged(yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState oldState,yarnwrap.block.BlockState newState) { wrapperContained.onBlockStateChanged(pos.wrapperContained,oldState.wrapperContained,newState.wrapperContained); }
// public static void onBlockStateChanged(yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState oldState,yarnwrap.block.BlockState newState, ) { net.minecraft.world.World.onBlockStateChanged(pos.wrapperContained,oldState.wrapperContained,newState.wrapperContained); }
public boolean isNightAndNatural() { return wrapperContained.isNightAndNatural(); }
// public static boolean isNightAndNatural() { return net.minecraft.world.World.isNightAndNatural(); }
public java.util.List getCrammedEntities(yarnwrap.entity.Entity entity,yarnwrap.util.math.Box box) { return wrapperContained.getCrammedEntities(entity.wrapperContained,box.wrapperContained); }
// public static java.util.List getCrammedEntities(yarnwrap.entity.Entity entity,yarnwrap.util.math.Box box, ) { return net.minecraft.world.World.getCrammedEntities(entity.wrapperContained,box.wrapperContained); }
public int getBlockColor(yarnwrap.util.math.BlockPos pos) { return wrapperContained.getBlockColor(pos.wrapperContained); }
// public static int getBlockColor(yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.world.World.getBlockColor(pos.wrapperContained); }
public void playSoundClient(yarnwrap.sound.SoundEvent sound,yarnwrap.sound.SoundCategory category,float volume,float pitch) { wrapperContained.playSoundClient(sound.wrapperContained,category.wrapperContained,volume,pitch); }
// public static void playSoundClient(yarnwrap.sound.SoundEvent sound,yarnwrap.sound.SoundCategory category,float volume,float pitch, ) { net.minecraft.world.World.playSoundClient(sound.wrapperContained,category.wrapperContained,volume,pitch); }
// public Object getPrecipitation(yarnwrap.util.math.BlockPos pos) { return wrapperContained.getPrecipitation(pos.wrapperContained); }
// public static Object getPrecipitation(yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.world.World.getPrecipitation(pos.wrapperContained); }

}