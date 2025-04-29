package yarnwrap.network.packet.s2c.play;
public class ScoreboardObjectiveUpdateS2CPacket { public net.minecraft.network.packet.s2c.play.ScoreboardObjectiveUpdateS2CPacket wrapperContained; public ScoreboardObjectiveUpdateS2CPacket(net.minecraft.network.packet.s2c.play.ScoreboardObjectiveUpdateS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String name() { return wrapperContained.name; }
// public void name(java.lang.String value) { wrapperContained.name = value; }
// public static java.lang.String name() { return net.minecraft.network.packet.s2c.play.ScoreboardObjectiveUpdateS2CPacket.name; }
// public static void name(java.lang.String value, ) { net.minecraft.network.packet.s2c.play.ScoreboardObjectiveUpdateS2CPacket.name = value; }

// public int mode() { return wrapperContained.mode; }
// public void mode(int value) { wrapperContained.mode = value; }
// public static int mode() { return net.minecraft.network.packet.s2c.play.ScoreboardObjectiveUpdateS2CPacket.mode; }
// public static void mode(int value, ) { net.minecraft.network.packet.s2c.play.ScoreboardObjectiveUpdateS2CPacket.mode = value; }

// public yarnwrap.text.Text displayName() { return new yarnwrap.text.Text(wrapperContained.displayName); }
// public void displayName(yarnwrap.text.Text value) { wrapperContained.displayName = value.wrapperContained; }
// public static yarnwrap.text.Text displayName() { return new yarnwrap.text.Text(net.minecraft.network.packet.s2c.play.ScoreboardObjectiveUpdateS2CPacket.displayName); }
// public static void displayName(yarnwrap.text.Text value, ) { net.minecraft.network.packet.s2c.play.ScoreboardObjectiveUpdateS2CPacket.displayName = value.wrapperContained; }

// public Object type() { return wrapperContained.type; }
// // public void type(Object value) { wrapperContained.type = value; }
// // public static Object type() { return net.minecraft.network.packet.s2c.play.ScoreboardObjectiveUpdateS2CPacket.type; }
// // public static void type(Object value, ) { net.minecraft.network.packet.s2c.play.ScoreboardObjectiveUpdateS2CPacket.type = value; }

// public int ADD_MODE() { return wrapperContained.ADD_MODE; }
// public void ADD_MODE(int value) { wrapperContained.ADD_MODE = value; }
public static int ADD_MODE() { return net.minecraft.network.packet.s2c.play.ScoreboardObjectiveUpdateS2CPacket.ADD_MODE; }
// public static void ADD_MODE(int value, ) { net.minecraft.network.packet.s2c.play.ScoreboardObjectiveUpdateS2CPacket.ADD_MODE = value; }

// public int REMOVE_MODE() { return wrapperContained.REMOVE_MODE; }
// public void REMOVE_MODE(int value) { wrapperContained.REMOVE_MODE = value; }
public static int REMOVE_MODE() { return net.minecraft.network.packet.s2c.play.ScoreboardObjectiveUpdateS2CPacket.REMOVE_MODE; }
// public static void REMOVE_MODE(int value, ) { net.minecraft.network.packet.s2c.play.ScoreboardObjectiveUpdateS2CPacket.REMOVE_MODE = value; }

// public int UPDATE_MODE() { return wrapperContained.UPDATE_MODE; }
// public void UPDATE_MODE(int value) { wrapperContained.UPDATE_MODE = value; }
public static int UPDATE_MODE() { return net.minecraft.network.packet.s2c.play.ScoreboardObjectiveUpdateS2CPacket.UPDATE_MODE; }
// public static void UPDATE_MODE(int value, ) { net.minecraft.network.packet.s2c.play.ScoreboardObjectiveUpdateS2CPacket.UPDATE_MODE = value; }

// public java.util.Optional numberFormat() { return wrapperContained.numberFormat; }
// public void numberFormat(java.util.Optional value) { wrapperContained.numberFormat = value; }
// public static java.util.Optional numberFormat() { return net.minecraft.network.packet.s2c.play.ScoreboardObjectiveUpdateS2CPacket.numberFormat; }
// public static void numberFormat(java.util.Optional value, ) { net.minecraft.network.packet.s2c.play.ScoreboardObjectiveUpdateS2CPacket.numberFormat = value; }

// public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.s2c.play.ScoreboardObjectiveUpdateS2CPacket.CODEC); }
// public static void CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.packet.s2c.play.ScoreboardObjectiveUpdateS2CPacket.CODEC = value.wrapperContained; }

public ScoreboardObjectiveUpdateS2CPacket(yarnwrap.scoreboard.ScoreboardObjective objective,int mode) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.ScoreboardObjectiveUpdateS2CPacket(objective.wrapperContained,mode); }
// public ScoreboardObjectiveUpdateS2CPacket(yarnwrap.network.RegistryByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.ScoreboardObjectiveUpdateS2CPacket(buf.wrapperContained); }
public java.lang.String getName() { return wrapperContained.getName(); }
// public static java.lang.String getName() { return net.minecraft.network.packet.s2c.play.ScoreboardObjectiveUpdateS2CPacket.getName(); }
public yarnwrap.text.Text getDisplayName() { return new yarnwrap.text.Text(wrapperContained.getDisplayName()); }
// public static yarnwrap.text.Text getDisplayName() { return new yarnwrap.text.Text(net.minecraft.network.packet.s2c.play.ScoreboardObjectiveUpdateS2CPacket.getDisplayName()); }
public int getMode() { return wrapperContained.getMode(); }
// public static int getMode() { return net.minecraft.network.packet.s2c.play.ScoreboardObjectiveUpdateS2CPacket.getMode(); }
public Object getType() { return wrapperContained.getType(); }
// public static Object getType() { return net.minecraft.network.packet.s2c.play.ScoreboardObjectiveUpdateS2CPacket.getType(); }
public java.util.Optional getNumberFormat() { return wrapperContained.getNumberFormat(); }
// public static java.util.Optional getNumberFormat() { return net.minecraft.network.packet.s2c.play.ScoreboardObjectiveUpdateS2CPacket.getNumberFormat(); }
// public void write(yarnwrap.network.RegistryByteBuf buf) { wrapperContained.write(buf.wrapperContained); }
// public static void write(yarnwrap.network.RegistryByteBuf buf, ) { net.minecraft.network.packet.s2c.play.ScoreboardObjectiveUpdateS2CPacket.write(buf.wrapperContained); }

}