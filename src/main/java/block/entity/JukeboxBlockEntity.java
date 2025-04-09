package yarnwrap.block.entity;
public class JukeboxBlockEntity { public net.minecraft.block.entity.JukeboxBlockEntity wrapperContained; public JukeboxBlockEntity(net.minecraft.block.entity.JukeboxBlockEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.item.ItemStack recordStack() { return new yarnwrap.item.ItemStack(wrapperContained.recordStack); }
public java.lang.String RECORD_ITEM_NBT_KEY() { return wrapperContained.RECORD_ITEM_NBT_KEY; }
public java.lang.String TICKS_SINCE_SONG_STARTED_NBT_KEY() { return wrapperContained.TICKS_SINCE_SONG_STARTED_NBT_KEY; }
// public yarnwrap.block.jukebox.JukeboxManager manager() { return new yarnwrap.block.jukebox.JukeboxManager(wrapperContained.manager); }
public void tick(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.block.entity.JukeboxBlockEntity blockEntity) { wrapperContained.tick(world.wrapperContained,pos.wrapperContained,state.wrapperContained,blockEntity.wrapperContained); }
public void setDisc(yarnwrap.item.ItemStack stack) { wrapperContained.setDisc(stack.wrapperContained); }
public void dropRecord() { wrapperContained.dropRecord(); }
// public void onRecordStackChanged(boolean hasRecord) { wrapperContained.onRecordStackChanged(hasRecord); }
public yarnwrap.block.jukebox.JukeboxManager getManager() { return new yarnwrap.block.jukebox.JukeboxManager(wrapperContained.getManager()); }
public void onManagerChange() { wrapperContained.onManagerChange(); }
public void reloadDisc() { wrapperContained.reloadDisc(); }
public int getComparatorOutput() { return wrapperContained.getComparatorOutput(); }

}