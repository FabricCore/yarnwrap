package yarnwrap.client.gui.screen.ingame;
public class HandledScreens { public net.minecraft.client.gui.screen.ingame.HandledScreens wrapperContained; public HandledScreens(net.minecraft.client.gui.screen.ingame.HandledScreens wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.client.gui.screen.ingame.HandledScreens.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.client.gui.screen.ingame.HandledScreens.LOGGER = value; }

// public java.util.Map PROVIDERS() { return wrapperContained.PROVIDERS; }
// public void PROVIDERS(java.util.Map value) { wrapperContained.PROVIDERS = value; }
// public static java.util.Map PROVIDERS() { return net.minecraft.client.gui.screen.ingame.HandledScreens.PROVIDERS; }
// public static void PROVIDERS(java.util.Map value, ) { net.minecraft.client.gui.screen.ingame.HandledScreens.PROVIDERS = value; }

// public boolean isMissingScreens() { return wrapperContained.isMissingScreens(); }
public static boolean isMissingScreens() { return net.minecraft.client.gui.screen.ingame.HandledScreens.isMissingScreens(); }
// public Object getProvider(yarnwrap.screen.ScreenHandlerType type) { return wrapperContained.getProvider(type.wrapperContained); }
// public static Object getProvider(yarnwrap.screen.ScreenHandlerType type, ) { return net.minecraft.client.gui.screen.ingame.HandledScreens.getProvider(type.wrapperContained); }
// public void open(yarnwrap.screen.ScreenHandlerType type,yarnwrap.client.MinecraftClient client,int id,yarnwrap.text.Text title) { wrapperContained.open(type.wrapperContained,client.wrapperContained,id,title.wrapperContained); }
// public static void open(yarnwrap.screen.ScreenHandlerType type,yarnwrap.client.MinecraftClient client,int id,yarnwrap.text.Text title, ) { net.minecraft.client.gui.screen.ingame.HandledScreens.open(type.wrapperContained,client.wrapperContained,id,title.wrapperContained); }
// public void register(yarnwrap.screen.ScreenHandlerType type,Object provider) { wrapperContained.register(type.wrapperContained,provider); }
// public static void register(yarnwrap.screen.ScreenHandlerType type,Object provider, ) { net.minecraft.client.gui.screen.ingame.HandledScreens.register(type.wrapperContained,provider); }

}