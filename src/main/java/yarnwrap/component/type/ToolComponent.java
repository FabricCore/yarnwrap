package yarnwrap.component.type;
public class ToolComponent { public net.minecraft.component.type.ToolComponent wrapperContained; public ToolComponent(net.minecraft.component.type.ToolComponent wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.component.type.ToolComponent.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.component.type.ToolComponent.CODEC = value; }

// public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.component.type.ToolComponent.PACKET_CODEC); }
// public static void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.component.type.ToolComponent.PACKET_CODEC = value.wrapperContained; }

// public com.mojang.datafixers.kinds.App method_58424(Object instance) { return wrapperContained.method_58424(instance); }
// public static com.mojang.datafixers.kinds.App method_58424(Object instance, ) { return net.minecraft.component.type.ToolComponent.method_58424(instance); }
public float getSpeed(yarnwrap.block.BlockState state) { return wrapperContained.getSpeed(state.wrapperContained); }
// public static float getSpeed(yarnwrap.block.BlockState state, ) { return net.minecraft.component.type.ToolComponent.getSpeed(state.wrapperContained); }
public boolean isCorrectForDrops(yarnwrap.block.BlockState state) { return wrapperContained.isCorrectForDrops(state.wrapperContained); }
// public static boolean isCorrectForDrops(yarnwrap.block.BlockState state, ) { return net.minecraft.component.type.ToolComponent.isCorrectForDrops(state.wrapperContained); }

}