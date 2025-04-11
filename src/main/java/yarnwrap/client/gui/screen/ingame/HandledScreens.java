package yarnwrap.client.gui.screen.ingame;
public class HandledScreens { public net.minecraft.client.gui.screen.ingame.HandledScreens wrapperContained; public HandledScreens(net.minecraft.client.gui.screen.ingame.HandledScreens wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public java.util.Map PROVIDERS() { return wrapperContained.PROVIDERS; }
// public void PROVIDERS(java.util.Map value) { wrapperContained.PROVIDERS = value; }
public boolean isMissingScreens() { return wrapperContained.isMissingScreens(); }
// public Object getProvider(yarnwrap.screen.ScreenHandlerType type) { return wrapperContained.getProvider(type.wrapperContained); }
public void open(yarnwrap.screen.ScreenHandlerType type,yarnwrap.client.MinecraftClient client,int id,yarnwrap.text.Text title) { wrapperContained.open(type.wrapperContained,client.wrapperContained,id,title.wrapperContained); }
// public void register(yarnwrap.screen.ScreenHandlerType type,Object provider) { wrapperContained.register(type.wrapperContained,provider); }

}