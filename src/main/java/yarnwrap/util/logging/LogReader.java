package yarnwrap.util.logging;
public class LogReader { public net.minecraft.util.logging.LogReader wrapperContained; public LogReader(net.minecraft.util.logging.LogReader wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.Object read() { return wrapperContained.read(); }
// public static java.lang.Object read() { return net.minecraft.util.logging.LogReader.read(); }
// public yarnwrap.util.logging.LogReader create(com.mojang.serialization.Codec codec,java.io.Reader reader) { return new yarnwrap.util.logging.LogReader(wrapperContained.create(codec,reader)); }
// public static yarnwrap.util.logging.LogReader create(com.mojang.serialization.Codec codec,java.io.Reader reader, ) { return new yarnwrap.util.logging.LogReader(net.minecraft.util.logging.LogReader.create(codec,reader)); }

}