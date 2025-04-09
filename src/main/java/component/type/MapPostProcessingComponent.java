package yarnwrap.component.type;
public class MapPostProcessingComponent { public net.minecraft.component.type.MapPostProcessingComponent wrapperContained; public MapPostProcessingComponent(net.minecraft.component.type.MapPostProcessingComponent wrapperContained) { this.wrapperContained = wrapperContained; }

public java.util.function.IntFunction ID_TO_VALUE() { return wrapperContained.ID_TO_VALUE; }
public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public int id() { return wrapperContained.id; }
public int getId() { return wrapperContained.getId(); }

}