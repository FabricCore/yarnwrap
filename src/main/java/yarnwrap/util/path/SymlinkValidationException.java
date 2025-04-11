package yarnwrap.util.path;
public class SymlinkValidationException { public net.minecraft.util.path.SymlinkValidationException wrapperContained; public SymlinkValidationException(net.minecraft.util.path.SymlinkValidationException wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.nio.file.Path path() { return wrapperContained.path; }
// public void path(java.nio.file.Path value) { wrapperContained.path = value; }
// public java.util.List symlinks() { return wrapperContained.symlinks; }
// public void symlinks(java.util.List value) { wrapperContained.symlinks = value; }
public java.lang.String getMessage(java.nio.file.Path path,java.util.List symlinks) { return wrapperContained.getMessage(path,symlinks); }

}