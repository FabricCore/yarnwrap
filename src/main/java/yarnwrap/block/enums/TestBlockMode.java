package yarnwrap.block.enums;
public class TestBlockMode { public net.minecraft.block.enums.TestBlockMode wrapperContained; public TestBlockMode(net.minecraft.block.enums.TestBlockMode wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.block.enums.TestBlockMode.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.block.enums.TestBlockMode.CODEC = value; }

// public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.block.enums.TestBlockMode.PACKET_CODEC); }
// public static void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.block.enums.TestBlockMode.PACKET_CODEC = value.wrapperContained; }

// public java.util.function.IntFunction INDEX_MAPPER() { return wrapperContained.INDEX_MAPPER; }
// public void INDEX_MAPPER(java.util.function.IntFunction value) { wrapperContained.INDEX_MAPPER = value; }
// public static java.util.function.IntFunction INDEX_MAPPER() { return net.minecraft.block.enums.TestBlockMode.INDEX_MAPPER; }
// public static void INDEX_MAPPER(java.util.function.IntFunction value, ) { net.minecraft.block.enums.TestBlockMode.INDEX_MAPPER = value; }

// public int index() { return wrapperContained.index; }
// public void index(int value) { wrapperContained.index = value; }
// public static int index() { return net.minecraft.block.enums.TestBlockMode.index; }
// public static void index(int value, ) { net.minecraft.block.enums.TestBlockMode.index = value; }

// public java.lang.String id() { return wrapperContained.id; }
// public void id(java.lang.String value) { wrapperContained.id = value; }
// public static java.lang.String id() { return net.minecraft.block.enums.TestBlockMode.id; }
// public static void id(java.lang.String value, ) { net.minecraft.block.enums.TestBlockMode.id = value; }

// public yarnwrap.text.Text name() { return new yarnwrap.text.Text(wrapperContained.name); }
// public void name(yarnwrap.text.Text value) { wrapperContained.name = value.wrapperContained; }
// public static yarnwrap.text.Text name() { return new yarnwrap.text.Text(net.minecraft.block.enums.TestBlockMode.name); }
// public static void name(yarnwrap.text.Text value, ) { net.minecraft.block.enums.TestBlockMode.name = value.wrapperContained; }

// public yarnwrap.text.Text info() { return new yarnwrap.text.Text(wrapperContained.info); }
// public void info(yarnwrap.text.Text value) { wrapperContained.info = value.wrapperContained; }
// public static yarnwrap.text.Text info() { return new yarnwrap.text.Text(net.minecraft.block.enums.TestBlockMode.info); }
// public static void info(yarnwrap.text.Text value, ) { net.minecraft.block.enums.TestBlockMode.info = value.wrapperContained; }

// // public TestBlockMode(java.lang.String index,int id) { this.wrapperContained = new net.minecraft.block.enums.TestBlockMode(index,id); }
public yarnwrap.text.Text getName() { return new yarnwrap.text.Text(wrapperContained.getName()); }
// public static yarnwrap.text.Text getName() { return new yarnwrap.text.Text(net.minecraft.block.enums.TestBlockMode.getName()); }
// public int method_66782(yarnwrap.block.enums.TestBlockMode mode) { return wrapperContained.method_66782(mode.wrapperContained); }
// public static int method_66782(yarnwrap.block.enums.TestBlockMode mode, ) { return net.minecraft.block.enums.TestBlockMode.method_66782(mode.wrapperContained); }
public yarnwrap.text.Text getInfo() { return new yarnwrap.text.Text(wrapperContained.getInfo()); }
// public static yarnwrap.text.Text getInfo() { return new yarnwrap.text.Text(net.minecraft.block.enums.TestBlockMode.getInfo()); }
// public int method_66784(yarnwrap.block.enums.TestBlockMode mode) { return wrapperContained.method_66784(mode.wrapperContained); }
// public static int method_66784(yarnwrap.block.enums.TestBlockMode mode, ) { return net.minecraft.block.enums.TestBlockMode.method_66784(mode.wrapperContained); }

}