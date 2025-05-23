package yarnwrap.network.state;
public class PlayStateFactories { public net.minecraft.network.state.PlayStateFactories wrapperContained; public PlayStateFactories(net.minecraft.network.state.PlayStateFactories wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.network.state.ContextAwareNetworkStateFactory C2S() { return new yarnwrap.network.state.ContextAwareNetworkStateFactory(wrapperContained.C2S); }
// public void C2S(yarnwrap.network.state.ContextAwareNetworkStateFactory value) { wrapperContained.C2S = value.wrapperContained; }
public static yarnwrap.network.state.ContextAwareNetworkStateFactory C2S() { return new yarnwrap.network.state.ContextAwareNetworkStateFactory(net.minecraft.network.state.PlayStateFactories.C2S); }
// public static void C2S(yarnwrap.network.state.ContextAwareNetworkStateFactory value, ) { net.minecraft.network.state.PlayStateFactories.C2S = value.wrapperContained; }

// public yarnwrap.network.state.NetworkStateFactory S2C() { return new yarnwrap.network.state.NetworkStateFactory(wrapperContained.S2C); }
// public void S2C(yarnwrap.network.state.NetworkStateFactory value) { wrapperContained.S2C = value.wrapperContained; }
public static yarnwrap.network.state.NetworkStateFactory S2C() { return new yarnwrap.network.state.NetworkStateFactory(net.minecraft.network.state.PlayStateFactories.S2C); }
// public static void S2C(yarnwrap.network.state.NetworkStateFactory value, ) { net.minecraft.network.state.PlayStateFactories.S2C = value.wrapperContained; }

// public yarnwrap.network.packet.PacketCodecModifier CREATIVE_INVENTORY_ACTION_C2S_MODIFIER() { return new yarnwrap.network.packet.PacketCodecModifier(wrapperContained.CREATIVE_INVENTORY_ACTION_C2S_MODIFIER); }
// public void CREATIVE_INVENTORY_ACTION_C2S_MODIFIER(yarnwrap.network.packet.PacketCodecModifier value) { wrapperContained.CREATIVE_INVENTORY_ACTION_C2S_MODIFIER = value.wrapperContained; }
public static yarnwrap.network.packet.PacketCodecModifier CREATIVE_INVENTORY_ACTION_C2S_MODIFIER() { return new yarnwrap.network.packet.PacketCodecModifier(net.minecraft.network.state.PlayStateFactories.CREATIVE_INVENTORY_ACTION_C2S_MODIFIER); }
// public static void CREATIVE_INVENTORY_ACTION_C2S_MODIFIER(yarnwrap.network.packet.PacketCodecModifier value, ) { net.minecraft.network.state.PlayStateFactories.CREATIVE_INVENTORY_ACTION_C2S_MODIFIER = value.wrapperContained; }

// public void method_55958(yarnwrap.network.state.NetworkStateBuilder builder) { wrapperContained.method_55958(builder.wrapperContained); }
// public static void method_55958(yarnwrap.network.state.NetworkStateBuilder builder, ) { net.minecraft.network.state.PlayStateFactories.method_55958(builder.wrapperContained); }
// public void method_55959(yarnwrap.network.state.NetworkStateBuilder builder) { wrapperContained.method_55959(builder.wrapperContained); }
// public static void method_55959(yarnwrap.network.state.NetworkStateBuilder builder, ) { net.minecraft.network.state.PlayStateFactories.method_55959(builder.wrapperContained); }
// public yarnwrap.network.codec.PacketCodec method_68730(yarnwrap.network.codec.PacketCodec packetCodec,Object context) { return new yarnwrap.network.codec.PacketCodec(wrapperContained.method_68730(packetCodec.wrapperContained,context)); }
// public static yarnwrap.network.codec.PacketCodec method_68730(yarnwrap.network.codec.PacketCodec packetCodec,Object context, ) { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.state.PlayStateFactories.method_68730(packetCodec.wrapperContained,context)); }

}