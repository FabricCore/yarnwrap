package yarnwrap.component.type;
public class MapPostProcessingComponent { public net.minecraft.component.type.MapPostProcessingComponent wrapperContained; public MapPostProcessingComponent(net.minecraft.component.type.MapPostProcessingComponent wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.function.IntFunction ID_TO_VALUE() { return wrapperContained.ID_TO_VALUE; }
// public void ID_TO_VALUE(java.util.function.IntFunction value) { wrapperContained.ID_TO_VALUE = value; }
public static java.util.function.IntFunction ID_TO_VALUE() { return net.minecraft.component.type.MapPostProcessingComponent.ID_TO_VALUE; }
// public static void ID_TO_VALUE(java.util.function.IntFunction value, ) { net.minecraft.component.type.MapPostProcessingComponent.ID_TO_VALUE = value; }

// public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.component.type.MapPostProcessingComponent.PACKET_CODEC); }
// public static void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.component.type.MapPostProcessingComponent.PACKET_CODEC = value.wrapperContained; }

// public int id() { return wrapperContained.id; }
// public void id(int value) { wrapperContained.id = value; }
// public static int id() { return net.minecraft.component.type.MapPostProcessingComponent.id; }
// public static void id(int value, ) { net.minecraft.component.type.MapPostProcessingComponent.id = value; }

// // public MapPostProcessingComponent(java.lang.String id) { this.wrapperContained = new net.minecraft.component.type.MapPostProcessingComponent(id); }
public int getId() { return wrapperContained.getId(); }
// public static int getId() { return net.minecraft.component.type.MapPostProcessingComponent.getId(); }

}