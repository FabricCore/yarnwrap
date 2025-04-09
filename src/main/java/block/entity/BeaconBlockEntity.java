package yarnwrap.block.entity;
public class BeaconBlockEntity { public net.minecraft.block.entity.BeaconBlockEntity wrapperContained; public BeaconBlockEntity(net.minecraft.block.entity.BeaconBlockEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.text.Text customName() { return new yarnwrap.text.Text(wrapperContained.customName); }
// public yarnwrap.registry.entry.RegistryEntry primary() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.primary); }
// public java.util.Set EFFECTS() { return wrapperContained.EFFECTS; }
// public yarnwrap.registry.entry.RegistryEntry secondary() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.secondary); }
public java.util.List EFFECTS_BY_LEVEL() { return wrapperContained.EFFECTS_BY_LEVEL; }
// public int level() { return wrapperContained.level; }
// public yarnwrap.inventory.ContainerLock lock() { return new yarnwrap.inventory.ContainerLock(wrapperContained.lock); }
// public yarnwrap.screen.PropertyDelegate propertyDelegate() { return new yarnwrap.screen.PropertyDelegate(wrapperContained.propertyDelegate); }
// public java.util.List beamSegments() { return wrapperContained.beamSegments; }
// public int minY() { return wrapperContained.minY; }
public int LEVEL_PROPERTY_INDEX() { return wrapperContained.LEVEL_PROPERTY_INDEX; }
public int PRIMARY_PROPERTY_INDEX() { return wrapperContained.PRIMARY_PROPERTY_INDEX; }
public int SECONDARY_PROPERTY_INDEX() { return wrapperContained.SECONDARY_PROPERTY_INDEX; }
public int PROPERTY_COUNT() { return wrapperContained.PROPERTY_COUNT; }
// public yarnwrap.text.Text CONTAINER_NAME_TEXT() { return new yarnwrap.text.Text(wrapperContained.CONTAINER_NAME_TEXT); }
// public java.lang.String PRIMARY_EFFECT_NBT_KEY() { return wrapperContained.PRIMARY_EFFECT_NBT_KEY; }
// public java.lang.String SECONDARY_EFFECT_NBT_KEY() { return wrapperContained.SECONDARY_EFFECT_NBT_KEY; }
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