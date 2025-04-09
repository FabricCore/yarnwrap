package yarnwrap.util;
public class ZipCompressor { public net.minecraft.util.ZipCompressor wrapperContained; public ZipCompressor(net.minecraft.util.ZipCompressor wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public java.nio.file.Path file() { return wrapperContained.file; }
// public java.nio.file.Path temp() { return wrapperContained.temp; }
// public java.nio.file.FileSystem zip() { return wrapperContained.zip; }
public void copyAll(java.nio.file.Path source) { wrapperContained.copyAll(source); }
public void copy(java.nio.file.Path target,java.io.File source) { wrapperContained.copy(target,source); }
public void write(java.nio.file.Path target,java.lang.String content) { wrapperContained.write(target,content); }

}