package yarnwrap.component.type;
public class BlockStateComponent { public net.minecraft.component.type.BlockStateComponent wrapperContained; public BlockStateComponent(net.minecraft.component.type.BlockStateComponent wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.component.type.BlockStateComponent DEFAULT() { return new yarnwrap.component.type.BlockStateComponent(wrapperContained.DEFAULT); }
// public void DEFAULT(yarnwrap.component.type.BlockStateComponent value) { wrapperContained.DEFAULT = value.wrapperContained; }
public static yarnwrap.component.type.BlockStateComponent DEFAULT() { return new yarnwrap.component.type.BlockStateComponent(net.minecraft.component.type.BlockStateComponent.DEFAULT); }
// public static void DEFAULT(yarnwrap.component.type.BlockStateComponent value, ) { net.minecraft.component.type.BlockStateComponent.DEFAULT = value.wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.component.type.BlockStateComponent.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.component.type.BlockStateComponent.CODEC = value; }

// public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.component.type.BlockStateComponent.PACKET_CODEC); }
// public static void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.component.type.BlockStateComponent.PACKET_CODEC = value.wrapperContained; }

// public yarnwrap.network.codec.PacketCodec MAP_PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.MAP_PACKET_CODEC); }
// public void MAP_PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.MAP_PACKET_CODEC = value.wrapperContained; }
// public static yarnwrap.network.codec.PacketCodec MAP_PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.component.type.BlockStateComponent.MAP_PACKET_CODEC); }
// public static void MAP_PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.component.type.BlockStateComponent.MAP_PACKET_CODEC = value.wrapperContained; }

public boolean isEmpty() { return wrapperContained.isEmpty(); }
// public static boolean isEmpty() { return net.minecraft.component.type.BlockStateComponent.isEmpty(); }
public yarnwrap.block.BlockState applyToState(yarnwrap.block.BlockState state) { return new yarnwrap.block.BlockState(wrapperContained.applyToState(state.wrapperContained)); }
// public static yarnwrap.block.BlockState applyToState(yarnwrap.block.BlockState state, ) { return new yarnwrap.block.BlockState(net.minecraft.component.type.BlockStateComponent.applyToState(state.wrapperContained)); }
// public yarnwrap.block.BlockState method_57416(yarnwrap.block.BlockState valuex) { return new yarnwrap.block.BlockState(wrapperContained.method_57416(valuex.wrapperContained)); }
// public static yarnwrap.block.BlockState method_57416(yarnwrap.block.BlockState valuex, ) { return new yarnwrap.block.BlockState(net.minecraft.component.type.BlockStateComponent.method_57416(valuex.wrapperContained)); }
// public yarnwrap.block.BlockState applyToState(yarnwrap.block.BlockState state,yarnwrap.state.property.Property property,java.lang.String value) { return new yarnwrap.block.BlockState(wrapperContained.applyToState(state.wrapperContained,property.wrapperContained,value)); }
// public static yarnwrap.block.BlockState applyToState(yarnwrap.block.BlockState state,yarnwrap.state.property.Property property,java.lang.String value, ) { return new yarnwrap.block.BlockState(net.minecraft.component.type.BlockStateComponent.applyToState(state.wrapperContained,property.wrapperContained,value)); }
public java.lang.Comparable getValue(yarnwrap.state.property.Property property) { return wrapperContained.getValue(property.wrapperContained); }
// public static java.lang.Comparable getValue(yarnwrap.state.property.Property property, ) { return net.minecraft.component.type.BlockStateComponent.getValue(property.wrapperContained); }
public yarnwrap.component.type.BlockStateComponent with(yarnwrap.state.property.Property property,yarnwrap.block.BlockState fromState) { return new yarnwrap.component.type.BlockStateComponent(wrapperContained.with(property.wrapperContained,fromState.wrapperContained)); }
// public static yarnwrap.component.type.BlockStateComponent with(yarnwrap.state.property.Property property,yarnwrap.block.BlockState fromState, ) { return new yarnwrap.component.type.BlockStateComponent(net.minecraft.component.type.BlockStateComponent.with(property.wrapperContained,fromState.wrapperContained)); }
public yarnwrap.component.type.BlockStateComponent with(yarnwrap.state.property.Property property,java.lang.Comparable value) { return new yarnwrap.component.type.BlockStateComponent(wrapperContained.with(property.wrapperContained,value)); }
// public static yarnwrap.component.type.BlockStateComponent with(yarnwrap.state.property.Property property,java.lang.Comparable value, ) { return new yarnwrap.component.type.BlockStateComponent(net.minecraft.component.type.BlockStateComponent.with(property.wrapperContained,value)); }

}