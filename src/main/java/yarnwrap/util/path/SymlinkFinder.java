package yarnwrap.util.path;
public class SymlinkFinder { public net.minecraft.util.path.SymlinkFinder wrapperContained; public SymlinkFinder(net.minecraft.util.path.SymlinkFinder wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.nio.file.PathMatcher matcher() { return wrapperContained.matcher; }
// public void matcher(java.nio.file.PathMatcher value) { wrapperContained.matcher = value; }
public SymlinkFinder(java.nio.file.PathMatcher matcher) { this.wrapperContained = new net.minecraft.util.path.SymlinkFinder(matcher); }
// public void validate(java.nio.file.Path path,java.util.List results) { wrapperContained.validate(path,results); }
// public java.util.List collect(java.nio.file.Path path,boolean resolveSymlink) { return wrapperContained.collect(path,resolveSymlink); }
// public java.util.List validate(java.nio.file.Path path) { return wrapperContained.validate(path); }
// public void validateRecursively(java.nio.file.Path path,java.util.List results) { wrapperContained.validateRecursively(path,results); }

}