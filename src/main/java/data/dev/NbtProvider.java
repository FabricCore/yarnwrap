package yarnwrap.data.dev;
public class NbtProvider { public net.minecraft.data.dev.NbtProvider wrapperContained; public NbtProvider(net.minecraft.data.dev.NbtProvider wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public java.lang.Iterable paths() { return wrapperContained.paths; }
// public yarnwrap.data.DataOutput output() { return new yarnwrap.data.DataOutput(wrapperContained.output); }
public java.nio.file.Path convertNbtToSnbt(yarnwrap.data.DataWriter writer,java.nio.file.Path inputPath,java.lang.String filename,java.nio.file.Path outputPath) { return wrapperContained.convertNbtToSnbt(writer.wrapperContained,inputPath,filename,outputPath); }
// public java.lang.String getLocation(java.nio.file.Path inputPath,java.nio.file.Path filePath) { return wrapperContained.getLocation(inputPath,filePath); }
// public void writeTo(yarnwrap.data.DataWriter writer,java.nio.file.Path path,java.lang.String content) { wrapperContained.writeTo(writer.wrapperContained,path,content); }

}