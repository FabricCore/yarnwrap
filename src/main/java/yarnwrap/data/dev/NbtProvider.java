package yarnwrap.data.dev;
public class NbtProvider { public net.minecraft.data.dev.NbtProvider wrapperContained; public NbtProvider(net.minecraft.data.dev.NbtProvider wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public java.lang.Iterable paths() { return wrapperContained.paths; }
// public void paths(java.lang.Iterable value) { wrapperContained.paths = value; }
// public yarnwrap.data.DataOutput output() { return new yarnwrap.data.DataOutput(wrapperContained.output); }
// public void output(yarnwrap.data.DataOutput value) { wrapperContained.output = value.wrapperContained; }
public NbtProvider(yarnwrap.data.DataOutput output,java.util.Collection paths) { this.wrapperContained = new net.minecraft.data.dev.NbtProvider(output.wrapperContained,paths); }
public java.nio.file.Path convertNbtToSnbt(yarnwrap.data.DataWriter writer,java.nio.file.Path inputPath,java.lang.String filename,java.nio.file.Path outputPath) { return wrapperContained.convertNbtToSnbt(writer.wrapperContained,inputPath,filename,outputPath); }
// public boolean method_10495(java.nio.file.Path path) { return wrapperContained.method_10495(path); }
// public java.lang.String getLocation(java.nio.file.Path inputPath,java.nio.file.Path filePath) { return wrapperContained.getLocation(inputPath,filePath); }
// public void writeTo(yarnwrap.data.DataWriter writer,java.nio.file.Path path,java.lang.String content) { wrapperContained.writeTo(writer.wrapperContained,path,content); }
// public java.util.concurrent.CompletableFuture method_46581(yarnwrap.data.DataWriter path) { return wrapperContained.method_46581(path.wrapperContained); }
// public java.util.concurrent.CompletionStage method_46583(java.util.concurrent.CompletableFuture future) { return wrapperContained.method_46583(future); }

}