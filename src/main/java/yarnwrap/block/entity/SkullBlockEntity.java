package yarnwrap.block.entity;
public class SkullBlockEntity { public net.minecraft.block.entity.SkullBlockEntity wrapperContained; public SkullBlockEntity(net.minecraft.block.entity.SkullBlockEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.component.type.ProfileComponent owner() { return new yarnwrap.component.type.ProfileComponent(wrapperContained.owner); }
// public void owner(yarnwrap.component.type.ProfileComponent value) { wrapperContained.owner = value.wrapperContained; }
// public java.util.concurrent.Executor currentExecutor() { return wrapperContained.currentExecutor; }
// public void currentExecutor(java.util.concurrent.Executor value) { wrapperContained.currentExecutor = value; }
// public int poweredTicks() { return wrapperContained.poweredTicks; }
// public void poweredTicks(int value) { wrapperContained.poweredTicks = value; }
// public boolean powered() { return wrapperContained.powered; }
// public void powered(boolean value) { wrapperContained.powered = value; }
// public java.lang.String NOTE_BLOCK_SOUND_NBT_KEY() { return wrapperContained.NOTE_BLOCK_SOUND_NBT_KEY; }
// public void NOTE_BLOCK_SOUND_NBT_KEY(java.lang.String value) { wrapperContained.NOTE_BLOCK_SOUND_NBT_KEY = value; }
// public yarnwrap.util.Identifier noteBlockSound() { return new yarnwrap.util.Identifier(wrapperContained.noteBlockSound); }
// public void noteBlockSound(yarnwrap.util.Identifier value) { wrapperContained.noteBlockSound = value.wrapperContained; }
public java.util.concurrent.Executor EXECUTOR() { return wrapperContained.EXECUTOR; }
// public void EXECUTOR(java.util.concurrent.Executor value) { wrapperContained.EXECUTOR = value; }
// public java.lang.String PROFILE_NBT_KEY() { return wrapperContained.PROFILE_NBT_KEY; }
// public void PROFILE_NBT_KEY(java.lang.String value) { wrapperContained.PROFILE_NBT_KEY = value; }
// public java.lang.String CUSTOM_NAME_NBT_KEY() { return wrapperContained.CUSTOM_NAME_NBT_KEY; }
// public void CUSTOM_NAME_NBT_KEY(java.lang.String value) { wrapperContained.CUSTOM_NAME_NBT_KEY = value; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public yarnwrap.text.Text customName() { return new yarnwrap.text.Text(wrapperContained.customName); }
// public void customName(yarnwrap.text.Text value) { wrapperContained.customName = value.wrapperContained; }
// public com.google.common.cache.LoadingCache nameToProfileCache() { return wrapperContained.nameToProfileCache; }
// public void nameToProfileCache(com.google.common.cache.LoadingCache value) { wrapperContained.nameToProfileCache = value; }
// public com.google.common.cache.LoadingCache uuidToProfileCache() { return wrapperContained.uuidToProfileCache; }
// public void uuidToProfileCache(com.google.common.cache.LoadingCache value) { wrapperContained.uuidToProfileCache = value; }
public SkullBlockEntity(yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { this.wrapperContained = new net.minecraft.block.entity.SkullBlockEntity(pos.wrapperContained,state.wrapperContained); }
public void setOwner(yarnwrap.component.type.ProfileComponent profile) { wrapperContained.setOwner(profile.wrapperContained); }
public yarnwrap.component.type.ProfileComponent getOwner() { return new yarnwrap.component.type.ProfileComponent(wrapperContained.getOwner()); }
// public void loadOwnerProperties() { wrapperContained.loadOwnerProperties(); }
public void setServices(yarnwrap.util.ApiServices apiServices,java.util.concurrent.Executor executor) { wrapperContained.setServices(apiServices.wrapperContained,executor); }
public void clearServices() { wrapperContained.clearServices(); }
public float getPoweredTicks(float tickDelta) { return wrapperContained.getPoweredTicks(tickDelta); }
public void tick(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.block.entity.SkullBlockEntity blockEntity) { wrapperContained.tick(world.wrapperContained,pos.wrapperContained,state.wrapperContained,blockEntity.wrapperContained); }
public yarnwrap.util.Identifier getNoteBlockSound() { return new yarnwrap.util.Identifier(wrapperContained.getNoteBlockSound()); }
// public void method_52579(java.lang.Runnable runnable) { wrapperContained.method_52579(runnable); }
public java.util.concurrent.CompletableFuture fetchProfileByName(java.lang.String name) { return wrapperContained.fetchProfileByName(name); }
// public void method_58126(yarnwrap.component.type.ProfileComponent owner) { wrapperContained.method_58126(owner.wrapperContained); }
// public java.util.concurrent.CompletableFuture fetchProfileByName(java.lang.String name,yarnwrap.util.ApiServices apiServices) { return wrapperContained.fetchProfileByName(name,apiServices.wrapperContained); }
public java.util.concurrent.CompletableFuture fetchProfileByUuid(java.util.UUID uuid) { return wrapperContained.fetchProfileByUuid(uuid); }
// public java.util.concurrent.CompletableFuture fetchProfileByUuid(java.util.UUID uuid,yarnwrap.util.ApiServices apiServices) { return wrapperContained.fetchProfileByUuid(uuid,apiServices.wrapperContained); }

}