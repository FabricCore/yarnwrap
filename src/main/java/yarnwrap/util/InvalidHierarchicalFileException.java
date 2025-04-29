package yarnwrap.util;
public class InvalidHierarchicalFileException { public net.minecraft.util.InvalidHierarchicalFileException wrapperContained; public InvalidHierarchicalFileException(net.minecraft.util.InvalidHierarchicalFileException wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List invalidFiles() { return wrapperContained.invalidFiles; }
// public void invalidFiles(java.util.List value) { wrapperContained.invalidFiles = value; }
// public static java.util.List invalidFiles() { return net.minecraft.util.InvalidHierarchicalFileException.invalidFiles; }
// public static void invalidFiles(java.util.List value, ) { net.minecraft.util.InvalidHierarchicalFileException.invalidFiles = value; }

// public java.lang.String message() { return wrapperContained.message; }
// public void message(java.lang.String value) { wrapperContained.message = value; }
// public static java.lang.String message() { return net.minecraft.util.InvalidHierarchicalFileException.message; }
// public static void message(java.lang.String value, ) { net.minecraft.util.InvalidHierarchicalFileException.message = value; }

public InvalidHierarchicalFileException(java.lang.String message) { this.wrapperContained = new net.minecraft.util.InvalidHierarchicalFileException(message); }
public InvalidHierarchicalFileException(java.lang.String message,java.lang.Throwable cause) { this.wrapperContained = new net.minecraft.util.InvalidHierarchicalFileException(message,cause); }
public void addInvalidKey(java.lang.String key) { wrapperContained.addInvalidKey(key); }
// public static void addInvalidKey(java.lang.String key, ) { net.minecraft.util.InvalidHierarchicalFileException.addInvalidKey(key); }
public void addInvalidFile(java.lang.String fileName) { wrapperContained.addInvalidFile(fileName); }
// public static void addInvalidFile(java.lang.String fileName, ) { net.minecraft.util.InvalidHierarchicalFileException.addInvalidFile(fileName); }
// public yarnwrap.util.InvalidHierarchicalFileException wrap(java.lang.Exception cause) { return new yarnwrap.util.InvalidHierarchicalFileException(wrapperContained.wrap(cause)); }
// public static yarnwrap.util.InvalidHierarchicalFileException wrap(java.lang.Exception cause, ) { return new yarnwrap.util.InvalidHierarchicalFileException(net.minecraft.util.InvalidHierarchicalFileException.wrap(cause)); }

}