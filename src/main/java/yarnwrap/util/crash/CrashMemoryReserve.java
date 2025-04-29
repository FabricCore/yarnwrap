package yarnwrap.util.crash;
public class CrashMemoryReserve { public net.minecraft.util.crash.CrashMemoryReserve wrapperContained; public CrashMemoryReserve(net.minecraft.util.crash.CrashMemoryReserve wrapperContained) { this.wrapperContained = wrapperContained; }

// public byte[] reservedMemory() { return wrapperContained.reservedMemory; }
// public void reservedMemory(byte[] value) { wrapperContained.reservedMemory = value; }
// public static byte[] reservedMemory() { return net.minecraft.util.crash.CrashMemoryReserve.reservedMemory; }
// public static void reservedMemory(byte[] value, ) { net.minecraft.util.crash.CrashMemoryReserve.reservedMemory = value; }

// public void reserveMemory() { wrapperContained.reserveMemory(); }
public static void reserveMemory() { net.minecraft.util.crash.CrashMemoryReserve.reserveMemory(); }
// public void releaseMemory() { wrapperContained.releaseMemory(); }
public static void releaseMemory() { net.minecraft.util.crash.CrashMemoryReserve.releaseMemory(); }

}