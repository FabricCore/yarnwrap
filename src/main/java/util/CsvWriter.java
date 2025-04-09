package yarnwrap.util;
public class CsvWriter { public net.minecraft.util.CsvWriter wrapperContained; public CsvWriter(net.minecraft.util.CsvWriter wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.io.Writer writer() { return wrapperContained.writer; }
// public int column() { return wrapperContained.column; }
// public java.lang.String CRLF() { return wrapperContained.CRLF; }
// public java.lang.String COMMA() { return wrapperContained.COMMA; }
public Object makeHeader() { return wrapperContained.makeHeader(); }
// public java.lang.String escape(java.lang.Object o) { return wrapperContained.escape(o); }
// public void printRow(java.util.stream.Stream columns) { wrapperContained.printRow(columns); }
// public void printRow(java.lang.Object[] columns) { wrapperContained.printRow(columns); }

}