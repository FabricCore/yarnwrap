package yarnwrap.component.type;
public class ToolComponent { public net.minecraft.component.type.ToolComponent wrapperContained; public ToolComponent(net.minecraft.component.type.ToolComponent wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
public float getSpeed(yarnwrap.block.BlockState state) { return wrapperContained.getSpeed(state.wrapperContained); }
public boolean isCorrectForDrops(yarnwrap.block.BlockState state) { return wrapperContained.isCorrectForDrops(state.wrapperContained); }

}