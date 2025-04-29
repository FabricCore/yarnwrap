package yarnwrap.util.path;
public class AllowedSymlinkPathMatcher { public net.minecraft.util.path.AllowedSymlinkPathMatcher wrapperContained; public AllowedSymlinkPathMatcher(net.minecraft.util.path.AllowedSymlinkPathMatcher wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.util.path.AllowedSymlinkPathMatcher.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.util.path.AllowedSymlinkPathMatcher.LOGGER = value; }

// public java.lang.String COMMENT_LINE_PREFIX() { return wrapperContained.COMMENT_LINE_PREFIX; }
// public void COMMENT_LINE_PREFIX(java.lang.String value) { wrapperContained.COMMENT_LINE_PREFIX = value; }
// public static java.lang.String COMMENT_LINE_PREFIX() { return net.minecraft.util.path.AllowedSymlinkPathMatcher.COMMENT_LINE_PREFIX; }
// public static void COMMENT_LINE_PREFIX(java.lang.String value, ) { net.minecraft.util.path.AllowedSymlinkPathMatcher.COMMENT_LINE_PREFIX = value; }

// public java.util.List allowedEntries() { return wrapperContained.allowedEntries; }
// public void allowedEntries(java.util.List value) { wrapperContained.allowedEntries = value; }
// public static java.util.List allowedEntries() { return net.minecraft.util.path.AllowedSymlinkPathMatcher.allowedEntries; }
// public static void allowedEntries(java.util.List value, ) { net.minecraft.util.path.AllowedSymlinkPathMatcher.allowedEntries = value; }

// public java.util.Map matcherCache() { return wrapperContained.matcherCache; }
// public void matcherCache(java.util.Map value) { wrapperContained.matcherCache = value; }
// public static java.util.Map matcherCache() { return net.minecraft.util.path.AllowedSymlinkPathMatcher.matcherCache; }
// public static void matcherCache(java.util.Map value, ) { net.minecraft.util.path.AllowedSymlinkPathMatcher.matcherCache = value; }

public AllowedSymlinkPathMatcher(java.util.List allowedEntries) { this.wrapperContained = new net.minecraft.util.path.AllowedSymlinkPathMatcher(allowedEntries); }
public boolean matches(java.nio.file.Path path) { return wrapperContained.matches(path); }
// public static boolean matches(java.nio.file.Path path, ) { return net.minecraft.util.path.AllowedSymlinkPathMatcher.matches(path); }
// public yarnwrap.util.path.AllowedSymlinkPathMatcher fromReader(java.io.BufferedReader reader) { return new yarnwrap.util.path.AllowedSymlinkPathMatcher(wrapperContained.fromReader(reader)); }
// public static yarnwrap.util.path.AllowedSymlinkPathMatcher fromReader(java.io.BufferedReader reader, ) { return new yarnwrap.util.path.AllowedSymlinkPathMatcher(net.minecraft.util.path.AllowedSymlinkPathMatcher.fromReader(reader)); }
// public java.util.stream.Stream method_52248(java.lang.String line) { return wrapperContained.method_52248(line); }
// public static java.util.stream.Stream method_52248(java.lang.String line, ) { return net.minecraft.util.path.AllowedSymlinkPathMatcher.method_52248(line); }
public java.nio.file.PathMatcher get(java.nio.file.FileSystem fileSystem) { return wrapperContained.get(fileSystem); }
// public static java.nio.file.PathMatcher get(java.nio.file.FileSystem fileSystem, ) { return net.minecraft.util.path.AllowedSymlinkPathMatcher.get(fileSystem); }
// public java.nio.file.PathMatcher method_52250(java.nio.file.FileSystem entry) { return wrapperContained.method_52250(entry); }
// public static java.nio.file.PathMatcher method_52250(java.nio.file.FileSystem entry, ) { return net.minecraft.util.path.AllowedSymlinkPathMatcher.method_52250(entry); }
// public java.nio.file.PathMatcher method_52251(java.nio.file.FileSystem scheme) { return wrapperContained.method_52251(scheme); }
// public static java.nio.file.PathMatcher method_52251(java.nio.file.FileSystem scheme, ) { return net.minecraft.util.path.AllowedSymlinkPathMatcher.method_52251(scheme); }
// public boolean method_52252(java.nio.file.Path path) { return wrapperContained.method_52252(path); }
// public static boolean method_52252(java.nio.file.Path path, ) { return net.minecraft.util.path.AllowedSymlinkPathMatcher.method_52252(path); }
// public boolean method_52253(java.util.List path) { return wrapperContained.method_52253(path); }
// public static boolean method_52253(java.util.List path, ) { return net.minecraft.util.path.AllowedSymlinkPathMatcher.method_52253(path); }
// public boolean method_52254(java.nio.file.Path path) { return wrapperContained.method_52254(path); }
// public static boolean method_52254(java.nio.file.Path path, ) { return net.minecraft.util.path.AllowedSymlinkPathMatcher.method_52254(path); }

}