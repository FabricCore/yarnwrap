package yarnwrap.item.map;
public class MapState { public net.minecraft.item.map.MapState wrapperContained; public MapState(net.minecraft.item.map.MapState wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List updateTrackers() { return wrapperContained.updateTrackers; }
// public boolean unlimitedTracking() { return wrapperContained.unlimitedTracking; }
// public boolean showDecorations() { return wrapperContained.showDecorations; }
public int centerZ() { return wrapperContained.centerZ; }
public int centerX() { return wrapperContained.centerX; }
// public java.util.Map decorations() { return wrapperContained.decorations; }
public yarnwrap.registry.RegistryKey dimension() { return new yarnwrap.registry.RegistryKey(wrapperContained.dimension); }
public byte scale() { return wrapperContained.scale; }
// public java.util.Map updateTrackersByPlayer() { return wrapperContained.updateTrackersByPlayer; }
// public java.util.Map frames() { return wrapperContained.frames; }
public byte[] colors() { return wrapperContained.colors; }
// public java.util.Map banners() { return wrapperContained.banners; }
public boolean locked() { return wrapperContained.locked; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
public int MAX_SCALE() { return wrapperContained.MAX_SCALE; }
// public int SIZE() { return wrapperContained.SIZE; }
// public int SIZE_HALF() { return wrapperContained.SIZE_HALF; }
public int MAX_DECORATIONS() { return wrapperContained.MAX_DECORATIONS; }
// public int decorationCount() { return wrapperContained.decorationCount; }
// public java.lang.String FRAME_PREFIX() { return wrapperContained.FRAME_PREFIX; }
public yarnwrap.network.packet.Packet getPlayerMarkerPacket(yarnwrap.component.type.MapIdComponent mapId,yarnwrap.entity.player.PlayerEntity player) { return new yarnwrap.network.packet.Packet(wrapperContained.getPlayerMarkerPacket(mapId.wrapperContained,player.wrapperContained)); }
public Object getPlayerSyncData(yarnwrap.entity.player.PlayerEntity player) { return wrapperContained.getPlayerSyncData(player.wrapperContained); }
public void update(yarnwrap.entity.player.PlayerEntity player,yarnwrap.item.ItemStack stack) { wrapperContained.update(player.wrapperContained,stack.wrapperContained); }
// public void markDirty(int x,int z) { wrapperContained.markDirty(x,z); }
public void removeFrame(yarnwrap.util.math.BlockPos pos,int id) { wrapperContained.removeFrame(pos.wrapperContained,id); }
// public void addDecoration(yarnwrap.registry.entry.RegistryEntry type,yarnwrap.world.WorldAccess world,java.lang.String key,double x,double z,double rotation,yarnwrap.text.Text text) { wrapperContained.addDecoration(type.wrapperContained,world.wrapperContained,key,x,z,rotation,text.wrapperContained); }
public boolean addBanner(yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.addBanner(world.wrapperContained,pos.wrapperContained); }
public void removeBanner(yarnwrap.world.BlockView world,int x,int z) { wrapperContained.removeBanner(world.wrapperContained,x,z); }
public void addDecorationsNbt(yarnwrap.item.ItemStack stack,yarnwrap.util.math.BlockPos pos,java.lang.String id,yarnwrap.registry.entry.RegistryEntry decorationType) { wrapperContained.addDecorationsNbt(stack.wrapperContained,pos.wrapperContained,id,decorationType.wrapperContained); }
public yarnwrap.item.map.MapState copy() { return new yarnwrap.item.map.MapState(wrapperContained.copy()); }
public yarnwrap.item.map.MapState of(byte scale,boolean locked,yarnwrap.registry.RegistryKey dimension) { return new yarnwrap.item.map.MapState(wrapperContained.of(scale,locked,dimension.wrapperContained)); }
public yarnwrap.item.map.MapState of(double centerX,double centerZ,byte scale,boolean showDecorations,boolean unlimitedTracking,yarnwrap.registry.RegistryKey dimension) { return new yarnwrap.item.map.MapState(wrapperContained.of(centerX,centerZ,scale,showDecorations,unlimitedTracking,dimension.wrapperContained)); }
public yarnwrap.item.map.MapState zoomOut() { return new yarnwrap.item.map.MapState(wrapperContained.zoomOut()); }
public boolean putColor(int x,int z,byte color) { return wrapperContained.putColor(x,z,color); }
// public void removeDecoration(java.lang.String id) { wrapperContained.removeDecoration(id); }
public void replaceDecorations(java.util.List decorations) { wrapperContained.replaceDecorations(decorations); }
public void setColor(int x,int z,byte color) { wrapperContained.setColor(x,z,color); }
// public yarnwrap.item.map.MapState fromNbt(yarnwrap.nbt.NbtCompound nbt,Object registryLookup) { return new yarnwrap.item.map.MapState(wrapperContained.fromNbt(nbt.wrapperContained,registryLookup)); }
public boolean hasExplorationMapDecoration() { return wrapperContained.hasExplorationMapDecoration(); }
public java.lang.Iterable getDecorations() { return wrapperContained.getDecorations(); }
// public void markDecorationsDirty() { wrapperContained.markDecorationsDirty(); }
public java.util.Collection getBanners() { return wrapperContained.getBanners(); }
public boolean decorationCountNotLessThan(int decorationCount) { return wrapperContained.decorationCountNotLessThan(decorationCount); }
public Object getPersistentStateType() { return wrapperContained.getPersistentStateType(); }
// public java.util.function.Predicate getEqualPredicate(yarnwrap.item.ItemStack stack) { return wrapperContained.getEqualPredicate(stack.wrapperContained); }
// public java.lang.String getFrameDecorationKey(int id) { return wrapperContained.getFrameDecorationKey(id); }

}