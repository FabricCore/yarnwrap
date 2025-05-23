package yarnwrap.block.entity;
public class SkullBlockEntity { public net.minecraft.block.entity.SkullBlockEntity wrapperContained; public SkullBlockEntity(net.minecraft.block.entity.SkullBlockEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.component.type.ProfileComponent owner() { return new yarnwrap.component.type.ProfileComponent(wrapperContained.owner); }
// public void owner(yarnwrap.component.type.ProfileComponent value) { wrapperContained.owner = value.wrapperContained; }
// public static yarnwrap.component.type.ProfileComponent owner() { return new yarnwrap.component.type.ProfileComponent(net.minecraft.block.entity.SkullBlockEntity.owner); }
// public static void owner(yarnwrap.component.type.ProfileComponent value, ) { net.minecraft.block.entity.SkullBlockEntity.owner = value.wrapperContained; }

// public java.util.concurrent.Executor currentExecutor() { return wrapperContained.currentExecutor; }
// public void currentExecutor(java.util.concurrent.Executor value) { wrapperContained.currentExecutor = value; }
// public static java.util.concurrent.Executor currentExecutor() { return net.minecraft.block.entity.SkullBlockEntity.currentExecutor; }
// public static void currentExecutor(java.util.concurrent.Executor value, ) { net.minecraft.block.entity.SkullBlockEntity.currentExecutor = value; }

// public int poweredTicks() { return wrapperContained.poweredTicks; }
// public void poweredTicks(int value) { wrapperContained.poweredTicks = value; }
// public static int poweredTicks() { return net.minecraft.block.entity.SkullBlockEntity.poweredTicks; }
// public static void poweredTicks(int value, ) { net.minecraft.block.entity.SkullBlockEntity.poweredTicks = value; }

// public boolean powered() { return wrapperContained.powered; }
// public void powered(boolean value) { wrapperContained.powered = value; }
// public static boolean powered() { return net.minecraft.block.entity.SkullBlockEntity.powered; }
// public static void powered(boolean value, ) { net.minecraft.block.entity.SkullBlockEntity.powered = value; }

// public java.lang.String NOTE_BLOCK_SOUND_NBT_KEY() { return wrapperContained.NOTE_BLOCK_SOUND_NBT_KEY; }
// public void NOTE_BLOCK_SOUND_NBT_KEY(java.lang.String value) { wrapperContained.NOTE_BLOCK_SOUND_NBT_KEY = value; }
// public static java.lang.String NOTE_BLOCK_SOUND_NBT_KEY() { return net.minecraft.block.entity.SkullBlockEntity.NOTE_BLOCK_SOUND_NBT_KEY; }
// public static void NOTE_BLOCK_SOUND_NBT_KEY(java.lang.String value, ) { net.minecraft.block.entity.SkullBlockEntity.NOTE_BLOCK_SOUND_NBT_KEY = value; }

// public yarnwrap.util.Identifier noteBlockSound() { return new yarnwrap.util.Identifier(wrapperContained.noteBlockSound); }
// public void noteBlockSound(yarnwrap.util.Identifier value) { wrapperContained.noteBlockSound = value.wrapperContained; }
// public static yarnwrap.util.Identifier noteBlockSound() { return new yarnwrap.util.Identifier(net.minecraft.block.entity.SkullBlockEntity.noteBlockSound); }
// public static void noteBlockSound(yarnwrap.util.Identifier value, ) { net.minecraft.block.entity.SkullBlockEntity.noteBlockSound = value.wrapperContained; }

// public java.util.concurrent.Executor EXECUTOR() { return wrapperContained.EXECUTOR; }
// public void EXECUTOR(java.util.concurrent.Executor value) { wrapperContained.EXECUTOR = value; }
public static java.util.concurrent.Executor EXECUTOR() { return net.minecraft.block.entity.SkullBlockEntity.EXECUTOR; }
// public static void EXECUTOR(java.util.concurrent.Executor value, ) { net.minecraft.block.entity.SkullBlockEntity.EXECUTOR = value; }

// public java.lang.String PROFILE_NBT_KEY() { return wrapperContained.PROFILE_NBT_KEY; }
// public void PROFILE_NBT_KEY(java.lang.String value) { wrapperContained.PROFILE_NBT_KEY = value; }
// public static java.lang.String PROFILE_NBT_KEY() { return net.minecraft.block.entity.SkullBlockEntity.PROFILE_NBT_KEY; }
// public static void PROFILE_NBT_KEY(java.lang.String value, ) { net.minecraft.block.entity.SkullBlockEntity.PROFILE_NBT_KEY = value; }

// public java.lang.String CUSTOM_NAME_NBT_KEY() { return wrapperContained.CUSTOM_NAME_NBT_KEY; }
// public void CUSTOM_NAME_NBT_KEY(java.lang.String value) { wrapperContained.CUSTOM_NAME_NBT_KEY = value; }
// public static java.lang.String CUSTOM_NAME_NBT_KEY() { return net.minecraft.block.entity.SkullBlockEntity.CUSTOM_NAME_NBT_KEY; }
// public static void CUSTOM_NAME_NBT_KEY(java.lang.String value, ) { net.minecraft.block.entity.SkullBlockEntity.CUSTOM_NAME_NBT_KEY = value; }

// public yarnwrap.text.Text customName() { return new yarnwrap.text.Text(wrapperContained.customName); }
// public void customName(yarnwrap.text.Text value) { wrapperContained.customName = value.wrapperContained; }
// public static yarnwrap.text.Text customName() { return new yarnwrap.text.Text(net.minecraft.block.entity.SkullBlockEntity.customName); }
// public static void customName(yarnwrap.text.Text value, ) { net.minecraft.block.entity.SkullBlockEntity.customName = value.wrapperContained; }

// public com.google.common.cache.LoadingCache nameToProfileCache() { return wrapperContained.nameToProfileCache; }
// public void nameToProfileCache(com.google.common.cache.LoadingCache value) { wrapperContained.nameToProfileCache = value; }
// public static com.google.common.cache.LoadingCache nameToProfileCache() { return net.minecraft.block.entity.SkullBlockEntity.nameToProfileCache; }
// public static void nameToProfileCache(com.google.common.cache.LoadingCache value, ) { net.minecraft.block.entity.SkullBlockEntity.nameToProfileCache = value; }

// public com.google.common.cache.LoadingCache uuidToProfileCache() { return wrapperContained.uuidToProfileCache; }
// public void uuidToProfileCache(com.google.common.cache.LoadingCache value) { wrapperContained.uuidToProfileCache = value; }
// public static com.google.common.cache.LoadingCache uuidToProfileCache() { return net.minecraft.block.entity.SkullBlockEntity.uuidToProfileCache; }
// public static void uuidToProfileCache(com.google.common.cache.LoadingCache value, ) { net.minecraft.block.entity.SkullBlockEntity.uuidToProfileCache = value; }

public SkullBlockEntity(yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { this.wrapperContained = new net.minecraft.block.entity.SkullBlockEntity(pos.wrapperContained,state.wrapperContained); }
public void setOwner(yarnwrap.component.type.ProfileComponent profile) { wrapperContained.setOwner(profile.wrapperContained); }
// public static void setOwner(yarnwrap.component.type.ProfileComponent profile, ) { net.minecraft.block.entity.SkullBlockEntity.setOwner(profile.wrapperContained); }
public yarnwrap.component.type.ProfileComponent getOwner() { return new yarnwrap.component.type.ProfileComponent(wrapperContained.getOwner()); }
// public static yarnwrap.component.type.ProfileComponent getOwner() { return new yarnwrap.component.type.ProfileComponent(net.minecraft.block.entity.SkullBlockEntity.getOwner()); }
// public void loadOwnerProperties() { wrapperContained.loadOwnerProperties(); }
// public static void loadOwnerProperties() { net.minecraft.block.entity.SkullBlockEntity.loadOwnerProperties(); }
// public void setServices(yarnwrap.util.ApiServices apiServices,java.util.concurrent.Executor executor) { wrapperContained.setServices(apiServices.wrapperContained,executor); }
// public static void setServices(yarnwrap.util.ApiServices apiServices,java.util.concurrent.Executor executor, ) { net.minecraft.block.entity.SkullBlockEntity.setServices(apiServices.wrapperContained,executor); }
// public void clearServices() { wrapperContained.clearServices(); }
public static void clearServices() { net.minecraft.block.entity.SkullBlockEntity.clearServices(); }
public float getPoweredTicks(float tickProgress) { return wrapperContained.getPoweredTicks(tickProgress); }
// public static float getPoweredTicks(float tickProgress, ) { return net.minecraft.block.entity.SkullBlockEntity.getPoweredTicks(tickProgress); }
// public void tick(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.block.entity.SkullBlockEntity blockEntity) { wrapperContained.tick(world.wrapperContained,pos.wrapperContained,state.wrapperContained,blockEntity.wrapperContained); }
// public static void tick(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.block.entity.SkullBlockEntity blockEntity, ) { net.minecraft.block.entity.SkullBlockEntity.tick(world.wrapperContained,pos.wrapperContained,state.wrapperContained,blockEntity.wrapperContained); }
public yarnwrap.util.Identifier getNoteBlockSound() { return new yarnwrap.util.Identifier(wrapperContained.getNoteBlockSound()); }
// public static yarnwrap.util.Identifier getNoteBlockSound() { return new yarnwrap.util.Identifier(net.minecraft.block.entity.SkullBlockEntity.getNoteBlockSound()); }
// public void method_52579(java.lang.Runnable runnable) { wrapperContained.method_52579(runnable); }
// public static void method_52579(java.lang.Runnable runnable, ) { net.minecraft.block.entity.SkullBlockEntity.method_52579(runnable); }
// public java.util.concurrent.CompletableFuture fetchProfileByName(java.lang.String name) { return wrapperContained.fetchProfileByName(name); }
// public static java.util.concurrent.CompletableFuture fetchProfileByName(java.lang.String name, ) { return net.minecraft.block.entity.SkullBlockEntity.fetchProfileByName(name); }
// public void method_58126(yarnwrap.component.type.ProfileComponent owner) { wrapperContained.method_58126(owner.wrapperContained); }
// public static void method_58126(yarnwrap.component.type.ProfileComponent owner, ) { net.minecraft.block.entity.SkullBlockEntity.method_58126(owner.wrapperContained); }
// public java.util.concurrent.CompletableFuture fetchProfileByName(java.lang.String name,yarnwrap.util.ApiServices apiServices) { return wrapperContained.fetchProfileByName(name,apiServices.wrapperContained); }
// public static java.util.concurrent.CompletableFuture fetchProfileByName(java.lang.String name,yarnwrap.util.ApiServices apiServices, ) { return net.minecraft.block.entity.SkullBlockEntity.fetchProfileByName(name,apiServices.wrapperContained); }
// public java.util.concurrent.CompletableFuture fetchProfileByUuid(java.util.UUID uuid) { return wrapperContained.fetchProfileByUuid(uuid); }
// public static java.util.concurrent.CompletableFuture fetchProfileByUuid(java.util.UUID uuid, ) { return net.minecraft.block.entity.SkullBlockEntity.fetchProfileByUuid(uuid); }
// public java.util.concurrent.CompletableFuture fetchProfileByUuid(java.util.UUID uuid,yarnwrap.util.ApiServices apiServices) { return wrapperContained.fetchProfileByUuid(uuid,apiServices.wrapperContained); }
// public static java.util.concurrent.CompletableFuture fetchProfileByUuid(java.util.UUID uuid,yarnwrap.util.ApiServices apiServices, ) { return net.minecraft.block.entity.SkullBlockEntity.fetchProfileByUuid(uuid,apiServices.wrapperContained); }

}