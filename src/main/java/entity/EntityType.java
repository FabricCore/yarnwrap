package yarnwrap.entity;
public class EntityType { public net.minecraft.entity.EntityType wrapperContained; public EntityType(net.minecraft.entity.EntityType wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.registry.RegistryKey lootTableId() { return new yarnwrap.registry.RegistryKey(wrapperContained.lootTableId); }
// public yarnwrap.entity.EntityDimensions dimensions() { return new yarnwrap.entity.EntityDimensions(wrapperContained.dimensions); }
// public boolean fireImmune() { return wrapperContained.fireImmune; }
// public boolean spawnableFarFromPlayer() { return wrapperContained.spawnableFarFromPlayer; }
// public int maxTrackDistance() { return wrapperContained.maxTrackDistance; }
// public int trackTickInterval() { return wrapperContained.trackTickInterval; }
// public com.google.common.collect.ImmutableSet canSpawnInside() { return wrapperContained.canSpawnInside; }
// public Object registryEntry() { return wrapperContained.registryEntry; }
// public yarnwrap.resource.featuretoggle.FeatureSet requiredFeatures() { return new yarnwrap.resource.featuretoggle.FeatureSet(wrapperContained.requiredFeatures); }
// public float spawnBoxScale() { return wrapperContained.spawnBoxScale; }
// public boolean saveable() { return wrapperContained.saveable; }
// public boolean summonable() { return wrapperContained.summonable; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public yarnwrap.text.Text name() { return new yarnwrap.text.Text(wrapperContained.name); }
// public yarnwrap.entity.SpawnGroup spawnGroup() { return new yarnwrap.entity.SpawnGroup(wrapperContained.spawnGroup); }
// public Object factory() { return wrapperContained.factory; }
// public java.lang.String translationKey() { return wrapperContained.translationKey; }
public yarnwrap.registry.RegistryKey getLootTableId() { return new yarnwrap.registry.RegistryKey(wrapperContained.getLootTableId()); }
public java.util.Optional fromNbt(yarnwrap.nbt.NbtCompound nbt) { return wrapperContained.fromNbt(nbt.wrapperContained); }
public float getWidth() { return wrapperContained.getWidth(); }
public float getHeight() { return wrapperContained.getHeight(); }
public yarnwrap.entity.Entity loadEntityWithPassengers(yarnwrap.nbt.NbtCompound nbt,yarnwrap.world.World world,java.util.function.Function entityProcessor) { return new yarnwrap.entity.Entity(wrapperContained.loadEntityWithPassengers(nbt.wrapperContained,world.wrapperContained,entityProcessor)); }
// public java.util.Optional loadEntityFromNbt(yarnwrap.nbt.NbtCompound nbt,yarnwrap.world.World world) { return wrapperContained.loadEntityFromNbt(nbt.wrapperContained,world.wrapperContained); }
public yarnwrap.entity.EntityDimensions getDimensions() { return new yarnwrap.entity.EntityDimensions(wrapperContained.getDimensions()); }
public int getMaxTrackDistance() { return wrapperContained.getMaxTrackDistance(); }
public int getTrackTickInterval() { return wrapperContained.getTrackTickInterval(); }
public boolean alwaysUpdateVelocity() { return wrapperContained.alwaysUpdateVelocity(); }
public boolean isFireImmune() { return wrapperContained.isFireImmune(); }
public boolean isIn(yarnwrap.registry.tag.TagKey tag) { return wrapperContained.isIn(tag.wrapperContained); }
public boolean isSpawnableFarFromPlayer() { return wrapperContained.isSpawnableFarFromPlayer(); }
public boolean isInvalidSpawn(yarnwrap.block.BlockState state) { return wrapperContained.isInvalidSpawn(state.wrapperContained); }
public java.util.stream.Stream streamFromNbt(java.util.List entityNbtList,yarnwrap.world.World world) { return wrapperContained.streamFromNbt(entityNbtList,world.wrapperContained); }
public java.lang.String getUntranslatedName() { return wrapperContained.getUntranslatedName(); }
public Object getRegistryEntry() { return wrapperContained.getRegistryEntry(); }
public yarnwrap.entity.Entity spawn(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos,yarnwrap.entity.SpawnReason reason) { return new yarnwrap.entity.Entity(wrapperContained.spawn(world.wrapperContained,pos.wrapperContained,reason.wrapperContained)); }
public java.util.function.Consumer copier(yarnwrap.server.world.ServerWorld world,yarnwrap.item.ItemStack stack,yarnwrap.entity.player.PlayerEntity player) { return wrapperContained.copier(world.wrapperContained,stack.wrapperContained,player.wrapperContained); }
public java.util.function.Consumer nbtCopier(java.util.function.Consumer chained,yarnwrap.server.world.ServerWorld world,yarnwrap.item.ItemStack stack,yarnwrap.entity.player.PlayerEntity player) { return wrapperContained.nbtCopier(chained,world.wrapperContained,stack.wrapperContained,player.wrapperContained); }
public java.util.function.Consumer customNameCopier(java.util.function.Consumer chained,yarnwrap.item.ItemStack stack) { return wrapperContained.customNameCopier(chained,stack.wrapperContained); }
public java.util.function.Consumer copier(java.util.function.Consumer chained,yarnwrap.server.world.ServerWorld world,yarnwrap.item.ItemStack stack,yarnwrap.entity.player.PlayerEntity player) { return wrapperContained.copier(chained,world.wrapperContained,stack.wrapperContained,player.wrapperContained); }
public boolean isIn(yarnwrap.registry.entry.RegistryEntryList entityTypeEntryList) { return wrapperContained.isIn(entityTypeEntryList.wrapperContained); }
public yarnwrap.util.math.Box getSpawnBox(double x,double y,double z) { return new yarnwrap.util.math.Box(wrapperContained.getSpawnBox(x,y,z)); }
public void loadFromEntityNbt(yarnwrap.world.World world,yarnwrap.entity.player.PlayerEntity player,yarnwrap.entity.Entity entity,yarnwrap.component.type.NbtComponent nbt) { wrapperContained.loadFromEntityNbt(world.wrapperContained,player.wrapperContained,entity.wrapperContained,nbt.wrapperContained); }
public java.lang.String getTranslationKey() { return wrapperContained.getTranslationKey(); }
public yarnwrap.entity.Entity create(yarnwrap.world.World world) { return new yarnwrap.entity.Entity(wrapperContained.create(world.wrapperContained)); }
// public double getOriginY(yarnwrap.world.WorldView world,yarnwrap.util.math.BlockPos pos,boolean invertY,yarnwrap.util.math.Box boundingBox) { return wrapperContained.getOriginY(world.wrapperContained,pos.wrapperContained,invertY,boundingBox.wrapperContained); }
public yarnwrap.entity.Entity create(yarnwrap.server.world.ServerWorld world,java.util.function.Consumer afterConsumer,yarnwrap.util.math.BlockPos pos,yarnwrap.entity.SpawnReason reason,boolean alignPosition,boolean invertY) { return new yarnwrap.entity.Entity(wrapperContained.create(world.wrapperContained,afterConsumer,pos.wrapperContained,reason.wrapperContained,alignPosition,invertY)); }
public yarnwrap.util.Identifier getId(yarnwrap.entity.EntityType type) { return new yarnwrap.util.Identifier(wrapperContained.getId(type.wrapperContained)); }
public yarnwrap.entity.SpawnGroup getSpawnGroup() { return new yarnwrap.entity.SpawnGroup(wrapperContained.getSpawnGroup()); }
public java.util.Optional getEntityFromNbt(yarnwrap.nbt.NbtCompound nbt,yarnwrap.world.World world) { return wrapperContained.getEntityFromNbt(nbt.wrapperContained,world.wrapperContained); }
public boolean isSaveable() { return wrapperContained.isSaveable(); }
public yarnwrap.entity.Entity spawnFromItemStack(yarnwrap.server.world.ServerWorld world,yarnwrap.item.ItemStack stack,yarnwrap.entity.player.PlayerEntity player,yarnwrap.util.math.BlockPos pos,yarnwrap.entity.SpawnReason spawnReason,boolean alignPosition,boolean invertY) { return new yarnwrap.entity.Entity(wrapperContained.spawnFromItemStack(world.wrapperContained,stack.wrapperContained,player.wrapperContained,pos.wrapperContained,spawnReason.wrapperContained,alignPosition,invertY)); }
// public yarnwrap.entity.EntityType register(java.lang.String id,Object type) { return new yarnwrap.entity.EntityType(wrapperContained.register(id,type)); }
public boolean isSummonable() { return wrapperContained.isSummonable(); }
public yarnwrap.text.Text getName() { return new yarnwrap.text.Text(wrapperContained.getName()); }
public java.util.Optional get(java.lang.String id) { return wrapperContained.get(id); }
public yarnwrap.entity.Entity spawn(yarnwrap.server.world.ServerWorld world,java.util.function.Consumer afterConsumer,yarnwrap.util.math.BlockPos pos,yarnwrap.entity.SpawnReason reason,boolean alignPosition,boolean invertY) { return new yarnwrap.entity.Entity(wrapperContained.spawn(world.wrapperContained,afterConsumer,pos.wrapperContained,reason.wrapperContained,alignPosition,invertY)); }

}