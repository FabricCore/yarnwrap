package yarnwrap.network.packet.s2c.play;
public class ScoreboardObjectiveUpdateS2CPacket { public net.minecraft.network.packet.s2c.play.ScoreboardObjectiveUpdateS2CPacket wrapperContained; public ScoreboardObjectiveUpdateS2CPacket(net.minecraft.network.packet.s2c.play.ScoreboardObjectiveUpdateS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String name() { return wrapperContained.name; }
// public int mode() { return wrapperContained.mode; }
// public yarnwrap.text.Text displayName() { return new yarnwrap.text.Text(wrapperContained.displayName); }
// public Object type() { return wrapperContained.type; }
public int ADD_MODE() { return wrapperContained.ADD_MODE; }
public int REMOVE_MODE() { return wrapperContained.REMOVE_MODE; }
public int UPDATE_MODE() { return wrapperContained.UPDATE_MODE; }
// public java.util.Optional numberFormat() { return wrapperContained.numberFormat; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
public java.lang.String getName() { return wrapperContained.getName(); }
public yarnwrap.text.Text getDisplayName() { return new yarnwrap.text.Text(wrapperContained.getDisplayName()); }
public int getMode() { return wrapperContained.getMode(); }
public Object getType() { return wrapperContained.getType(); }
public java.util.Optional getNumberFormat() { return wrapperContained.getNumberFormat(); }
// public void write(yarnwrap.network.RegistryByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}