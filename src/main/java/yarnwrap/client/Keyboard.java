package yarnwrap.client;
public class Keyboard { public net.minecraft.client.Keyboard wrapperContained; public Keyboard(net.minecraft.client.Keyboard wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.util.Clipboard clipboard() { return new yarnwrap.client.util.Clipboard(wrapperContained.clipboard); }
// public void clipboard(yarnwrap.client.util.Clipboard value) { wrapperContained.clipboard = value.wrapperContained; }
// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
// public void client(yarnwrap.client.MinecraftClient value) { wrapperContained.client = value.wrapperContained; }
// public boolean switchF3State() { return wrapperContained.switchF3State; }
// public void switchF3State(boolean value) { wrapperContained.switchF3State = value; }
// public long debugCrashElapsedTime() { return wrapperContained.debugCrashElapsedTime; }
// public void debugCrashElapsedTime(long value) { wrapperContained.debugCrashElapsedTime = value; }
// public long debugCrashLastLogTime() { return wrapperContained.debugCrashLastLogTime; }
// public void debugCrashLastLogTime(long value) { wrapperContained.debugCrashLastLogTime = value; }
// public long debugCrashStartTime() { return wrapperContained.debugCrashStartTime; }
// public void debugCrashStartTime(long value) { wrapperContained.debugCrashStartTime = value; }
public int DEBUG_CRASH_TIME() { return wrapperContained.DEBUG_CRASH_TIME; }
// public void DEBUG_CRASH_TIME(int value) { wrapperContained.DEBUG_CRASH_TIME = value; }
public void setClipboard(java.lang.String clipboard) { wrapperContained.setClipboard(clipboard); }
// public void debugError(java.lang.String key,java.lang.Object[] args) { wrapperContained.debugError(key,args); }
// public void onChar(long window,int codePoint,int modifiers) { wrapperContained.onChar(window,codePoint,modifiers); }
// public void debugLog(java.lang.String key,java.lang.Object[] args) { wrapperContained.debugLog(key,args); }
public java.lang.String getClipboard() { return wrapperContained.getClipboard(); }
// public void copyLookAt(boolean hasQueryPermission,boolean queryServer) { wrapperContained.copyLookAt(hasQueryPermission,queryServer); }
public void onKey(long window,int key,int scancode,int action,int modifiers) { wrapperContained.onKey(window,key,scancode,action,modifiers); }
// public boolean processF3(int key) { return wrapperContained.processF3(key); }
// public void copyEntity(yarnwrap.util.Identifier id,yarnwrap.util.math.Vec3d pos,yarnwrap.nbt.NbtCompound nbt) { wrapperContained.copyEntity(id.wrapperContained,pos.wrapperContained,nbt.wrapperContained); }
public void setup(long window) { wrapperContained.setup(window); }
public void pollDebugCrash() { wrapperContained.pollDebugCrash(); }
// public void copyBlock(yarnwrap.block.BlockState state,yarnwrap.util.math.BlockPos pos,yarnwrap.nbt.NbtCompound nbt) { wrapperContained.copyBlock(state.wrapperContained,pos.wrapperContained,nbt.wrapperContained); }
// public boolean processDebugKeys(int key) { return wrapperContained.processDebugKeys(key); }
// public void debugFormattedLog(java.lang.String pattern,java.lang.Object[] args) { wrapperContained.debugFormattedLog(pattern,args); }
// public void debugLog(yarnwrap.text.Text text) { wrapperContained.debugLog(text.wrapperContained); }
// public void addDebugMessage(yarnwrap.util.Formatting formatting,yarnwrap.text.Text text) { wrapperContained.addDebugMessage(formatting.wrapperContained,text.wrapperContained); }

}