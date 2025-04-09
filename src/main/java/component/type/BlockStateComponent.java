package yarnwrap.component.type;
public class BlockStateComponent { public net.minecraft.component.type.BlockStateComponent wrapperContained; public BlockStateComponent(net.minecraft.component.type.BlockStateComponent wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.component.type.BlockStateComponent DEFAULT() { return new yarnwrap.component.type.BlockStateComponent(wrapperContained.DEFAULT); }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public yarnwrap.network.codec.PacketCodec MAP_PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.MAP_PACKET_CODEC); }
public boolean isEmpty() { return wrapperContained.isEmpty(); }
public yarnwrap.block.BlockState applyToState(yarnwrap.block.BlockState state) { return new yarnwrap.block.BlockState(wrapperContained.applyToState(state.wrapperContained)); }
// public yarnwrap.block.BlockState applyToState(yarnwrap.block.BlockState state,yarnwrap.state.property.Property property,java.lang.String value) { return new yarnwrap.block.BlockState(wrapperContained.applyToState(state.wrapperContained,property.wrapperContained,value)); }
public java.lang.Comparable getValue(yarnwrap.state.property.Property property) { return wrapperContained.getValue(property.wrapperContained); }
public yarnwrap.component.type.BlockStateComponent with(yarnwrap.state.property.Property property,yarnwrap.block.BlockState fromState) { return new yarnwrap.component.type.BlockStateComponent(wrapperContained.with(property.wrapperContained,fromState.wrapperContained)); }
public yarnwrap.component.type.BlockStateComponent with(yarnwrap.state.property.Property property,java.lang.Comparable value) { return new yarnwrap.component.type.BlockStateComponent(wrapperContained.with(property.wrapperContained,value)); }

}