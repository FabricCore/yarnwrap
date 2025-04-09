package yarnwrap.util.crash;
public class CrashMemoryReserve { public net.minecraft.util.crash.CrashMemoryReserve wrapperContained; public CrashMemoryReserve(net.minecraft.util.crash.CrashMemoryReserve wrapperContained) { this.wrapperContained = wrapperContained; }

// public byte[] reservedMemory() { return wrapperContained.reservedMemory; }
public void reserveMemory() { wrapperContained.reserveMemory(); }
public void releaseMemory() { wrapperContained.releaseMemory(); }

}