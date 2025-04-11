package yarnwrap.util;
public class SystemDetails { public net.minecraft.util.SystemDetails wrapperContained; public SystemDetails(net.minecraft.util.SystemDetails wrapperContained) { this.wrapperContained = wrapperContained; }

public long MEBI() { return wrapperContained.MEBI; }
// public void MEBI(long value) { wrapperContained.MEBI = value; }
// public long GIGA() { return wrapperContained.GIGA; }
// public void GIGA(long value) { wrapperContained.GIGA = value; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public java.lang.String OPERATING_SYSTEM() { return wrapperContained.OPERATING_SYSTEM; }
// public void OPERATING_SYSTEM(java.lang.String value) { wrapperContained.OPERATING_SYSTEM = value; }
// public java.lang.String JAVA_VERSION() { return wrapperContained.JAVA_VERSION; }
// public void JAVA_VERSION(java.lang.String value) { wrapperContained.JAVA_VERSION = value; }
// public java.lang.String JVM_VERSION() { return wrapperContained.JVM_VERSION; }
// public void JVM_VERSION(java.lang.String value) { wrapperContained.JVM_VERSION = value; }
// public java.util.Map sections() { return wrapperContained.sections; }
// public void sections(java.util.Map value) { wrapperContained.sections = value; }
public java.lang.String collect() { return wrapperContained.collect(); }
// public void tryAddGroup(java.lang.String name,java.lang.Runnable adder) { wrapperContained.tryAddGroup(name,adder); }
public void addSection(java.lang.String name,java.lang.String value) { wrapperContained.addSection(name,value); }
public void addSection(java.lang.String name,java.util.function.Supplier valueSupplier) { wrapperContained.addSection(name,valueSupplier); }
public void writeTo(java.lang.StringBuilder stringBuilder) { wrapperContained.writeTo(stringBuilder); }
// public void addPhysicalMemoryGroup(java.util.List memories) { wrapperContained.addPhysicalMemoryGroup(memories); }
// public void addHardwareGroup(oshi.SystemInfo systemInfo) { wrapperContained.addHardwareGroup(systemInfo); }
// public void addProcessorGroup(oshi.hardware.CentralProcessor centralProcessor) { wrapperContained.addProcessorGroup(centralProcessor); }
// public void addGlobalMemoryGroup(oshi.hardware.GlobalMemory globalMemory) { wrapperContained.addGlobalMemoryGroup(globalMemory); }
// public void addVirtualMemoryGroup(oshi.hardware.VirtualMemory virtualMemory) { wrapperContained.addVirtualMemoryGroup(virtualMemory); }
// public void addGraphicsCardGroup(java.util.List graphicsCards) { wrapperContained.addGraphicsCardGroup(graphicsCards); }
public float toMebibytes(long bytes) { return wrapperContained.toMebibytes(bytes); }
// public void addStorageSection(java.lang.String property) { wrapperContained.addStorageSection(property); }
// public void addStorageGroup() { wrapperContained.addStorageGroup(); }
// public void addStorageSection(java.lang.String name,java.util.function.Supplier pathSupplier) { wrapperContained.addStorageSection(name,pathSupplier); }

}