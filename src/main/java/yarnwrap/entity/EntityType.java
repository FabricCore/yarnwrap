package yarnwrap.entity;
public class EntityType { public net.minecraft.entity.EntityType wrapperContained; public EntityType(net.minecraft.entity.EntityType wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean saveable() { return wrapperContained.saveable; }
// public void saveable(boolean value) { wrapperContained.saveable = value; }
// public static boolean saveable() { return net.minecraft.entity.EntityType.saveable; }
// public static void saveable(boolean value, ) { net.minecraft.entity.EntityType.saveable = value; }

// public boolean summonable() { return wrapperContained.summonable; }
// public void summonable(boolean value) { wrapperContained.summonable = value; }
// public static boolean summonable() { return net.minecraft.entity.EntityType.summonable; }
// public static void summonable(boolean value, ) { net.minecraft.entity.EntityType.summonable = value; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.entity.EntityType.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.entity.EntityType.LOGGER = value; }

// public yarnwrap.text.Text name() { return new yarnwrap.text.Text(wrapperContained.name); }
// public void name(yarnwrap.text.Text value) { wrapperContained.name = value.wrapperContained; }
// public static yarnwrap.text.Text name() { return new yarnwrap.text.Text(net.minecraft.entity.EntityType.name); }
// public static void name(yarnwrap.text.Text value, ) { net.minecraft.entity.EntityType.name = value.wrapperContained; }

// public yarnwrap.entity.SpawnGroup spawnGroup() { return new yarnwrap.entity.SpawnGroup(wrapperContained.spawnGroup); }
// public void spawnGroup(yarnwrap.entity.SpawnGroup value) { wrapperContained.spawnGroup = value.wrapperContained; }
// public static yarnwrap.entity.SpawnGroup spawnGroup() { return new yarnwrap.entity.SpawnGroup(net.minecraft.entity.EntityType.spawnGroup); }
// public static void spawnGroup(yarnwrap.entity.SpawnGroup value, ) { net.minecraft.entity.EntityType.spawnGroup = value.wrapperContained; }

// public Object factory() { return wrapperContained.factory; }
// // public void factory(Object value) { wrapperContained.factory = value; }
// // public static Object factory() { return net.minecraft.entity.EntityType.factory; }
// // public static void factory(Object value, ) { net.minecraft.entity.EntityType.factory = value; }

// public java.lang.String translationKey() { return wrapperContained.translationKey; }
// public void translationKey(java.lang.String value) { wrapperContained.translationKey = value; }
// public static java.lang.String translationKey() { return net.minecraft.entity.EntityType.translationKey; }
// public static void translationKey(java.lang.String value, ) { net.minecraft.entity.EntityType.translationKey = value; }

// public java.util.Optional lootTableKey() { return wrapperContained.lootTableKey; }
// public void lootTableKey(java.util.Optional value) { wrapperContained.lootTableKey = value; }
// public static java.util.Optional lootTableKey() { return net.minecraft.entity.EntityType.lootTableKey; }
// public static void lootTableKey(java.util.Optional value, ) { net.minecraft.entity.EntityType.lootTableKey = value; }

// public yarnwrap.entity.EntityDimensions dimensions() { return new yarnwrap.entity.EntityDimensions(wrapperContained.dimensions); }
// public void dimensions(yarnwrap.entity.EntityDimensions value) { wrapperContained.dimensions = value.wrapperContained; }
// public static yarnwrap.entity.EntityDimensions dimensions() { return new yarnwrap.entity.EntityDimensions(net.minecraft.entity.EntityType.dimensions); }
// public static void dimensions(yarnwrap.entity.EntityDimensions value, ) { net.minecraft.entity.EntityType.dimensions = value.wrapperContained; }

// public boolean fireImmune() { return wrapperContained.fireImmune; }
// public void fireImmune(boolean value) { wrapperContained.fireImmune = value; }
// public static boolean fireImmune() { return net.minecraft.entity.EntityType.fireImmune; }
// public static void fireImmune(boolean value, ) { net.minecraft.entity.EntityType.fireImmune = value; }

// public boolean spawnableFarFromPlayer() { return wrapperContained.spawnableFarFromPlayer; }
// public void spawnableFarFromPlayer(boolean value) { wrapperContained.spawnableFarFromPlayer = value; }
// public static boolean spawnableFarFromPlayer() { return net.minecraft.entity.EntityType.spawnableFarFromPlayer; }
// public static void spawnableFarFromPlayer(boolean value, ) { net.minecraft.entity.EntityType.spawnableFarFromPlayer = value; }

// public int maxTrackDistance() { return wrapperContained.maxTrackDistance; }
// public void maxTrackDistance(int value) { wrapperContained.maxTrackDistance = value; }
// public static int maxTrackDistance() { return net.minecraft.entity.EntityType.maxTrackDistance; }
// public static void maxTrackDistance(int value, ) { net.minecraft.entity.EntityType.maxTrackDistance = value; }

// public int trackTickInterval() { return wrapperContained.trackTickInterval; }
// public void trackTickInterval(int value) { wrapperContained.trackTickInterval = value; }
// public static int trackTickInterval() { return net.minecraft.entity.EntityType.trackTickInterval; }
// public static void trackTickInterval(int value, ) { net.minecraft.entity.EntityType.trackTickInterval = value; }

// public com.google.common.collect.ImmutableSet canSpawnInside() { return wrapperContained.canSpawnInside; }
// public void canSpawnInside(com.google.common.collect.ImmutableSet value) { wrapperContained.canSpawnInside = value; }
// public static com.google.common.collect.ImmutableSet canSpawnInside() { return net.minecraft.entity.EntityType.canSpawnInside; }
// public static void canSpawnInside(com.google.common.collect.ImmutableSet value, ) { net.minecraft.entity.EntityType.canSpawnInside = value; }

// public Object registryEntry() { return wrapperContained.registryEntry; }
// // public void registryEntry(Object value) { wrapperContained.registryEntry = value; }
// // public static Object registryEntry() { return net.minecraft.entity.EntityType.registryEntry; }
// // public static void registryEntry(Object value, ) { net.minecraft.entity.EntityType.registryEntry = value; }

// public yarnwrap.resource.featuretoggle.FeatureSet requiredFeatures() { return new yarnwrap.resource.featuretoggle.FeatureSet(wrapperContained.requiredFeatures); }
// public void requiredFeatures(yarnwrap.resource.featuretoggle.FeatureSet value) { wrapperContained.requiredFeatures = value.wrapperContained; }
// public static yarnwrap.resource.featuretoggle.FeatureSet requiredFeatures() { return new yarnwrap.resource.featuretoggle.FeatureSet(net.minecraft.entity.EntityType.requiredFeatures); }
// public static void requiredFeatures(yarnwrap.resource.featuretoggle.FeatureSet value, ) { net.minecraft.entity.EntityType.requiredFeatures = value.wrapperContained; }

// public float spawnBoxScale() { return wrapperContained.spawnBoxScale; }
// public void spawnBoxScale(float value) { wrapperContained.spawnBoxScale = value; }
// public static float spawnBoxScale() { return net.minecraft.entity.EntityType.spawnBoxScale; }
// public static void spawnBoxScale(float value, ) { net.minecraft.entity.EntityType.spawnBoxScale = value; }

// public java.util.Set POTENTIALLY_EXECUTES_COMMANDS() { return wrapperContained.POTENTIALLY_EXECUTES_COMMANDS; }
// public void POTENTIALLY_EXECUTES_COMMANDS(java.util.Set value) { wrapperContained.POTENTIALLY_EXECUTES_COMMANDS = value; }
// public static java.util.Set POTENTIALLY_EXECUTES_COMMANDS() { return net.minecraft.entity.EntityType.POTENTIALLY_EXECUTES_COMMANDS; }
// public static void POTENTIALLY_EXECUTES_COMMANDS(java.util.Set value, ) { net.minecraft.entity.EntityType.POTENTIALLY_EXECUTES_COMMANDS = value; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.entity.EntityType.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.entity.EntityType.CODEC = value; }

// public EntityType(Object factory,yarnwrap.entity.SpawnGroup spawnGroup,boolean saveable,boolean summonable,boolean fireImmune,boolean spawnableFarFromPlayer,com.google.common.collect.ImmutableSet canSpawnInside,yarnwrap.entity.EntityDimensions dimensions,float spawnBoxScale,int maxTrackDistance,int trackTickInterval,java.lang.String translationKey,java.util.Optional lootTable,yarnwrap.resource.featuretoggle.FeatureSet requiredFeatures) { this.wrapperContained = new net.minecraft.entity.EntityType(factory,spawnGroup.wrapperContained,saveable,summonable,fireImmune,spawnableFarFromPlayer,canSpawnInside,dimensions.wrapperContained,spawnBoxScale,maxTrackDistance,trackTickInterval,translationKey,lootTable,requiredFeatures.wrapperContained); }
// public void loadFromEntityNbt(yarnwrap.world.World world,yarnwrap.entity.LivingEntity spawner,yarnwrap.entity.Entity entity,yarnwrap.component.type.NbtComponent nbt) { wrapperContained.loadFromEntityNbt(world.wrapperContained,spawner.wrapperContained,entity.wrapperContained,nbt.wrapperContained); }
// public static void loadFromEntityNbt(yarnwrap.world.World world,yarnwrap.entity.LivingEntity spawner,yarnwrap.entity.Entity entity,yarnwrap.component.type.NbtComponent nbt, ) { net.minecraft.entity.EntityType.loadFromEntityNbt(world.wrapperContained,spawner.wrapperContained,entity.wrapperContained,nbt.wrapperContained); }
public java.lang.String getTranslationKey() { return wrapperContained.getTranslationKey(); }
// public static java.lang.String getTranslationKey() { return net.minecraft.entity.EntityType.getTranslationKey(); }
public yarnwrap.entity.Entity create(yarnwrap.world.World world,yarnwrap.entity.SpawnReason reason) { return new yarnwrap.entity.Entity(wrapperContained.create(world.wrapperContained,reason.wrapperContained)); }
// public static yarnwrap.entity.Entity create(yarnwrap.world.World world,yarnwrap.entity.SpawnReason reason, ) { return new yarnwrap.entity.Entity(net.minecraft.entity.EntityType.create(world.wrapperContained,reason.wrapperContained)); }
// public double getOriginY(yarnwrap.world.WorldView world,yarnwrap.util.math.BlockPos pos,boolean invertY,yarnwrap.util.math.Box boundingBox) { return wrapperContained.getOriginY(world.wrapperContained,pos.wrapperContained,invertY,boundingBox.wrapperContained); }
// public static double getOriginY(yarnwrap.world.WorldView world,yarnwrap.util.math.BlockPos pos,boolean invertY,yarnwrap.util.math.Box boundingBox, ) { return net.minecraft.entity.EntityType.getOriginY(world.wrapperContained,pos.wrapperContained,invertY,boundingBox.wrapperContained); }
public yarnwrap.entity.Entity create(yarnwrap.server.world.ServerWorld world,java.util.function.Consumer afterConsumer,yarnwrap.util.math.BlockPos pos,yarnwrap.entity.SpawnReason reason,boolean alignPosition,boolean invertY) { return new yarnwrap.entity.Entity(wrapperContained.create(world.wrapperContained,afterConsumer,pos.wrapperContained,reason.wrapperContained,alignPosition,invertY)); }
// public static yarnwrap.entity.Entity create(yarnwrap.server.world.ServerWorld world,java.util.function.Consumer afterConsumer,yarnwrap.util.math.BlockPos pos,yarnwrap.entity.SpawnReason reason,boolean alignPosition,boolean invertY, ) { return new yarnwrap.entity.Entity(net.minecraft.entity.EntityType.create(world.wrapperContained,afterConsumer,pos.wrapperContained,reason.wrapperContained,alignPosition,invertY)); }
// public yarnwrap.util.Identifier getId(yarnwrap.entity.EntityType type) { return new yarnwrap.util.Identifier(wrapperContained.getId(type.wrapperContained)); }
// public static yarnwrap.util.Identifier getId(yarnwrap.entity.EntityType type, ) { return new yarnwrap.util.Identifier(net.minecraft.entity.EntityType.getId(type.wrapperContained)); }
public yarnwrap.entity.SpawnGroup getSpawnGroup() { return new yarnwrap.entity.SpawnGroup(wrapperContained.getSpawnGroup()); }
// public static yarnwrap.entity.SpawnGroup getSpawnGroup() { return new yarnwrap.entity.SpawnGroup(net.minecraft.entity.EntityType.getSpawnGroup()); }
// public java.util.Optional getEntityFromData(yarnwrap.storage.ReadView view,yarnwrap.world.World world,yarnwrap.entity.SpawnReason reason) { return wrapperContained.getEntityFromData(view.wrapperContained,world.wrapperContained,reason.wrapperContained); }
// public static java.util.Optional getEntityFromData(yarnwrap.storage.ReadView view,yarnwrap.world.World world,yarnwrap.entity.SpawnReason reason, ) { return net.minecraft.entity.EntityType.getEntityFromData(view.wrapperContained,world.wrapperContained,reason.wrapperContained); }
public boolean isSaveable() { return wrapperContained.isSaveable(); }
// public static boolean isSaveable() { return net.minecraft.entity.EntityType.isSaveable(); }
public yarnwrap.entity.Entity spawnFromItemStack(yarnwrap.server.world.ServerWorld world,yarnwrap.item.ItemStack stack,yarnwrap.entity.LivingEntity spawner,yarnwrap.util.math.BlockPos pos,yarnwrap.entity.SpawnReason spawnReason,boolean alignPosition,boolean invertY) { return new yarnwrap.entity.Entity(wrapperContained.spawnFromItemStack(world.wrapperContained,stack.wrapperContained,spawner.wrapperContained,pos.wrapperContained,spawnReason.wrapperContained,alignPosition,invertY)); }
// public static yarnwrap.entity.Entity spawnFromItemStack(yarnwrap.server.world.ServerWorld world,yarnwrap.item.ItemStack stack,yarnwrap.entity.LivingEntity spawner,yarnwrap.util.math.BlockPos pos,yarnwrap.entity.SpawnReason spawnReason,boolean alignPosition,boolean invertY, ) { return new yarnwrap.entity.Entity(net.minecraft.entity.EntityType.spawnFromItemStack(world.wrapperContained,stack.wrapperContained,spawner.wrapperContained,pos.wrapperContained,spawnReason.wrapperContained,alignPosition,invertY)); }
// public yarnwrap.entity.EntityType register(java.lang.String id,Object type) { return new yarnwrap.entity.EntityType(wrapperContained.register(id,type)); }
// public static yarnwrap.entity.EntityType register(java.lang.String id,Object type, ) { return new yarnwrap.entity.EntityType(net.minecraft.entity.EntityType.register(id,type)); }
public boolean isSummonable() { return wrapperContained.isSummonable(); }
// public static boolean isSummonable() { return net.minecraft.entity.EntityType.isSummonable(); }
public yarnwrap.text.Text getName() { return new yarnwrap.text.Text(wrapperContained.getName()); }
// public static yarnwrap.text.Text getName() { return new yarnwrap.text.Text(net.minecraft.entity.EntityType.getName()); }
// public java.util.Optional get(java.lang.String id) { return wrapperContained.get(id); }
// public static java.util.Optional get(java.lang.String id, ) { return net.minecraft.entity.EntityType.get(id); }
public yarnwrap.entity.Entity spawn(yarnwrap.server.world.ServerWorld world,java.util.function.Consumer afterConsumer,yarnwrap.util.math.BlockPos pos,yarnwrap.entity.SpawnReason reason,boolean alignPosition,boolean invertY) { return new yarnwrap.entity.Entity(wrapperContained.spawn(world.wrapperContained,afterConsumer,pos.wrapperContained,reason.wrapperContained,alignPosition,invertY)); }
// public static yarnwrap.entity.Entity spawn(yarnwrap.server.world.ServerWorld world,java.util.function.Consumer afterConsumer,yarnwrap.util.math.BlockPos pos,yarnwrap.entity.SpawnReason reason,boolean alignPosition,boolean invertY, ) { return new yarnwrap.entity.Entity(net.minecraft.entity.EntityType.spawn(world.wrapperContained,afterConsumer,pos.wrapperContained,reason.wrapperContained,alignPosition,invertY)); }
public java.util.Optional getLootTableKey() { return wrapperContained.getLootTableKey(); }
// public static java.util.Optional getLootTableKey() { return net.minecraft.entity.EntityType.getLootTableKey(); }
// public java.util.Optional fromData(yarnwrap.storage.ReadView view) { return wrapperContained.fromData(view.wrapperContained); }
// public static java.util.Optional fromData(yarnwrap.storage.ReadView view, ) { return net.minecraft.entity.EntityType.fromData(view.wrapperContained); }
public float getWidth() { return wrapperContained.getWidth(); }
// public static float getWidth() { return net.minecraft.entity.EntityType.getWidth(); }
public float getHeight() { return wrapperContained.getHeight(); }
// public static float getHeight() { return net.minecraft.entity.EntityType.getHeight(); }
// public void method_17839(yarnwrap.storage.ReadView entity) { wrapperContained.method_17839(entity.wrapperContained); }
// public static void method_17839(yarnwrap.storage.ReadView entity, ) { net.minecraft.entity.EntityType.method_17839(entity.wrapperContained); }
// public yarnwrap.entity.Entity loadEntityWithPassengers(yarnwrap.storage.ReadView view,yarnwrap.world.World world,yarnwrap.entity.SpawnReason reason,java.util.function.Function entityProcessor) { return new yarnwrap.entity.Entity(wrapperContained.loadEntityWithPassengers(view.wrapperContained,world.wrapperContained,reason.wrapperContained,entityProcessor)); }
// public static yarnwrap.entity.Entity loadEntityWithPassengers(yarnwrap.storage.ReadView view,yarnwrap.world.World world,yarnwrap.entity.SpawnReason reason,java.util.function.Function entityProcessor, ) { return new yarnwrap.entity.Entity(net.minecraft.entity.EntityType.loadEntityWithPassengers(view.wrapperContained,world.wrapperContained,reason.wrapperContained,entityProcessor)); }
// public yarnwrap.entity.Entity method_17843(yarnwrap.storage.ReadView entity) { return new yarnwrap.entity.Entity(wrapperContained.method_17843(entity.wrapperContained)); }
// public static yarnwrap.entity.Entity method_17843(yarnwrap.storage.ReadView entity, ) { return new yarnwrap.entity.Entity(net.minecraft.entity.EntityType.method_17843(entity.wrapperContained)); }
// public yarnwrap.entity.Entity method_17846(yarnwrap.world.World type) { return new yarnwrap.entity.Entity(wrapperContained.method_17846(type.wrapperContained)); }
// public static yarnwrap.entity.Entity method_17846(yarnwrap.world.World type, ) { return new yarnwrap.entity.Entity(net.minecraft.entity.EntityType.method_17846(type.wrapperContained)); }
// public java.util.Optional loadEntityFromData(yarnwrap.storage.ReadView view,yarnwrap.world.World world,yarnwrap.entity.SpawnReason reason) { return wrapperContained.loadEntityFromData(view.wrapperContained,world.wrapperContained,reason.wrapperContained); }
// public static java.util.Optional loadEntityFromData(yarnwrap.storage.ReadView view,yarnwrap.world.World world,yarnwrap.entity.SpawnReason reason, ) { return net.minecraft.entity.EntityType.loadEntityFromData(view.wrapperContained,world.wrapperContained,reason.wrapperContained); }
public yarnwrap.entity.EntityDimensions getDimensions() { return new yarnwrap.entity.EntityDimensions(wrapperContained.getDimensions()); }
// public static yarnwrap.entity.EntityDimensions getDimensions() { return new yarnwrap.entity.EntityDimensions(net.minecraft.entity.EntityType.getDimensions()); }
public int getMaxTrackDistance() { return wrapperContained.getMaxTrackDistance(); }
// public static int getMaxTrackDistance() { return net.minecraft.entity.EntityType.getMaxTrackDistance(); }
public int getTrackTickInterval() { return wrapperContained.getTrackTickInterval(); }
// public static int getTrackTickInterval() { return net.minecraft.entity.EntityType.getTrackTickInterval(); }
public boolean alwaysUpdateVelocity() { return wrapperContained.alwaysUpdateVelocity(); }
// public static boolean alwaysUpdateVelocity() { return net.minecraft.entity.EntityType.alwaysUpdateVelocity(); }
public boolean isFireImmune() { return wrapperContained.isFireImmune(); }
// public static boolean isFireImmune() { return net.minecraft.entity.EntityType.isFireImmune(); }
public boolean isIn(yarnwrap.registry.tag.TagKey tag) { return wrapperContained.isIn(tag.wrapperContained); }
// public static boolean isIn(yarnwrap.registry.tag.TagKey tag, ) { return net.minecraft.entity.EntityType.isIn(tag.wrapperContained); }
public boolean isSpawnableFarFromPlayer() { return wrapperContained.isSpawnableFarFromPlayer(); }
// public static boolean isSpawnableFarFromPlayer() { return net.minecraft.entity.EntityType.isSpawnableFarFromPlayer(); }
public boolean isInvalidSpawn(yarnwrap.block.BlockState state) { return wrapperContained.isInvalidSpawn(state.wrapperContained); }
// public static boolean isInvalidSpawn(yarnwrap.block.BlockState state, ) { return net.minecraft.entity.EntityType.isInvalidSpawn(state.wrapperContained); }
// public java.util.stream.Stream streamFromData(Object view,yarnwrap.world.World world,yarnwrap.entity.SpawnReason reason) { return wrapperContained.streamFromData(view,world.wrapperContained,reason.wrapperContained); }
// public static java.util.stream.Stream streamFromData(Object view,yarnwrap.world.World world,yarnwrap.entity.SpawnReason reason, ) { return net.minecraft.entity.EntityType.streamFromData(view,world.wrapperContained,reason.wrapperContained); }
public java.lang.String getUntranslatedName() { return wrapperContained.getUntranslatedName(); }
// public static java.lang.String getUntranslatedName() { return net.minecraft.entity.EntityType.getUntranslatedName(); }
public Object getRegistryEntry() { return wrapperContained.getRegistryEntry(); }
// public static Object getRegistryEntry() { return net.minecraft.entity.EntityType.getRegistryEntry(); }
public yarnwrap.entity.Entity spawn(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos,yarnwrap.entity.SpawnReason reason) { return new yarnwrap.entity.Entity(wrapperContained.spawn(world.wrapperContained,pos.wrapperContained,reason.wrapperContained)); }
// public static yarnwrap.entity.Entity spawn(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos,yarnwrap.entity.SpawnReason reason, ) { return new yarnwrap.entity.Entity(net.minecraft.entity.EntityType.spawn(world.wrapperContained,pos.wrapperContained,reason.wrapperContained)); }
// public void method_47823(yarnwrap.entity.Entity entity) { wrapperContained.method_47823(entity.wrapperContained); }
// public static void method_47823(yarnwrap.entity.Entity entity, ) { net.minecraft.entity.EntityType.method_47823(entity.wrapperContained); }
// public void method_48008(yarnwrap.world.World entity) { wrapperContained.method_48008(entity.wrapperContained); }
// public static void method_48008(yarnwrap.world.World entity, ) { net.minecraft.entity.EntityType.method_48008(entity.wrapperContained); }
// public java.util.function.Consumer copier(yarnwrap.world.World world,yarnwrap.item.ItemStack stack,yarnwrap.entity.LivingEntity spawner) { return wrapperContained.copier(world.wrapperContained,stack.wrapperContained,spawner.wrapperContained); }
// public static java.util.function.Consumer copier(yarnwrap.world.World world,yarnwrap.item.ItemStack stack,yarnwrap.entity.LivingEntity spawner, ) { return net.minecraft.entity.EntityType.copier(world.wrapperContained,stack.wrapperContained,spawner.wrapperContained); }
// public java.util.function.Consumer nbtCopier(java.util.function.Consumer chained,yarnwrap.world.World world,yarnwrap.item.ItemStack stack,yarnwrap.entity.LivingEntity spawner) { return wrapperContained.nbtCopier(chained,world.wrapperContained,stack.wrapperContained,spawner.wrapperContained); }
// public static java.util.function.Consumer nbtCopier(java.util.function.Consumer chained,yarnwrap.world.World world,yarnwrap.item.ItemStack stack,yarnwrap.entity.LivingEntity spawner, ) { return net.minecraft.entity.EntityType.nbtCopier(chained,world.wrapperContained,stack.wrapperContained,spawner.wrapperContained); }
// public void method_48013(yarnwrap.entity.Entity entity) { wrapperContained.method_48013(entity.wrapperContained); }
// public static void method_48013(yarnwrap.entity.Entity entity, ) { net.minecraft.entity.EntityType.method_48013(entity.wrapperContained); }
// public java.util.function.Consumer copier(java.util.function.Consumer chained,yarnwrap.world.World world,yarnwrap.item.ItemStack stack,yarnwrap.entity.LivingEntity spawner) { return wrapperContained.copier(chained,world.wrapperContained,stack.wrapperContained,spawner.wrapperContained); }
// public static java.util.function.Consumer copier(java.util.function.Consumer chained,yarnwrap.world.World world,yarnwrap.item.ItemStack stack,yarnwrap.entity.LivingEntity spawner, ) { return net.minecraft.entity.EntityType.copier(chained,world.wrapperContained,stack.wrapperContained,spawner.wrapperContained); }
public boolean isIn(yarnwrap.registry.entry.RegistryEntryList entityTypeEntryList) { return wrapperContained.isIn(entityTypeEntryList.wrapperContained); }
// public static boolean isIn(yarnwrap.registry.entry.RegistryEntryList entityTypeEntryList, ) { return net.minecraft.entity.EntityType.isIn(entityTypeEntryList.wrapperContained); }
public yarnwrap.util.math.Box getSpawnBox(double x,double y,double z) { return new yarnwrap.util.math.Box(wrapperContained.getSpawnBox(x,y,z)); }
// public static yarnwrap.util.math.Box getSpawnBox(double x,double y,double z, ) { return new yarnwrap.util.math.Box(net.minecraft.entity.EntityType.getSpawnBox(x,y,z)); }
// public yarnwrap.entity.EntityType register(yarnwrap.registry.RegistryKey key,Object type) { return new yarnwrap.entity.EntityType(wrapperContained.register(key.wrapperContained,type)); }
// public static yarnwrap.entity.EntityType register(yarnwrap.registry.RegistryKey key,Object type, ) { return new yarnwrap.entity.EntityType(net.minecraft.entity.EntityType.register(key.wrapperContained,type)); }
// public yarnwrap.registry.RegistryKey keyOf(java.lang.String id) { return new yarnwrap.registry.RegistryKey(wrapperContained.keyOf(id)); }
// public static yarnwrap.registry.RegistryKey keyOf(java.lang.String id, ) { return new yarnwrap.registry.RegistryKey(net.minecraft.entity.EntityType.keyOf(id)); }
// public Object getBoatFactory(java.util.function.Supplier itemSupplier) { return wrapperContained.getBoatFactory(itemSupplier); }
// public static Object getBoatFactory(java.util.function.Supplier itemSupplier, ) { return net.minecraft.entity.EntityType.getBoatFactory(itemSupplier); }
// public yarnwrap.entity.vehicle.ChestRaftEntity method_64433(java.util.function.Supplier type,yarnwrap.entity.EntityType world) { return new yarnwrap.entity.vehicle.ChestRaftEntity(wrapperContained.method_64433(type,world.wrapperContained)); }
// public static yarnwrap.entity.vehicle.ChestRaftEntity method_64433(java.util.function.Supplier type,yarnwrap.entity.EntityType world, ) { return new yarnwrap.entity.vehicle.ChestRaftEntity(net.minecraft.entity.EntityType.method_64433(type,world.wrapperContained)); }
// public Object getChestBoatFactory(java.util.function.Supplier itemSupplier) { return wrapperContained.getChestBoatFactory(itemSupplier); }
// public static Object getChestBoatFactory(java.util.function.Supplier itemSupplier, ) { return net.minecraft.entity.EntityType.getChestBoatFactory(itemSupplier); }
// public yarnwrap.entity.vehicle.RaftEntity method_64435(java.util.function.Supplier type,yarnwrap.entity.EntityType world) { return new yarnwrap.entity.vehicle.RaftEntity(wrapperContained.method_64435(type,world.wrapperContained)); }
// public static yarnwrap.entity.vehicle.RaftEntity method_64435(java.util.function.Supplier type,yarnwrap.entity.EntityType world, ) { return new yarnwrap.entity.vehicle.RaftEntity(net.minecraft.entity.EntityType.method_64435(type,world.wrapperContained)); }
// public Object getRaftFactory(java.util.function.Supplier itemSupplier) { return wrapperContained.getRaftFactory(itemSupplier); }
// public static Object getRaftFactory(java.util.function.Supplier itemSupplier, ) { return net.minecraft.entity.EntityType.getRaftFactory(itemSupplier); }
// public yarnwrap.entity.vehicle.ChestBoatEntity method_64437(java.util.function.Supplier type,yarnwrap.entity.EntityType world) { return new yarnwrap.entity.vehicle.ChestBoatEntity(wrapperContained.method_64437(type,world.wrapperContained)); }
// public static yarnwrap.entity.vehicle.ChestBoatEntity method_64437(java.util.function.Supplier type,yarnwrap.entity.EntityType world, ) { return new yarnwrap.entity.vehicle.ChestBoatEntity(net.minecraft.entity.EntityType.method_64437(type,world.wrapperContained)); }
// public Object getChestRaftFactory(java.util.function.Supplier itemSupplier) { return wrapperContained.getChestRaftFactory(itemSupplier); }
// public static Object getChestRaftFactory(java.util.function.Supplier itemSupplier, ) { return net.minecraft.entity.EntityType.getChestRaftFactory(itemSupplier); }
// public yarnwrap.entity.vehicle.BoatEntity method_64439(java.util.function.Supplier type,yarnwrap.entity.EntityType world) { return new yarnwrap.entity.vehicle.BoatEntity(wrapperContained.method_64439(type,world.wrapperContained)); }
// public static yarnwrap.entity.vehicle.BoatEntity method_64439(java.util.function.Supplier type,yarnwrap.entity.EntityType world, ) { return new yarnwrap.entity.vehicle.BoatEntity(net.minecraft.entity.EntityType.method_64439(type,world.wrapperContained)); }
public boolean canPotentiallyExecuteCommands() { return wrapperContained.canPotentiallyExecuteCommands(); }
// public static boolean canPotentiallyExecuteCommands() { return net.minecraft.entity.EntityType.canPotentiallyExecuteCommands(); }
// public void method_66662(yarnwrap.item.ItemStack entity) { wrapperContained.method_66662(entity.wrapperContained); }
// public static void method_66662(yarnwrap.item.ItemStack entity, ) { net.minecraft.entity.EntityType.method_66662(entity.wrapperContained); }
// public java.util.function.Consumer componentsCopier(java.util.function.Consumer chained,yarnwrap.item.ItemStack stack) { return wrapperContained.componentsCopier(chained,stack.wrapperContained); }
// public static java.util.function.Consumer componentsCopier(java.util.function.Consumer chained,yarnwrap.item.ItemStack stack, ) { return net.minecraft.entity.EntityType.componentsCopier(chained,stack.wrapperContained); }
// public void method_67636(yarnwrap.world.World viewx,yarnwrap.entity.SpawnReason callback) { wrapperContained.method_67636(viewx.wrapperContained,callback.wrapperContained); }
// public static void method_67636(yarnwrap.world.World viewx,yarnwrap.entity.SpawnReason callback, ) { net.minecraft.entity.EntityType.method_67636(viewx.wrapperContained,callback.wrapperContained); }
// public yarnwrap.entity.Entity method_67637(java.util.function.Consumer entity) { return new yarnwrap.entity.Entity(wrapperContained.method_67637(entity)); }
// public static yarnwrap.entity.Entity method_67637(java.util.function.Consumer entity, ) { return new yarnwrap.entity.Entity(net.minecraft.entity.EntityType.method_67637(entity)); }
// public yarnwrap.entity.Entity loadEntityWithPassengers(yarnwrap.nbt.NbtCompound nbt,yarnwrap.world.World world,yarnwrap.entity.SpawnReason reason,java.util.function.Function entityProcessor) { return new yarnwrap.entity.Entity(wrapperContained.loadEntityWithPassengers(nbt.wrapperContained,world.wrapperContained,reason.wrapperContained,entityProcessor)); }
// public static yarnwrap.entity.Entity loadEntityWithPassengers(yarnwrap.nbt.NbtCompound nbt,yarnwrap.world.World world,yarnwrap.entity.SpawnReason reason,java.util.function.Function entityProcessor, ) { return new yarnwrap.entity.Entity(net.minecraft.entity.EntityType.loadEntityWithPassengers(nbt.wrapperContained,world.wrapperContained,reason.wrapperContained,entityProcessor)); }

}