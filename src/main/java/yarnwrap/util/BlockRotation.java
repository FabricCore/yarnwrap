package yarnwrap.util;
public class BlockRotation { public net.minecraft.util.BlockRotation wrapperContained; public BlockRotation(net.minecraft.util.BlockRotation wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.math.DirectionTransformation directionTransformation() { return new yarnwrap.util.math.DirectionTransformation(wrapperContained.directionTransformation); }
// public void directionTransformation(yarnwrap.util.math.DirectionTransformation value) { wrapperContained.directionTransformation = value.wrapperContained; }
// public static yarnwrap.util.math.DirectionTransformation directionTransformation() { return new yarnwrap.util.math.DirectionTransformation(net.minecraft.util.BlockRotation.directionTransformation); }
// public static void directionTransformation(yarnwrap.util.math.DirectionTransformation value, ) { net.minecraft.util.BlockRotation.directionTransformation = value.wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.util.BlockRotation.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.util.BlockRotation.CODEC = value; }

// public java.lang.String id() { return wrapperContained.id; }
// public void id(java.lang.String value) { wrapperContained.id = value; }
// public static java.lang.String id() { return net.minecraft.util.BlockRotation.id; }
// public static void id(java.lang.String value, ) { net.minecraft.util.BlockRotation.id = value; }

// public java.util.function.IntFunction INDEX_MAPPER() { return wrapperContained.INDEX_MAPPER; }
// public void INDEX_MAPPER(java.util.function.IntFunction value) { wrapperContained.INDEX_MAPPER = value; }
public static java.util.function.IntFunction INDEX_MAPPER() { return net.minecraft.util.BlockRotation.INDEX_MAPPER; }
// public static void INDEX_MAPPER(java.util.function.IntFunction value, ) { net.minecraft.util.BlockRotation.INDEX_MAPPER = value; }

// public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.util.BlockRotation.PACKET_CODEC); }
// public static void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.util.BlockRotation.PACKET_CODEC = value.wrapperContained; }

// public int index() { return wrapperContained.index; }
// public void index(int value) { wrapperContained.index = value; }
// public static int index() { return net.minecraft.util.BlockRotation.index; }
// public static void index(int value, ) { net.minecraft.util.BlockRotation.index = value; }

// public com.mojang.serialization.Codec ENUM_NAME_CODEC() { return wrapperContained.ENUM_NAME_CODEC; }
// public void ENUM_NAME_CODEC(com.mojang.serialization.Codec value) { wrapperContained.ENUM_NAME_CODEC = value; }
public static com.mojang.serialization.Codec ENUM_NAME_CODEC() { return net.minecraft.util.BlockRotation.ENUM_NAME_CODEC; }
// public static void ENUM_NAME_CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.util.BlockRotation.ENUM_NAME_CODEC = value; }

// // public BlockRotation(java.lang.String index,int id,int directionTransformation) { this.wrapperContained = new net.minecraft.util.BlockRotation(index,id,directionTransformation); }
public yarnwrap.util.BlockRotation rotate(yarnwrap.util.BlockRotation rotation) { return new yarnwrap.util.BlockRotation(wrapperContained.rotate(rotation.wrapperContained)); }
// public static yarnwrap.util.BlockRotation rotate(yarnwrap.util.BlockRotation rotation, ) { return new yarnwrap.util.BlockRotation(net.minecraft.util.BlockRotation.rotate(rotation.wrapperContained)); }
public int rotate(int rotation,int fullTurn) { return wrapperContained.rotate(rotation,fullTurn); }
// public static int rotate(int rotation,int fullTurn, ) { return net.minecraft.util.BlockRotation.rotate(rotation,fullTurn); }
public yarnwrap.util.math.Direction rotate(yarnwrap.util.math.Direction direction) { return new yarnwrap.util.math.Direction(wrapperContained.rotate(direction.wrapperContained)); }
// public static yarnwrap.util.math.Direction rotate(yarnwrap.util.math.Direction direction, ) { return new yarnwrap.util.math.Direction(net.minecraft.util.BlockRotation.rotate(direction.wrapperContained)); }
// public java.util.List randomRotationOrder(yarnwrap.util.math.random.Random random) { return wrapperContained.randomRotationOrder(random.wrapperContained); }
// public static java.util.List randomRotationOrder(yarnwrap.util.math.random.Random random, ) { return net.minecraft.util.BlockRotation.randomRotationOrder(random.wrapperContained); }
// public yarnwrap.util.BlockRotation random(yarnwrap.util.math.random.Random random) { return new yarnwrap.util.BlockRotation(wrapperContained.random(random.wrapperContained)); }
// public static yarnwrap.util.BlockRotation random(yarnwrap.util.math.random.Random random, ) { return new yarnwrap.util.BlockRotation(net.minecraft.util.BlockRotation.random(random.wrapperContained)); }
public yarnwrap.util.math.DirectionTransformation getDirectionTransformation() { return new yarnwrap.util.math.DirectionTransformation(wrapperContained.getDirectionTransformation()); }
// public static yarnwrap.util.math.DirectionTransformation getDirectionTransformation() { return new yarnwrap.util.math.DirectionTransformation(net.minecraft.util.BlockRotation.getDirectionTransformation()); }
// public int getIndex() { return wrapperContained.getIndex(); }
// public static int getIndex() { return net.minecraft.util.BlockRotation.getIndex(); }

}