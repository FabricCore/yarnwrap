package yarnwrap.util.math;
public class Direction { public net.minecraft.util.math.Direction wrapperContained; public Direction(net.minecraft.util.math.Direction wrapperContained) { this.wrapperContained = wrapperContained; }

// public int idHorizontal() { return wrapperContained.idHorizontal; }
// public int idOpposite() { return wrapperContained.idOpposite; }
// public int id() { return wrapperContained.id; }
// public net.minecraft.util.math.Direction[] VALUES() { return wrapperContained.VALUES; }
// public net.minecraft.util.math.Direction[] ALL() { return wrapperContained.ALL; }
// public net.minecraft.util.math.Direction[] HORIZONTAL() { return wrapperContained.HORIZONTAL; }
// public yarnwrap.util.math.Vec3i vector() { return new yarnwrap.util.math.Vec3i(wrapperContained.vector); }
// public Object direction() { return wrapperContained.direction; }
// public java.lang.String name() { return wrapperContained.name; }
// public Object axis() { return wrapperContained.axis; }
public Object CODEC() { return wrapperContained.CODEC; }
public com.mojang.serialization.Codec VERTICAL_CODEC() { return wrapperContained.VERTICAL_CODEC; }
public java.util.function.IntFunction ID_TO_VALUE_FUNCTION() { return wrapperContained.ID_TO_VALUE_FUNCTION; }
public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
public yarnwrap.util.math.Direction fromHorizontal(int value) { return new yarnwrap.util.math.Direction(wrapperContained.fromHorizontal(value)); }
public yarnwrap.util.math.Direction getFacing(double x,double y,double z) { return new yarnwrap.util.math.Direction(wrapperContained.getFacing(x,y,z)); }
public yarnwrap.util.math.Direction byId(int id) { return new yarnwrap.util.math.Direction(wrapperContained.byId(id)); }
public float asRotation() { return wrapperContained.asRotation(); }
// public net.minecraft.util.math.Direction[] listClosest(yarnwrap.util.math.Direction first,yarnwrap.util.math.Direction second,yarnwrap.util.math.Direction third) { return wrapperContained.listClosest(first.wrapperContained,second.wrapperContained,third.wrapperContained); }
public int getId() { return wrapperContained.getId(); }
public yarnwrap.util.math.Direction getFacing(float x,float y,float z) { return new yarnwrap.util.math.Direction(wrapperContained.getFacing(x,y,z)); }
public int getOffsetX() { return wrapperContained.getOffsetX(); }
public yarnwrap.util.math.Direction fromRotation(double rotation) { return new yarnwrap.util.math.Direction(wrapperContained.fromRotation(rotation)); }
public java.lang.String getName() { return wrapperContained.getName(); }
public yarnwrap.util.math.Direction getOpposite() { return new yarnwrap.util.math.Direction(wrapperContained.getOpposite()); }
// public yarnwrap.util.math.Direction get(Object direction,Object axis) { return new yarnwrap.util.math.Direction(wrapperContained.get(direction,axis)); }
public net.minecraft.util.math.Direction[] getEntityFacingOrder(yarnwrap.entity.Entity entity) { return wrapperContained.getEntityFacingOrder(entity.wrapperContained); }
public yarnwrap.util.math.Direction rotateYCounterclockwise() { return new yarnwrap.util.math.Direction(wrapperContained.rotateYCounterclockwise()); }
public int getHorizontal() { return wrapperContained.getHorizontal(); }
public yarnwrap.util.math.Direction random(yarnwrap.util.math.random.Random random) { return new yarnwrap.util.math.Direction(wrapperContained.random(random.wrapperContained)); }
public yarnwrap.util.math.Vec3i getVector() { return new yarnwrap.util.math.Vec3i(wrapperContained.getVector()); }
public int getOffsetY() { return wrapperContained.getOffsetY(); }
public int getOffsetZ() { return wrapperContained.getOffsetZ(); }
public Object getAxis() { return wrapperContained.getAxis(); }
public yarnwrap.util.math.Direction byName(java.lang.String name) { return new yarnwrap.util.math.Direction(wrapperContained.byName(name)); }
// public yarnwrap.util.math.Direction from(Object axis,Object direction) { return new yarnwrap.util.math.Direction(wrapperContained.from(axis,direction)); }
public yarnwrap.util.math.Direction rotateYClockwise() { return new yarnwrap.util.math.Direction(wrapperContained.rotateYClockwise()); }
public Object getDirection() { return wrapperContained.getDirection(); }
public org.joml.Quaternionf getRotationQuaternion() { return wrapperContained.getRotationQuaternion(); }
public yarnwrap.util.math.Direction transform(org.joml.Matrix4f matrix,yarnwrap.util.math.Direction direction) { return new yarnwrap.util.math.Direction(wrapperContained.transform(matrix,direction.wrapperContained)); }
public org.joml.Vector3f getUnitVector() { return wrapperContained.getUnitVector(); }
public boolean pointsTo(float yaw) { return wrapperContained.pointsTo(yaw); }
// public yarnwrap.util.math.Direction getLookDirectionForAxis(yarnwrap.entity.Entity entity,Object axis) { return new yarnwrap.util.math.Direction(wrapperContained.getLookDirectionForAxis(entity.wrapperContained,axis)); }
// public yarnwrap.util.math.Direction rotateClockwise(Object axis) { return new yarnwrap.util.math.Direction(wrapperContained.rotateClockwise(axis)); }
// public yarnwrap.util.math.Direction rotateCounterclockwise(Object axis) { return new yarnwrap.util.math.Direction(wrapperContained.rotateCounterclockwise(axis)); }
// public yarnwrap.util.math.Direction rotateXClockwise() { return new yarnwrap.util.math.Direction(wrapperContained.rotateXClockwise()); }
// public yarnwrap.util.math.Direction rotateXCounterclockwise() { return new yarnwrap.util.math.Direction(wrapperContained.rotateXCounterclockwise()); }
// public yarnwrap.util.math.Direction rotateZClockwise() { return new yarnwrap.util.math.Direction(wrapperContained.rotateZClockwise()); }
// public yarnwrap.util.math.Direction rotateZCounterclockwise() { return new yarnwrap.util.math.Direction(wrapperContained.rotateZCounterclockwise()); }
// public com.mojang.serialization.DataResult validateVertical(yarnwrap.util.math.Direction direction) { return wrapperContained.validateVertical(direction.wrapperContained); }
public java.util.stream.Stream stream() { return wrapperContained.stream(); }
public java.util.Collection shuffle(yarnwrap.util.math.random.Random random) { return wrapperContained.shuffle(random.wrapperContained); }
public yarnwrap.util.math.Direction fromVector(int x,int y,int z) { return new yarnwrap.util.math.Direction(wrapperContained.fromVector(x,y,z)); }
public yarnwrap.util.math.Direction getFacing(yarnwrap.util.math.Vec3d vec) { return new yarnwrap.util.math.Direction(wrapperContained.getFacing(vec.wrapperContained)); }

}