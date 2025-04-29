package yarnwrap.client.util;
public class NarratorManager { public net.minecraft.client.util.NarratorManager wrapperContained; public NarratorManager(net.minecraft.client.util.NarratorManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.client.util.NarratorManager.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.client.util.NarratorManager.LOGGER = value; }

// public yarnwrap.text.Text EMPTY() { return new yarnwrap.text.Text(wrapperContained.EMPTY); }
// public void EMPTY(yarnwrap.text.Text value) { wrapperContained.EMPTY = value.wrapperContained; }
public static yarnwrap.text.Text EMPTY() { return new yarnwrap.text.Text(net.minecraft.client.util.NarratorManager.EMPTY); }
// public static void EMPTY(yarnwrap.text.Text value, ) { net.minecraft.client.util.NarratorManager.EMPTY = value.wrapperContained; }

// public com.mojang.text2speech.Narrator narrator() { return wrapperContained.narrator; }
// public void narrator(com.mojang.text2speech.Narrator value) { wrapperContained.narrator = value; }
// public static com.mojang.text2speech.Narrator narrator() { return net.minecraft.client.util.NarratorManager.narrator; }
// public static void narrator(com.mojang.text2speech.Narrator value, ) { net.minecraft.client.util.NarratorManager.narrator = value; }

// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
// public void client(yarnwrap.client.MinecraftClient value) { wrapperContained.client = value.wrapperContained; }
// public static yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(net.minecraft.client.util.NarratorManager.client); }
// public static void client(yarnwrap.client.MinecraftClient value, ) { net.minecraft.client.util.NarratorManager.client = value.wrapperContained; }

public NarratorManager(yarnwrap.client.MinecraftClient client) { this.wrapperContained = new net.minecraft.client.util.NarratorManager(client.wrapperContained); }
public boolean isActive() { return wrapperContained.isActive(); }
// public static boolean isActive() { return net.minecraft.client.util.NarratorManager.isActive(); }
public void onModeChange(yarnwrap.client.option.NarratorMode mode) { wrapperContained.onModeChange(mode.wrapperContained); }
// public static void onModeChange(yarnwrap.client.option.NarratorMode mode, ) { net.minecraft.client.util.NarratorManager.onModeChange(mode.wrapperContained); }
public void clear() { wrapperContained.clear(); }
// public static void clear() { net.minecraft.client.util.NarratorManager.clear(); }
public void narrate(java.lang.String text) { wrapperContained.narrate(text); }
// public static void narrate(java.lang.String text, ) { net.minecraft.client.util.NarratorManager.narrate(text); }
public void destroy() { wrapperContained.destroy(); }
// public static void destroy() { net.minecraft.client.util.NarratorManager.destroy(); }
// public yarnwrap.client.option.NarratorMode getNarratorMode() { return new yarnwrap.client.option.NarratorMode(wrapperContained.getNarratorMode()); }
// public static yarnwrap.client.option.NarratorMode getNarratorMode() { return new yarnwrap.client.option.NarratorMode(net.minecraft.client.util.NarratorManager.getNarratorMode()); }
public void narrate(yarnwrap.text.Text text) { wrapperContained.narrate(text.wrapperContained); }
// public static void narrate(yarnwrap.text.Text text, ) { net.minecraft.client.util.NarratorManager.narrate(text.wrapperContained); }
// public void debugPrintMessage(java.lang.String message) { wrapperContained.debugPrintMessage(message); }
// public static void debugPrintMessage(java.lang.String message, ) { net.minecraft.client.util.NarratorManager.debugPrintMessage(message); }
public void narrateChatMessage(yarnwrap.text.Text text) { wrapperContained.narrateChatMessage(text.wrapperContained); }
// public static void narrateChatMessage(yarnwrap.text.Text text, ) { net.minecraft.client.util.NarratorManager.narrateChatMessage(text.wrapperContained); }
public void narrateSystemMessage(yarnwrap.text.Text text) { wrapperContained.narrateSystemMessage(text.wrapperContained); }
// public static void narrateSystemMessage(yarnwrap.text.Text text, ) { net.minecraft.client.util.NarratorManager.narrateSystemMessage(text.wrapperContained); }
public void checkNarratorLibrary(boolean narratorEnabled) { wrapperContained.checkNarratorLibrary(narratorEnabled); }
// public static void checkNarratorLibrary(boolean narratorEnabled, ) { net.minecraft.client.util.NarratorManager.checkNarratorLibrary(narratorEnabled); }

}