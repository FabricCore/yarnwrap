package yarnwrap.util.logging;
public class LogFileCompressor { public net.minecraft.util.logging.LogFileCompressor wrapperContained; public LogFileCompressor(net.minecraft.util.logging.LogFileCompressor wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public int COMPRESSION_BUFFER_SIZE() { return wrapperContained.COMPRESSION_BUFFER_SIZE; }
// public java.lang.String GZ_EXTENSION() { return wrapperContained.GZ_EXTENSION; }
// public java.nio.file.Path directory() { return wrapperContained.directory; }
// public java.lang.String extension() { return wrapperContained.extension; }
// public Object getAll() { return wrapperContained.getAll(); }
// public void compress(java.nio.channels.ReadableByteChannel source,java.nio.file.Path outputPath) { wrapperContained.compress(source,outputPath); }
// public Object get(java.nio.file.Path path) { return wrapperContained.get(path); }
// public yarnwrap.util.logging.LogFileCompressor create(java.nio.file.Path directory,java.lang.String extension) { return new yarnwrap.util.logging.LogFileCompressor(wrapperContained.create(directory,extension)); }
// public void compress(java.nio.file.Path from,java.nio.file.Path to) { wrapperContained.compress(from,to); }
// public Object createLogFile(java.time.LocalDate date) { return wrapperContained.createLogFile(date); }

}