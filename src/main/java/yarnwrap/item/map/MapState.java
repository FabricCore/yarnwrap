package yarnwrap.item.map;
public class MapState { public net.minecraft.item.map.MapState wrapperContained; public MapState(net.minecraft.item.map.MapState wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List updateTrackers() { return wrapperContained.updateTrackers; }
// public void updateTrackers(java.util.List value) { wrapperContained.updateTrackers = value; }
// public static java.util.List updateTrackers() { return net.minecraft.item.map.MapState.updateTrackers; }
// public static void updateTrackers(java.util.List value, ) { net.minecraft.item.map.MapState.updateTrackers = value; }

// public boolean unlimitedTracking() { return wrapperContained.unlimitedTracking; }
// public void unlimitedTracking(boolean value) { wrapperContained.unlimitedTracking = value; }
// public static boolean unlimitedTracking() { return net.minecraft.item.map.MapState.unlimitedTracking; }
// public static void unlimitedTracking(boolean value, ) { net.minecraft.item.map.MapState.unlimitedTracking = value; }

// public boolean showDecorations() { return wrapperContained.showDecorations; }
// public void showDecorations(boolean value) { wrapperContained.showDecorations = value; }
// public static boolean showDecorations() { return net.minecraft.item.map.MapState.showDecorations; }
// public static void showDecorations(boolean value, ) { net.minecraft.item.map.MapState.showDecorations = value; }

public int centerZ() { return wrapperContained.centerZ; }
// public void centerZ(int value) { wrapperContained.centerZ = value; }
// public static int centerZ() { return net.minecraft.item.map.MapState.centerZ; }
// public static void centerZ(int value, ) { net.minecraft.item.map.MapState.centerZ = value; }

public int centerX() { return wrapperContained.centerX; }
// public void centerX(int value) { wrapperContained.centerX = value; }
// public static int centerX() { return net.minecraft.item.map.MapState.centerX; }
// public static void centerX(int value, ) { net.minecraft.item.map.MapState.centerX = value; }

// public java.util.Map decorations() { return wrapperContained.decorations; }
// public void decorations(java.util.Map value) { wrapperContained.decorations = value; }
// public static java.util.Map decorations() { return net.minecraft.item.map.MapState.decorations; }
// public static void decorations(java.util.Map value, ) { net.minecraft.item.map.MapState.decorations = value; }

public yarnwrap.registry.RegistryKey dimension() { return new yarnwrap.registry.RegistryKey(wrapperContained.dimension); }
// public void dimension(yarnwrap.registry.RegistryKey value) { wrapperContained.dimension = value.wrapperContained; }
// public static yarnwrap.registry.RegistryKey dimension() { return new yarnwrap.registry.RegistryKey(net.minecraft.item.map.MapState.dimension); }
// public static void dimension(yarnwrap.registry.RegistryKey value, ) { net.minecraft.item.map.MapState.dimension = value.wrapperContained; }

public byte scale() { return wrapperContained.scale; }
// public void scale(byte value) { wrapperContained.scale = value; }
// public static byte scale() { return net.minecraft.item.map.MapState.scale; }
// public static void scale(byte value, ) { net.minecraft.item.map.MapState.scale = value; }

// public java.util.Map updateTrackersByPlayer() { return wrapperContained.updateTrackersByPlayer; }
// public void updateTrackersByPlayer(java.util.Map value) { wrapperContained.updateTrackersByPlayer = value; }
// public static java.util.Map updateTrackersByPlayer() { return net.minecraft.item.map.MapState.updateTrackersByPlayer; }
// public static void updateTrackersByPlayer(java.util.Map value, ) { net.minecraft.item.map.MapState.updateTrackersByPlayer = value; }

// public java.util.Map frames() { return wrapperContained.frames; }
// public void frames(java.util.Map value) { wrapperContained.frames = value; }
// public static java.util.Map frames() { return net.minecraft.item.map.MapState.frames; }
// public static void frames(java.util.Map value, ) { net.minecraft.item.map.MapState.frames = value; }

public byte[] colors() { return wrapperContained.colors; }
public void colors(byte[] value) { wrapperContained.colors = value; }
// public static byte[] colors() { return net.minecraft.item.map.MapState.colors; }
// public static void colors(byte[] value, ) { net.minecraft.item.map.MapState.colors = value; }

// public java.util.Map banners() { return wrapperContained.banners; }
// public void banners(java.util.Map value) { wrapperContained.banners = value; }
// public static java.util.Map banners() { return net.minecraft.item.map.MapState.banners; }
// public static void banners(java.util.Map value, ) { net.minecraft.item.map.MapState.banners = value; }

public boolean locked() { return wrapperContained.locked; }
// public void locked(boolean value) { wrapperContained.locked = value; }
// public static boolean locked() { return net.minecraft.item.map.MapState.locked; }
// public static void locked(boolean value, ) { net.minecraft.item.map.MapState.locked = value; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.item.map.MapState.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.item.map.MapState.LOGGER = value; }

// public int MAX_SCALE() { return wrapperContained.MAX_SCALE; }
// public void MAX_SCALE(int value) { wrapperContained.MAX_SCALE = value; }
public static int MAX_SCALE() { return net.minecraft.item.map.MapState.MAX_SCALE; }
// public static void MAX_SCALE(int value, ) { net.minecraft.item.map.MapState.MAX_SCALE = value; }

// public int SIZE() { return wrapperContained.SIZE; }
// public void SIZE(int value) { wrapperContained.SIZE = value; }
// public static int SIZE() { return net.minecraft.item.map.MapState.SIZE; }
// public static void SIZE(int value, ) { net.minecraft.item.map.MapState.SIZE = value; }

// public int SIZE_HALF() { return wrapperContained.SIZE_HALF; }
// public void SIZE_HALF(int value) { wrapperContained.SIZE_HALF = value; }
// public static int SIZE_HALF() { return net.minecraft.item.map.MapState.SIZE_HALF; }
// public static void SIZE_HALF(int value, ) { net.minecraft.item.map.MapState.SIZE_HALF = value; }

// public int MAX_DECORATIONS() { return wrapperContained.MAX_DECORATIONS; }
// public void MAX_DECORATIONS(int value) { wrapperContained.MAX_DECORATIONS = value; }
public static int MAX_DECORATIONS() { return net.minecraft.item.map.MapState.MAX_DECORATIONS; }
// public static void MAX_DECORATIONS(int value, ) { net.minecraft.item.map.MapState.MAX_DECORATIONS = value; }

// public int decorationCount() { return wrapperContained.decorationCount; }
// public void decorationCount(int value) { wrapperContained.decorationCount = value; }
// public static int decorationCount() { return net.minecraft.item.map.MapState.decorationCount; }
// public static void decorationCount(int value, ) { net.minecraft.item.map.MapState.decorationCount = value; }

// public java.lang.String FRAME_PREFIX() { return wrapperContained.FRAME_PREFIX; }
// public void FRAME_PREFIX(java.lang.String value) { wrapperContained.FRAME_PREFIX = value; }
// public static java.lang.String FRAME_PREFIX() { return net.minecraft.item.map.MapState.FRAME_PREFIX; }
// public static void FRAME_PREFIX(java.lang.String value, ) { net.minecraft.item.map.MapState.FRAME_PREFIX = value; }

// public MapState(int centerX,int centerZ,byte scale,boolean showDecorations,boolean unlimitedTracking,boolean locked,yarnwrap.registry.RegistryKey dimension) { this.wrapperContained = new net.minecraft.item.map.MapState(centerX,centerZ,scale,showDecorations,unlimitedTracking,locked,dimension.wrapperContained); }
public yarnwrap.network.packet.Packet getPlayerMarkerPacket(yarnwrap.component.type.MapIdComponent mapId,yarnwrap.entity.player.PlayerEntity player) { return new yarnwrap.network.packet.Packet(wrapperContained.getPlayerMarkerPacket(mapId.wrapperContained,player.wrapperContained)); }
// public static yarnwrap.network.packet.Packet getPlayerMarkerPacket(yarnwrap.component.type.MapIdComponent mapId,yarnwrap.entity.player.PlayerEntity player, ) { return new yarnwrap.network.packet.Packet(net.minecraft.item.map.MapState.getPlayerMarkerPacket(mapId.wrapperContained,player.wrapperContained)); }
public Object getPlayerSyncData(yarnwrap.entity.player.PlayerEntity player) { return wrapperContained.getPlayerSyncData(player.wrapperContained); }
// public static Object getPlayerSyncData(yarnwrap.entity.player.PlayerEntity player, ) { return net.minecraft.item.map.MapState.getPlayerSyncData(player.wrapperContained); }
public void update(yarnwrap.entity.player.PlayerEntity player,yarnwrap.item.ItemStack stack) { wrapperContained.update(player.wrapperContained,stack.wrapperContained); }
// public static void update(yarnwrap.entity.player.PlayerEntity player,yarnwrap.item.ItemStack stack, ) { net.minecraft.item.map.MapState.update(player.wrapperContained,stack.wrapperContained); }
// public void markDirty(int x,int z) { wrapperContained.markDirty(x,z); }
// public static void markDirty(int x,int z, ) { net.minecraft.item.map.MapState.markDirty(x,z); }
public void removeFrame(yarnwrap.util.math.BlockPos pos,int id) { wrapperContained.removeFrame(pos.wrapperContained,id); }
// public static void removeFrame(yarnwrap.util.math.BlockPos pos,int id, ) { net.minecraft.item.map.MapState.removeFrame(pos.wrapperContained,id); }
// public void addDecoration(yarnwrap.registry.entry.RegistryEntry type,yarnwrap.world.WorldAccess world,java.lang.String key,double x,double z,double rotation,yarnwrap.text.Text text) { wrapperContained.addDecoration(type.wrapperContained,world.wrapperContained,key,x,z,rotation,text.wrapperContained); }
// public static void addDecoration(yarnwrap.registry.entry.RegistryEntry type,yarnwrap.world.WorldAccess world,java.lang.String key,double x,double z,double rotation,yarnwrap.text.Text text, ) { net.minecraft.item.map.MapState.addDecoration(type.wrapperContained,world.wrapperContained,key,x,z,rotation,text.wrapperContained); }
public boolean addBanner(yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.addBanner(world.wrapperContained,pos.wrapperContained); }
// public static boolean addBanner(yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.item.map.MapState.addBanner(world.wrapperContained,pos.wrapperContained); }
public void removeBanner(yarnwrap.world.BlockView world,int x,int z) { wrapperContained.removeBanner(world.wrapperContained,x,z); }
// public static void removeBanner(yarnwrap.world.BlockView world,int x,int z, ) { net.minecraft.item.map.MapState.removeBanner(world.wrapperContained,x,z); }
// public void addDecorationsNbt(yarnwrap.item.ItemStack stack,yarnwrap.util.math.BlockPos pos,java.lang.String id,yarnwrap.registry.entry.RegistryEntry decorationType) { wrapperContained.addDecorationsNbt(stack.wrapperContained,pos.wrapperContained,id,decorationType.wrapperContained); }
// public static void addDecorationsNbt(yarnwrap.item.ItemStack stack,yarnwrap.util.math.BlockPos pos,java.lang.String id,yarnwrap.registry.entry.RegistryEntry decorationType, ) { net.minecraft.item.map.MapState.addDecorationsNbt(stack.wrapperContained,pos.wrapperContained,id,decorationType.wrapperContained); }
public yarnwrap.item.map.MapState copy() { return new yarnwrap.item.map.MapState(wrapperContained.copy()); }
// public static yarnwrap.item.map.MapState copy() { return new yarnwrap.item.map.MapState(net.minecraft.item.map.MapState.copy()); }
// public yarnwrap.item.map.MapState of(byte scale,boolean locked,yarnwrap.registry.RegistryKey dimension) { return new yarnwrap.item.map.MapState(wrapperContained.of(scale,locked,dimension.wrapperContained)); }
// public static yarnwrap.item.map.MapState of(byte scale,boolean locked,yarnwrap.registry.RegistryKey dimension, ) { return new yarnwrap.item.map.MapState(net.minecraft.item.map.MapState.of(scale,locked,dimension.wrapperContained)); }
// public yarnwrap.item.map.MapState of(double centerX,double centerZ,byte scale,boolean showDecorations,boolean unlimitedTracking,yarnwrap.registry.RegistryKey dimension) { return new yarnwrap.item.map.MapState(wrapperContained.of(centerX,centerZ,scale,showDecorations,unlimitedTracking,dimension.wrapperContained)); }
// public static yarnwrap.item.map.MapState of(double centerX,double centerZ,byte scale,boolean showDecorations,boolean unlimitedTracking,yarnwrap.registry.RegistryKey dimension, ) { return new yarnwrap.item.map.MapState(net.minecraft.item.map.MapState.of(centerX,centerZ,scale,showDecorations,unlimitedTracking,dimension.wrapperContained)); }
public yarnwrap.item.map.MapState zoomOut() { return new yarnwrap.item.map.MapState(wrapperContained.zoomOut()); }
// public static yarnwrap.item.map.MapState zoomOut() { return new yarnwrap.item.map.MapState(net.minecraft.item.map.MapState.zoomOut()); }
public boolean putColor(int x,int z,byte color) { return wrapperContained.putColor(x,z,color); }
// public static boolean putColor(int x,int z,byte color, ) { return net.minecraft.item.map.MapState.putColor(x,z,color); }
// public void removeDecoration(java.lang.String id) { wrapperContained.removeDecoration(id); }
// public static void removeDecoration(java.lang.String id, ) { net.minecraft.item.map.MapState.removeDecoration(id); }
public void replaceDecorations(java.util.List decorations) { wrapperContained.replaceDecorations(decorations); }
// public static void replaceDecorations(java.util.List decorations, ) { net.minecraft.item.map.MapState.replaceDecorations(decorations); }
public void setColor(int x,int z,byte color) { wrapperContained.setColor(x,z,color); }
// public static void setColor(int x,int z,byte color, ) { net.minecraft.item.map.MapState.setColor(x,z,color); }
// public yarnwrap.item.map.MapState fromNbt(yarnwrap.nbt.NbtCompound nbt,Object registryLookup) { return new yarnwrap.item.map.MapState(wrapperContained.fromNbt(nbt.wrapperContained,registryLookup)); }
// public static yarnwrap.item.map.MapState fromNbt(yarnwrap.nbt.NbtCompound nbt,Object registryLookup, ) { return new yarnwrap.item.map.MapState(net.minecraft.item.map.MapState.fromNbt(nbt.wrapperContained,registryLookup)); }
public boolean hasExplorationMapDecoration() { return wrapperContained.hasExplorationMapDecoration(); }
// public static boolean hasExplorationMapDecoration() { return net.minecraft.item.map.MapState.hasExplorationMapDecoration(); }
public java.lang.Iterable getDecorations() { return wrapperContained.getDecorations(); }
// public static java.lang.Iterable getDecorations() { return net.minecraft.item.map.MapState.getDecorations(); }
// public void markDecorationsDirty() { wrapperContained.markDecorationsDirty(); }
// public static void markDecorationsDirty() { net.minecraft.item.map.MapState.markDecorationsDirty(); }
public java.util.Collection getBanners() { return wrapperContained.getBanners(); }
// public static java.util.Collection getBanners() { return net.minecraft.item.map.MapState.getBanners(); }
public boolean decorationCountNotLessThan(int decorationCount) { return wrapperContained.decorationCountNotLessThan(decorationCount); }
// public static boolean decorationCountNotLessThan(int decorationCount, ) { return net.minecraft.item.map.MapState.decorationCountNotLessThan(decorationCount); }
// public Object getPersistentStateType() { return wrapperContained.getPersistentStateType(); }
public static Object getPersistentStateType() { return net.minecraft.item.map.MapState.getPersistentStateType(); }
// public java.util.function.Predicate getEqualPredicate(yarnwrap.item.ItemStack stack) { return wrapperContained.getEqualPredicate(stack.wrapperContained); }
// public static java.util.function.Predicate getEqualPredicate(yarnwrap.item.ItemStack stack, ) { return net.minecraft.item.map.MapState.getEqualPredicate(stack.wrapperContained); }
// public boolean method_55785(yarnwrap.item.ItemStack other) { return wrapperContained.method_55785(other.wrapperContained); }
// public static boolean method_55785(yarnwrap.item.ItemStack other, ) { return net.minecraft.item.map.MapState.method_55785(other.wrapperContained); }
// public void method_56815(java.lang.String banner) { wrapperContained.method_56815(banner); }
// public static void method_56815(java.lang.String banner, ) { net.minecraft.item.map.MapState.method_56815(banner); }
// public void method_57626(yarnwrap.entity.player.PlayerEntity id,java.lang.String decoration) { wrapperContained.method_57626(id.wrapperContained,decoration); }
// public static void method_57626(yarnwrap.entity.player.PlayerEntity id,java.lang.String decoration, ) { net.minecraft.item.map.MapState.method_57626(id.wrapperContained,decoration); }
// public yarnwrap.component.type.MapDecorationsComponent method_57627(java.lang.String decorations) { return new yarnwrap.component.type.MapDecorationsComponent(wrapperContained.method_57627(decorations)); }
// public static yarnwrap.component.type.MapDecorationsComponent method_57627(java.lang.String decorations, ) { return new yarnwrap.component.type.MapDecorationsComponent(net.minecraft.item.map.MapState.method_57627(decorations)); }
// public java.lang.String getFrameDecorationKey(int id) { return wrapperContained.getFrameDecorationKey(id); }
// public static java.lang.String getFrameDecorationKey(int id, ) { return net.minecraft.item.map.MapState.getFrameDecorationKey(id); }

}