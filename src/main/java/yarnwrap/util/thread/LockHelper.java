package yarnwrap.util.thread;
public class LockHelper { public net.minecraft.util.thread.LockHelper wrapperContained; public LockHelper(net.minecraft.util.thread.LockHelper wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.util.thread.LockHelper.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.util.thread.LockHelper.LOGGER = value; }

// public java.lang.String name() { return wrapperContained.name; }
// public void name(java.lang.String value) { wrapperContained.name = value; }
// public static java.lang.String name() { return net.minecraft.util.thread.LockHelper.name; }
// public static void name(java.lang.String value, ) { net.minecraft.util.thread.LockHelper.name = value; }

// public java.util.concurrent.Semaphore semaphore() { return wrapperContained.semaphore; }
// public void semaphore(java.util.concurrent.Semaphore value) { wrapperContained.semaphore = value; }
// public static java.util.concurrent.Semaphore semaphore() { return net.minecraft.util.thread.LockHelper.semaphore; }
// public static void semaphore(java.util.concurrent.Semaphore value, ) { net.minecraft.util.thread.LockHelper.semaphore = value; }

// public java.util.concurrent.locks.Lock lock() { return wrapperContained.lock; }
// public void lock(java.util.concurrent.locks.Lock value) { wrapperContained.lock = value; }
// public static java.util.concurrent.locks.Lock lock() { return net.minecraft.util.thread.LockHelper.lock; }
// public static void lock(java.util.concurrent.locks.Lock value, ) { net.minecraft.util.thread.LockHelper.lock = value; }

// public java.lang.Thread thread() { return wrapperContained.thread; }
// public void thread(java.lang.Thread value) { wrapperContained.thread = value; }
// public static java.lang.Thread thread() { return net.minecraft.util.thread.LockHelper.thread; }
// public static void thread(java.lang.Thread value, ) { net.minecraft.util.thread.LockHelper.thread = value; }

// public yarnwrap.util.crash.CrashException crashException() { return new yarnwrap.util.crash.CrashException(wrapperContained.crashException); }
// public void crashException(yarnwrap.util.crash.CrashException value) { wrapperContained.crashException = value.wrapperContained; }
// public static yarnwrap.util.crash.CrashException crashException() { return new yarnwrap.util.crash.CrashException(net.minecraft.util.thread.LockHelper.crashException); }
// public static void crashException(yarnwrap.util.crash.CrashException value, ) { net.minecraft.util.thread.LockHelper.crashException = value.wrapperContained; }

public LockHelper(java.lang.String name) { this.wrapperContained = new net.minecraft.util.thread.LockHelper(name); }
// public yarnwrap.util.crash.CrashException crash(java.lang.String message,java.lang.Thread thread) { return new yarnwrap.util.crash.CrashException(wrapperContained.crash(message,thread)); }
// public static yarnwrap.util.crash.CrashException crash(java.lang.String message,java.lang.Thread thread, ) { return new yarnwrap.util.crash.CrashException(net.minecraft.util.thread.LockHelper.crash(message,thread)); }
// public void lock() { wrapperContained.lock(); }
// // public static void lock() { net.minecraft.util.thread.LockHelper.lock(); }
// public java.lang.String formatStackTraceForThread(java.lang.Thread thread) { return wrapperContained.formatStackTraceForThread(thread); }
// public static java.lang.String formatStackTraceForThread(java.lang.Thread thread, ) { return net.minecraft.util.thread.LockHelper.formatStackTraceForThread(thread); }
public void unlock() { wrapperContained.unlock(); }
// public static void unlock() { net.minecraft.util.thread.LockHelper.unlock(); }

}