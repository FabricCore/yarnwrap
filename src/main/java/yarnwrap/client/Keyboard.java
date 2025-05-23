package yarnwrap.client;
public class Keyboard { public net.minecraft.client.Keyboard wrapperContained; public Keyboard(net.minecraft.client.Keyboard wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
// public void client(yarnwrap.client.MinecraftClient value) { wrapperContained.client = value.wrapperContained; }
// public static yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(net.minecraft.client.Keyboard.client); }
// public static void client(yarnwrap.client.MinecraftClient value, ) { net.minecraft.client.Keyboard.client = value.wrapperContained; }

// public boolean switchF3State() { return wrapperContained.switchF3State; }
// public void switchF3State(boolean value) { wrapperContained.switchF3State = value; }
// public static boolean switchF3State() { return net.minecraft.client.Keyboard.switchF3State; }
// public static void switchF3State(boolean value, ) { net.minecraft.client.Keyboard.switchF3State = value; }

// public long debugCrashElapsedTime() { return wrapperContained.debugCrashElapsedTime; }
// public void debugCrashElapsedTime(long value) { wrapperContained.debugCrashElapsedTime = value; }
// public static long debugCrashElapsedTime() { return net.minecraft.client.Keyboard.debugCrashElapsedTime; }
// public static void debugCrashElapsedTime(long value, ) { net.minecraft.client.Keyboard.debugCrashElapsedTime = value; }

// public long debugCrashLastLogTime() { return wrapperContained.debugCrashLastLogTime; }
// public void debugCrashLastLogTime(long value) { wrapperContained.debugCrashLastLogTime = value; }
// public static long debugCrashLastLogTime() { return net.minecraft.client.Keyboard.debugCrashLastLogTime; }
// public static void debugCrashLastLogTime(long value, ) { net.minecraft.client.Keyboard.debugCrashLastLogTime = value; }

// public long debugCrashStartTime() { return wrapperContained.debugCrashStartTime; }
// public void debugCrashStartTime(long value) { wrapperContained.debugCrashStartTime = value; }
// public static long debugCrashStartTime() { return net.minecraft.client.Keyboard.debugCrashStartTime; }
// public static void debugCrashStartTime(long value, ) { net.minecraft.client.Keyboard.debugCrashStartTime = value; }

// public yarnwrap.client.util.Clipboard clipboard() { return new yarnwrap.client.util.Clipboard(wrapperContained.clipboard); }
// public void clipboard(yarnwrap.client.util.Clipboard value) { wrapperContained.clipboard = value.wrapperContained; }
// public static yarnwrap.client.util.Clipboard clipboard() { return new yarnwrap.client.util.Clipboard(net.minecraft.client.Keyboard.clipboard); }
// public static void clipboard(yarnwrap.client.util.Clipboard value, ) { net.minecraft.client.Keyboard.clipboard = value.wrapperContained; }

// public int DEBUG_CRASH_TIME() { return wrapperContained.DEBUG_CRASH_TIME; }
// public void DEBUG_CRASH_TIME(int value) { wrapperContained.DEBUG_CRASH_TIME = value; }
public static int DEBUG_CRASH_TIME() { return net.minecraft.client.Keyboard.DEBUG_CRASH_TIME; }
// public static void DEBUG_CRASH_TIME(int value, ) { net.minecraft.client.Keyboard.DEBUG_CRASH_TIME = value; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.client.Keyboard.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.client.Keyboard.LOGGER = value; }

public Keyboard(yarnwrap.client.MinecraftClient client) { this.wrapperContained = new net.minecraft.client.Keyboard(client.wrapperContained); }
public void setClipboard(java.lang.String clipboard) { wrapperContained.setClipboard(clipboard); }
// public static void setClipboard(java.lang.String clipboard, ) { net.minecraft.client.Keyboard.setClipboard(clipboard); }
// public void debugError(yarnwrap.text.Text message) { wrapperContained.debugError(message.wrapperContained); }
// public static void debugError(yarnwrap.text.Text message, ) { net.minecraft.client.Keyboard.debugError(message.wrapperContained); }
// public void onChar(long window,int codePoint,int modifiers) { wrapperContained.onChar(window,codePoint,modifiers); }
// public static void onChar(long window,int codePoint,int modifiers, ) { net.minecraft.client.Keyboard.onChar(window,codePoint,modifiers); }
// public void debugLog(java.lang.String key) { wrapperContained.debugLog(key); }
// public static void debugLog(java.lang.String key, ) { net.minecraft.client.Keyboard.debugLog(key); }
public java.lang.String getClipboard() { return wrapperContained.getClipboard(); }
// public static java.lang.String getClipboard() { return net.minecraft.client.Keyboard.getClipboard(); }
// public void method_1461(int error,long description) { wrapperContained.method_1461(error,description); }
// public static void method_1461(int error,long description, ) { net.minecraft.client.Keyboard.method_1461(error,description); }
// public void method_1463(yarnwrap.text.Text message) { wrapperContained.method_1463(message.wrapperContained); }
// public static void method_1463(yarnwrap.text.Text message, ) { net.minecraft.client.Keyboard.method_1463(message.wrapperContained); }
// public void copyLookAt(boolean hasQueryPermission,boolean queryServer) { wrapperContained.copyLookAt(hasQueryPermission,queryServer); }
// public static void copyLookAt(boolean hasQueryPermission,boolean queryServer, ) { net.minecraft.client.Keyboard.copyLookAt(hasQueryPermission,queryServer); }
public void onKey(long window,int key,int scancode,int action,int modifiers) { wrapperContained.onKey(window,key,scancode,action,modifiers); }
// public static void onKey(long window,int key,int scancode,int action,int modifiers, ) { net.minecraft.client.Keyboard.onKey(window,key,scancode,action,modifiers); }
// public void method_1467(yarnwrap.block.BlockState nbt) { wrapperContained.method_1467(nbt.wrapperContained); }
// public static void method_1467(yarnwrap.block.BlockState nbt, ) { net.minecraft.client.Keyboard.method_1467(nbt.wrapperContained); }
// public boolean processF3(int key) { return wrapperContained.processF3(key); }
// public static boolean processF3(int key, ) { return net.minecraft.client.Keyboard.processF3(key); }
// public void copyEntity(yarnwrap.util.Identifier id,yarnwrap.util.math.Vec3d pos,yarnwrap.nbt.NbtCompound nbt) { wrapperContained.copyEntity(id.wrapperContained,pos.wrapperContained,nbt.wrapperContained); }
// public static void copyEntity(yarnwrap.util.Identifier id,yarnwrap.util.math.Vec3d pos,yarnwrap.nbt.NbtCompound nbt, ) { net.minecraft.client.Keyboard.copyEntity(id.wrapperContained,pos.wrapperContained,nbt.wrapperContained); }
// public void method_1471(yarnwrap.util.Identifier nbt) { wrapperContained.method_1471(nbt.wrapperContained); }
// public static void method_1471(yarnwrap.util.Identifier nbt, ) { net.minecraft.client.Keyboard.method_1471(nbt.wrapperContained); }
public void setup(long window) { wrapperContained.setup(window); }
// public static void setup(long window, ) { net.minecraft.client.Keyboard.setup(window); }
public void pollDebugCrash() { wrapperContained.pollDebugCrash(); }
// public static void pollDebugCrash() { net.minecraft.client.Keyboard.pollDebugCrash(); }
// public void copyBlock(yarnwrap.block.BlockState state,yarnwrap.util.math.BlockPos pos,yarnwrap.nbt.NbtCompound nbt) { wrapperContained.copyBlock(state.wrapperContained,pos.wrapperContained,nbt.wrapperContained); }
// public static void copyBlock(yarnwrap.block.BlockState state,yarnwrap.util.math.BlockPos pos,yarnwrap.nbt.NbtCompound nbt, ) { net.minecraft.client.Keyboard.copyBlock(state.wrapperContained,pos.wrapperContained,nbt.wrapperContained); }
// public void method_22675(long window,int codePoint,int modifiers) { wrapperContained.method_22675(window,codePoint,modifiers); }
// public static void method_22675(long window,int codePoint,int modifiers, ) { net.minecraft.client.Keyboard.method_22675(window,codePoint,modifiers); }
// public void method_22676(long window,int key,int scancode,int action,int modifiers) { wrapperContained.method_22676(window,key,scancode,action,modifiers); }
// public static void method_22676(long window,int key,int scancode,int action,int modifiers, ) { net.minecraft.client.Keyboard.method_22676(window,key,scancode,action,modifiers); }
// public boolean processDebugKeys(int key) { return wrapperContained.processDebugKeys(key); }
// public static boolean processDebugKeys(int key, ) { return net.minecraft.client.Keyboard.processDebugKeys(key); }
// public void debugFormattedLog(java.lang.String pattern,java.lang.Object[] args) { wrapperContained.debugFormattedLog(pattern,args); }
// public static void debugFormattedLog(java.lang.String pattern,java.lang.Object[] args, ) { net.minecraft.client.Keyboard.debugFormattedLog(pattern,args); }
// public void debugLog(yarnwrap.text.Text text) { wrapperContained.debugLog(text.wrapperContained); }
// public static void debugLog(yarnwrap.text.Text text, ) { net.minecraft.client.Keyboard.debugLog(text.wrapperContained); }
// public yarnwrap.text.Text getDebugMessage(yarnwrap.util.Formatting formatting,yarnwrap.text.Text message) { return new yarnwrap.text.Text(wrapperContained.getDebugMessage(formatting.wrapperContained,message.wrapperContained)); }
// public static yarnwrap.text.Text getDebugMessage(yarnwrap.util.Formatting formatting,yarnwrap.text.Text message, ) { return new yarnwrap.text.Text(net.minecraft.client.Keyboard.getDebugMessage(formatting.wrapperContained,message.wrapperContained)); }
// public yarnwrap.text.Style method_49711(java.nio.file.Path style) { return new yarnwrap.text.Style(wrapperContained.method_49711(style)); }
// public static yarnwrap.text.Style method_49711(java.nio.file.Path style, ) { return new yarnwrap.text.Style(net.minecraft.client.Keyboard.method_49711(style)); }
// public void sendMessage(yarnwrap.text.Text message) { wrapperContained.sendMessage(message.wrapperContained); }
// public static void sendMessage(yarnwrap.text.Text message, ) { net.minecraft.client.Keyboard.sendMessage(message.wrapperContained); }

}