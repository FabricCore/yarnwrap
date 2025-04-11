package yarnwrap.entity;
public class EntityPose { public net.minecraft.entity.EntityPose wrapperContained; public EntityPose(net.minecraft.entity.EntityPose wrapperContained) { this.wrapperContained = wrapperContained; }

public java.util.function.IntFunction INDEX_TO_VALUE() { return wrapperContained.INDEX_TO_VALUE; }
// public void INDEX_TO_VALUE(java.util.function.IntFunction value) { wrapperContained.INDEX_TO_VALUE = value; }
public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
// public int index() { return wrapperContained.index; }
// public void index(int value) { wrapperContained.index = value; }
// // public EntityPose(java.lang.String index) { this.wrapperContained = new net.minecraft.entity.EntityPose(index); }
public int getIndex() { return wrapperContained.getIndex(); }

}