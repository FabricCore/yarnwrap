package yarnwrap.world.border;
public class WorldBorder { public net.minecraft.world.border.WorldBorder wrapperContained; public WorldBorder(net.minecraft.world.border.WorldBorder wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List listeners() { return wrapperContained.listeners; }
// public void listeners(java.util.List value) { wrapperContained.listeners = value; }
// public double safeZone() { return wrapperContained.safeZone; }
// public void safeZone(double value) { wrapperContained.safeZone = value; }
// public int maxRadius() { return wrapperContained.maxRadius; }
// public void maxRadius(int value) { wrapperContained.maxRadius = value; }
// public double damagePerBlock() { return wrapperContained.damagePerBlock; }
// public void damagePerBlock(double value) { wrapperContained.damagePerBlock = value; }
// public int warningBlocks() { return wrapperContained.warningBlocks; }
// public void warningBlocks(int value) { wrapperContained.warningBlocks = value; }
// public int warningTime() { return wrapperContained.warningTime; }
// public void warningTime(int value) { wrapperContained.warningTime = value; }
// public Object area() { return wrapperContained.area; }
// // public void area(Object value) { wrapperContained.area = value; }
// public double centerZ() { return wrapperContained.centerZ; }
// public void centerZ(double value) { wrapperContained.centerZ = value; }
// public double centerX() { return wrapperContained.centerX; }
// public void centerX(double value) { wrapperContained.centerX = value; }
public Object DEFAULT_BORDER() { return wrapperContained.DEFAULT_BORDER; }
// // public void DEFAULT_BORDER(Object value) { wrapperContained.DEFAULT_BORDER = value; }
public double STATIC_AREA_SIZE() { return wrapperContained.STATIC_AREA_SIZE; }
// public void STATIC_AREA_SIZE(double value) { wrapperContained.STATIC_AREA_SIZE = value; }
public double MAX_CENTER_COORDINATES() { return wrapperContained.MAX_CENTER_COORDINATES; }
// public void MAX_CENTER_COORDINATES(double value) { wrapperContained.MAX_CENTER_COORDINATES = value; }
public boolean contains(yarnwrap.util.math.ChunkPos chunkPos) { return wrapperContained.contains(chunkPos.wrapperContained); }
public boolean contains(yarnwrap.util.math.BlockPos pos) { return wrapperContained.contains(pos.wrapperContained); }
public double getDamagePerBlock() { return wrapperContained.getDamagePerBlock(); }
public double getSizeLerpTarget() { return wrapperContained.getSizeLerpTarget(); }
public void setDamagePerBlock(double damagePerBlock) { wrapperContained.setDamagePerBlock(damagePerBlock); }
public int getWarningTime() { return wrapperContained.getWarningTime(); }
public void interpolateSize(double fromSize,double toSize,long time) { wrapperContained.interpolateSize(fromSize,toSize,time); }
public double getBoundNorth() { return wrapperContained.getBoundNorth(); }
public int getMaxRadius() { return wrapperContained.getMaxRadius(); }
public double getDistanceInsideBorder(double x,double z) { return wrapperContained.getDistanceInsideBorder(x,z); }
public long getSizeLerpTime() { return wrapperContained.getSizeLerpTime(); }
public double getBoundEast() { return wrapperContained.getBoundEast(); }
public double getCenterX() { return wrapperContained.getCenterX(); }
public double getSize() { return wrapperContained.getSize(); }
public boolean contains(yarnwrap.util.math.Box box) { return wrapperContained.contains(box.wrapperContained); }
public void setWarningBlocks(int warningBlocks) { wrapperContained.setWarningBlocks(warningBlocks); }
public yarnwrap.world.border.WorldBorderStage getStage() { return new yarnwrap.world.border.WorldBorderStage(wrapperContained.getStage()); }
public void setSize(double size) { wrapperContained.setSize(size); }
// public java.util.List getListeners() { return wrapperContained.getListeners(); }
public double getSafeZone() { return wrapperContained.getSafeZone(); }
public int getWarningBlocks() { return wrapperContained.getWarningBlocks(); }
public void setMaxRadius(int maxRadius) { wrapperContained.setMaxRadius(maxRadius); }
public double getShrinkingSpeed() { return wrapperContained.getShrinkingSpeed(); }
public void setWarningTime(int warningTime) { wrapperContained.setWarningTime(warningTime); }
public double getBoundWest() { return wrapperContained.getBoundWest(); }
public double getBoundSouth() { return wrapperContained.getBoundSouth(); }
public void setCenter(double x,double z) { wrapperContained.setCenter(x,z); }
public double getDistanceInsideBorder(yarnwrap.entity.Entity entity) { return wrapperContained.getDistanceInsideBorder(entity.wrapperContained); }
public double getCenterZ() { return wrapperContained.getCenterZ(); }
public void setSafeZone(double safeZone) { wrapperContained.setSafeZone(safeZone); }
public void tick() { wrapperContained.tick(); }
public void addListener(yarnwrap.world.border.WorldBorderListener listener) { wrapperContained.addListener(listener.wrapperContained); }
public yarnwrap.util.shape.VoxelShape asVoxelShape() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.asVoxelShape()); }
// public void load(Object properties) { wrapperContained.load(properties); }
public Object write() { return wrapperContained.write(); }
public boolean contains(double x,double z) { return wrapperContained.contains(x,z); }
public void removeListener(yarnwrap.world.border.WorldBorderListener listener) { wrapperContained.removeListener(listener.wrapperContained); }
public boolean contains(double x,double z,double margin) { return wrapperContained.contains(x,z,margin); }
public boolean canCollide(yarnwrap.entity.Entity entity,yarnwrap.util.math.Box box) { return wrapperContained.canCollide(entity.wrapperContained,box.wrapperContained); }
public yarnwrap.util.math.BlockPos clamp(double x,double y,double z) { return new yarnwrap.util.math.BlockPos(wrapperContained.clamp(x,y,z)); }
// public boolean contains(double minX,double minZ,double maxX,double maxZ) { return wrapperContained.contains(minX,minZ,maxX,maxZ); }
public boolean contains(yarnwrap.util.math.Vec3d pos) { return wrapperContained.contains(pos.wrapperContained); }
public yarnwrap.util.math.BlockPos clamp(yarnwrap.util.math.Vec3d pos) { return new yarnwrap.util.math.BlockPos(wrapperContained.clamp(pos.wrapperContained)); }
public yarnwrap.util.math.BlockPos clamp(yarnwrap.util.math.BlockPos pos) { return new yarnwrap.util.math.BlockPos(wrapperContained.clamp(pos.wrapperContained)); }

}