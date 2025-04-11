package yarnwrap.network.packet.s2c.play;
public class OpenScreenS2CPacket { public net.minecraft.network.packet.s2c.play.OpenScreenS2CPacket wrapperContained; public OpenScreenS2CPacket(net.minecraft.network.packet.s2c.play.OpenScreenS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public int syncId() { return wrapperContained.syncId; }
// public void syncId(int value) { wrapperContained.syncId = value; }
// public yarnwrap.screen.ScreenHandlerType screenHandlerId() { return new yarnwrap.screen.ScreenHandlerType(wrapperContained.screenHandlerId); }
// public void screenHandlerId(yarnwrap.screen.ScreenHandlerType value) { wrapperContained.screenHandlerId = value.wrapperContained; }
// public yarnwrap.text.Text name() { return new yarnwrap.text.Text(wrapperContained.name); }
// public void name(yarnwrap.text.Text value) { wrapperContained.name = value.wrapperContained; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public int getSyncId() { return wrapperContained.getSyncId(); }
public yarnwrap.screen.ScreenHandlerType getScreenHandlerType() { return new yarnwrap.screen.ScreenHandlerType(wrapperContained.getScreenHandlerType()); }
public yarnwrap.text.Text getName() { return new yarnwrap.text.Text(wrapperContained.getName()); }

}