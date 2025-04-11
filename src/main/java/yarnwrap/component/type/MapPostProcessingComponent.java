package yarnwrap.component.type;
public class MapPostProcessingComponent { public net.minecraft.component.type.MapPostProcessingComponent wrapperContained; public MapPostProcessingComponent(net.minecraft.component.type.MapPostProcessingComponent wrapperContained) { this.wrapperContained = wrapperContained; }

public java.util.function.IntFunction ID_TO_VALUE() { return wrapperContained.ID_TO_VALUE; }
// public void ID_TO_VALUE(java.util.function.IntFunction value) { wrapperContained.ID_TO_VALUE = value; }
public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
// public int id() { return wrapperContained.id; }
// public void id(int value) { wrapperContained.id = value; }
// // public MapPostProcessingComponent(java.lang.String id) { this.wrapperContained = new net.minecraft.component.type.MapPostProcessingComponent(id); }
public int getId() { return wrapperContained.getId(); }

}