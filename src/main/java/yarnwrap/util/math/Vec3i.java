package yarnwrap.util.math;
public class Vec3i { public net.minecraft.util.math.Vec3i wrapperContained; public Vec3i(net.minecraft.util.math.Vec3i wrapperContained) { this.wrapperContained = wrapperContained; }

// public int z() { return wrapperContained.z; }
// public void z(int value) { wrapperContained.z = value; }
// public static int z() { return net.minecraft.util.math.Vec3i.z; }
// public static void z(int value, ) { net.minecraft.util.math.Vec3i.z = value; }

// public int y() { return wrapperContained.y; }
// public void y(int value) { wrapperContained.y = value; }
// public static int y() { return net.minecraft.util.math.Vec3i.y; }
// public static void y(int value, ) { net.minecraft.util.math.Vec3i.y = value; }

// public int x() { return wrapperContained.x; }
// public void x(int value) { wrapperContained.x = value; }
// public static int x() { return net.minecraft.util.math.Vec3i.x; }
// public static void x(int value, ) { net.minecraft.util.math.Vec3i.x = value; }

// public yarnwrap.util.math.Vec3i ZERO() { return new yarnwrap.util.math.Vec3i(wrapperContained.ZERO); }
// public void ZERO(yarnwrap.util.math.Vec3i value) { wrapperContained.ZERO = value.wrapperContained; }
public static yarnwrap.util.math.Vec3i ZERO() { return new yarnwrap.util.math.Vec3i(net.minecraft.util.math.Vec3i.ZERO); }
// public static void ZERO(yarnwrap.util.math.Vec3i value, ) { net.minecraft.util.math.Vec3i.ZERO = value.wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.util.math.Vec3i.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.util.math.Vec3i.CODEC = value; }

// public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.util.math.Vec3i.PACKET_CODEC); }
// public static void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.util.math.Vec3i.PACKET_CODEC = value.wrapperContained; }

public Vec3i(int x,int y,int z) { this.wrapperContained = new net.minecraft.util.math.Vec3i(x,y,z); }
// public int compareTo(java.lang.Object vec) { return wrapperContained.compareTo(vec); }
// public static int compareTo(java.lang.Object vec, ) { return net.minecraft.util.math.Vec3i.compareTo(vec); }
public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
// public static boolean equals(java.lang.Object o, ) { return net.minecraft.util.math.Vec3i.equals(o); }
// public yarnwrap.util.math.Vec3i setY(int y) { return new yarnwrap.util.math.Vec3i(wrapperContained.setY(y)); }
// public static yarnwrap.util.math.Vec3i setY(int y, ) { return new yarnwrap.util.math.Vec3i(net.minecraft.util.math.Vec3i.setY(y)); }
public yarnwrap.util.math.Vec3i crossProduct(yarnwrap.util.math.Vec3i vec) { return new yarnwrap.util.math.Vec3i(wrapperContained.crossProduct(vec.wrapperContained)); }
// public static yarnwrap.util.math.Vec3i crossProduct(yarnwrap.util.math.Vec3i vec, ) { return new yarnwrap.util.math.Vec3i(net.minecraft.util.math.Vec3i.crossProduct(vec.wrapperContained)); }
public int getZ() { return wrapperContained.getZ(); }
// public static int getZ() { return net.minecraft.util.math.Vec3i.getZ(); }
public double getSquaredDistance(yarnwrap.util.math.Vec3i vec) { return wrapperContained.getSquaredDistance(vec.wrapperContained); }
// public static double getSquaredDistance(yarnwrap.util.math.Vec3i vec, ) { return net.minecraft.util.math.Vec3i.getSquaredDistance(vec.wrapperContained); }
public int getX() { return wrapperContained.getX(); }
// public static int getX() { return net.minecraft.util.math.Vec3i.getX(); }
public int getY() { return wrapperContained.getY(); }
// public static int getY() { return net.minecraft.util.math.Vec3i.getY(); }
public double getSquaredDistanceFromCenter(double x,double y,double z) { return wrapperContained.getSquaredDistanceFromCenter(x,y,z); }
// public static double getSquaredDistanceFromCenter(double x,double y,double z, ) { return net.minecraft.util.math.Vec3i.getSquaredDistanceFromCenter(x,y,z); }
public int getManhattanDistance(yarnwrap.util.math.Vec3i vec) { return wrapperContained.getManhattanDistance(vec.wrapperContained); }
// public static int getManhattanDistance(yarnwrap.util.math.Vec3i vec, ) { return net.minecraft.util.math.Vec3i.getManhattanDistance(vec.wrapperContained); }
public boolean isWithinDistance(yarnwrap.util.math.Position pos,double distance) { return wrapperContained.isWithinDistance(pos.wrapperContained,distance); }
// public static boolean isWithinDistance(yarnwrap.util.math.Position pos,double distance, ) { return net.minecraft.util.math.Vec3i.isWithinDistance(pos.wrapperContained,distance); }
public double getSquaredDistance(yarnwrap.util.math.Position pos) { return wrapperContained.getSquaredDistance(pos.wrapperContained); }
// public static double getSquaredDistance(yarnwrap.util.math.Position pos, ) { return net.minecraft.util.math.Vec3i.getSquaredDistance(pos.wrapperContained); }
public boolean isWithinDistance(yarnwrap.util.math.Vec3i vec,double distance) { return wrapperContained.isWithinDistance(vec.wrapperContained,distance); }
// public static boolean isWithinDistance(yarnwrap.util.math.Vec3i vec,double distance, ) { return net.minecraft.util.math.Vec3i.isWithinDistance(vec.wrapperContained,distance); }
// public yarnwrap.util.math.Vec3i setX(int x) { return new yarnwrap.util.math.Vec3i(wrapperContained.setX(x)); }
// public static yarnwrap.util.math.Vec3i setX(int x, ) { return new yarnwrap.util.math.Vec3i(net.minecraft.util.math.Vec3i.setX(x)); }
// public yarnwrap.util.math.Vec3i setZ(int z) { return new yarnwrap.util.math.Vec3i(wrapperContained.setZ(z)); }
// public static yarnwrap.util.math.Vec3i setZ(int z, ) { return new yarnwrap.util.math.Vec3i(net.minecraft.util.math.Vec3i.setZ(z)); }
public yarnwrap.util.math.Vec3i offset(yarnwrap.util.math.Direction direction,int distance) { return new yarnwrap.util.math.Vec3i(wrapperContained.offset(direction.wrapperContained,distance)); }
// public static yarnwrap.util.math.Vec3i offset(yarnwrap.util.math.Direction direction,int distance, ) { return new yarnwrap.util.math.Vec3i(net.minecraft.util.math.Vec3i.offset(direction.wrapperContained,distance)); }
public yarnwrap.util.math.Vec3i down(int distance) { return new yarnwrap.util.math.Vec3i(wrapperContained.down(distance)); }
// public static yarnwrap.util.math.Vec3i down(int distance, ) { return new yarnwrap.util.math.Vec3i(net.minecraft.util.math.Vec3i.down(distance)); }
public yarnwrap.util.math.Vec3i down() { return new yarnwrap.util.math.Vec3i(wrapperContained.down()); }
// public static yarnwrap.util.math.Vec3i down() { return new yarnwrap.util.math.Vec3i(net.minecraft.util.math.Vec3i.down()); }
public java.lang.String toShortString() { return wrapperContained.toShortString(); }
// public static java.lang.String toShortString() { return net.minecraft.util.math.Vec3i.toShortString(); }
// public java.util.stream.IntStream method_29124(yarnwrap.util.math.Vec3i vec) { return wrapperContained.method_29124(vec.wrapperContained); }
// public static java.util.stream.IntStream method_29124(yarnwrap.util.math.Vec3i vec, ) { return net.minecraft.util.math.Vec3i.method_29124(vec.wrapperContained); }
// public com.mojang.serialization.DataResult method_29125(java.util.stream.IntStream stream) { return wrapperContained.method_29125(stream); }
// public static com.mojang.serialization.DataResult method_29125(java.util.stream.IntStream stream, ) { return net.minecraft.util.math.Vec3i.method_29125(stream); }
// public yarnwrap.util.math.Vec3i method_29126(int coordinates) { return new yarnwrap.util.math.Vec3i(wrapperContained.method_29126(coordinates)); }
// public static yarnwrap.util.math.Vec3i method_29126(int coordinates, ) { return new yarnwrap.util.math.Vec3i(net.minecraft.util.math.Vec3i.method_29126(coordinates)); }
// public int getComponentAlongAxis(Object axis) { return wrapperContained.getComponentAlongAxis(axis); }
// public static int getComponentAlongAxis(Object axis, ) { return net.minecraft.util.math.Vec3i.getComponentAlongAxis(axis); }
public yarnwrap.util.math.Vec3i up(int distance) { return new yarnwrap.util.math.Vec3i(wrapperContained.up(distance)); }
// public static yarnwrap.util.math.Vec3i up(int distance, ) { return new yarnwrap.util.math.Vec3i(net.minecraft.util.math.Vec3i.up(distance)); }
public yarnwrap.util.math.Vec3i up() { return new yarnwrap.util.math.Vec3i(wrapperContained.up()); }
// public static yarnwrap.util.math.Vec3i up() { return new yarnwrap.util.math.Vec3i(net.minecraft.util.math.Vec3i.up()); }
public yarnwrap.util.math.Vec3i add(int x,int y,int z) { return new yarnwrap.util.math.Vec3i(wrapperContained.add(x,y,z)); }
// public static yarnwrap.util.math.Vec3i add(int x,int y,int z, ) { return new yarnwrap.util.math.Vec3i(net.minecraft.util.math.Vec3i.add(x,y,z)); }
// public yarnwrap.util.math.Vec3i offset(Object axis,int distance) { return new yarnwrap.util.math.Vec3i(wrapperContained.offset(axis,distance)); }
// public static yarnwrap.util.math.Vec3i offset(Object axis,int distance, ) { return new yarnwrap.util.math.Vec3i(net.minecraft.util.math.Vec3i.offset(axis,distance)); }
public yarnwrap.util.math.Vec3i offset(yarnwrap.util.math.Direction direction) { return new yarnwrap.util.math.Vec3i(wrapperContained.offset(direction.wrapperContained)); }
// public static yarnwrap.util.math.Vec3i offset(yarnwrap.util.math.Direction direction, ) { return new yarnwrap.util.math.Vec3i(net.minecraft.util.math.Vec3i.offset(direction.wrapperContained)); }
public yarnwrap.util.math.Vec3i subtract(yarnwrap.util.math.Vec3i vec) { return new yarnwrap.util.math.Vec3i(wrapperContained.subtract(vec.wrapperContained)); }
// public static yarnwrap.util.math.Vec3i subtract(yarnwrap.util.math.Vec3i vec, ) { return new yarnwrap.util.math.Vec3i(net.minecraft.util.math.Vec3i.subtract(vec.wrapperContained)); }
public yarnwrap.util.math.Vec3i add(yarnwrap.util.math.Vec3i vec) { return new yarnwrap.util.math.Vec3i(wrapperContained.add(vec.wrapperContained)); }
// public static yarnwrap.util.math.Vec3i add(yarnwrap.util.math.Vec3i vec, ) { return new yarnwrap.util.math.Vec3i(net.minecraft.util.math.Vec3i.add(vec.wrapperContained)); }
public yarnwrap.util.math.Vec3i east(int distance) { return new yarnwrap.util.math.Vec3i(wrapperContained.east(distance)); }
// public static yarnwrap.util.math.Vec3i east(int distance, ) { return new yarnwrap.util.math.Vec3i(net.minecraft.util.math.Vec3i.east(distance)); }
public yarnwrap.util.math.Vec3i east() { return new yarnwrap.util.math.Vec3i(wrapperContained.east()); }
// public static yarnwrap.util.math.Vec3i east() { return new yarnwrap.util.math.Vec3i(net.minecraft.util.math.Vec3i.east()); }
public yarnwrap.util.math.Vec3i west(int distance) { return new yarnwrap.util.math.Vec3i(wrapperContained.west(distance)); }
// public static yarnwrap.util.math.Vec3i west(int distance, ) { return new yarnwrap.util.math.Vec3i(net.minecraft.util.math.Vec3i.west(distance)); }
public yarnwrap.util.math.Vec3i west() { return new yarnwrap.util.math.Vec3i(wrapperContained.west()); }
// public static yarnwrap.util.math.Vec3i west() { return new yarnwrap.util.math.Vec3i(net.minecraft.util.math.Vec3i.west()); }
public yarnwrap.util.math.Vec3i south(int distance) { return new yarnwrap.util.math.Vec3i(wrapperContained.south(distance)); }
// public static yarnwrap.util.math.Vec3i south(int distance, ) { return new yarnwrap.util.math.Vec3i(net.minecraft.util.math.Vec3i.south(distance)); }
public yarnwrap.util.math.Vec3i south() { return new yarnwrap.util.math.Vec3i(wrapperContained.south()); }
// public static yarnwrap.util.math.Vec3i south() { return new yarnwrap.util.math.Vec3i(net.minecraft.util.math.Vec3i.south()); }
public yarnwrap.util.math.Vec3i north(int distance) { return new yarnwrap.util.math.Vec3i(wrapperContained.north(distance)); }
// public static yarnwrap.util.math.Vec3i north(int distance, ) { return new yarnwrap.util.math.Vec3i(net.minecraft.util.math.Vec3i.north(distance)); }
public yarnwrap.util.math.Vec3i north() { return new yarnwrap.util.math.Vec3i(wrapperContained.north()); }
// public static yarnwrap.util.math.Vec3i north() { return new yarnwrap.util.math.Vec3i(net.minecraft.util.math.Vec3i.north()); }
public yarnwrap.util.math.Vec3i multiply(int scale) { return new yarnwrap.util.math.Vec3i(wrapperContained.multiply(scale)); }
// public static yarnwrap.util.math.Vec3i multiply(int scale, ) { return new yarnwrap.util.math.Vec3i(net.minecraft.util.math.Vec3i.multiply(scale)); }
// public com.mojang.serialization.Codec createOffsetCodec(int maxAbsValue) { return wrapperContained.createOffsetCodec(maxAbsValue); }
// public static com.mojang.serialization.Codec createOffsetCodec(int maxAbsValue, ) { return net.minecraft.util.math.Vec3i.createOffsetCodec(maxAbsValue); }
public double getSquaredDistance(double x,double y,double z) { return wrapperContained.getSquaredDistance(x,y,z); }
// public static double getSquaredDistance(double x,double y,double z, ) { return net.minecraft.util.math.Vec3i.getSquaredDistance(x,y,z); }
// public com.mojang.serialization.DataResult method_48305(int vec) { return wrapperContained.method_48305(vec); }
// public static com.mojang.serialization.DataResult method_48305(int vec, ) { return net.minecraft.util.math.Vec3i.method_48305(vec); }
public int getChebyshevDistance(yarnwrap.util.math.Vec3i vec) { return wrapperContained.getChebyshevDistance(vec.wrapperContained); }
// public static int getChebyshevDistance(yarnwrap.util.math.Vec3i vec, ) { return net.minecraft.util.math.Vec3i.getChebyshevDistance(vec.wrapperContained); }

}