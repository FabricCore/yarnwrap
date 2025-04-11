package yarnwrap.network.packet.s2c.play;
public class ScoreboardObjectiveUpdateS2CPacket { public net.minecraft.network.packet.s2c.play.ScoreboardObjectiveUpdateS2CPacket wrapperContained; public ScoreboardObjectiveUpdateS2CPacket(net.minecraft.network.packet.s2c.play.ScoreboardObjectiveUpdateS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String name() { return wrapperContained.name; }
// public void name(java.lang.String value) { wrapperContained.name = value; }
// public int mode() { return wrapperContained.mode; }
// public void mode(int value) { wrapperContained.mode = value; }
// public yarnwrap.text.Text displayName() { return new yarnwrap.text.Text(wrapperContained.displayName); }
// public void displayName(yarnwrap.text.Text value) { wrapperContained.displayName = value.wrapperContained; }
// public Object type() { return wrapperContained.type; }
// // public void type(Object value) { wrapperContained.type = value; }
public int ADD_MODE() { return wrapperContained.ADD_MODE; }
// public void ADD_MODE(int value) { wrapperContained.ADD_MODE = value; }
public int REMOVE_MODE() { return wrapperContained.REMOVE_MODE; }
// public void REMOVE_MODE(int value) { wrapperContained.REMOVE_MODE = value; }
public int UPDATE_MODE() { return wrapperContained.UPDATE_MODE; }
// public void UPDATE_MODE(int value) { wrapperContained.UPDATE_MODE = value; }
// public java.util.Optional numberFormat() { return wrapperContained.numberFormat; }
// public void numberFormat(java.util.Optional value) { wrapperContained.numberFormat = value; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public ScoreboardObjectiveUpdateS2CPacket(yarnwrap.scoreboard.ScoreboardObjective objective,int mode) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.ScoreboardObjectiveUpdateS2CPacket(objective.wrapperContained,mode); }
// public ScoreboardObjectiveUpdateS2CPacket(yarnwrap.network.RegistryByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.ScoreboardObjectiveUpdateS2CPacket(buf.wrapperContained); }
public java.lang.String getName() { return wrapperContained.getName(); }
public yarnwrap.text.Text getDisplayName() { return new yarnwrap.text.Text(wrapperContained.getDisplayName()); }
public int getMode() { return wrapperContained.getMode(); }
public Object getType() { return wrapperContained.getType(); }
public java.util.Optional getNumberFormat() { return wrapperContained.getNumberFormat(); }
// public void write(yarnwrap.network.RegistryByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}