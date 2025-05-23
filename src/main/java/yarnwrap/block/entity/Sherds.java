package yarnwrap.block.entity;
public class Sherds { public net.minecraft.block.entity.Sherds wrapperContained; public Sherds(net.minecraft.block.entity.Sherds wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.block.entity.Sherds DEFAULT() { return new yarnwrap.block.entity.Sherds(wrapperContained.DEFAULT); }
// public void DEFAULT(yarnwrap.block.entity.Sherds value) { wrapperContained.DEFAULT = value.wrapperContained; }
public static yarnwrap.block.entity.Sherds DEFAULT() { return new yarnwrap.block.entity.Sherds(net.minecraft.block.entity.Sherds.DEFAULT); }
// public static void DEFAULT(yarnwrap.block.entity.Sherds value, ) { net.minecraft.block.entity.Sherds.DEFAULT = value.wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.block.entity.Sherds.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.block.entity.Sherds.CODEC = value; }

// public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.block.entity.Sherds.PACKET_CODEC); }
// public static void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.block.entity.Sherds.PACKET_CODEC = value.wrapperContained; }

// public Sherds(java.util.List sherds) { this.wrapperContained = new net.minecraft.block.entity.Sherds(sherds); }
public Sherds(yarnwrap.item.Item back,yarnwrap.item.Item left,yarnwrap.item.Item right,yarnwrap.item.Item front) { this.wrapperContained = new net.minecraft.block.entity.Sherds(back.wrapperContained,left.wrapperContained,right.wrapperContained,front.wrapperContained); }
public java.util.List toList() { return wrapperContained.toList(); }
// public static java.util.List toList() { return net.minecraft.block.entity.Sherds.toList(); }
// public java.util.Optional getSherd(java.util.List sherds,int index) { return wrapperContained.getSherd(sherds,index); }
// public static java.util.Optional getSherd(java.util.List sherds,int index, ) { return net.minecraft.block.entity.Sherds.getSherd(sherds,index); }
// public yarnwrap.item.Item method_57592(java.util.Optional item) { return new yarnwrap.item.Item(wrapperContained.method_57592(item)); }
// public static yarnwrap.item.Item method_57592(java.util.Optional item, ) { return new yarnwrap.item.Item(net.minecraft.block.entity.Sherds.method_57592(item)); }
// public void appendSherdTooltip(java.util.function.Consumer textConsumer,java.util.Optional sherdItem) { wrapperContained.appendSherdTooltip(textConsumer,sherdItem); }
// public static void appendSherdTooltip(java.util.function.Consumer textConsumer,java.util.Optional sherdItem, ) { net.minecraft.block.entity.Sherds.appendSherdTooltip(textConsumer,sherdItem); }

}