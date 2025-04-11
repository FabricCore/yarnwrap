package yarnwrap.util;
public class CsvWriter { public net.minecraft.util.CsvWriter wrapperContained; public CsvWriter(net.minecraft.util.CsvWriter wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.io.Writer writer() { return wrapperContained.writer; }
// public void writer(java.io.Writer value) { wrapperContained.writer = value; }
// public int column() { return wrapperContained.column; }
// public void column(int value) { wrapperContained.column = value; }
// public java.lang.String CRLF() { return wrapperContained.CRLF; }
// public void CRLF(java.lang.String value) { wrapperContained.CRLF = value; }
// public java.lang.String COMMA() { return wrapperContained.COMMA; }
// public void COMMA(java.lang.String value) { wrapperContained.COMMA = value; }
public Object makeHeader() { return wrapperContained.makeHeader(); }
// public java.lang.String escape(java.lang.Object o) { return wrapperContained.escape(o); }
// public void printRow(java.util.stream.Stream columns) { wrapperContained.printRow(columns); }
// public void printRow(java.lang.Object[] columns) { wrapperContained.printRow(columns); }

}