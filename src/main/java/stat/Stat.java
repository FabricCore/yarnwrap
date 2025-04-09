package yarnwrap.stat;
public class Stat { public net.minecraft.stat.Stat wrapperContained; public Stat(net.minecraft.stat.Stat wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.stat.StatFormatter formatter() { return new yarnwrap.stat.StatFormatter(wrapperContained.formatter); }
// public java.lang.Object value() { return wrapperContained.value; }
// public yarnwrap.stat.StatType type() { return new yarnwrap.stat.StatType(wrapperContained.type); }
public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
public yarnwrap.stat.StatType getType() { return new yarnwrap.stat.StatType(wrapperContained.getType()); }
public java.lang.String getName(yarnwrap.stat.StatType type,java.lang.Object value) { return wrapperContained.getName(type.wrapperContained,value); }
public java.lang.Object getValue() { return wrapperContained.getValue(); }
// public java.lang.String getName(yarnwrap.util.Identifier id) { return wrapperContained.getName(id.wrapperContained); }
public java.lang.String format(int value) { return wrapperContained.format(value); }

}