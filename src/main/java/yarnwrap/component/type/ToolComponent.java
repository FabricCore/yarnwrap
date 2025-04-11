package yarnwrap.component.type;
public class ToolComponent { public net.minecraft.component.type.ToolComponent wrapperContained; public ToolComponent(net.minecraft.component.type.ToolComponent wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
// public com.mojang.datafixers.kinds.App method_58424(Object instance) { return wrapperContained.method_58424(instance); }
public float getSpeed(yarnwrap.block.BlockState state) { return wrapperContained.getSpeed(state.wrapperContained); }
public boolean isCorrectForDrops(yarnwrap.block.BlockState state) { return wrapperContained.isCorrectForDrops(state.wrapperContained); }

}