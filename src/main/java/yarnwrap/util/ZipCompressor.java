package yarnwrap.util;
public class ZipCompressor { public net.minecraft.util.ZipCompressor wrapperContained; public ZipCompressor(net.minecraft.util.ZipCompressor wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.util.ZipCompressor.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.util.ZipCompressor.LOGGER = value; }

// public java.nio.file.Path file() { return wrapperContained.file; }
// public void file(java.nio.file.Path value) { wrapperContained.file = value; }
// public static java.nio.file.Path file() { return net.minecraft.util.ZipCompressor.file; }
// public static void file(java.nio.file.Path value, ) { net.minecraft.util.ZipCompressor.file = value; }

// public java.nio.file.Path temp() { return wrapperContained.temp; }
// public void temp(java.nio.file.Path value) { wrapperContained.temp = value; }
// public static java.nio.file.Path temp() { return net.minecraft.util.ZipCompressor.temp; }
// public static void temp(java.nio.file.Path value, ) { net.minecraft.util.ZipCompressor.temp = value; }

// public java.nio.file.FileSystem zip() { return wrapperContained.zip; }
// public void zip(java.nio.file.FileSystem value) { wrapperContained.zip = value; }
// public static java.nio.file.FileSystem zip() { return net.minecraft.util.ZipCompressor.zip; }
// public static void zip(java.nio.file.FileSystem value, ) { net.minecraft.util.ZipCompressor.zip = value; }

public ZipCompressor(java.nio.file.Path file) { this.wrapperContained = new net.minecraft.util.ZipCompressor(file); }
public void copyAll(java.nio.file.Path source) { wrapperContained.copyAll(source); }
// public static void copyAll(java.nio.file.Path source, ) { net.minecraft.util.ZipCompressor.copyAll(source); }
public void copy(java.nio.file.Path target,java.io.File source) { wrapperContained.copy(target,source); }
// public static void copy(java.nio.file.Path target,java.io.File source, ) { net.minecraft.util.ZipCompressor.copy(target,source); }
public void write(java.nio.file.Path target,java.lang.String content) { wrapperContained.write(target,content); }
// public static void write(java.nio.file.Path target,java.lang.String content, ) { net.minecraft.util.ZipCompressor.write(target,content); }
// public boolean method_37164(java.nio.file.Path path,java.nio.file.attribute.BasicFileAttributes attributes) { return wrapperContained.method_37164(path,attributes); }
// public static boolean method_37164(java.nio.file.Path path,java.nio.file.attribute.BasicFileAttributes attributes, ) { return net.minecraft.util.ZipCompressor.method_37164(path,attributes); }

}