package yarnwrap.network.handler;
public class SideValidatingDispatchingCodecBuilder { public net.minecraft.network.handler.SideValidatingDispatchingCodecBuilder wrapperContained; public SideValidatingDispatchingCodecBuilder(net.minecraft.network.handler.SideValidatingDispatchingCodecBuilder wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object backingBuilder() { return wrapperContained.backingBuilder; }
// // public void backingBuilder(Object value) { wrapperContained.backingBuilder = value; }
// // public static Object backingBuilder() { return net.minecraft.network.handler.SideValidatingDispatchingCodecBuilder.backingBuilder; }
// // public static void backingBuilder(Object value, ) { net.minecraft.network.handler.SideValidatingDispatchingCodecBuilder.backingBuilder = value; }

// public yarnwrap.network.NetworkSide side() { return new yarnwrap.network.NetworkSide(wrapperContained.side); }
// public void side(yarnwrap.network.NetworkSide value) { wrapperContained.side = value.wrapperContained; }
// public static yarnwrap.network.NetworkSide side() { return new yarnwrap.network.NetworkSide(net.minecraft.network.handler.SideValidatingDispatchingCodecBuilder.side); }
// public static void side(yarnwrap.network.NetworkSide value, ) { net.minecraft.network.handler.SideValidatingDispatchingCodecBuilder.side = value.wrapperContained; }

public SideValidatingDispatchingCodecBuilder(yarnwrap.network.NetworkSide side) { this.wrapperContained = new net.minecraft.network.handler.SideValidatingDispatchingCodecBuilder(side.wrapperContained); }
public yarnwrap.network.codec.PacketCodec build() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.build()); }
// public static yarnwrap.network.codec.PacketCodec build() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.handler.SideValidatingDispatchingCodecBuilder.build()); }
public yarnwrap.network.handler.SideValidatingDispatchingCodecBuilder add(yarnwrap.network.packet.PacketType id,yarnwrap.network.codec.PacketCodec codec) { return new yarnwrap.network.handler.SideValidatingDispatchingCodecBuilder(wrapperContained.add(id.wrapperContained,codec.wrapperContained)); }
// public static yarnwrap.network.handler.SideValidatingDispatchingCodecBuilder add(yarnwrap.network.packet.PacketType id,yarnwrap.network.codec.PacketCodec codec, ) { return new yarnwrap.network.handler.SideValidatingDispatchingCodecBuilder(net.minecraft.network.handler.SideValidatingDispatchingCodecBuilder.add(id.wrapperContained,codec.wrapperContained)); }

}