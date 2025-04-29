package yarnwrap.world.level.storage;
public class SessionLock { public net.minecraft.world.level.storage.SessionLock wrapperContained; public SessionLock(net.minecraft.world.level.storage.SessionLock wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.nio.channels.FileChannel channel() { return wrapperContained.channel; }
// public void channel(java.nio.channels.FileChannel value) { wrapperContained.channel = value; }
// public static java.nio.channels.FileChannel channel() { return net.minecraft.world.level.storage.SessionLock.channel; }
// public static void channel(java.nio.channels.FileChannel value, ) { net.minecraft.world.level.storage.SessionLock.channel = value; }

// public java.nio.channels.FileLock lock() { return wrapperContained.lock; }
// public void lock(java.nio.channels.FileLock value) { wrapperContained.lock = value; }
// public static java.nio.channels.FileLock lock() { return net.minecraft.world.level.storage.SessionLock.lock; }
// public static void lock(java.nio.channels.FileLock value, ) { net.minecraft.world.level.storage.SessionLock.lock = value; }

// public java.nio.ByteBuffer SNOWMAN() { return wrapperContained.SNOWMAN; }
// public void SNOWMAN(java.nio.ByteBuffer value) { wrapperContained.SNOWMAN = value; }
// public static java.nio.ByteBuffer SNOWMAN() { return net.minecraft.world.level.storage.SessionLock.SNOWMAN; }
// public static void SNOWMAN(java.nio.ByteBuffer value, ) { net.minecraft.world.level.storage.SessionLock.SNOWMAN = value; }

// public java.lang.String SESSION_LOCK() { return wrapperContained.SESSION_LOCK; }
// public void SESSION_LOCK(java.lang.String value) { wrapperContained.SESSION_LOCK = value; }
public static java.lang.String SESSION_LOCK() { return net.minecraft.world.level.storage.SessionLock.SESSION_LOCK; }
// public static void SESSION_LOCK(java.lang.String value, ) { net.minecraft.world.level.storage.SessionLock.SESSION_LOCK = value; }

// public SessionLock(java.nio.channels.FileChannel channel,java.nio.channels.FileLock lock) { this.wrapperContained = new net.minecraft.world.level.storage.SessionLock(channel,lock); }
public boolean isValid() { return wrapperContained.isValid(); }
// public static boolean isValid() { return net.minecraft.world.level.storage.SessionLock.isValid(); }
// public yarnwrap.world.level.storage.SessionLock create(java.nio.file.Path path) { return new yarnwrap.world.level.storage.SessionLock(wrapperContained.create(path)); }
// public static yarnwrap.world.level.storage.SessionLock create(java.nio.file.Path path, ) { return new yarnwrap.world.level.storage.SessionLock(net.minecraft.world.level.storage.SessionLock.create(path)); }
// public boolean isLocked(java.nio.file.Path path) { return wrapperContained.isLocked(path); }
// public static boolean isLocked(java.nio.file.Path path, ) { return net.minecraft.world.level.storage.SessionLock.isLocked(path); }

}