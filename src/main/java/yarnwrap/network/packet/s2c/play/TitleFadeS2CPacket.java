package yarnwrap.network.packet.s2c.play;
public class TitleFadeS2CPacket { public net.minecraft.network.packet.s2c.play.TitleFadeS2CPacket wrapperContained; public TitleFadeS2CPacket(net.minecraft.network.packet.s2c.play.TitleFadeS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public int fadeInTicks() { return wrapperContained.fadeInTicks; }
// public void fadeInTicks(int value) { wrapperContained.fadeInTicks = value; }
// public int stayTicks() { return wrapperContained.stayTicks; }
// public void stayTicks(int value) { wrapperContained.stayTicks = value; }
// public int fadeOutTicks() { return wrapperContained.fadeOutTicks; }
// public void fadeOutTicks(int value) { wrapperContained.fadeOutTicks = value; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public int getFadeInTicks() { return wrapperContained.getFadeInTicks(); }
public int getStayTicks() { return wrapperContained.getStayTicks(); }
public int getFadeOutTicks() { return wrapperContained.getFadeOutTicks(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}