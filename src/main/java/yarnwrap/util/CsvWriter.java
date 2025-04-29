package yarnwrap.util;
public class CsvWriter { public net.minecraft.util.CsvWriter wrapperContained; public CsvWriter(net.minecraft.util.CsvWriter wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.io.Writer writer() { return wrapperContained.writer; }
// public void writer(java.io.Writer value) { wrapperContained.writer = value; }
// public static java.io.Writer writer() { return net.minecraft.util.CsvWriter.writer; }
// public static void writer(java.io.Writer value, ) { net.minecraft.util.CsvWriter.writer = value; }

// public int column() { return wrapperContained.column; }
// public void column(int value) { wrapperContained.column = value; }
// public static int column() { return net.minecraft.util.CsvWriter.column; }
// public static void column(int value, ) { net.minecraft.util.CsvWriter.column = value; }

// public java.lang.String CRLF() { return wrapperContained.CRLF; }
// public void CRLF(java.lang.String value) { wrapperContained.CRLF = value; }
// public static java.lang.String CRLF() { return net.minecraft.util.CsvWriter.CRLF; }
// public static void CRLF(java.lang.String value, ) { net.minecraft.util.CsvWriter.CRLF = value; }

// public java.lang.String COMMA() { return wrapperContained.COMMA; }
// public void COMMA(java.lang.String value) { wrapperContained.COMMA = value; }
// public static java.lang.String COMMA() { return net.minecraft.util.CsvWriter.COMMA; }
// public static void COMMA(java.lang.String value, ) { net.minecraft.util.CsvWriter.COMMA = value; }

// public CsvWriter(java.io.Writer writer,java.util.List columns) { this.wrapperContained = new net.minecraft.util.CsvWriter(writer,columns); }
// public Object makeHeader() { return wrapperContained.makeHeader(); }
public static Object makeHeader() { return net.minecraft.util.CsvWriter.makeHeader(); }
// public java.lang.String escape(java.lang.Object o) { return wrapperContained.escape(o); }
// public static java.lang.String escape(java.lang.Object o, ) { return net.minecraft.util.CsvWriter.escape(o); }
// public void printRow(java.util.stream.Stream columns) { wrapperContained.printRow(columns); }
// public static void printRow(java.util.stream.Stream columns, ) { net.minecraft.util.CsvWriter.printRow(columns); }
// public void printRow(java.lang.Object[] columns) { wrapperContained.printRow(columns); }
// public static void printRow(java.lang.Object[] columns, ) { net.minecraft.util.CsvWriter.printRow(columns); }

}