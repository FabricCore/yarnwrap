package yarnwrap.world.border;
public class WorldBorder { public net.minecraft.world.border.WorldBorder wrapperContained; public WorldBorder(net.minecraft.world.border.WorldBorder wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List listeners() { return wrapperContained.listeners; }
// public void listeners(java.util.List value) { wrapperContained.listeners = value; }
// public static java.util.List listeners() { return net.minecraft.world.border.WorldBorder.listeners; }
// public static void listeners(java.util.List value, ) { net.minecraft.world.border.WorldBorder.listeners = value; }

// public double safeZone() { return wrapperContained.safeZone; }
// public void safeZone(double value) { wrapperContained.safeZone = value; }
// public static double safeZone() { return net.minecraft.world.border.WorldBorder.safeZone; }
// public static void safeZone(double value, ) { net.minecraft.world.border.WorldBorder.safeZone = value; }

// public int maxRadius() { return wrapperContained.maxRadius; }
// public void maxRadius(int value) { wrapperContained.maxRadius = value; }
// public static int maxRadius() { return net.minecraft.world.border.WorldBorder.maxRadius; }
// public static void maxRadius(int value, ) { net.minecraft.world.border.WorldBorder.maxRadius = value; }

// public double damagePerBlock() { return wrapperContained.damagePerBlock; }
// public void damagePerBlock(double value) { wrapperContained.damagePerBlock = value; }
// public static double damagePerBlock() { return net.minecraft.world.border.WorldBorder.damagePerBlock; }
// public static void damagePerBlock(double value, ) { net.minecraft.world.border.WorldBorder.damagePerBlock = value; }

// public int warningBlocks() { return wrapperContained.warningBlocks; }
// public void warningBlocks(int value) { wrapperContained.warningBlocks = value; }
// public static int warningBlocks() { return net.minecraft.world.border.WorldBorder.warningBlocks; }
// public static void warningBlocks(int value, ) { net.minecraft.world.border.WorldBorder.warningBlocks = value; }

// public int warningTime() { return wrapperContained.warningTime; }
// public void warningTime(int value) { wrapperContained.warningTime = value; }
// public static int warningTime() { return net.minecraft.world.border.WorldBorder.warningTime; }
// public static void warningTime(int value, ) { net.minecraft.world.border.WorldBorder.warningTime = value; }

// public Object area() { return wrapperContained.area; }
// // public void area(Object value) { wrapperContained.area = value; }
// // public static Object area() { return net.minecraft.world.border.WorldBorder.area; }
// // public static void area(Object value, ) { net.minecraft.world.border.WorldBorder.area = value; }

// public double centerZ() { return wrapperContained.centerZ; }
// public void centerZ(double value) { wrapperContained.centerZ = value; }
// public static double centerZ() { return net.minecraft.world.border.WorldBorder.centerZ; }
// public static void centerZ(double value, ) { net.minecraft.world.border.WorldBorder.centerZ = value; }

// public double centerX() { return wrapperContained.centerX; }
// public void centerX(double value) { wrapperContained.centerX = value; }
// public static double centerX() { return net.minecraft.world.border.WorldBorder.centerX; }
// public static void centerX(double value, ) { net.minecraft.world.border.WorldBorder.centerX = value; }

// public Object DEFAULT_BORDER() { return wrapperContained.DEFAULT_BORDER; }
// // public void DEFAULT_BORDER(Object value) { wrapperContained.DEFAULT_BORDER = value; }
// public static Object DEFAULT_BORDER() { return net.minecraft.world.border.WorldBorder.DEFAULT_BORDER; }
// // public static void DEFAULT_BORDER(Object value, ) { net.minecraft.world.border.WorldBorder.DEFAULT_BORDER = value; }

// public double STATIC_AREA_SIZE() { return wrapperContained.STATIC_AREA_SIZE; }
// public void STATIC_AREA_SIZE(double value) { wrapperContained.STATIC_AREA_SIZE = value; }
public static double STATIC_AREA_SIZE() { return net.minecraft.world.border.WorldBorder.STATIC_AREA_SIZE; }
// public static void STATIC_AREA_SIZE(double value, ) { net.minecraft.world.border.WorldBorder.STATIC_AREA_SIZE = value; }

// public double MAX_CENTER_COORDINATES() { return wrapperContained.MAX_CENTER_COORDINATES; }
// public void MAX_CENTER_COORDINATES(double value) { wrapperContained.MAX_CENTER_COORDINATES = value; }
public static double MAX_CENTER_COORDINATES() { return net.minecraft.world.border.WorldBorder.MAX_CENTER_COORDINATES; }
// public static void MAX_CENTER_COORDINATES(double value, ) { net.minecraft.world.border.WorldBorder.MAX_CENTER_COORDINATES = value; }

public boolean contains(yarnwrap.util.math.ChunkPos chunkPos) { return wrapperContained.contains(chunkPos.wrapperContained); }
// public static boolean contains(yarnwrap.util.math.ChunkPos chunkPos, ) { return net.minecraft.world.border.WorldBorder.contains(chunkPos.wrapperContained); }
public boolean contains(yarnwrap.util.math.BlockPos pos) { return wrapperContained.contains(pos.wrapperContained); }
// public static boolean contains(yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.world.border.WorldBorder.contains(pos.wrapperContained); }
public double getDamagePerBlock() { return wrapperContained.getDamagePerBlock(); }
// public static double getDamagePerBlock() { return net.minecraft.world.border.WorldBorder.getDamagePerBlock(); }
public double getSizeLerpTarget() { return wrapperContained.getSizeLerpTarget(); }
// public static double getSizeLerpTarget() { return net.minecraft.world.border.WorldBorder.getSizeLerpTarget(); }
public void setDamagePerBlock(double damagePerBlock) { wrapperContained.setDamagePerBlock(damagePerBlock); }
// public static void setDamagePerBlock(double damagePerBlock, ) { net.minecraft.world.border.WorldBorder.setDamagePerBlock(damagePerBlock); }
public int getWarningTime() { return wrapperContained.getWarningTime(); }
// public static int getWarningTime() { return net.minecraft.world.border.WorldBorder.getWarningTime(); }
public void interpolateSize(double fromSize,double toSize,long time) { wrapperContained.interpolateSize(fromSize,toSize,time); }
// public static void interpolateSize(double fromSize,double toSize,long time, ) { net.minecraft.world.border.WorldBorder.interpolateSize(fromSize,toSize,time); }
public double getBoundNorth() { return wrapperContained.getBoundNorth(); }
// public static double getBoundNorth() { return net.minecraft.world.border.WorldBorder.getBoundNorth(); }
public int getMaxRadius() { return wrapperContained.getMaxRadius(); }
// public static int getMaxRadius() { return net.minecraft.world.border.WorldBorder.getMaxRadius(); }
public double getDistanceInsideBorder(double x,double z) { return wrapperContained.getDistanceInsideBorder(x,z); }
// public static double getDistanceInsideBorder(double x,double z, ) { return net.minecraft.world.border.WorldBorder.getDistanceInsideBorder(x,z); }
public long getSizeLerpTime() { return wrapperContained.getSizeLerpTime(); }
// public static long getSizeLerpTime() { return net.minecraft.world.border.WorldBorder.getSizeLerpTime(); }
public double getBoundEast() { return wrapperContained.getBoundEast(); }
// public static double getBoundEast() { return net.minecraft.world.border.WorldBorder.getBoundEast(); }
public double getCenterX() { return wrapperContained.getCenterX(); }
// public static double getCenterX() { return net.minecraft.world.border.WorldBorder.getCenterX(); }
public double getSize() { return wrapperContained.getSize(); }
// public static double getSize() { return net.minecraft.world.border.WorldBorder.getSize(); }
public boolean contains(yarnwrap.util.math.Box box) { return wrapperContained.contains(box.wrapperContained); }
// public static boolean contains(yarnwrap.util.math.Box box, ) { return net.minecraft.world.border.WorldBorder.contains(box.wrapperContained); }
public void setWarningBlocks(int warningBlocks) { wrapperContained.setWarningBlocks(warningBlocks); }
// public static void setWarningBlocks(int warningBlocks, ) { net.minecraft.world.border.WorldBorder.setWarningBlocks(warningBlocks); }
public yarnwrap.world.border.WorldBorderStage getStage() { return new yarnwrap.world.border.WorldBorderStage(wrapperContained.getStage()); }
// public static yarnwrap.world.border.WorldBorderStage getStage() { return new yarnwrap.world.border.WorldBorderStage(net.minecraft.world.border.WorldBorder.getStage()); }
public void setSize(double size) { wrapperContained.setSize(size); }
// public static void setSize(double size, ) { net.minecraft.world.border.WorldBorder.setSize(size); }
// public java.util.List getListeners() { return wrapperContained.getListeners(); }
// public static java.util.List getListeners() { return net.minecraft.world.border.WorldBorder.getListeners(); }
public double getSafeZone() { return wrapperContained.getSafeZone(); }
// public static double getSafeZone() { return net.minecraft.world.border.WorldBorder.getSafeZone(); }
public int getWarningBlocks() { return wrapperContained.getWarningBlocks(); }
// public static int getWarningBlocks() { return net.minecraft.world.border.WorldBorder.getWarningBlocks(); }
public void setMaxRadius(int maxRadius) { wrapperContained.setMaxRadius(maxRadius); }
// public static void setMaxRadius(int maxRadius, ) { net.minecraft.world.border.WorldBorder.setMaxRadius(maxRadius); }
public double getShrinkingSpeed() { return wrapperContained.getShrinkingSpeed(); }
// public static double getShrinkingSpeed() { return net.minecraft.world.border.WorldBorder.getShrinkingSpeed(); }
public void setWarningTime(int warningTime) { wrapperContained.setWarningTime(warningTime); }
// public static void setWarningTime(int warningTime, ) { net.minecraft.world.border.WorldBorder.setWarningTime(warningTime); }
public double getBoundWest() { return wrapperContained.getBoundWest(); }
// public static double getBoundWest() { return net.minecraft.world.border.WorldBorder.getBoundWest(); }
public double getBoundSouth() { return wrapperContained.getBoundSouth(); }
// public static double getBoundSouth() { return net.minecraft.world.border.WorldBorder.getBoundSouth(); }
public void setCenter(double x,double z) { wrapperContained.setCenter(x,z); }
// public static void setCenter(double x,double z, ) { net.minecraft.world.border.WorldBorder.setCenter(x,z); }
public double getDistanceInsideBorder(yarnwrap.entity.Entity entity) { return wrapperContained.getDistanceInsideBorder(entity.wrapperContained); }
// public static double getDistanceInsideBorder(yarnwrap.entity.Entity entity, ) { return net.minecraft.world.border.WorldBorder.getDistanceInsideBorder(entity.wrapperContained); }
public double getCenterZ() { return wrapperContained.getCenterZ(); }
// public static double getCenterZ() { return net.minecraft.world.border.WorldBorder.getCenterZ(); }
public void setSafeZone(double safeZone) { wrapperContained.setSafeZone(safeZone); }
// public static void setSafeZone(double safeZone, ) { net.minecraft.world.border.WorldBorder.setSafeZone(safeZone); }
public void tick() { wrapperContained.tick(); }
// public static void tick() { net.minecraft.world.border.WorldBorder.tick(); }
public void addListener(yarnwrap.world.border.WorldBorderListener listener) { wrapperContained.addListener(listener.wrapperContained); }
// public static void addListener(yarnwrap.world.border.WorldBorderListener listener, ) { net.minecraft.world.border.WorldBorder.addListener(listener.wrapperContained); }
public yarnwrap.util.shape.VoxelShape asVoxelShape() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.asVoxelShape()); }
// public static yarnwrap.util.shape.VoxelShape asVoxelShape() { return new yarnwrap.util.shape.VoxelShape(net.minecraft.world.border.WorldBorder.asVoxelShape()); }
// public void load(Object properties) { wrapperContained.load(properties); }
// public static void load(Object properties, ) { net.minecraft.world.border.WorldBorder.load(properties); }
public Object write() { return wrapperContained.write(); }
// public static Object write() { return net.minecraft.world.border.WorldBorder.write(); }
public boolean contains(double x,double z) { return wrapperContained.contains(x,z); }
// public static boolean contains(double x,double z, ) { return net.minecraft.world.border.WorldBorder.contains(x,z); }
public void removeListener(yarnwrap.world.border.WorldBorderListener listener) { wrapperContained.removeListener(listener.wrapperContained); }
// public static void removeListener(yarnwrap.world.border.WorldBorderListener listener, ) { net.minecraft.world.border.WorldBorder.removeListener(listener.wrapperContained); }
public boolean contains(double x,double z,double margin) { return wrapperContained.contains(x,z,margin); }
// public static boolean contains(double x,double z,double margin, ) { return net.minecraft.world.border.WorldBorder.contains(x,z,margin); }
public boolean canCollide(yarnwrap.entity.Entity entity,yarnwrap.util.math.Box box) { return wrapperContained.canCollide(entity.wrapperContained,box.wrapperContained); }
// public static boolean canCollide(yarnwrap.entity.Entity entity,yarnwrap.util.math.Box box, ) { return net.minecraft.world.border.WorldBorder.canCollide(entity.wrapperContained,box.wrapperContained); }
public yarnwrap.util.math.BlockPos clampFloored(double x,double y,double z) { return new yarnwrap.util.math.BlockPos(wrapperContained.clampFloored(x,y,z)); }
// public static yarnwrap.util.math.BlockPos clampFloored(double x,double y,double z, ) { return new yarnwrap.util.math.BlockPos(net.minecraft.world.border.WorldBorder.clampFloored(x,y,z)); }
// public boolean contains(double minX,double minZ,double maxX,double maxZ) { return wrapperContained.contains(minX,minZ,maxX,maxZ); }
// public static boolean contains(double minX,double minZ,double maxX,double maxZ, ) { return net.minecraft.world.border.WorldBorder.contains(minX,minZ,maxX,maxZ); }
public boolean contains(yarnwrap.util.math.Vec3d pos) { return wrapperContained.contains(pos.wrapperContained); }
// public static boolean contains(yarnwrap.util.math.Vec3d pos, ) { return net.minecraft.world.border.WorldBorder.contains(pos.wrapperContained); }
public yarnwrap.util.math.BlockPos clampFloored(yarnwrap.util.math.Vec3d pos) { return new yarnwrap.util.math.BlockPos(wrapperContained.clampFloored(pos.wrapperContained)); }
// public static yarnwrap.util.math.BlockPos clampFloored(yarnwrap.util.math.Vec3d pos, ) { return new yarnwrap.util.math.BlockPos(net.minecraft.world.border.WorldBorder.clampFloored(pos.wrapperContained)); }
public yarnwrap.util.math.BlockPos clampFloored(yarnwrap.util.math.BlockPos pos) { return new yarnwrap.util.math.BlockPos(wrapperContained.clampFloored(pos.wrapperContained)); }
// public static yarnwrap.util.math.BlockPos clampFloored(yarnwrap.util.math.BlockPos pos, ) { return new yarnwrap.util.math.BlockPos(net.minecraft.world.border.WorldBorder.clampFloored(pos.wrapperContained)); }
public yarnwrap.util.math.Vec3d clamp(double x,double y,double z) { return new yarnwrap.util.math.Vec3d(wrapperContained.clamp(x,y,z)); }
// public static yarnwrap.util.math.Vec3d clamp(double x,double y,double z, ) { return new yarnwrap.util.math.Vec3d(net.minecraft.world.border.WorldBorder.clamp(x,y,z)); }
public yarnwrap.util.math.Vec3d clamp(yarnwrap.util.math.Vec3d pos) { return new yarnwrap.util.math.Vec3d(wrapperContained.clamp(pos.wrapperContained)); }
// public static yarnwrap.util.math.Vec3d clamp(yarnwrap.util.math.Vec3d pos, ) { return new yarnwrap.util.math.Vec3d(net.minecraft.world.border.WorldBorder.clamp(pos.wrapperContained)); }
public java.util.List calculateDistancesFromCamera(double x,double z) { return wrapperContained.calculateDistancesFromCamera(x,z); }
// public static java.util.List calculateDistancesFromCamera(double x,double z, ) { return net.minecraft.world.border.WorldBorder.calculateDistancesFromCamera(x,z); }

}