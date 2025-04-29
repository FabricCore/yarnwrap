package yarnwrap.util.path;
public class SymlinkValidationException { public net.minecraft.util.path.SymlinkValidationException wrapperContained; public SymlinkValidationException(net.minecraft.util.path.SymlinkValidationException wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.nio.file.Path path() { return wrapperContained.path; }
// public void path(java.nio.file.Path value) { wrapperContained.path = value; }
// public static java.nio.file.Path path() { return net.minecraft.util.path.SymlinkValidationException.path; }
// public static void path(java.nio.file.Path value, ) { net.minecraft.util.path.SymlinkValidationException.path = value; }

// public java.util.List symlinks() { return wrapperContained.symlinks; }
// public void symlinks(java.util.List value) { wrapperContained.symlinks = value; }
// public static java.util.List symlinks() { return net.minecraft.util.path.SymlinkValidationException.symlinks; }
// public static void symlinks(java.util.List value, ) { net.minecraft.util.path.SymlinkValidationException.symlinks = value; }

public SymlinkValidationException(java.nio.file.Path path,java.util.List symlinks) { this.wrapperContained = new net.minecraft.util.path.SymlinkValidationException(path,symlinks); }
// public java.lang.String method_52240(yarnwrap.util.path.SymlinkEntry symlink) { return wrapperContained.method_52240(symlink.wrapperContained); }
// public static java.lang.String method_52240(yarnwrap.util.path.SymlinkEntry symlink, ) { return net.minecraft.util.path.SymlinkValidationException.method_52240(symlink.wrapperContained); }
// public java.lang.String getMessage(java.nio.file.Path path,java.util.List symlinks) { return wrapperContained.getMessage(path,symlinks); }
// public static java.lang.String getMessage(java.nio.file.Path path,java.util.List symlinks, ) { return net.minecraft.util.path.SymlinkValidationException.getMessage(path,symlinks); }

}