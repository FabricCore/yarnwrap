package yarnwrap.network.packet.s2c.play;
public class TitleFadeS2CPacket { public net.minecraft.network.packet.s2c.play.TitleFadeS2CPacket wrapperContained; public TitleFadeS2CPacket(net.minecraft.network.packet.s2c.play.TitleFadeS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public int fadeInTicks() { return wrapperContained.fadeInTicks; }
// public int stayTicks() { return wrapperContained.stayTicks; }
// public int fadeOutTicks() { return wrapperContained.fadeOutTicks; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
public int getFadeInTicks() { return wrapperContained.getFadeInTicks(); }
public int getStayTicks() { return wrapperContained.getStayTicks(); }
public int getFadeOutTicks() { return wrapperContained.getFadeOutTicks(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}