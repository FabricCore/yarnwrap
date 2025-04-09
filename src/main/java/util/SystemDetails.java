package yarnwrap.util;
public class SystemDetails { public net.minecraft.util.SystemDetails wrapperContained; public SystemDetails(net.minecraft.util.SystemDetails wrapperContained) { this.wrapperContained = wrapperContained; }

public long MEBI() { return wrapperContained.MEBI; }
// public long GIGA() { return wrapperContained.GIGA; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public java.lang.String OPERATING_SYSTEM() { return wrapperContained.OPERATING_SYSTEM; }
// public java.lang.String JAVA_VERSION() { return wrapperContained.JAVA_VERSION; }
// public java.lang.String JVM_VERSION() { return wrapperContained.JVM_VERSION; }
// public java.util.Map sections() { return wrapperContained.sections; }
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