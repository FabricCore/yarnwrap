package yarnwrap.client.util;
public class NarratorManager { public net.minecraft.client.util.NarratorManager wrapperContained; public NarratorManager(net.minecraft.client.util.NarratorManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
public yarnwrap.text.Text EMPTY() { return new yarnwrap.text.Text(wrapperContained.EMPTY); }
// public void EMPTY(yarnwrap.text.Text value) { wrapperContained.EMPTY = value.wrapperContained; }
// public com.mojang.text2speech.Narrator narrator() { return wrapperContained.narrator; }
// public void narrator(com.mojang.text2speech.Narrator value) { wrapperContained.narrator = value; }
// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
// public void client(yarnwrap.client.MinecraftClient value) { wrapperContained.client = value.wrapperContained; }
public boolean isActive() { return wrapperContained.isActive(); }
public void onModeChange(yarnwrap.client.option.NarratorMode mode) { wrapperContained.onModeChange(mode.wrapperContained); }
public void clear() { wrapperContained.clear(); }
public void narrate(java.lang.String text) { wrapperContained.narrate(text); }
public void destroy() { wrapperContained.destroy(); }
// public yarnwrap.client.option.NarratorMode getNarratorMode() { return new yarnwrap.client.option.NarratorMode(wrapperContained.getNarratorMode()); }
public void narrate(yarnwrap.text.Text text) { wrapperContained.narrate(text.wrapperContained); }
// public void debugPrintMessage(java.lang.String message) { wrapperContained.debugPrintMessage(message); }
public void narrateChatMessage(yarnwrap.text.Text text) { wrapperContained.narrateChatMessage(text.wrapperContained); }
public void narrateSystemMessage(yarnwrap.text.Text text) { wrapperContained.narrateSystemMessage(text.wrapperContained); }
public void checkNarratorLibrary(boolean narratorEnabled) { wrapperContained.checkNarratorLibrary(narratorEnabled); }

}