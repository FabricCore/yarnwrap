package yarnwrap.util.path;
public class AllowedSymlinkPathMatcher { public net.minecraft.util.path.AllowedSymlinkPathMatcher wrapperContained; public AllowedSymlinkPathMatcher(net.minecraft.util.path.AllowedSymlinkPathMatcher wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public java.lang.String COMMENT_LINE_PREFIX() { return wrapperContained.COMMENT_LINE_PREFIX; }
// public java.util.List allowedEntries() { return wrapperContained.allowedEntries; }
// public java.util.Map matcherCache() { return wrapperContained.matcherCache; }
public yarnwrap.util.path.AllowedSymlinkPathMatcher fromReader(java.io.BufferedReader reader) { return new yarnwrap.util.path.AllowedSymlinkPathMatcher(wrapperContained.fromReader(reader)); }
public java.nio.file.PathMatcher get(java.nio.file.FileSystem fileSystem) { return wrapperContained.get(fileSystem); }

}