package yarnwrap.util;
public class InvalidHierarchicalFileException { public net.minecraft.util.InvalidHierarchicalFileException wrapperContained; public InvalidHierarchicalFileException(net.minecraft.util.InvalidHierarchicalFileException wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List invalidFiles() { return wrapperContained.invalidFiles; }
// public void invalidFiles(java.util.List value) { wrapperContained.invalidFiles = value; }
// public java.lang.String message() { return wrapperContained.message; }
// public void message(java.lang.String value) { wrapperContained.message = value; }
public void addInvalidKey(java.lang.String key) { wrapperContained.addInvalidKey(key); }
public void addInvalidFile(java.lang.String fileName) { wrapperContained.addInvalidFile(fileName); }
public yarnwrap.util.InvalidHierarchicalFileException wrap(java.lang.Exception cause) { return new yarnwrap.util.InvalidHierarchicalFileException(wrapperContained.wrap(cause)); }

}