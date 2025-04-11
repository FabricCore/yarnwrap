package yarnwrap.block.entity;
public class BeaconBlockEntity { public net.minecraft.block.entity.BeaconBlockEntity wrapperContained; public BeaconBlockEntity(net.minecraft.block.entity.BeaconBlockEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.text.Text customName() { return new yarnwrap.text.Text(wrapperContained.customName); }
// public void customName(yarnwrap.text.Text value) { wrapperContained.customName = value.wrapperContained; }
// public yarnwrap.registry.entry.RegistryEntry primary() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.primary); }
// public void primary(yarnwrap.registry.entry.RegistryEntry value) { wrapperContained.primary = value.wrapperContained; }
// public java.util.Set EFFECTS() { return wrapperContained.EFFECTS; }
// public void EFFECTS(java.util.Set value) { wrapperContained.EFFECTS = value; }
// public yarnwrap.registry.entry.RegistryEntry secondary() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.secondary); }
// public void secondary(yarnwrap.registry.entry.RegistryEntry value) { wrapperContained.secondary = value.wrapperContained; }
public java.util.List EFFECTS_BY_LEVEL() { return wrapperContained.EFFECTS_BY_LEVEL; }
// public void EFFECTS_BY_LEVEL(java.util.List value) { wrapperContained.EFFECTS_BY_LEVEL = value; }
// public int level() { return wrapperContained.level; }
// public void level(int value) { wrapperContained.level = value; }
// public yarnwrap.inventory.ContainerLock lock() { return new yarnwrap.inventory.ContainerLock(wrapperContained.lock); }
// public void lock(yarnwrap.inventory.ContainerLock value) { wrapperContained.lock = value.wrapperContained; }
// public yarnwrap.screen.PropertyDelegate propertyDelegate() { return new yarnwrap.screen.PropertyDelegate(wrapperContained.propertyDelegate); }
// public void propertyDelegate(yarnwrap.screen.PropertyDelegate value) { wrapperContained.propertyDelegate = value.wrapperContained; }
// public java.util.List beamSegments() { return wrapperContained.beamSegments; }
// public void beamSegments(java.util.List value) { wrapperContained.beamSegments = value; }
// public int minY() { return wrapperContained.minY; }
// public void minY(int value) { wrapperContained.minY = value; }
public int LEVEL_PROPERTY_INDEX() { return wrapperContained.LEVEL_PROPERTY_INDEX; }
// public void LEVEL_PROPERTY_INDEX(int value) { wrapperContained.LEVEL_PROPERTY_INDEX = value; }
public int PRIMARY_PROPERTY_INDEX() { return wrapperContained.PRIMARY_PROPERTY_INDEX; }
// public void PRIMARY_PROPERTY_INDEX(int value) { wrapperContained.PRIMARY_PROPERTY_INDEX = value; }
public int SECONDARY_PROPERTY_INDEX() { return wrapperContained.SECONDARY_PROPERTY_INDEX; }
// public void SECONDARY_PROPERTY_INDEX(int value) { wrapperContained.SECONDARY_PROPERTY_INDEX = value; }
public int PROPERTY_COUNT() { return wrapperContained.PROPERTY_COUNT; }
// public void PROPERTY_COUNT(int value) { wrapperContained.PROPERTY_COUNT = value; }
// public yarnwrap.text.Text CONTAINER_NAME_TEXT() { return new yarnwrap.text.Text(wrapperContained.CONTAINER_NAME_TEXT); }
// public void CONTAINER_NAME_TEXT(yarnwrap.text.Text value) { wrapperContained.CONTAINER_NAME_TEXT = value.wrapperContained; }
// public java.lang.String PRIMARY_EFFECT_NBT_KEY() { return wrapperContained.PRIMARY_EFFECT_NBT_KEY; }
// public void PRIMARY_EFFECT_NBT_KEY(java.lang.String value) { wrapperContained.PRIMARY_EFFECT_NBT_KEY = value; }
// public java.lang.String SECONDARY_EFFECT_NBT_KEY() { return wrapperContained.SECONDARY_EFFECT_NBT_KEY; }
// public void SECONDARY_EFFECT_NBT_KEY(java.lang.String value) { wrapperContained.SECONDARY_EFFECT_NBT_KEY = value; }
public void setCustomName(yarnwrap.text.Text customName) { wrapperContained.setCustomName(customName.wrapperContained); }
public java.util.List getBeamSegments() { return wrapperContained.getBeamSegments(); }
public void playSound(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.sound.SoundEvent sound) { wrapperContained.playSound(world.wrapperContained,pos.wrapperContained,sound.wrapperContained); }
// public void applyPlayerEffects(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,int beaconLevel,yarnwrap.registry.entry.RegistryEntry primaryEffect,yarnwrap.registry.entry.RegistryEntry secondaryEffect) { wrapperContained.applyPlayerEffects(world.wrapperContained,pos.wrapperContained,beaconLevel,primaryEffect.wrapperContained,secondaryEffect.wrapperContained); }
public void tick(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.block.entity.BeaconBlockEntity blockEntity) { wrapperContained.tick(world.wrapperContained,pos.wrapperContained,state.wrapperContained,blockEntity.wrapperContained); }
// public int updateLevel(yarnwrap.world.World world,int x,int y,int z) { return wrapperContained.updateLevel(world.wrapperContained,x,y,z); }
// public yarnwrap.registry.entry.RegistryEntry getEffectOrNull(yarnwrap.registry.entry.RegistryEntry effect) { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.getEffectOrNull(effect.wrapperContained)); }
// public yarnwrap.registry.entry.RegistryEntry readStatusEffect(yarnwrap.nbt.NbtCompound nbt,java.lang.String key) { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.readStatusEffect(nbt.wrapperContained,key)); }
// public void writeStatusEffect(yarnwrap.nbt.NbtCompound nbt,java.lang.String key,yarnwrap.registry.entry.RegistryEntry effect) { wrapperContained.writeStatusEffect(nbt.wrapperContained,key,effect.wrapperContained); }

}