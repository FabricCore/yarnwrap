package yarnwrap.util.profiler;
public class RecordDumper { public net.minecraft.util.profiler.RecordDumper wrapperContained; public RecordDumper(net.minecraft.util.profiler.RecordDumper wrapperContained) { this.wrapperContained = wrapperContained; }

public java.nio.file.Path DEBUG_PROFILING_DIRECTORY() { return wrapperContained.DEBUG_PROFILING_DIRECTORY; }
// public void DEBUG_PROFILING_DIRECTORY(java.nio.file.Path value) { wrapperContained.DEBUG_PROFILING_DIRECTORY = value; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
public java.lang.String METRICS_DIRECTORY() { return wrapperContained.METRICS_DIRECTORY; }
// public void METRICS_DIRECTORY(java.lang.String value) { wrapperContained.METRICS_DIRECTORY = value; }
public java.lang.String DEVIATIONS_DIRECTORY() { return wrapperContained.DEVIATIONS_DIRECTORY; }
// public void DEVIATIONS_DIRECTORY(java.lang.String value) { wrapperContained.DEVIATIONS_DIRECTORY = value; }
public java.lang.String FILE_NAME() { return wrapperContained.FILE_NAME; }
// public void FILE_NAME(java.lang.String value) { wrapperContained.FILE_NAME = value; }
// public java.lang.String type() { return wrapperContained.type; }
// public void type(java.lang.String value) { wrapperContained.type = value; }
// public void save(yarnwrap.util.profiler.ProfileResult result,java.nio.file.Path directory) { wrapperContained.save(result.wrapperContained,directory); }
// public void writeSamplers(java.util.Set samplers,java.nio.file.Path directory) { wrapperContained.writeSamplers(samplers,directory); }
public java.nio.file.Path createDump(java.util.Set samplers,java.util.Map deviations,yarnwrap.util.profiler.ProfileResult result) { return wrapperContained.createDump(samplers,deviations,result.wrapperContained); }
// public void writeSamplersInType(yarnwrap.util.profiler.SampleType type,java.util.List samplers,java.nio.file.Path directory) { wrapperContained.writeSamplersInType(type.wrapperContained,samplers,directory); }
// public void writeDeviations(java.util.Map deviations,java.nio.file.Path deviationsDirectory) { wrapperContained.writeDeviations(deviations,deviationsDirectory); }

}