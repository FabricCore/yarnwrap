package yarnwrap.util.thread;
public class LockHelper { public net.minecraft.util.thread.LockHelper wrapperContained; public LockHelper(net.minecraft.util.thread.LockHelper wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public java.lang.String name() { return wrapperContained.name; }
// public java.util.concurrent.Semaphore semaphore() { return wrapperContained.semaphore; }
// public java.util.concurrent.locks.Lock lock() { return wrapperContained.lock; }
// public java.lang.Thread thread() { return wrapperContained.thread; }
// public yarnwrap.util.crash.CrashException crashException() { return new yarnwrap.util.crash.CrashException(wrapperContained.crashException); }
public yarnwrap.util.crash.CrashException crash(java.lang.String message,java.lang.Thread thread) { return new yarnwrap.util.crash.CrashException(wrapperContained.crash(message,thread)); }
// public void lock() { wrapperContained.lock(); }
// public java.lang.String formatStackTraceForThread(java.lang.Thread thread) { return wrapperContained.formatStackTraceForThread(thread); }
public void unlock() { wrapperContained.unlock(); }

}