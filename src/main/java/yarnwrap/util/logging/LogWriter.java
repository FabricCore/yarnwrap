package yarnwrap.util.logging;
public class LogWriter { public net.minecraft.util.logging.LogWriter wrapperContained; public LogWriter(net.minecraft.util.logging.LogWriter wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.google.gson.Gson GSON() { return wrapperContained.GSON; }
// public void GSON(com.google.gson.Gson value) { wrapperContained.GSON = value; }
// public static com.google.gson.Gson GSON() { return net.minecraft.util.logging.LogWriter.GSON; }
// public static void GSON(com.google.gson.Gson value, ) { net.minecraft.util.logging.LogWriter.GSON = value; }

// public com.mojang.serialization.Codec codec() { return wrapperContained.codec; }
// public void codec(com.mojang.serialization.Codec value) { wrapperContained.codec = value; }
// public static com.mojang.serialization.Codec codec() { return net.minecraft.util.logging.LogWriter.codec; }
// public static void codec(com.mojang.serialization.Codec value, ) { net.minecraft.util.logging.LogWriter.codec = value; }

// public java.nio.channels.FileChannel channel() { return wrapperContained.channel; }
// public void channel(java.nio.channels.FileChannel value) { wrapperContained.channel = value; }
// public static java.nio.channels.FileChannel channel() { return net.minecraft.util.logging.LogWriter.channel; }
// public static void channel(java.nio.channels.FileChannel value, ) { net.minecraft.util.logging.LogWriter.channel = value; }

// public java.util.concurrent.atomic.AtomicInteger refCount() { return wrapperContained.refCount; }
// public void refCount(java.util.concurrent.atomic.AtomicInteger value) { wrapperContained.refCount = value; }
// public static java.util.concurrent.atomic.AtomicInteger refCount() { return net.minecraft.util.logging.LogWriter.refCount; }
// public static void refCount(java.util.concurrent.atomic.AtomicInteger value, ) { net.minecraft.util.logging.LogWriter.refCount = value; }

public LogWriter(com.mojang.serialization.Codec codec,java.nio.channels.FileChannel channel) { this.wrapperContained = new net.minecraft.util.logging.LogWriter(codec,channel); }
// public yarnwrap.util.logging.LogReader getReader() { return new yarnwrap.util.logging.LogReader(wrapperContained.getReader()); }
// public static yarnwrap.util.logging.LogReader getReader() { return new yarnwrap.util.logging.LogReader(net.minecraft.util.logging.LogWriter.getReader()); }
// public yarnwrap.util.logging.LogWriter create(com.mojang.serialization.Codec codec,java.nio.file.Path path) { return new yarnwrap.util.logging.LogWriter(wrapperContained.create(codec,path)); }
// public static yarnwrap.util.logging.LogWriter create(com.mojang.serialization.Codec codec,java.nio.file.Path path, ) { return new yarnwrap.util.logging.LogWriter(net.minecraft.util.logging.LogWriter.create(codec,path)); }
// public void write(java.lang.Object object) { wrapperContained.write(object); }
// public static void write(java.lang.Object object, ) { net.minecraft.util.logging.LogWriter.write(object); }
// public void closeIfNotReferenced() { wrapperContained.closeIfNotReferenced(); }
// public static void closeIfNotReferenced() { net.minecraft.util.logging.LogWriter.closeIfNotReferenced(); }

}