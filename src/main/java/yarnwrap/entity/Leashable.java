package yarnwrap.entity;
public class Leashable { public net.minecraft.entity.Leashable wrapperContained; public Leashable(net.minecraft.entity.Leashable wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String LEASH_NBT_KEY() { return wrapperContained.LEASH_NBT_KEY; }
// public void LEASH_NBT_KEY(java.lang.String value) { wrapperContained.LEASH_NBT_KEY = value; }
public static java.lang.String LEASH_NBT_KEY() { return net.minecraft.entity.Leashable.LEASH_NBT_KEY; }
// public static void LEASH_NBT_KEY(java.lang.String value, ) { net.minecraft.entity.Leashable.LEASH_NBT_KEY = value; }

// public double DEFAULT_SNAPPING_DISTANCE() { return wrapperContained.DEFAULT_SNAPPING_DISTANCE; }
// public void DEFAULT_SNAPPING_DISTANCE(double value) { wrapperContained.DEFAULT_SNAPPING_DISTANCE = value; }
// public static double DEFAULT_SNAPPING_DISTANCE() { return net.minecraft.entity.Leashable.DEFAULT_SNAPPING_DISTANCE; }
// public static void DEFAULT_SNAPPING_DISTANCE(double value, ) { net.minecraft.entity.Leashable.DEFAULT_SNAPPING_DISTANCE = value; }

// public double DEFAULT_ELASTIC_DISTANCE() { return wrapperContained.DEFAULT_ELASTIC_DISTANCE; }
// public void DEFAULT_ELASTIC_DISTANCE(double value) { wrapperContained.DEFAULT_ELASTIC_DISTANCE = value; }
// public static double DEFAULT_ELASTIC_DISTANCE() { return net.minecraft.entity.Leashable.DEFAULT_ELASTIC_DISTANCE; }
// public static void DEFAULT_ELASTIC_DISTANCE(double value, ) { net.minecraft.entity.Leashable.DEFAULT_ELASTIC_DISTANCE = value; }

// public java.util.List HELD_ENTITY_ATTACHMENT_POINT() { return wrapperContained.HELD_ENTITY_ATTACHMENT_POINT; }
// public void HELD_ENTITY_ATTACHMENT_POINT(java.util.List value) { wrapperContained.HELD_ENTITY_ATTACHMENT_POINT = value; }
// public static java.util.List HELD_ENTITY_ATTACHMENT_POINT() { return net.minecraft.entity.Leashable.HELD_ENTITY_ATTACHMENT_POINT; }
// public static void HELD_ENTITY_ATTACHMENT_POINT(java.util.List value, ) { net.minecraft.entity.Leashable.HELD_ENTITY_ATTACHMENT_POINT = value; }

// public java.util.List LEASH_HOLDER_ATTACHMENT_POINT() { return wrapperContained.LEASH_HOLDER_ATTACHMENT_POINT; }
// public void LEASH_HOLDER_ATTACHMENT_POINT(java.util.List value) { wrapperContained.LEASH_HOLDER_ATTACHMENT_POINT = value; }
// public static java.util.List LEASH_HOLDER_ATTACHMENT_POINT() { return net.minecraft.entity.Leashable.LEASH_HOLDER_ATTACHMENT_POINT; }
// public static void LEASH_HOLDER_ATTACHMENT_POINT(java.util.List value, ) { net.minecraft.entity.Leashable.LEASH_HOLDER_ATTACHMENT_POINT = value; }

// public java.util.List QUAD_LEASH_ATTACHMENT_POINTS() { return wrapperContained.QUAD_LEASH_ATTACHMENT_POINTS; }
// public void QUAD_LEASH_ATTACHMENT_POINTS(java.util.List value) { wrapperContained.QUAD_LEASH_ATTACHMENT_POINTS = value; }
// public static java.util.List QUAD_LEASH_ATTACHMENT_POINTS() { return net.minecraft.entity.Leashable.QUAD_LEASH_ATTACHMENT_POINTS; }
// public static void QUAD_LEASH_ATTACHMENT_POINTS(java.util.List value, ) { net.minecraft.entity.Leashable.QUAD_LEASH_ATTACHMENT_POINTS = value; }

// public yarnwrap.util.math.Vec3d ELASTICITY_MULTIPLIER() { return new yarnwrap.util.math.Vec3d(wrapperContained.ELASTICITY_MULTIPLIER); }
// public void ELASTICITY_MULTIPLIER(yarnwrap.util.math.Vec3d value) { wrapperContained.ELASTICITY_MULTIPLIER = value.wrapperContained; }
// public static yarnwrap.util.math.Vec3d ELASTICITY_MULTIPLIER() { return new yarnwrap.util.math.Vec3d(net.minecraft.entity.Leashable.ELASTICITY_MULTIPLIER); }
// public static void ELASTICITY_MULTIPLIER(yarnwrap.util.math.Vec3d value, ) { net.minecraft.entity.Leashable.ELASTICITY_MULTIPLIER = value.wrapperContained; }

public boolean canBeLeashed() { return wrapperContained.canBeLeashed(); }
// public static boolean canBeLeashed() { return net.minecraft.entity.Leashable.canBeLeashed(); }
public void detachLeash() { wrapperContained.detachLeash(); }
// public static void detachLeash() { net.minecraft.entity.Leashable.detachLeash(); }
// public yarnwrap.util.math.Vec3d getLeashOffset() { return new yarnwrap.util.math.Vec3d(wrapperContained.getLeashOffset()); }
// public static yarnwrap.util.math.Vec3d getLeashOffset() { return new yarnwrap.util.math.Vec3d(net.minecraft.entity.Leashable.getLeashOffset()); }
// public yarnwrap.util.math.Vec3d getLeashOffset(float tickProgress) { return new yarnwrap.util.math.Vec3d(wrapperContained.getLeashOffset(tickProgress)); }
// public static yarnwrap.util.math.Vec3d getLeashOffset(float tickProgress, ) { return new yarnwrap.util.math.Vec3d(net.minecraft.entity.Leashable.getLeashOffset(tickProgress)); }
public yarnwrap.entity.Entity getLeashHolder() { return new yarnwrap.entity.Entity(wrapperContained.getLeashHolder()); }
// public static yarnwrap.entity.Entity getLeashHolder() { return new yarnwrap.entity.Entity(net.minecraft.entity.Leashable.getLeashHolder()); }
public boolean isLeashed() { return wrapperContained.isLeashed(); }
// public static boolean isLeashed() { return net.minecraft.entity.Leashable.isLeashed(); }
public boolean mightBeLeashed() { return wrapperContained.mightBeLeashed(); }
// public static boolean mightBeLeashed() { return net.minecraft.entity.Leashable.mightBeLeashed(); }
public Object getLeashData() { return wrapperContained.getLeashData(); }
// public static Object getLeashData() { return net.minecraft.entity.Leashable.getLeashData(); }
// public void attachLeash(yarnwrap.entity.Entity entity,yarnwrap.entity.Entity leashHolder,boolean sendPacket) { wrapperContained.attachLeash(entity.wrapperContained,leashHolder.wrapperContained,sendPacket); }
// public static void attachLeash(yarnwrap.entity.Entity entity,yarnwrap.entity.Entity leashHolder,boolean sendPacket, ) { net.minecraft.entity.Leashable.attachLeash(entity.wrapperContained,leashHolder.wrapperContained,sendPacket); }
// public void resolveLeashData(yarnwrap.entity.Entity entity,Object leashData) { wrapperContained.resolveLeashData(entity.wrapperContained,leashData); }
// public static void resolveLeashData(yarnwrap.entity.Entity entity,Object leashData, ) { net.minecraft.entity.Leashable.resolveLeashData(entity.wrapperContained,leashData); }
// public void detachLeash(yarnwrap.entity.Entity entity,boolean sendPacket,boolean dropItem) { wrapperContained.detachLeash(entity.wrapperContained,sendPacket,dropItem); }
// public static void detachLeash(yarnwrap.entity.Entity entity,boolean sendPacket,boolean dropItem, ) { net.minecraft.entity.Leashable.detachLeash(entity.wrapperContained,sendPacket,dropItem); }
// public void setLeashData(Object leashData) { wrapperContained.setLeashData(leashData); }
// public static void setLeashData(Object leashData, ) { net.minecraft.entity.Leashable.setLeashData(leashData); }
// public void writeLeashData(yarnwrap.storage.WriteView view,Object leashData) { wrapperContained.writeLeashData(view.wrapperContained,leashData); }
// public static void writeLeashData(yarnwrap.storage.WriteView view,Object leashData, ) { net.minecraft.entity.Leashable.writeLeashData(view.wrapperContained,leashData); }
public void onShortLeashTick(yarnwrap.entity.Entity entity) { wrapperContained.onShortLeashTick(entity.wrapperContained); }
// public static void onShortLeashTick(yarnwrap.entity.Entity entity, ) { net.minecraft.entity.Leashable.onShortLeashTick(entity.wrapperContained); }
public void attachLeash(yarnwrap.entity.Entity leashHolder,boolean sendPacket) { wrapperContained.attachLeash(leashHolder.wrapperContained,sendPacket); }
// public static void attachLeash(yarnwrap.entity.Entity leashHolder,boolean sendPacket, ) { net.minecraft.entity.Leashable.attachLeash(leashHolder.wrapperContained,sendPacket); }
// public void tickLeash(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.Entity entity) { wrapperContained.tickLeash(world.wrapperContained,entity.wrapperContained); }
// public static void tickLeash(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.Entity entity, ) { net.minecraft.entity.Leashable.tickLeash(world.wrapperContained,entity.wrapperContained); }
// public yarnwrap.entity.Entity getLeashHolder(yarnwrap.entity.Entity entity) { return new yarnwrap.entity.Entity(wrapperContained.getLeashHolder(entity.wrapperContained)); }
// public static yarnwrap.entity.Entity getLeashHolder(yarnwrap.entity.Entity entity, ) { return new yarnwrap.entity.Entity(net.minecraft.entity.Leashable.getLeashHolder(entity.wrapperContained)); }
// public void readLeashData(yarnwrap.storage.ReadView view) { wrapperContained.readLeashData(view.wrapperContained); }
// public static void readLeashData(yarnwrap.storage.ReadView view, ) { net.minecraft.entity.Leashable.readLeashData(view.wrapperContained); }
public void setUnresolvedLeashHolderId(int unresolvedLeashHolderId) { wrapperContained.setUnresolvedLeashHolderId(unresolvedLeashHolderId); }
// public static void setUnresolvedLeashHolderId(int unresolvedLeashHolderId, ) { net.minecraft.entity.Leashable.setUnresolvedLeashHolderId(unresolvedLeashHolderId); }
// public void snapLongLeash() { wrapperContained.snapLongLeash(); }
// public static void snapLongLeash() { net.minecraft.entity.Leashable.snapLongLeash(); }
public void detachLeashWithoutDrop() { wrapperContained.detachLeashWithoutDrop(); }
// public static void detachLeashWithoutDrop() { net.minecraft.entity.Leashable.detachLeashWithoutDrop(); }
public void onLeashRemoved() { wrapperContained.onLeashRemoved(); }
// public static void onLeashRemoved() { net.minecraft.entity.Leashable.onLeashRemoved(); }
// public double getLeashSnappingDistance() { return wrapperContained.getLeashSnappingDistance(); }
// public static double getLeashSnappingDistance() { return net.minecraft.entity.Leashable.getLeashSnappingDistance(); }
// public double getElasticLeashDistance() { return wrapperContained.getElasticLeashDistance(); }
// public static double getElasticLeashDistance() { return net.minecraft.entity.Leashable.getElasticLeashDistance(); }
// public boolean canUseQuadLeashAttachmentPoint() { return wrapperContained.canUseQuadLeashAttachmentPoint(); }
// public static boolean canUseQuadLeashAttachmentPoint() { return net.minecraft.entity.Leashable.canUseQuadLeashAttachmentPoint(); }
// public net.minecraft.util.math.Vec3d[] getQuadLeashOffsets() { return wrapperContained.getQuadLeashOffsets(); }
// public static net.minecraft.util.math.Vec3d[] getQuadLeashOffsets() { return net.minecraft.entity.Leashable.getQuadLeashOffsets(); }
// public net.minecraft.util.math.Vec3d[] createQuadLeashOffsets(yarnwrap.entity.Entity leashedEntity,double addedZOffset,double zOffset,double xOffset,double yOffset) { return wrapperContained.createQuadLeashOffsets(leashedEntity.wrapperContained,addedZOffset,zOffset,xOffset,yOffset); }
// public static net.minecraft.util.math.Vec3d[] createQuadLeashOffsets(yarnwrap.entity.Entity leashedEntity,double addedZOffset,double zOffset,double xOffset,double yOffset, ) { return net.minecraft.entity.Leashable.createQuadLeashOffsets(leashedEntity.wrapperContained,addedZOffset,zOffset,xOffset,yOffset); }
// public java.util.List calculateLeashElasticities(yarnwrap.entity.Entity heldEntity,yarnwrap.entity.Entity leashHolder,java.util.List heldEntityAttachmentPoints,java.util.List leashHolderAttachmentPoints) { return wrapperContained.calculateLeashElasticities(heldEntity.wrapperContained,leashHolder.wrapperContained,heldEntityAttachmentPoints,leashHolderAttachmentPoints); }
// public static java.util.List calculateLeashElasticities(yarnwrap.entity.Entity heldEntity,yarnwrap.entity.Entity leashHolder,java.util.List heldEntityAttachmentPoints,java.util.List leashHolderAttachmentPoints, ) { return net.minecraft.entity.Leashable.calculateLeashElasticities(heldEntity.wrapperContained,leashHolder.wrapperContained,heldEntityAttachmentPoints,leashHolderAttachmentPoints); }
// public boolean applyElasticity(yarnwrap.entity.Entity leashHolder,Object leashData) { return wrapperContained.applyElasticity(leashHolder.wrapperContained,leashData); }
// public static boolean applyElasticity(yarnwrap.entity.Entity leashHolder,Object leashData, ) { return net.minecraft.entity.Leashable.applyElasticity(leashHolder.wrapperContained,leashData); }
// public boolean method_70996(yarnwrap.entity.Entity leashable) { return wrapperContained.method_70996(leashable.wrapperContained); }
// public static boolean method_70996(yarnwrap.entity.Entity leashable, ) { return net.minecraft.entity.Leashable.method_70996(leashable.wrapperContained); }
// public java.util.List collectLeashablesAround(yarnwrap.entity.Entity entity,java.util.function.Predicate leashablePredicate) { return wrapperContained.collectLeashablesAround(entity.wrapperContained,leashablePredicate); }
// public static java.util.List collectLeashablesAround(yarnwrap.entity.Entity entity,java.util.function.Predicate leashablePredicate, ) { return net.minecraft.entity.Leashable.collectLeashablesAround(entity.wrapperContained,leashablePredicate); }
// public java.util.List collectLeashablesAround(yarnwrap.world.World world,yarnwrap.util.math.Vec3d pos,java.util.function.Predicate leashablePredicate) { return wrapperContained.collectLeashablesAround(world.wrapperContained,pos.wrapperContained,leashablePredicate); }
// public static java.util.List collectLeashablesAround(yarnwrap.world.World world,yarnwrap.util.math.Vec3d pos,java.util.function.Predicate leashablePredicate, ) { return net.minecraft.entity.Leashable.collectLeashablesAround(world.wrapperContained,pos.wrapperContained,leashablePredicate); }
// public java.util.Optional calculateLeashElasticity(yarnwrap.util.math.Vec3d leashHolderAttachmentPos,yarnwrap.util.math.Vec3d heldEntityAttachmentPos,double elasticDistance,yarnwrap.util.math.Vec3d heldEntityMovement,yarnwrap.util.math.Vec3d heldEntityAttachmentPoint) { return wrapperContained.calculateLeashElasticity(leashHolderAttachmentPos.wrapperContained,heldEntityAttachmentPos.wrapperContained,elasticDistance,heldEntityMovement.wrapperContained,heldEntityAttachmentPoint.wrapperContained); }
// public static java.util.Optional calculateLeashElasticity(yarnwrap.util.math.Vec3d leashHolderAttachmentPos,yarnwrap.util.math.Vec3d heldEntityAttachmentPos,double elasticDistance,yarnwrap.util.math.Vec3d heldEntityMovement,yarnwrap.util.math.Vec3d heldEntityAttachmentPoint, ) { return net.minecraft.entity.Leashable.calculateLeashElasticity(leashHolderAttachmentPos.wrapperContained,heldEntityAttachmentPos.wrapperContained,elasticDistance,heldEntityMovement.wrapperContained,heldEntityAttachmentPoint.wrapperContained); }
// public boolean method_71000(java.util.function.Predicate entity) { return wrapperContained.method_71000(entity); }
// public static boolean method_71000(java.util.function.Predicate entity, ) { return net.minecraft.entity.Leashable.method_71000(entity); }
// public double getDistanceToCenter(yarnwrap.entity.Entity entity) { return wrapperContained.getDistanceToCenter(entity.wrapperContained); }
// public static double getDistanceToCenter(yarnwrap.entity.Entity entity, ) { return net.minecraft.entity.Leashable.getDistanceToCenter(entity.wrapperContained); }
// public boolean canBeLeashedTo(yarnwrap.entity.Entity entity) { return wrapperContained.canBeLeashedTo(entity.wrapperContained); }
// public static boolean canBeLeashedTo(yarnwrap.entity.Entity entity, ) { return net.minecraft.entity.Leashable.canBeLeashedTo(entity.wrapperContained); }
// public float getSlipperiness(yarnwrap.entity.Entity entity) { return wrapperContained.getSlipperiness(entity.wrapperContained); }
// public static float getSlipperiness(yarnwrap.entity.Entity entity, ) { return net.minecraft.entity.Leashable.getSlipperiness(entity.wrapperContained); }
// public java.util.List collectLeashablesHeldBy(yarnwrap.entity.Entity leashHolder) { return wrapperContained.collectLeashablesHeldBy(leashHolder.wrapperContained); }
// public static java.util.List collectLeashablesHeldBy(yarnwrap.entity.Entity leashHolder, ) { return net.minecraft.entity.Leashable.collectLeashablesHeldBy(leashHolder.wrapperContained); }
// public void beforeLeashTick(yarnwrap.entity.Entity leashHolder) { wrapperContained.beforeLeashTick(leashHolder.wrapperContained); }
// public static void beforeLeashTick(yarnwrap.entity.Entity leashHolder, ) { net.minecraft.entity.Leashable.beforeLeashTick(leashHolder.wrapperContained); }
// public void onLongLeashTick() { wrapperContained.onLongLeashTick(); }
// public static void onLongLeashTick() { net.minecraft.entity.Leashable.onLongLeashTick(); }
// public yarnwrap.util.math.Vec3d getLeashHolderMovement(yarnwrap.entity.Entity leashHolder) { return new yarnwrap.util.math.Vec3d(wrapperContained.getLeashHolderMovement(leashHolder.wrapperContained)); }
// public static yarnwrap.util.math.Vec3d getLeashHolderMovement(yarnwrap.entity.Entity leashHolder, ) { return new yarnwrap.util.math.Vec3d(net.minecraft.entity.Leashable.getLeashHolderMovement(leashHolder.wrapperContained)); }

}