package yarnwrap.block.entity;
public class JukeboxBlockEntity { public net.minecraft.block.entity.JukeboxBlockEntity wrapperContained; public JukeboxBlockEntity(net.minecraft.block.entity.JukeboxBlockEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.item.ItemStack recordStack() { return new yarnwrap.item.ItemStack(wrapperContained.recordStack); }
// public void recordStack(yarnwrap.item.ItemStack value) { wrapperContained.recordStack = value.wrapperContained; }
// public static yarnwrap.item.ItemStack recordStack() { return new yarnwrap.item.ItemStack(net.minecraft.block.entity.JukeboxBlockEntity.recordStack); }
// public static void recordStack(yarnwrap.item.ItemStack value, ) { net.minecraft.block.entity.JukeboxBlockEntity.recordStack = value.wrapperContained; }

// public java.lang.String RECORD_ITEM_NBT_KEY() { return wrapperContained.RECORD_ITEM_NBT_KEY; }
// public void RECORD_ITEM_NBT_KEY(java.lang.String value) { wrapperContained.RECORD_ITEM_NBT_KEY = value; }
public static java.lang.String RECORD_ITEM_NBT_KEY() { return net.minecraft.block.entity.JukeboxBlockEntity.RECORD_ITEM_NBT_KEY; }
// public static void RECORD_ITEM_NBT_KEY(java.lang.String value, ) { net.minecraft.block.entity.JukeboxBlockEntity.RECORD_ITEM_NBT_KEY = value; }

// public java.lang.String TICKS_SINCE_SONG_STARTED_NBT_KEY() { return wrapperContained.TICKS_SINCE_SONG_STARTED_NBT_KEY; }
// public void TICKS_SINCE_SONG_STARTED_NBT_KEY(java.lang.String value) { wrapperContained.TICKS_SINCE_SONG_STARTED_NBT_KEY = value; }
public static java.lang.String TICKS_SINCE_SONG_STARTED_NBT_KEY() { return net.minecraft.block.entity.JukeboxBlockEntity.TICKS_SINCE_SONG_STARTED_NBT_KEY; }
// public static void TICKS_SINCE_SONG_STARTED_NBT_KEY(java.lang.String value, ) { net.minecraft.block.entity.JukeboxBlockEntity.TICKS_SINCE_SONG_STARTED_NBT_KEY = value; }

// public yarnwrap.block.jukebox.JukeboxManager manager() { return new yarnwrap.block.jukebox.JukeboxManager(wrapperContained.manager); }
// public void manager(yarnwrap.block.jukebox.JukeboxManager value) { wrapperContained.manager = value.wrapperContained; }
// public static yarnwrap.block.jukebox.JukeboxManager manager() { return new yarnwrap.block.jukebox.JukeboxManager(net.minecraft.block.entity.JukeboxBlockEntity.manager); }
// public static void manager(yarnwrap.block.jukebox.JukeboxManager value, ) { net.minecraft.block.entity.JukeboxBlockEntity.manager = value.wrapperContained; }

public JukeboxBlockEntity(yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { this.wrapperContained = new net.minecraft.block.entity.JukeboxBlockEntity(pos.wrapperContained,state.wrapperContained); }
// public void tick(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.block.entity.JukeboxBlockEntity blockEntity) { wrapperContained.tick(world.wrapperContained,pos.wrapperContained,state.wrapperContained,blockEntity.wrapperContained); }
// public static void tick(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.block.entity.JukeboxBlockEntity blockEntity, ) { net.minecraft.block.entity.JukeboxBlockEntity.tick(world.wrapperContained,pos.wrapperContained,state.wrapperContained,blockEntity.wrapperContained); }
public void setDisc(yarnwrap.item.ItemStack stack) { wrapperContained.setDisc(stack.wrapperContained); }
// public static void setDisc(yarnwrap.item.ItemStack stack, ) { net.minecraft.block.entity.JukeboxBlockEntity.setDisc(stack.wrapperContained); }
public void dropRecord() { wrapperContained.dropRecord(); }
// public static void dropRecord() { net.minecraft.block.entity.JukeboxBlockEntity.dropRecord(); }
// public void method_60780(yarnwrap.registry.entry.RegistryEntry song) { wrapperContained.method_60780(song.wrapperContained); }
// public static void method_60780(yarnwrap.registry.entry.RegistryEntry song, ) { net.minecraft.block.entity.JukeboxBlockEntity.method_60780(song.wrapperContained); }
// public void method_60781(yarnwrap.nbt.NbtCompound song) { wrapperContained.method_60781(song.wrapperContained); }
// public static void method_60781(yarnwrap.nbt.NbtCompound song, ) { net.minecraft.block.entity.JukeboxBlockEntity.method_60781(song.wrapperContained); }
// public void onRecordStackChanged(boolean hasRecord) { wrapperContained.onRecordStackChanged(hasRecord); }
// public static void onRecordStackChanged(boolean hasRecord, ) { net.minecraft.block.entity.JukeboxBlockEntity.onRecordStackChanged(hasRecord); }
// public void method_60783(yarnwrap.registry.entry.RegistryEntry song) { wrapperContained.method_60783(song.wrapperContained); }
// public static void method_60783(yarnwrap.registry.entry.RegistryEntry song, ) { net.minecraft.block.entity.JukeboxBlockEntity.method_60783(song.wrapperContained); }
public yarnwrap.block.jukebox.JukeboxManager getManager() { return new yarnwrap.block.jukebox.JukeboxManager(wrapperContained.getManager()); }
// public static yarnwrap.block.jukebox.JukeboxManager getManager() { return new yarnwrap.block.jukebox.JukeboxManager(net.minecraft.block.entity.JukeboxBlockEntity.getManager()); }
public void onManagerChange() { wrapperContained.onManagerChange(); }
// public static void onManagerChange() { net.minecraft.block.entity.JukeboxBlockEntity.onManagerChange(); }
public void reloadDisc() { wrapperContained.reloadDisc(); }
// public static void reloadDisc() { net.minecraft.block.entity.JukeboxBlockEntity.reloadDisc(); }
public int getComparatorOutput() { return wrapperContained.getComparatorOutput(); }
// public static int getComparatorOutput() { return net.minecraft.block.entity.JukeboxBlockEntity.getComparatorOutput(); }

}