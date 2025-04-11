package yarnwrap.util.logging;
public class LogWriter { public net.minecraft.util.logging.LogWriter wrapperContained; public LogWriter(net.minecraft.util.logging.LogWriter wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.google.gson.Gson GSON() { return wrapperContained.GSON; }
// public void GSON(com.google.gson.Gson value) { wrapperContained.GSON = value; }
// public com.mojang.serialization.Codec codec() { return wrapperContained.codec; }
// public void codec(com.mojang.serialization.Codec value) { wrapperContained.codec = value; }
// public java.nio.channels.FileChannel channel() { return wrapperContained.channel; }
// public void channel(java.nio.channels.FileChannel value) { wrapperContained.channel = value; }
// public java.util.concurrent.atomic.AtomicInteger refCount() { return wrapperContained.refCount; }
// public void refCount(java.util.concurrent.atomic.AtomicInteger value) { wrapperContained.refCount = value; }
public LogWriter(com.mojang.serialization.Codec codec,java.nio.channels.FileChannel channel) { this.wrapperContained = new net.minecraft.util.logging.LogWriter(codec,channel); }
// public yarnwrap.util.logging.LogReader getReader() { return new yarnwrap.util.logging.LogReader(wrapperContained.getReader()); }
// public yarnwrap.util.logging.LogWriter create(com.mojang.serialization.Codec codec,java.nio.file.Path path) { return new yarnwrap.util.logging.LogWriter(wrapperContained.create(codec,path)); }
// public void write(java.lang.Object object) { wrapperContained.write(object); }
// public void closeIfNotReferenced() { wrapperContained.closeIfNotReferenced(); }

}