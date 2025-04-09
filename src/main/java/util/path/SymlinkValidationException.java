package yarnwrap.util.path;
public class SymlinkValidationException { public net.minecraft.util.path.SymlinkValidationException wrapperContained; public SymlinkValidationException(net.minecraft.util.path.SymlinkValidationException wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.nio.file.Path path() { return wrapperContained.path; }
// public java.util.List symlinks() { return wrapperContained.symlinks; }
public java.lang.String getMessage(java.nio.file.Path path,java.util.List symlinks) { return wrapperContained.getMessage(path,symlinks); }

}