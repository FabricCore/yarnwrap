package yarnwrap.world.level.storage;
public class SessionLock { public net.minecraft.world.level.storage.SessionLock wrapperContained; public SessionLock(net.minecraft.world.level.storage.SessionLock wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.nio.channels.FileChannel channel() { return wrapperContained.channel; }
// public void channel(java.nio.channels.FileChannel value) { wrapperContained.channel = value; }
// public java.nio.channels.FileLock lock() { return wrapperContained.lock; }
// public void lock(java.nio.channels.FileLock value) { wrapperContained.lock = value; }
// public java.nio.ByteBuffer SNOWMAN() { return wrapperContained.SNOWMAN; }
// public void SNOWMAN(java.nio.ByteBuffer value) { wrapperContained.SNOWMAN = value; }
public java.lang.String SESSION_LOCK() { return wrapperContained.SESSION_LOCK; }
// public void SESSION_LOCK(java.lang.String value) { wrapperContained.SESSION_LOCK = value; }
// public SessionLock(java.nio.channels.FileChannel channel,java.nio.channels.FileLock lock) { this.wrapperContained = new net.minecraft.world.level.storage.SessionLock(channel,lock); }
public boolean isValid() { return wrapperContained.isValid(); }
// public yarnwrap.world.level.storage.SessionLock create(java.nio.file.Path path) { return new yarnwrap.world.level.storage.SessionLock(wrapperContained.create(path)); }
// public boolean isLocked(java.nio.file.Path path) { return wrapperContained.isLocked(path); }

}