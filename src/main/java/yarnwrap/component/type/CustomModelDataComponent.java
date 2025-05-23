package yarnwrap.component.type;
public class CustomModelDataComponent { public net.minecraft.component.type.CustomModelDataComponent wrapperContained; public CustomModelDataComponent(net.minecraft.component.type.CustomModelDataComponent wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.component.type.CustomModelDataComponent.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.component.type.CustomModelDataComponent.CODEC = value; }

// public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.component.type.CustomModelDataComponent.PACKET_CODEC); }
// public static void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.component.type.CustomModelDataComponent.PACKET_CODEC = value.wrapperContained; }

// public yarnwrap.component.type.CustomModelDataComponent DEFAULT() { return new yarnwrap.component.type.CustomModelDataComponent(wrapperContained.DEFAULT); }
// public void DEFAULT(yarnwrap.component.type.CustomModelDataComponent value) { wrapperContained.DEFAULT = value.wrapperContained; }
public static yarnwrap.component.type.CustomModelDataComponent DEFAULT() { return new yarnwrap.component.type.CustomModelDataComponent(net.minecraft.component.type.CustomModelDataComponent.DEFAULT); }
// public static void DEFAULT(yarnwrap.component.type.CustomModelDataComponent value, ) { net.minecraft.component.type.CustomModelDataComponent.DEFAULT = value.wrapperContained; }

public java.lang.Float getFloat(int index) { return wrapperContained.getFloat(index); }
// public static java.lang.Float getFloat(int index, ) { return net.minecraft.component.type.CustomModelDataComponent.getFloat(index); }
// public com.mojang.datafixers.kinds.App method_65363(Object instance) { return wrapperContained.method_65363(instance); }
// public static com.mojang.datafixers.kinds.App method_65363(Object instance, ) { return net.minecraft.component.type.CustomModelDataComponent.method_65363(instance); }
// public java.lang.Object getValue(java.util.List values,int index) { return wrapperContained.getValue(values,index); }
// public static java.lang.Object getValue(java.util.List values,int index, ) { return net.minecraft.component.type.CustomModelDataComponent.getValue(values,index); }
public java.lang.Boolean getFlag(int index) { return wrapperContained.getFlag(index); }
// public static java.lang.Boolean getFlag(int index, ) { return net.minecraft.component.type.CustomModelDataComponent.getFlag(index); }
public java.lang.String getString(int index) { return wrapperContained.getString(index); }
// public static java.lang.String getString(int index, ) { return net.minecraft.component.type.CustomModelDataComponent.getString(index); }
public java.lang.Integer getColor(int index) { return wrapperContained.getColor(index); }
// public static java.lang.Integer getColor(int index, ) { return net.minecraft.component.type.CustomModelDataComponent.getColor(index); }

}