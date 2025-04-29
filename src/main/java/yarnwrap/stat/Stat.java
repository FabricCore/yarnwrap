package yarnwrap.stat;
public class Stat { public net.minecraft.stat.Stat wrapperContained; public Stat(net.minecraft.stat.Stat wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.stat.StatFormatter formatter() { return new yarnwrap.stat.StatFormatter(wrapperContained.formatter); }
// public void formatter(yarnwrap.stat.StatFormatter value) { wrapperContained.formatter = value.wrapperContained; }
// public static yarnwrap.stat.StatFormatter formatter() { return new yarnwrap.stat.StatFormatter(net.minecraft.stat.Stat.formatter); }
// public static void formatter(yarnwrap.stat.StatFormatter value, ) { net.minecraft.stat.Stat.formatter = value.wrapperContained; }

// public java.lang.Object value() { return wrapperContained.value; }
// public void value(java.lang.Object value) { wrapperContained.value = value; }
// // public static java.lang.Object value() { return net.minecraft.stat.Stat.value; }
// public static void value(java.lang.Object value, ) { net.minecraft.stat.Stat.value = value; }

// public yarnwrap.stat.StatType type() { return new yarnwrap.stat.StatType(wrapperContained.type); }
// public void type(yarnwrap.stat.StatType value) { wrapperContained.type = value.wrapperContained; }
// public static yarnwrap.stat.StatType type() { return new yarnwrap.stat.StatType(net.minecraft.stat.Stat.type); }
// public static void type(yarnwrap.stat.StatType value, ) { net.minecraft.stat.Stat.type = value.wrapperContained; }

// public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.stat.Stat.PACKET_CODEC); }
// public static void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.stat.Stat.PACKET_CODEC = value.wrapperContained; }

// public Stat(yarnwrap.stat.StatType type,java.lang.Object value,yarnwrap.stat.StatFormatter formatter) { this.wrapperContained = new net.minecraft.stat.Stat(type.wrapperContained,value,formatter.wrapperContained); }
public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
// public static boolean equals(java.lang.Object o, ) { return net.minecraft.stat.Stat.equals(o); }
public yarnwrap.stat.StatType getType() { return new yarnwrap.stat.StatType(wrapperContained.getType()); }
// public static yarnwrap.stat.StatType getType() { return new yarnwrap.stat.StatType(net.minecraft.stat.Stat.getType()); }
// public java.lang.String getName(yarnwrap.stat.StatType type,java.lang.Object value) { return wrapperContained.getName(type.wrapperContained,value); }
// public static java.lang.String getName(yarnwrap.stat.StatType type,java.lang.Object value, ) { return net.minecraft.stat.Stat.getName(type.wrapperContained,value); }
public java.lang.Object getValue() { return wrapperContained.getValue(); }
// public static java.lang.Object getValue() { return net.minecraft.stat.Stat.getValue(); }
// public java.lang.String getName(yarnwrap.util.Identifier id) { return wrapperContained.getName(id.wrapperContained); }
// public static java.lang.String getName(yarnwrap.util.Identifier id, ) { return net.minecraft.stat.Stat.getName(id.wrapperContained); }
public java.lang.String format(int value) { return wrapperContained.format(value); }
// public static java.lang.String format(int value, ) { return net.minecraft.stat.Stat.format(value); }

}