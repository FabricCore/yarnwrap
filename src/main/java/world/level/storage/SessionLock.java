package yarnwrap.world.level.storage;
public class SessionLock { public net.minecraft.world.level.storage.SessionLock wrapperContained; public SessionLock(net.minecraft.world.level.storage.SessionLock wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.nio.channels.FileChannel channel() { return wrapperContained.channel; }
// public java.nio.channels.FileLock lock() { return wrapperContained.lock; }
// public java.nio.ByteBuffer SNOWMAN() { return wrapperContained.SNOWMAN; }
public java.lang.String SESSION_LOCK() { return wrapperContained.SESSION_LOCK; }
public boolean isValid() { return wrapperContained.isValid(); }
// public yarnwrap.world.level.storage.SessionLock create(java.nio.file.Path path) { return new yarnwrap.world.level.storage.SessionLock(wrapperContained.create(path)); }
// public boolean isLocked(java.nio.file.Path path) { return wrapperContained.isLocked(path); }

}