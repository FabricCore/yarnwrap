package yarnwrap.network.packet.s2c.play;
public class PositionFlag { public net.minecraft.network.packet.s2c.play.PositionFlag wrapperContained; public PositionFlag(net.minecraft.network.packet.s2c.play.PositionFlag wrapperContained) { this.wrapperContained = wrapperContained; }

// public int shift() { return wrapperContained.shift; }
// public void shift(int value) { wrapperContained.shift = value; }
public java.util.Set VALUES() { return wrapperContained.VALUES; }
// public void VALUES(java.util.Set value) { wrapperContained.VALUES = value; }
public java.util.Set ROT() { return wrapperContained.ROT; }
// public void ROT(java.util.Set value) { wrapperContained.ROT = value; }
public int getBitfield(java.util.Set flags) { return wrapperContained.getBitfield(flags); }
// public int getMask() { return wrapperContained.getMask(); }
// public boolean isSet(int mask) { return wrapperContained.isSet(mask); }
public java.util.Set getFlags(int mask) { return wrapperContained.getFlags(mask); }

}