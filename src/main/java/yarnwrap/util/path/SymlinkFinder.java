package yarnwrap.util.path;
public class SymlinkFinder { public net.minecraft.util.path.SymlinkFinder wrapperContained; public SymlinkFinder(net.minecraft.util.path.SymlinkFinder wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.nio.file.PathMatcher matcher() { return wrapperContained.matcher; }
// public void matcher(java.nio.file.PathMatcher value) { wrapperContained.matcher = value; }
// public static java.nio.file.PathMatcher matcher() { return net.minecraft.util.path.SymlinkFinder.matcher; }
// public static void matcher(java.nio.file.PathMatcher value, ) { net.minecraft.util.path.SymlinkFinder.matcher = value; }

public SymlinkFinder(java.nio.file.PathMatcher matcher) { this.wrapperContained = new net.minecraft.util.path.SymlinkFinder(matcher); }
// public void validate(java.nio.file.Path path,java.util.List results) { wrapperContained.validate(path,results); }
// public static void validate(java.nio.file.Path path,java.util.List results, ) { net.minecraft.util.path.SymlinkFinder.validate(path,results); }
// public java.util.List collect(java.nio.file.Path path,boolean resolveSymlink) { return wrapperContained.collect(path,resolveSymlink); }
// public static java.util.List collect(java.nio.file.Path path,boolean resolveSymlink, ) { return net.minecraft.util.path.SymlinkFinder.collect(path,resolveSymlink); }
// public java.util.List validate(java.nio.file.Path path) { return wrapperContained.validate(path); }
// public static java.util.List validate(java.nio.file.Path path, ) { return net.minecraft.util.path.SymlinkFinder.validate(path); }
// public void validateRecursively(java.nio.file.Path path,java.util.List results) { wrapperContained.validateRecursively(path,results); }
// public static void validateRecursively(java.nio.file.Path path,java.util.List results, ) { net.minecraft.util.path.SymlinkFinder.validateRecursively(path,results); }

}