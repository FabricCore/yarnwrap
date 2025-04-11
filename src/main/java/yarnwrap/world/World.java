package yarnwrap.world;
public class World { public net.minecraft.world.World wrapperContained; public World(net.minecraft.world.World wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.function.Supplier profiler() { return wrapperContained.profiler; }
// public void profiler(java.util.function.Supplier value) { wrapperContained.profiler = value; }
// public java.lang.Thread thread() { return wrapperContained.thread; }
// public void thread(java.lang.Thread value) { wrapperContained.thread = value; }
// public yarnwrap.world.biome.source.BiomeAccess biomeAccess() { return new yarnwrap.world.biome.source.BiomeAccess(wrapperContained.biomeAccess); }
// public void biomeAccess(yarnwrap.world.biome.source.BiomeAccess value) { wrapperContained.biomeAccess = value.wrapperContained; }
// public boolean debugWorld() { return wrapperContained.debugWorld; }
// public void debugWorld(boolean value) { wrapperContained.debugWorld = value; }
// public yarnwrap.registry.RegistryKey registryKey() { return new yarnwrap.registry.RegistryKey(wrapperContained.registryKey); }
// public void registryKey(yarnwrap.registry.RegistryKey value) { wrapperContained.registryKey = value.wrapperContained; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public yarnwrap.registry.RegistryKey OVERWORLD() { return new yarnwrap.registry.RegistryKey(wrapperContained.OVERWORLD); }
// public void OVERWORLD(yarnwrap.registry.RegistryKey value) { wrapperContained.OVERWORLD = value.wrapperContained; }
public yarnwrap.registry.RegistryKey NETHER() { return new yarnwrap.registry.RegistryKey(wrapperContained.NETHER); }
// public void NETHER(yarnwrap.registry.RegistryKey value) { wrapperContained.NETHER = value.wrapperContained; }
public yarnwrap.registry.RegistryKey END() { return new yarnwrap.registry.RegistryKey(wrapperContained.END); }
// public void END(yarnwrap.registry.RegistryKey value) { wrapperContained.END = value.wrapperContained; }
// public java.util.List pendingBlockEntityTickers() { return wrapperContained.pendingBlockEntityTickers; }
// public void pendingBlockEntityTickers(java.util.List value) { wrapperContained.pendingBlockEntityTickers = value; }
// public java.util.List blockEntityTickers() { return wrapperContained.blockEntityTickers; }
// public void blockEntityTickers(java.util.List value) { wrapperContained.blockEntityTickers = value; }
public int HORIZONTAL_LIMIT() { return wrapperContained.HORIZONTAL_LIMIT; }
// public void HORIZONTAL_LIMIT(int value) { wrapperContained.HORIZONTAL_LIMIT = value; }
public int MAX_UPDATE_DEPTH() { return wrapperContained.MAX_UPDATE_DEPTH; }
// public void MAX_UPDATE_DEPTH(int value) { wrapperContained.MAX_UPDATE_DEPTH = value; }
public int MAX_Y() { return wrapperContained.MAX_Y; }
// public void MAX_Y(int value) { wrapperContained.MAX_Y = value; }
public int MIN_Y() { return wrapperContained.MIN_Y; }
// public void MIN_Y(int value) { wrapperContained.MIN_Y = value; }
// public long tickOrder() { return wrapperContained.tickOrder; }
// public void tickOrder(long value) { wrapperContained.tickOrder = value; }
// public yarnwrap.registry.entry.RegistryEntry dimensionEntry() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.dimensionEntry); }
// public void dimensionEntry(yarnwrap.registry.entry.RegistryEntry value) { wrapperContained.dimensionEntry = value.wrapperContained; }
// public yarnwrap.world.block.NeighborUpdater neighborUpdater() { return new yarnwrap.world.block.NeighborUpdater(wrapperContained.neighborUpdater); }
// public void neighborUpdater(yarnwrap.world.block.NeighborUpdater value) { wrapperContained.neighborUpdater = value.wrapperContained; }
// public yarnwrap.util.math.random.Random threadSafeRandom() { return new yarnwrap.util.math.random.Random(wrapperContained.threadSafeRandom); }
// public void threadSafeRandom(yarnwrap.util.math.random.Random value) { wrapperContained.threadSafeRandom = value.wrapperContained; }
// public yarnwrap.registry.DynamicRegistryManager registryManager() { return new yarnwrap.registry.DynamicRegistryManager(wrapperContained.registryManager); }
// public void registryManager(yarnwrap.registry.DynamicRegistryManager value) { wrapperContained.registryManager = value.wrapperContained; }
// public yarnwrap.entity.damage.DamageSources damageSources() { return new yarnwrap.entity.damage.DamageSources(wrapperContained.damageSources); }
// public void damageSources(yarnwrap.entity.damage.DamageSources value) { wrapperContained.damageSources = value.wrapperContained; }
// public yarnwrap.world.border.WorldBorder border() { return new yarnwrap.world.border.WorldBorder(wrapperContained.border); }
// public void border(yarnwrap.world.border.WorldBorder value) { wrapperContained.border = value.wrapperContained; }
// public int ambientDarkness() { return wrapperContained.ambientDarkness; }
// public void ambientDarkness(int value) { wrapperContained.ambientDarkness = value; }
public yarnwrap.util.math.random.Random random() { return new yarnwrap.util.math.random.Random(wrapperContained.random); }
// public void random(yarnwrap.util.math.random.Random value) { wrapperContained.random = value.wrapperContained; }
// public yarnwrap.world.MutableWorldProperties properties() { return new yarnwrap.world.MutableWorldProperties(wrapperContained.properties); }
// public void properties(yarnwrap.world.MutableWorldProperties value) { wrapperContained.properties = value.wrapperContained; }
// public float thunderGradient() { return wrapperContained.thunderGradient; }
// public void thunderGradient(float value) { wrapperContained.thunderGradient = value; }
// public float rainGradient() { return wrapperContained.rainGradient; }
// public void rainGradient(float value) { wrapperContained.rainGradient = value; }
public boolean isClient() { return wrapperContained.isClient; }
// public void isClient(boolean value) { wrapperContained.isClient = value; }
// public int lcgBlockSeedIncrement() { return wrapperContained.lcgBlockSeedIncrement; }
// public void lcgBlockSeedIncrement(int value) { wrapperContained.lcgBlockSeedIncrement = value; }
// public boolean iteratingTickingBlockEntities() { return wrapperContained.iteratingTickingBlockEntities; }
// public void iteratingTickingBlockEntities(boolean value) { wrapperContained.iteratingTickingBlockEntities = value; }
// public float thunderGradientPrev() { return wrapperContained.thunderGradientPrev; }
// public void thunderGradientPrev(float value) { wrapperContained.thunderGradientPrev = value; }
// public float rainGradientPrev() { return wrapperContained.rainGradientPrev; }
// public void rainGradientPrev(float value) { wrapperContained.rainGradientPrev = value; }
// public int lcgBlockSeed() { return wrapperContained.lcgBlockSeed; }
// public void lcgBlockSeed(int value) { wrapperContained.lcgBlockSeed = value; }
public yarnwrap.util.profiler.Profiler getProfiler() { return new yarnwrap.util.profiler.Profiler(wrapperContained.getProfiler()); }
public void scheduleBlockRerenderIfNeeded(yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState old,yarnwrap.block.BlockState updated) { wrapperContained.scheduleBlockRerenderIfNeeded(pos.wrapperContained,old.wrapperContained,updated.wrapperContained); }
public void addImportantParticle(yarnwrap.particle.ParticleEffect parameters,boolean alwaysSpawn,double x,double y,double z,double velocityX,double velocityY,double velocityZ) { wrapperContained.addImportantParticle(parameters.wrapperContained,alwaysSpawn,x,y,z,velocityX,velocityY,velocityZ); }
public yarnwrap.component.type.MapIdComponent increaseAndGetMapId() { return new yarnwrap.component.type.MapIdComponent(wrapperContained.increaseAndGetMapId()); }
public void putMapState(yarnwrap.component.type.MapIdComponent id,yarnwrap.item.map.MapState state) { wrapperContained.putMapState(id.wrapperContained,state.wrapperContained); }
public yarnwrap.item.map.MapState getMapState(yarnwrap.component.type.MapIdComponent id) { return new yarnwrap.item.map.MapState(wrapperContained.getMapState(id.wrapperContained)); }
// public void tickBlockEntities() { wrapperContained.tickBlockEntities(); }
public void tickEntity(java.util.function.Consumer tickConsumer,yarnwrap.entity.Entity entity) { wrapperContained.tickEntity(tickConsumer,entity.wrapperContained); }
public void onBlockChanged(yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState oldBlock,yarnwrap.block.BlockState newBlock) { wrapperContained.onBlockChanged(pos.wrapperContained,oldBlock.wrapperContained,newBlock.wrapperContained); }
public boolean isNight() { return wrapperContained.isNight(); }
public java.util.function.Supplier getProfilerSupplier() { return wrapperContained.getProfilerSupplier(); }
public boolean isDirectionSolid(yarnwrap.util.math.BlockPos pos,yarnwrap.entity.Entity entity,yarnwrap.util.math.Direction direction) { return wrapperContained.isDirectionSolid(pos.wrapperContained,entity.wrapperContained,direction.wrapperContained); }
public boolean isInBuildLimit(yarnwrap.util.math.BlockPos pos) { return wrapperContained.isInBuildLimit(pos.wrapperContained); }
// public boolean isInvalidVertically(int y) { return wrapperContained.isInvalidVertically(y); }
public boolean isValid(yarnwrap.util.math.BlockPos pos) { return wrapperContained.isValid(pos.wrapperContained); }
public boolean isDebugWorld() { return wrapperContained.isDebugWorld(); }
public yarnwrap.registry.RegistryKey getRegistryKey() { return new yarnwrap.registry.RegistryKey(wrapperContained.getRegistryKey()); }
public java.lang.String asString() { return wrapperContained.asString(); }
// public yarnwrap.world.entity.EntityLookup getEntityLookup() { return new yarnwrap.world.entity.EntityLookup(wrapperContained.getEntityLookup()); }
public void addBlockEntityTicker(yarnwrap.world.chunk.BlockEntityTickInvoker ticker) { wrapperContained.addBlockEntityTicker(ticker.wrapperContained); }
public void addBlockBreakParticles(yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { wrapperContained.addBlockBreakParticles(pos.wrapperContained,state.wrapperContained); }
public boolean shouldUpdatePostDeath(yarnwrap.entity.Entity entity) { return wrapperContained.shouldUpdatePostDeath(entity.wrapperContained); }
public boolean shouldTickBlocksInChunk(long chunkPos) { return wrapperContained.shouldTickBlocksInChunk(chunkPos); }
public yarnwrap.registry.entry.RegistryEntry getDimensionEntry() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.getDimensionEntry()); }
public void updateNeighbor(yarnwrap.block.BlockState state,yarnwrap.util.math.BlockPos pos,yarnwrap.block.Block sourceBlock,yarnwrap.util.math.BlockPos sourcePos,boolean notify) { wrapperContained.updateNeighbor(state.wrapperContained,pos.wrapperContained,sourceBlock.wrapperContained,sourcePos.wrapperContained,notify); }
public boolean shouldTickBlockPos(yarnwrap.util.math.BlockPos pos) { return wrapperContained.shouldTickBlockPos(pos.wrapperContained); }
public yarnwrap.util.math.BlockPos getSpawnPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.getSpawnPos()); }
public float getSpawnAngle() { return wrapperContained.getSpawnAngle(); }
public void playSound(yarnwrap.entity.player.PlayerEntity source,double x,double y,double z,yarnwrap.sound.SoundEvent sound,yarnwrap.sound.SoundCategory category,float volume,float pitch) { wrapperContained.playSound(source.wrapperContained,x,y,z,sound.wrapperContained,category.wrapperContained,volume,pitch); }
public void playSoundFromEntity(yarnwrap.entity.player.PlayerEntity source,yarnwrap.entity.Entity entity,yarnwrap.sound.SoundEvent sound,yarnwrap.sound.SoundCategory category,float volume,float pitch) { wrapperContained.playSoundFromEntity(source.wrapperContained,entity.wrapperContained,sound.wrapperContained,category.wrapperContained,volume,pitch); }
public void playSound(yarnwrap.entity.Entity source,yarnwrap.util.math.BlockPos pos,yarnwrap.sound.SoundEvent sound,yarnwrap.sound.SoundCategory category,float volume,float pitch) { wrapperContained.playSound(source.wrapperContained,pos.wrapperContained,sound.wrapperContained,category.wrapperContained,volume,pitch); }
public void playSoundAtBlockCenter(yarnwrap.util.math.BlockPos pos,yarnwrap.sound.SoundEvent sound,yarnwrap.sound.SoundCategory category,float volume,float pitch,boolean useDistance) { wrapperContained.playSoundAtBlockCenter(pos.wrapperContained,sound.wrapperContained,category.wrapperContained,volume,pitch,useDistance); }
// public yarnwrap.world.explosion.Explosion createExplosion(yarnwrap.entity.Entity entity,yarnwrap.entity.damage.DamageSource damageSource,yarnwrap.world.explosion.ExplosionBehavior behavior,yarnwrap.util.math.Vec3d pos,float power,boolean createFire,Object explosionSourceType) { return new yarnwrap.world.explosion.Explosion(wrapperContained.createExplosion(entity.wrapperContained,damageSource.wrapperContained,behavior.wrapperContained,pos.wrapperContained,power,createFire,explosionSourceType)); }
// public yarnwrap.world.explosion.Explosion createExplosion(yarnwrap.entity.Entity entity,yarnwrap.entity.damage.DamageSource damageSource,yarnwrap.world.explosion.ExplosionBehavior behavior,double x,double y,double z,float power,boolean createFire,Object explosionSourceType,boolean particles,yarnwrap.particle.ParticleEffect particle,yarnwrap.particle.ParticleEffect emitterParticle,yarnwrap.registry.entry.RegistryEntry soundEvent) { return new yarnwrap.world.explosion.Explosion(wrapperContained.createExplosion(entity.wrapperContained,damageSource.wrapperContained,behavior.wrapperContained,x,y,z,power,createFire,explosionSourceType,particles,particle.wrapperContained,emitterParticle.wrapperContained,soundEvent.wrapperContained)); }
// public Object getDestructionType(Object gameRuleKey) { return wrapperContained.getDestructionType(gameRuleKey); }
public void collectEntitiesByType(yarnwrap.util.TypeFilter filter,yarnwrap.util.math.Box box,java.util.function.Predicate predicate,java.util.List result) { wrapperContained.collectEntitiesByType(filter.wrapperContained,box.wrapperContained,predicate,result); }
public void collectEntitiesByType(yarnwrap.util.TypeFilter filter,yarnwrap.util.math.Box box,java.util.function.Predicate predicate,java.util.List result,int limit) { wrapperContained.collectEntitiesByType(filter.wrapperContained,box.wrapperContained,predicate,result,limit); }
public void playSound(yarnwrap.entity.player.PlayerEntity source,double x,double y,double z,yarnwrap.sound.SoundEvent sound,yarnwrap.sound.SoundCategory category,float volume,float pitch,long seed) { wrapperContained.playSound(source.wrapperContained,x,y,z,sound.wrapperContained,category.wrapperContained,volume,pitch,seed); }
public void sendEntityDamage(yarnwrap.entity.Entity entity,yarnwrap.entity.damage.DamageSource damageSource) { wrapperContained.sendEntityDamage(entity.wrapperContained,damageSource.wrapperContained); }
public yarnwrap.entity.damage.DamageSources getDamageSources() { return new yarnwrap.entity.damage.DamageSources(wrapperContained.getDamageSources()); }
public yarnwrap.world.tick.TickManager getTickManager() { return new yarnwrap.world.tick.TickManager(wrapperContained.getTickManager()); }
public void playSound(yarnwrap.entity.player.PlayerEntity source,double x,double y,double z,yarnwrap.sound.SoundEvent sound,yarnwrap.sound.SoundCategory category) { wrapperContained.playSound(source.wrapperContained,x,y,z,sound.wrapperContained,category.wrapperContained); }
public void playSoundFromEntity(yarnwrap.entity.Entity entity,yarnwrap.sound.SoundEvent sound,yarnwrap.sound.SoundCategory category,float volume,float pitch) { wrapperContained.playSoundFromEntity(entity.wrapperContained,sound.wrapperContained,category.wrapperContained,volume,pitch); }
// public yarnwrap.world.explosion.Explosion createExplosion(yarnwrap.entity.Entity entity,yarnwrap.entity.damage.DamageSource damageSource,yarnwrap.world.explosion.ExplosionBehavior behavior,double x,double y,double z,float power,boolean createFire,Object explosionSourceType) { return new yarnwrap.world.explosion.Explosion(wrapperContained.createExplosion(entity.wrapperContained,damageSource.wrapperContained,behavior.wrapperContained,x,y,z,power,createFire,explosionSourceType)); }
public yarnwrap.recipe.BrewingRecipeRegistry getBrewingRecipeRegistry() { return new yarnwrap.recipe.BrewingRecipeRegistry(wrapperContained.getBrewingRecipeRegistry()); }
public void playSound(yarnwrap.entity.player.PlayerEntity source,double x,double y,double z,yarnwrap.registry.entry.RegistryEntry sound,yarnwrap.sound.SoundCategory category,float volume,float pitch) { wrapperContained.playSound(source.wrapperContained,x,y,z,sound.wrapperContained,category.wrapperContained,volume,pitch); }
public void updateListeners(yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState oldState,yarnwrap.block.BlockState newState,int flags) { wrapperContained.updateListeners(pos.wrapperContained,oldState.wrapperContained,newState.wrapperContained,flags); }
public boolean isRaining() { return wrapperContained.isRaining(); }
public void sendEntityStatus(yarnwrap.entity.Entity entity,byte status) { wrapperContained.sendEntityStatus(entity.wrapperContained,status); }
public void setMobSpawnOptions(boolean spawnMonsters,boolean spawnAnimals) { wrapperContained.setMobSpawnOptions(spawnMonsters,spawnAnimals); }
public void addSyncedBlockEvent(yarnwrap.util.math.BlockPos pos,yarnwrap.block.Block block,int type,int data) { wrapperContained.addSyncedBlockEvent(pos.wrapperContained,block.wrapperContained,type,data); }
public yarnwrap.scoreboard.Scoreboard getScoreboard() { return new yarnwrap.scoreboard.Scoreboard(wrapperContained.getScoreboard()); }
public float getRainGradient(float delta) { return wrapperContained.getRainGradient(delta); }
public yarnwrap.recipe.RecipeManager getRecipeManager() { return new yarnwrap.recipe.RecipeManager(wrapperContained.getRecipeManager()); }
// public yarnwrap.world.explosion.Explosion createExplosion(yarnwrap.entity.Entity entity,double x,double y,double z,float power,Object explosionSourceType) { return new yarnwrap.world.explosion.Explosion(wrapperContained.createExplosion(entity.wrapperContained,x,y,z,power,explosionSourceType)); }
public void addBlockEntity(yarnwrap.block.entity.BlockEntity blockEntity) { wrapperContained.addBlockEntity(blockEntity.wrapperContained); }
public float getSkyAngleRadians(float tickDelta) { return wrapperContained.getSkyAngleRadians(tickDelta); }
public void playSoundFromEntity(yarnwrap.entity.player.PlayerEntity source,yarnwrap.entity.Entity entity,yarnwrap.registry.entry.RegistryEntry sound,yarnwrap.sound.SoundCategory category,float volume,float pitch,long seed) { wrapperContained.playSoundFromEntity(source.wrapperContained,entity.wrapperContained,sound.wrapperContained,category.wrapperContained,volume,pitch,seed); }
public yarnwrap.world.GameRules getGameRules() { return new yarnwrap.world.GameRules(wrapperContained.getGameRules()); }
public void updateNeighborsAlways(yarnwrap.util.math.BlockPos pos,yarnwrap.block.Block sourceBlock) { wrapperContained.updateNeighborsAlways(pos.wrapperContained,sourceBlock.wrapperContained); }
// public yarnwrap.world.explosion.Explosion createExplosion(yarnwrap.entity.Entity entity,yarnwrap.entity.damage.DamageSource damageSource,yarnwrap.world.explosion.ExplosionBehavior behavior,double x,double y,double z,float power,boolean createFire,Object explosionSourceType,yarnwrap.particle.ParticleEffect particle,yarnwrap.particle.ParticleEffect emitterParticle,yarnwrap.registry.entry.RegistryEntry soundEvent) { return new yarnwrap.world.explosion.Explosion(wrapperContained.createExplosion(entity.wrapperContained,damageSource.wrapperContained,behavior.wrapperContained,x,y,z,power,createFire,explosionSourceType,particle.wrapperContained,emitterParticle.wrapperContained,soundEvent.wrapperContained)); }
public void updateComparators(yarnwrap.util.math.BlockPos pos,yarnwrap.block.Block block) { wrapperContained.updateComparators(pos.wrapperContained,block.wrapperContained); }
public boolean isSavingDisabled() { return wrapperContained.isSavingDisabled(); }
public void playSound(yarnwrap.entity.player.PlayerEntity source,double x,double y,double z,yarnwrap.registry.entry.RegistryEntry sound,yarnwrap.sound.SoundCategory category,float volume,float pitch,long seed) { wrapperContained.playSound(source.wrapperContained,x,y,z,sound.wrapperContained,category.wrapperContained,volume,pitch,seed); }
public void addParticle(yarnwrap.particle.ParticleEffect parameters,boolean alwaysSpawn,double x,double y,double z,double velocityX,double velocityY,double velocityZ) { wrapperContained.addParticle(parameters.wrapperContained,alwaysSpawn,x,y,z,velocityX,velocityY,velocityZ); }
public yarnwrap.entity.Entity getEntityById(int id) { return new yarnwrap.entity.Entity(wrapperContained.getEntityById(id)); }
public void syncGlobalEvent(int eventId,yarnwrap.util.math.BlockPos pos,int data) { wrapperContained.syncGlobalEvent(eventId,pos.wrapperContained,data); }
public boolean canSetBlock(yarnwrap.util.math.BlockPos pos) { return wrapperContained.canSetBlock(pos.wrapperContained); }
public float getThunderGradient(float delta) { return wrapperContained.getThunderGradient(delta); }
public void playSound(double x,double y,double z,yarnwrap.sound.SoundEvent sound,yarnwrap.sound.SoundCategory category,float volume,float pitch,boolean useDistance) { wrapperContained.playSound(x,y,z,sound.wrapperContained,category.wrapperContained,volume,pitch,useDistance); }
public void updateNeighbor(yarnwrap.util.math.BlockPos pos,yarnwrap.block.Block sourceBlock,yarnwrap.util.math.BlockPos sourcePos) { wrapperContained.updateNeighbor(pos.wrapperContained,sourceBlock.wrapperContained,sourcePos.wrapperContained); }
public void addImportantParticle(yarnwrap.particle.ParticleEffect parameters,double x,double y,double z,double velocityX,double velocityY,double velocityZ) { wrapperContained.addImportantParticle(parameters.wrapperContained,x,y,z,velocityX,velocityY,velocityZ); }
public void setThunderGradient(float thunderGradient) { wrapperContained.setThunderGradient(thunderGradient); }
public yarnwrap.world.chunk.WorldChunk getWorldChunk(yarnwrap.util.math.BlockPos pos) { return new yarnwrap.world.chunk.WorldChunk(wrapperContained.getWorldChunk(pos.wrapperContained)); }
public boolean setBlockState(yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { return wrapperContained.setBlockState(pos.wrapperContained,state.wrapperContained); }
public boolean canPlayerModifyAt(yarnwrap.entity.player.PlayerEntity player,yarnwrap.util.math.BlockPos pos) { return wrapperContained.canPlayerModifyAt(player.wrapperContained,pos.wrapperContained); }
public void updateNeighborsExcept(yarnwrap.util.math.BlockPos pos,yarnwrap.block.Block sourceBlock,yarnwrap.util.math.Direction direction) { wrapperContained.updateNeighborsExcept(pos.wrapperContained,sourceBlock.wrapperContained,direction.wrapperContained); }
public void setLightningTicksLeft(int lightningTicksLeft) { wrapperContained.setLightningTicksLeft(lightningTicksLeft); }
public long getTime() { return wrapperContained.getTime(); }
public boolean isTopSolid(yarnwrap.util.math.BlockPos pos,yarnwrap.entity.Entity entity) { return wrapperContained.isTopSolid(pos.wrapperContained,entity.wrapperContained); }
public void setBlockBreakingInfo(int entityId,yarnwrap.util.math.BlockPos pos,int progress) { wrapperContained.setBlockBreakingInfo(entityId,pos.wrapperContained,progress); }
public void setRainGradient(float rainGradient) { wrapperContained.setRainGradient(rainGradient); }
public boolean hasRain(yarnwrap.util.math.BlockPos pos) { return wrapperContained.hasRain(pos.wrapperContained); }
public void sendPacket(yarnwrap.network.packet.Packet packet) { wrapperContained.sendPacket(packet.wrapperContained); }
public void markDirty(yarnwrap.util.math.BlockPos pos) { wrapperContained.markDirty(pos.wrapperContained); }
public void disconnect() { wrapperContained.disconnect(); }
public boolean isDay() { return wrapperContained.isDay(); }
public long getTimeOfDay() { return wrapperContained.getTimeOfDay(); }
public void calculateAmbientDarkness() { wrapperContained.calculateAmbientDarkness(); }
// public yarnwrap.util.math.BlockPos getRandomPosInChunk(int x,int y,int z) { return new yarnwrap.util.math.BlockPos(wrapperContained.getRandomPosInChunk(x,y,z)); }
// public yarnwrap.world.explosion.Explosion createExplosion(yarnwrap.entity.Entity entity,double x,double y,double z,float power,boolean createFire,Object explosionSourceType) { return new yarnwrap.world.explosion.Explosion(wrapperContained.createExplosion(entity.wrapperContained,x,y,z,power,createFire,explosionSourceType)); }
public yarnwrap.util.crash.CrashReportSection addDetailsToCrashReport(yarnwrap.util.crash.CrashReport report) { return new yarnwrap.util.crash.CrashReportSection(wrapperContained.addDetailsToCrashReport(report.wrapperContained)); }
// public void initWeatherGradients() { wrapperContained.initWeatherGradients(); }
public void removeBlockEntity(yarnwrap.util.math.BlockPos pos) { wrapperContained.removeBlockEntity(pos.wrapperContained); }
public boolean isThundering() { return wrapperContained.isThundering(); }
public void addFireworkParticle(double x,double y,double z,double velocityX,double velocityY,double velocityZ,java.util.List explosions) { wrapperContained.addFireworkParticle(x,y,z,velocityX,velocityY,velocityZ,explosions); }
// public boolean isValidHorizontally(yarnwrap.util.math.BlockPos pos) { return wrapperContained.isValidHorizontally(pos.wrapperContained); }

}