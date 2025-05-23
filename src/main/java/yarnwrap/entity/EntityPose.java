package yarnwrap.entity;
public class EntityPose { public net.minecraft.entity.EntityPose wrapperContained; public EntityPose(net.minecraft.entity.EntityPose wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.EntityPose GLIDING() { return new yarnwrap.entity.EntityPose(wrapperContained.GLIDING); }
// public void GLIDING(yarnwrap.entity.EntityPose value) { wrapperContained.GLIDING = value.wrapperContained; }
public static yarnwrap.entity.EntityPose GLIDING() { return new yarnwrap.entity.EntityPose(net.minecraft.entity.EntityPose.GLIDING); }
// public static void GLIDING(yarnwrap.entity.EntityPose value, ) { net.minecraft.entity.EntityPose.GLIDING = value.wrapperContained; }

// public java.util.function.IntFunction INDEX_TO_VALUE() { return wrapperContained.INDEX_TO_VALUE; }
// public void INDEX_TO_VALUE(java.util.function.IntFunction value) { wrapperContained.INDEX_TO_VALUE = value; }
public static java.util.function.IntFunction INDEX_TO_VALUE() { return net.minecraft.entity.EntityPose.INDEX_TO_VALUE; }
// public static void INDEX_TO_VALUE(java.util.function.IntFunction value, ) { net.minecraft.entity.EntityPose.INDEX_TO_VALUE = value; }

// public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.entity.EntityPose.PACKET_CODEC); }
// public static void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.entity.EntityPose.PACKET_CODEC = value.wrapperContained; }

// public int index() { return wrapperContained.index; }
// public void index(int value) { wrapperContained.index = value; }
// public static int index() { return net.minecraft.entity.EntityPose.index; }
// public static void index(int value, ) { net.minecraft.entity.EntityPose.index = value; }

// // public EntityPose(java.lang.String index) { this.wrapperContained = new net.minecraft.entity.EntityPose(index); }
public int getIndex() { return wrapperContained.getIndex(); }
// public static int getIndex() { return net.minecraft.entity.EntityPose.getIndex(); }

}