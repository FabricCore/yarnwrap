package yarnwrap.util.logging;
public class LogWriter { public net.minecraft.util.logging.LogWriter wrapperContained; public LogWriter(net.minecraft.util.logging.LogWriter wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.google.gson.Gson GSON() { return wrapperContained.GSON; }
// public com.mojang.serialization.Codec codec() { return wrapperContained.codec; }
// public java.nio.channels.FileChannel channel() { return wrapperContained.channel; }
// public java.util.concurrent.atomic.AtomicInteger refCount() { return wrapperContained.refCount; }
// public yarnwrap.util.logging.LogReader getReader() { return new yarnwrap.util.logging.LogReader(wrapperContained.getReader()); }
// public yarnwrap.util.logging.LogWriter create(com.mojang.serialization.Codec codec,java.nio.file.Path path) { return new yarnwrap.util.logging.LogWriter(wrapperContained.create(codec,path)); }
// public void write(java.lang.Object object) { wrapperContained.write(object); }
// public void closeIfNotReferenced() { wrapperContained.closeIfNotReferenced(); }

}