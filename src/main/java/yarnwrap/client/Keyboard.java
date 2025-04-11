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
public Keyboard(yarnwrap.client.MinecraftClient client) { this.wrapperContained = new net.minecraft.client.Keyboard(client.wrapperContained); }
public void setClipboard(java.lang.String clipboard) { wrapperContained.setClipboard(clipboard); }
// public void debugError(java.lang.String key,java.lang.Object[] args) { wrapperContained.debugError(key,args); }
// public void onChar(long window,int codePoint,int modifiers) { wrapperContained.onChar(window,codePoint,modifiers); }
// public void debugLog(java.lang.String key,java.lang.Object[] args) { wrapperContained.debugLog(key,args); }
public java.lang.String getClipboard() { return wrapperContained.getClipboard(); }
// public void method_1461(int error,long description) { wrapperContained.method_1461(error,description); }
// public void method_1463(yarnwrap.text.Text message) { wrapperContained.method_1463(message.wrapperContained); }
// public void copyLookAt(boolean hasQueryPermission,boolean queryServer) { wrapperContained.copyLookAt(hasQueryPermission,queryServer); }
public void onKey(long window,int key,int scancode,int action,int modifiers) { wrapperContained.onKey(window,key,scancode,action,modifiers); }
// public void method_1467(yarnwrap.block.BlockState nbt) { wrapperContained.method_1467(nbt.wrapperContained); }
// public boolean processF3(int key) { return wrapperContained.processF3(key); }
// public void copyEntity(yarnwrap.util.Identifier id,yarnwrap.util.math.Vec3d pos,yarnwrap.nbt.NbtCompound nbt) { wrapperContained.copyEntity(id.wrapperContained,pos.wrapperContained,nbt.wrapperContained); }
// public void method_1471(yarnwrap.util.Identifier nbt) { wrapperContained.method_1471(nbt.wrapperContained); }
public void setup(long window) { wrapperContained.setup(window); }
public void pollDebugCrash() { wrapperContained.pollDebugCrash(); }
// public void copyBlock(yarnwrap.block.BlockState state,yarnwrap.util.math.BlockPos pos,yarnwrap.nbt.NbtCompound nbt) { wrapperContained.copyBlock(state.wrapperContained,pos.wrapperContained,nbt.wrapperContained); }
// public void method_22675(long window,int codePoint,int modifiers) { wrapperContained.method_22675(window,codePoint,modifiers); }
// public void method_22676(long window,int key,int scancode,int action,int modifiers) { wrapperContained.method_22676(window,key,scancode,action,modifiers); }
// public boolean processDebugKeys(int key) { return wrapperContained.processDebugKeys(key); }
// public void debugFormattedLog(java.lang.String pattern,java.lang.Object[] args) { wrapperContained.debugFormattedLog(pattern,args); }
// public void debugLog(yarnwrap.text.Text text) { wrapperContained.debugLog(text.wrapperContained); }
// public void addDebugMessage(yarnwrap.util.Formatting formatting,yarnwrap.text.Text text) { wrapperContained.addDebugMessage(formatting.wrapperContained,text.wrapperContained); }
// public yarnwrap.text.Style method_49711(java.nio.file.Path style) { return new yarnwrap.text.Style(wrapperContained.method_49711(style)); }

}