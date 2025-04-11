package yarnwrap.util;
public class ZipCompressor { public net.minecraft.util.ZipCompressor wrapperContained; public ZipCompressor(net.minecraft.util.ZipCompressor wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public java.nio.file.Path file() { return wrapperContained.file; }
// public void file(java.nio.file.Path value) { wrapperContained.file = value; }
// public java.nio.file.Path temp() { return wrapperContained.temp; }
// public void temp(java.nio.file.Path value) { wrapperContained.temp = value; }
// public java.nio.file.FileSystem zip() { return wrapperContained.zip; }
// public void zip(java.nio.file.FileSystem value) { wrapperContained.zip = value; }
public void copyAll(java.nio.file.Path source) { wrapperContained.copyAll(source); }
public void copy(java.nio.file.Path target,java.io.File source) { wrapperContained.copy(target,source); }
public void write(java.nio.file.Path target,java.lang.String content) { wrapperContained.write(target,content); }

}