package yarnwrap.component.type;
public class TooltipDisplayComponent { public net.minecraft.component.type.TooltipDisplayComponent wrapperContained; public TooltipDisplayComponent(net.minecraft.component.type.TooltipDisplayComponent wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.component.type.TooltipDisplayComponent.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.component.type.TooltipDisplayComponent.CODEC = value; }

// public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.component.type.TooltipDisplayComponent.PACKET_CODEC); }
// public static void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.component.type.TooltipDisplayComponent.PACKET_CODEC = value.wrapperContained; }

// public yarnwrap.component.type.TooltipDisplayComponent DEFAULT() { return new yarnwrap.component.type.TooltipDisplayComponent(wrapperContained.DEFAULT); }
// public void DEFAULT(yarnwrap.component.type.TooltipDisplayComponent value) { wrapperContained.DEFAULT = value.wrapperContained; }
public static yarnwrap.component.type.TooltipDisplayComponent DEFAULT() { return new yarnwrap.component.type.TooltipDisplayComponent(net.minecraft.component.type.TooltipDisplayComponent.DEFAULT); }
// public static void DEFAULT(yarnwrap.component.type.TooltipDisplayComponent value, ) { net.minecraft.component.type.TooltipDisplayComponent.DEFAULT = value.wrapperContained; }

// public com.mojang.serialization.Codec HIDDEN_COMPONENTS_CODEC() { return wrapperContained.HIDDEN_COMPONENTS_CODEC; }
// public void HIDDEN_COMPONENTS_CODEC(com.mojang.serialization.Codec value) { wrapperContained.HIDDEN_COMPONENTS_CODEC = value; }
// public static com.mojang.serialization.Codec HIDDEN_COMPONENTS_CODEC() { return net.minecraft.component.type.TooltipDisplayComponent.HIDDEN_COMPONENTS_CODEC; }
// public static void HIDDEN_COMPONENTS_CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.component.type.TooltipDisplayComponent.HIDDEN_COMPONENTS_CODEC = value; }

// public com.mojang.datafixers.kinds.App method_67213(Object instance) { return wrapperContained.method_67213(instance); }
// public static com.mojang.datafixers.kinds.App method_67213(Object instance, ) { return net.minecraft.component.type.TooltipDisplayComponent.method_67213(instance); }
public boolean shouldDisplay(yarnwrap.component.ComponentType component) { return wrapperContained.shouldDisplay(component.wrapperContained); }
// public static boolean shouldDisplay(yarnwrap.component.ComponentType component, ) { return net.minecraft.component.type.TooltipDisplayComponent.shouldDisplay(component.wrapperContained); }
public yarnwrap.component.type.TooltipDisplayComponent with(yarnwrap.component.ComponentType component,boolean hidden) { return new yarnwrap.component.type.TooltipDisplayComponent(wrapperContained.with(component.wrapperContained,hidden)); }
// public static yarnwrap.component.type.TooltipDisplayComponent with(yarnwrap.component.ComponentType component,boolean hidden, ) { return new yarnwrap.component.type.TooltipDisplayComponent(net.minecraft.component.type.TooltipDisplayComponent.with(component.wrapperContained,hidden)); }

}