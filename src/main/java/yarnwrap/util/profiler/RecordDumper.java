package yarnwrap.util.profiler;
public class RecordDumper { public net.minecraft.util.profiler.RecordDumper wrapperContained; public RecordDumper(net.minecraft.util.profiler.RecordDumper wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.nio.file.Path DEBUG_PROFILING_DIRECTORY() { return wrapperContained.DEBUG_PROFILING_DIRECTORY; }
// public void DEBUG_PROFILING_DIRECTORY(java.nio.file.Path value) { wrapperContained.DEBUG_PROFILING_DIRECTORY = value; }
public static java.nio.file.Path DEBUG_PROFILING_DIRECTORY() { return net.minecraft.util.profiler.RecordDumper.DEBUG_PROFILING_DIRECTORY; }
// public static void DEBUG_PROFILING_DIRECTORY(java.nio.file.Path value, ) { net.minecraft.util.profiler.RecordDumper.DEBUG_PROFILING_DIRECTORY = value; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.util.profiler.RecordDumper.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.util.profiler.RecordDumper.LOGGER = value; }

// public java.lang.String METRICS_DIRECTORY() { return wrapperContained.METRICS_DIRECTORY; }
// public void METRICS_DIRECTORY(java.lang.String value) { wrapperContained.METRICS_DIRECTORY = value; }
public static java.lang.String METRICS_DIRECTORY() { return net.minecraft.util.profiler.RecordDumper.METRICS_DIRECTORY; }
// public static void METRICS_DIRECTORY(java.lang.String value, ) { net.minecraft.util.profiler.RecordDumper.METRICS_DIRECTORY = value; }

// public java.lang.String DEVIATIONS_DIRECTORY() { return wrapperContained.DEVIATIONS_DIRECTORY; }
// public void DEVIATIONS_DIRECTORY(java.lang.String value) { wrapperContained.DEVIATIONS_DIRECTORY = value; }
public static java.lang.String DEVIATIONS_DIRECTORY() { return net.minecraft.util.profiler.RecordDumper.DEVIATIONS_DIRECTORY; }
// public static void DEVIATIONS_DIRECTORY(java.lang.String value, ) { net.minecraft.util.profiler.RecordDumper.DEVIATIONS_DIRECTORY = value; }

// public java.lang.String FILE_NAME() { return wrapperContained.FILE_NAME; }
// public void FILE_NAME(java.lang.String value) { wrapperContained.FILE_NAME = value; }
public static java.lang.String FILE_NAME() { return net.minecraft.util.profiler.RecordDumper.FILE_NAME; }
// public static void FILE_NAME(java.lang.String value, ) { net.minecraft.util.profiler.RecordDumper.FILE_NAME = value; }

// public java.lang.String type() { return wrapperContained.type; }
// public void type(java.lang.String value) { wrapperContained.type = value; }
// public static java.lang.String type() { return net.minecraft.util.profiler.RecordDumper.type; }
// public static void type(java.lang.String value, ) { net.minecraft.util.profiler.RecordDumper.type = value; }

public RecordDumper(java.lang.String type) { this.wrapperContained = new net.minecraft.util.profiler.RecordDumper(type); }
// public void save(yarnwrap.util.profiler.ProfileResult result,java.nio.file.Path directory) { wrapperContained.save(result.wrapperContained,directory); }
// public static void save(yarnwrap.util.profiler.ProfileResult result,java.nio.file.Path directory, ) { net.minecraft.util.profiler.RecordDumper.save(result.wrapperContained,directory); }
// public void writeSamplers(java.util.Set samplers,java.nio.file.Path directory) { wrapperContained.writeSamplers(samplers,directory); }
// public static void writeSamplers(java.util.Set samplers,java.nio.file.Path directory, ) { net.minecraft.util.profiler.RecordDumper.writeSamplers(samplers,directory); }
public java.nio.file.Path createDump(java.util.Set samplers,java.util.Map deviations,yarnwrap.util.profiler.ProfileResult result) { return wrapperContained.createDump(samplers,deviations,result.wrapperContained); }
// public static java.nio.file.Path createDump(java.util.Set samplers,java.util.Map deviations,yarnwrap.util.profiler.ProfileResult result, ) { return net.minecraft.util.profiler.RecordDumper.createDump(samplers,deviations,result.wrapperContained); }
// public java.lang.String method_37207(int data) { return wrapperContained.method_37207(data); }
// public static java.lang.String method_37207(int data, ) { return net.minecraft.util.profiler.RecordDumper.method_37207(data); }
// public void writeSamplersInType(yarnwrap.util.profiler.SampleType type,java.util.List samplers,java.nio.file.Path directory) { wrapperContained.writeSamplersInType(type.wrapperContained,samplers,directory); }
// public static void writeSamplersInType(yarnwrap.util.profiler.SampleType type,java.util.List samplers,java.nio.file.Path directory, ) { net.minecraft.util.profiler.RecordDumper.writeSamplersInType(type.wrapperContained,samplers,directory); }
// public void method_37209(java.nio.file.Path type,yarnwrap.util.profiler.SampleType sampler) { wrapperContained.method_37209(type,sampler.wrapperContained); }
// public static void method_37209(java.nio.file.Path type,yarnwrap.util.profiler.SampleType sampler, ) { net.minecraft.util.profiler.RecordDumper.method_37209(type,sampler.wrapperContained); }
// public void method_37210(java.time.format.DateTimeFormatter deviation) { wrapperContained.method_37210(deviation); }
// public static void method_37210(java.time.format.DateTimeFormatter deviation, ) { net.minecraft.util.profiler.RecordDumper.method_37210(deviation); }
// public void method_37211(java.time.format.DateTimeFormatter sampler,java.nio.file.Path sampleDeviations) { wrapperContained.method_37211(sampler,sampleDeviations); }
// public static void method_37211(java.time.format.DateTimeFormatter sampler,java.nio.file.Path sampleDeviations, ) { net.minecraft.util.profiler.RecordDumper.method_37211(sampler,sampleDeviations); }
// public void writeDeviations(java.util.Map deviations,java.nio.file.Path deviationsDirectory) { wrapperContained.writeDeviations(deviations,deviationsDirectory); }
// public static void writeDeviations(java.util.Map deviations,java.nio.file.Path deviationsDirectory, ) { net.minecraft.util.profiler.RecordDumper.writeDeviations(deviations,deviationsDirectory); }

}