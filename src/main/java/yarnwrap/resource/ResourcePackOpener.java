package yarnwrap.resource;
public class ResourcePackOpener { public net.minecraft.resource.ResourcePackOpener wrapperContained; public ResourcePackOpener(net.minecraft.resource.ResourcePackOpener wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.path.SymlinkFinder symlinkFinder() { return new yarnwrap.util.path.SymlinkFinder(wrapperContained.symlinkFinder); }
// public void symlinkFinder(yarnwrap.util.path.SymlinkFinder value) { wrapperContained.symlinkFinder = value.wrapperContained; }
// public ResourcePackOpener(yarnwrap.util.path.SymlinkFinder symlinkFinder) { this.wrapperContained = new net.minecraft.resource.ResourcePackOpener(symlinkFinder.wrapperContained); }
// public java.lang.Object openDirectory(java.nio.file.Path path) { return wrapperContained.openDirectory(path); }
// public java.lang.Object openZip(java.nio.file.Path path) { return wrapperContained.openZip(path); }
// public java.lang.Object open(java.nio.file.Path path,java.util.List foundSymlinks) { return wrapperContained.open(path,foundSymlinks); }

}