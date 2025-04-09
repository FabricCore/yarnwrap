package yarnwrap.entity;
public class EntityPose { public net.minecraft.entity.EntityPose wrapperContained; public EntityPose(net.minecraft.entity.EntityPose wrapperContained) { this.wrapperContained = wrapperContained; }

public java.util.function.IntFunction INDEX_TO_VALUE() { return wrapperContained.INDEX_TO_VALUE; }
public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public int index() { return wrapperContained.index; }
public int getIndex() { return wrapperContained.getIndex(); }

}