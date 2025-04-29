package yarnwrap.util;
public class SystemDetails { public net.minecraft.util.SystemDetails wrapperContained; public SystemDetails(net.minecraft.util.SystemDetails wrapperContained) { this.wrapperContained = wrapperContained; }

// public long MEBI() { return wrapperContained.MEBI; }
// public void MEBI(long value) { wrapperContained.MEBI = value; }
public static long MEBI() { return net.minecraft.util.SystemDetails.MEBI; }
// public static void MEBI(long value, ) { net.minecraft.util.SystemDetails.MEBI = value; }

// public long GIGA() { return wrapperContained.GIGA; }
// public void GIGA(long value) { wrapperContained.GIGA = value; }
// public static long GIGA() { return net.minecraft.util.SystemDetails.GIGA; }
// public static void GIGA(long value, ) { net.minecraft.util.SystemDetails.GIGA = value; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.util.SystemDetails.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.util.SystemDetails.LOGGER = value; }

// public java.lang.String OPERATING_SYSTEM() { return wrapperContained.OPERATING_SYSTEM; }
// public void OPERATING_SYSTEM(java.lang.String value) { wrapperContained.OPERATING_SYSTEM = value; }
// public static java.lang.String OPERATING_SYSTEM() { return net.minecraft.util.SystemDetails.OPERATING_SYSTEM; }
// public static void OPERATING_SYSTEM(java.lang.String value, ) { net.minecraft.util.SystemDetails.OPERATING_SYSTEM = value; }

// public java.lang.String JAVA_VERSION() { return wrapperContained.JAVA_VERSION; }
// public void JAVA_VERSION(java.lang.String value) { wrapperContained.JAVA_VERSION = value; }
// public static java.lang.String JAVA_VERSION() { return net.minecraft.util.SystemDetails.JAVA_VERSION; }
// public static void JAVA_VERSION(java.lang.String value, ) { net.minecraft.util.SystemDetails.JAVA_VERSION = value; }

// public java.lang.String JVM_VERSION() { return wrapperContained.JVM_VERSION; }
// public void JVM_VERSION(java.lang.String value) { wrapperContained.JVM_VERSION = value; }
// public static java.lang.String JVM_VERSION() { return net.minecraft.util.SystemDetails.JVM_VERSION; }
// public static void JVM_VERSION(java.lang.String value, ) { net.minecraft.util.SystemDetails.JVM_VERSION = value; }

// public java.util.Map sections() { return wrapperContained.sections; }
// public void sections(java.util.Map value) { wrapperContained.sections = value; }
// public static java.util.Map sections() { return net.minecraft.util.SystemDetails.sections; }
// public static void sections(java.util.Map value, ) { net.minecraft.util.SystemDetails.sections = value; }

public java.lang.String collect() { return wrapperContained.collect(); }
// public static java.lang.String collect() { return net.minecraft.util.SystemDetails.collect(); }
// public void tryAddGroup(java.lang.String name,java.lang.Runnable adder) { wrapperContained.tryAddGroup(name,adder); }
// public static void tryAddGroup(java.lang.String name,java.lang.Runnable adder, ) { net.minecraft.util.SystemDetails.tryAddGroup(name,adder); }
public void addSection(java.lang.String name,java.lang.String value) { wrapperContained.addSection(name,value); }
// public static void addSection(java.lang.String name,java.lang.String value, ) { net.minecraft.util.SystemDetails.addSection(name,value); }
public void addSection(java.lang.String name,java.util.function.Supplier valueSupplier) { wrapperContained.addSection(name,valueSupplier); }
// public static void addSection(java.lang.String name,java.util.function.Supplier valueSupplier, ) { net.minecraft.util.SystemDetails.addSection(name,valueSupplier); }
public void writeTo(java.lang.StringBuilder stringBuilder) { wrapperContained.writeTo(stringBuilder); }
// public static void writeTo(java.lang.StringBuilder stringBuilder, ) { net.minecraft.util.SystemDetails.writeTo(stringBuilder); }
// public void method_37125(java.lang.StringBuilder name,java.lang.String value) { wrapperContained.method_37125(name,value); }
// public static void method_37125(java.lang.StringBuilder name,java.lang.String value, ) { net.minecraft.util.SystemDetails.method_37125(name,value); }
// public void addPhysicalMemoryGroup(java.util.List memories) { wrapperContained.addPhysicalMemoryGroup(memories); }
// public static void addPhysicalMemoryGroup(java.util.List memories, ) { net.minecraft.util.SystemDetails.addPhysicalMemoryGroup(memories); }
// public java.lang.String method_37127(Object entry) { return wrapperContained.method_37127(entry); }
// public static java.lang.String method_37127(Object entry, ) { return net.minecraft.util.SystemDetails.method_37127(entry); }
// public void addHardwareGroup(oshi.SystemInfo systemInfo) { wrapperContained.addHardwareGroup(systemInfo); }
// public static void addHardwareGroup(oshi.SystemInfo systemInfo, ) { net.minecraft.util.SystemDetails.addHardwareGroup(systemInfo); }
// public void addProcessorGroup(oshi.hardware.CentralProcessor centralProcessor) { wrapperContained.addProcessorGroup(centralProcessor); }
// public static void addProcessorGroup(oshi.hardware.CentralProcessor centralProcessor, ) { net.minecraft.util.SystemDetails.addProcessorGroup(centralProcessor); }
// public void addGlobalMemoryGroup(oshi.hardware.GlobalMemory globalMemory) { wrapperContained.addGlobalMemoryGroup(globalMemory); }
// public static void addGlobalMemoryGroup(oshi.hardware.GlobalMemory globalMemory, ) { net.minecraft.util.SystemDetails.addGlobalMemoryGroup(globalMemory); }
// public void addVirtualMemoryGroup(oshi.hardware.VirtualMemory virtualMemory) { wrapperContained.addVirtualMemoryGroup(virtualMemory); }
// public static void addVirtualMemoryGroup(oshi.hardware.VirtualMemory virtualMemory, ) { net.minecraft.util.SystemDetails.addVirtualMemoryGroup(virtualMemory); }
// public void addGraphicsCardGroup(java.util.List graphicsCards) { wrapperContained.addGraphicsCardGroup(graphicsCards); }
// public static void addGraphicsCardGroup(java.util.List graphicsCards, ) { net.minecraft.util.SystemDetails.addGraphicsCardGroup(graphicsCards); }
// public float toMebibytes(long bytes) { return wrapperContained.toMebibytes(bytes); }
// public static float toMebibytes(long bytes, ) { return net.minecraft.util.SystemDetails.toMebibytes(bytes); }
// public void addStorageSection(java.lang.String property) { wrapperContained.addStorageSection(property); }
// public static void addStorageSection(java.lang.String property, ) { net.minecraft.util.SystemDetails.addStorageSection(property); }
// public void addStorageGroup() { wrapperContained.addStorageGroup(); }
// public static void addStorageGroup() { net.minecraft.util.SystemDetails.addStorageGroup(); }
// public void addStorageSection(java.lang.String name,java.util.function.Supplier pathSupplier) { wrapperContained.addStorageSection(name,pathSupplier); }
// public static void addStorageSection(java.lang.String name,java.util.function.Supplier pathSupplier, ) { net.minecraft.util.SystemDetails.addStorageSection(name,pathSupplier); }

}