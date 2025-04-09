package yarnwrap.network.handler;
public class SideValidatingDispatchingCodecBuilder { public net.minecraft.network.handler.SideValidatingDispatchingCodecBuilder wrapperContained; public SideValidatingDispatchingCodecBuilder(net.minecraft.network.handler.SideValidatingDispatchingCodecBuilder wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object backingBuilder() { return wrapperContained.backingBuilder; }
// public yarnwrap.network.NetworkSide side() { return new yarnwrap.network.NetworkSide(wrapperContained.side); }
public yarnwrap.network.codec.PacketCodec build() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.build()); }
public yarnwrap.network.handler.SideValidatingDispatchingCodecBuilder add(yarnwrap.network.packet.PacketType id,yarnwrap.network.codec.PacketCodec codec) { return new yarnwrap.network.handler.SideValidatingDispatchingCodecBuilder(wrapperContained.add(id.wrapperContained,codec.wrapperContained)); }

}