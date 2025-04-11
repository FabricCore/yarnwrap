package yarnwrap.client.gl;
public class GlImportProcessor { public net.minecraft.client.gl.GlImportProcessor wrapperContained; public GlImportProcessor(net.minecraft.client.gl.GlImportProcessor wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.regex.Pattern MOJ_IMPORT_PATTERN() { return wrapperContained.MOJ_IMPORT_PATTERN; }
// public void MOJ_IMPORT_PATTERN(java.util.regex.Pattern value) { wrapperContained.MOJ_IMPORT_PATTERN = value; }
// public java.util.regex.Pattern IMPORT_VERSION_PATTERN() { return wrapperContained.IMPORT_VERSION_PATTERN; }
// public void IMPORT_VERSION_PATTERN(java.util.regex.Pattern value) { wrapperContained.IMPORT_VERSION_PATTERN = value; }
// public java.lang.String MULTI_LINE_COMMENT_PATTERN() { return wrapperContained.MULTI_LINE_COMMENT_PATTERN; }
// public void MULTI_LINE_COMMENT_PATTERN(java.lang.String value) { wrapperContained.MULTI_LINE_COMMENT_PATTERN = value; }
// public java.lang.String SINGLE_LINE_COMMENT_PATTERN() { return wrapperContained.SINGLE_LINE_COMMENT_PATTERN; }
// public void SINGLE_LINE_COMMENT_PATTERN(java.lang.String value) { wrapperContained.SINGLE_LINE_COMMENT_PATTERN = value; }
// public java.util.regex.Pattern TRAILING_WHITESPACE_PATTERN() { return wrapperContained.TRAILING_WHITESPACE_PATTERN; }
// public void TRAILING_WHITESPACE_PATTERN(java.util.regex.Pattern value) { wrapperContained.TRAILING_WHITESPACE_PATTERN = value; }
public java.util.List readSource(java.lang.String source) { return wrapperContained.readSource(source); }
// public java.lang.String readImport(java.lang.String line,int start) { return wrapperContained.readImport(line,start); }
// public java.lang.String extractVersion(java.lang.String line,Object context) { return wrapperContained.extractVersion(line,context); }
// public java.util.List parseImports(java.lang.String source,Object context,java.lang.String path) { return wrapperContained.parseImports(source,context,path); }
public java.lang.String loadImport(boolean inline,java.lang.String name) { return wrapperContained.loadImport(inline,name); }
// public boolean isLineValid(java.lang.String line,java.util.regex.Matcher matcher) { return wrapperContained.isLineValid(line,matcher); }
// public boolean hasBogusString(java.lang.String string,java.util.regex.Matcher matcher,int matchEnd) { return wrapperContained.hasBogusString(string,matcher,matchEnd); }

}