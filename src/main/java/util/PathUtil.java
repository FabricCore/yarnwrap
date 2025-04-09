package yarnwrap.util;
public class PathUtil { public net.minecraft.util.PathUtil wrapperContained; public PathUtil(net.minecraft.util.PathUtil wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.regex.Pattern RESERVED_WINDOWS_NAMES() { return wrapperContained.RESERVED_WINDOWS_NAMES; }
// public java.util.regex.Pattern FILE_NAME_WITH_COUNT() { return wrapperContained.FILE_NAME_WITH_COUNT; }
// public int MAX_NAME_LENGTH() { return wrapperContained.MAX_NAME_LENGTH; }
// public java.util.regex.Pattern VALID_FILE_NAME() { return wrapperContained.VALID_FILE_NAME; }
// public java.lang.String getNextUniqueName(java.nio.file.Path path,java.lang.String name,java.lang.String extension) { return wrapperContained.getNextUniqueName(path,name,extension); }
public boolean isNormal(java.nio.file.Path path) { return wrapperContained.isNormal(path); }
public boolean isAllowedName(java.nio.file.Path path) { return wrapperContained.isAllowedName(path); }
public java.nio.file.Path getResourcePath(java.nio.file.Path path,java.lang.String resourceName,java.lang.String extension) { return wrapperContained.getResourcePath(path,resourceName,extension); }
public java.lang.String getPosixFullPath(java.lang.String path) { return wrapperContained.getPosixFullPath(path); }
public java.lang.String normalizeToPosix(java.lang.String path) { return wrapperContained.normalizeToPosix(path); }
public java.nio.file.Path getPath(java.nio.file.Path root,java.util.List paths) { return wrapperContained.getPath(root,paths); }
public void validatePath(java.lang.String[] paths) { wrapperContained.validatePath(paths); }
public com.mojang.serialization.DataResult split(java.lang.String path) { return wrapperContained.split(path); }
public boolean isFileNameValid(java.lang.String name) { return wrapperContained.isFileNameValid(name); }
// public void createDirectories(java.nio.file.Path path) { wrapperContained.createDirectories(path); }
public java.lang.String replaceInvalidChars(java.lang.String fileName) { return wrapperContained.replaceInvalidChars(fileName); }

}