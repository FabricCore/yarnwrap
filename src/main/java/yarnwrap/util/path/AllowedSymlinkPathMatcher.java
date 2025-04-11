package yarnwrap.util.path;
public class AllowedSymlinkPathMatcher { public net.minecraft.util.path.AllowedSymlinkPathMatcher wrapperContained; public AllowedSymlinkPathMatcher(net.minecraft.util.path.AllowedSymlinkPathMatcher wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public java.lang.String COMMENT_LINE_PREFIX() { return wrapperContained.COMMENT_LINE_PREFIX; }
// public void COMMENT_LINE_PREFIX(java.lang.String value) { wrapperContained.COMMENT_LINE_PREFIX = value; }
// public java.util.List allowedEntries() { return wrapperContained.allowedEntries; }
// public void allowedEntries(java.util.List value) { wrapperContained.allowedEntries = value; }
// public java.util.Map matcherCache() { return wrapperContained.matcherCache; }
// public void matcherCache(java.util.Map value) { wrapperContained.matcherCache = value; }
public yarnwrap.util.path.AllowedSymlinkPathMatcher fromReader(java.io.BufferedReader reader) { return new yarnwrap.util.path.AllowedSymlinkPathMatcher(wrapperContained.fromReader(reader)); }
public java.nio.file.PathMatcher get(java.nio.file.FileSystem fileSystem) { return wrapperContained.get(fileSystem); }

}